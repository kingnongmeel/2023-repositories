import {authRequest, request} from "./Api";
import {getProfile, loginFailure, loginSuccess, signupFailure, signupSuccess} from "../modules/MemberModule";
import {toast} from "react-toastify";
import {saveToken} from "../utils/TokenUtils";

export const callSignupAPI = ({signupRequest}) => {

    return async (dispatch, getState) => {
        const result = await request(
            'POST',
            '/member/signup',
            {'Content-Type' : 'application/json'},
            JSON.stringify(signupRequest)
        );

        console.log('callSignupAPI result : ', result);

        if(result?.status === 201) {
            dispatch(signupSuccess());
        } else {
            dispatch(signupFailure());
            toast.warning("회원 가입에 실패했습니다. 다시 시도해주세요.");
        }
    }
}

export const callLoginAPI = ({loginRequest}) => {

    return async (dispatch, getState) => {
        const result = await request(
            'POST',
            '/member/login',
            {'Content-Type' : 'application/json'},
            JSON.stringify(loginRequest)
        );

        console.log('callLoginAPI result : ', result);

        if(result?.status === 200) {
            saveToken(result.headers);
            dispatch(loginSuccess());
        } else {
            dispatch(loginFailure());
        }

    }
}

export const callMemberAPI = () => {

    return async (dispatch, getState) => {

        const result = await authRequest.get("/api/v1/member");
        console.log('callMemberAPI result : ', result);

        if(result.status === 200) {
            dispatch(getProfile(result));
        }

    }
}







