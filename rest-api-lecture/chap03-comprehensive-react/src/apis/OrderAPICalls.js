import {authRequest} from "./Api";
import {toast} from "react-toastify";
import {getOrders, postSuccess} from "../modules/OrderModule";

export const callOrderRegistAPI = ({ registRequest }) => {

    return async (dispatch, getState) => {

        const result = await authRequest.post('/api/v1/order',
            JSON.stringify(registRequest),
            {
                headers : {
                    'Content-Type' : 'application/json'
                }
            }).catch(e => {
                if(e.response.status === 400) {
                    toast.error("주문 불가 상품입니다.");
                } else if(e.response.status === 409) {
                    toast.error("재고 부족으로 상품 구매가 불가합니다.");
                }
        });

        console.log('callOrderRegistAPI result : ', result);

        if(result?.status === 201) {
            dispatch(postSuccess());
        }
    }
}

export const callOrdersAPI = ({ currentPage }) => {

    return async (dispatch, getState) => {

        const result = await authRequest.get(`/api/v1/order?page=${currentPage}`,
            {
                headers : {
                    'Content-Type' : 'application/json'
                }
            }).catch(e => {
            console.log(e);
        });

        console.log('callOrdersAPI result : ', result);

        if(result?.status === 200) {
            dispatch(getOrders(result));
        }
    }
}












