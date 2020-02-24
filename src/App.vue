<template>
  <v-app>
    <router-view>
      <v-content>
        <LoginPage />
      </v-content>
    </router-view>
  </v-app>
</template>

<script>
import LoginPage from "./components/LoginPage"
export default {
  name: "App",

  components: {
    LoginPage
  },

  data: () => ({
    //
  })
}
</script>
