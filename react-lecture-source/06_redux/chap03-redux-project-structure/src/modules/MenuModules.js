import {createActions, handleActions} from "redux-actions";

/* 초기 값 */
const initialState = {};

/* 액션 타입 */
const GET_MENULIST = 'menu/GET_MENULIST';
const GET_MENU = 'menu/GET_MENU';

/* 액션 함수 */
export const { menu : { getMenulist, getMenu } } = createActions({
    [GET_MENULIST] : (result) => ({ menulist : result }),
    [GET_MENU] : (result) => ({ menu : result })
});

/* 리듀서 함수 */
const menuReducer = handleActions({
    [GET_MENULIST] : (state, { payload }) => payload,
    [GET_MENU] : (state, { payload }) => payload
}, initialState);

export default menuReducer;












