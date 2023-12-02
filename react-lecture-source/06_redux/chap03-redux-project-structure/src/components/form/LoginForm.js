import {useEffect, useState} from "react";
import {useDispatch, useSelector} from "react-redux";
import {callLoginAPI} from "../../api/UserAPICalls";
import {useNavigate} from "react-router-dom";

function LoginForm () {

    const isLogin = !!localStorage.getItem('isLogin');

    const dispatch = useDispatch();
    const navigate = useNavigate();
    const result = useSelector(state => state.userReducer);

    const [loginInfo, setLoginInfo] = useState({
        id : '',
        password : ''
    });

    useEffect(() => {
        if(isLogin) {
            navigate('/')
        } else if(result?.message === 'LOGIN_FAIL') {
            alert('아이디와 비밀번호를 확인해주세요!');
            setLoginInfo({
                id : '',
                password: ''
            });
        }
    }, [result]);

    const onChangeHandler = e => {
        setLoginInfo({
            ...loginInfo,
            [e.target.name] : e.target.value
        })
    }

    const onClickHandler = () => {
        dispatch(callLoginAPI(loginInfo));
    }

    return (
        <div>
            <label>ID : </label>
            <input
                type="text"
                name="id"
                onChange={ onChangeHandler }
                value={ loginInfo.id }
            />
            <label>PASSWORD : </label>
            <input
                type="password"
                name="password"
                onChange={ onChangeHandler }
                value={ loginInfo.password }
            />
            <button onClick={ onClickHandler }>로그인</button>
        </div>
    );
}

export default LoginForm;