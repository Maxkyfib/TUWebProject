import Vue from 'vue';
import Vuex from 'vuex';
import router from '../router';
import axios from "axios";
Vue.use(Vuex)

const state ={
    loading :true,
    userData:[],
    Loginform:{
        Username : "",
        Password : ""
    }
   


};
const mutations ={
    preLoading(state,preload){
        state.loading = preload;
    },
    getData(state,preload){
        console.log("get data ")
        state.userData = preload;
        console.log(state.userData)
    },
    resetData(state){
        state.userData = ""
        console.log("Data is " + state.userData)
    }

};
const getters ={
//
};
const actions ={
    async Login ({commit},preload){
        await axios 
            .get(
                "http://localhost:8081/GetUserData/"+preload.Username+"/"+preload.Password
            )
            .then(dataIP=>{
                console.log(dataIP);
                commit("preLoading",false);
                commit("getData",dataIP.data)
                router.push('UserPage')
            })
            .catch(error =>{
                alert("ข้อมูลไม่ถูกต้องกรุณาตรวจสอบข้อมูลให้ถูกต้อง")
                console.log(error);
                
            });
    },
    Logout ({commit}){
        router.replace('/')
        console.log("reset data")
        commit("resetData")
       }
};





export default new Vuex.Store({
    state,
    mutations,
    getters,
    actions   
})