import Vue from "vue"
import Router from "vue-router"
import LoginPage from "./components/LoginPage"
import UserPage from "./components/UserPage"

Vue.use(Router)

export default new Router({
  mode: "history",
  base: process.env.BASE_URL,
  routes: [
    {
      path: "/",
      name: "LoginPage",
      component: LoginPage
    },
    {
      path: "/UserPage",
      name: "UserPage",
      component: UserPage
    }
  ]
})
