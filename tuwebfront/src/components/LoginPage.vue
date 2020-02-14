<template>

  <v-app id="inspire">
    <v-content>
      <v-container
      >
        <v-img
            :src="require('../assets/TULogo.png')"
              class="my-3"
              contain
              height="200"
        ></v-img>
        <v-row
          align="center"
          justify="center">
           <p class="school-name"> โรงเรียนเตรียมอุดมศึกษา</p>
        </v-row>
        <v-row
          align="center"
          justify="center"
        >
          <v-col
            cols="12"
            sm="8"
            md="4"
          >
            <v-card class="elevation-12">
              <v-toolbar
                color="primary"
                dark
                flat
              >
             <v-toolbar-title>ประกาศที่นั่งสอบ</v-toolbar-title>
              <v-spacer />
              </v-toolbar>
              <v-card-text>
               <v-form  autocomplete = false 
               v-model="valid"
               ref="form" 
               lazy-validation>
                     <v-text-field
                        
                          label="กรอกเลขบัตรประจำตัวประชาชน หรือ หมายเลขหนังสือเดินทาง"
                          v-model="Loginform.Username"
                          hint="input number only"   
                          counter
                          maxlength="13"
                          :rules="[rules.required,rules.personalid]"
                          required
                          type="number"
                        ></v-text-field>
                        <v-text-field
                        
                        label="Enter your password"
                          v-model="Loginform.Password"
                          hint="Your Phone number"   
                          maxlength="10"
                          counter
                          :append-icon="show ? 'mdi-eye' : 'mdi-eye-off'"
                          
                          :type="show ? 'number' : 'password'"
                          @click:append="show = !show"       
                          :rules="[rules.required , rules.phone]"
                          required
                        ></v-text-field>
                </v-form>
        
              </v-card-text>
              <v-card-actions>
                <v-spacer />
                <v-btn @click="validate" :disabled="!valid" color="primary">Login</v-btn>
                <!-- <v-btn @click="Login(Loginform)" color="primary">Login</v-btn> -->
              </v-card-actions>
            </v-card>
          </v-col>
        </v-row>
      </v-container>
    </v-content>
  </v-app>
</template>

<script>
import { mapState, mapActions } from 'vuex';
export default {
    mounted(){
      this.$refs.form.reset()
    },
    data: () => ({
    show : false,
    valid : true,
    //  Loginform:{
    //     Username : "",
    //     Password : ""
    // },
    rules: {
        required: value => !!value || 'Required.',
        personalid: value => (value && value.length == 13) || 'Personal ID must be 13 characters',
        phone: value => (value && value.length == 10) || 'phone must be 10 characters'
    }
    }),
    computed:{
        ...mapState({
            Loginform : "Loginform" ,
        })
    },
    methods:{
        ...mapActions({
            Login : "Login",
        }),
        validate () {
        if (this.$refs.form.validate()) {
          this.snackbar = true
          this.Login(this.Loginform)
        }else{
          alert("Pless input Username and Password")
        }
       },
      // reset () {
      //   this.$refs.form.reset()
      // },
    }
}
    

</script>

<style  scoped>
    .school-name {
         font-size: 30px;
    }
</style>


