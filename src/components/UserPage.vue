<template>
  <v-content>
    <v-container v-if="loading">
      <div class="loading">
        <v-progress-circular indeterminate :size="150" :width="8" color="pink"></v-progress-circular>
      </div>
    </v-container>
    <v-container v-else>
      <v-img :src="require('../assets/TULogo.png')" class="my-3" contain height="200"></v-img>
      <v-row align="center" justify="center">
        <p class="head">โรงเรียนเตรียมอุดมศึกษา</p>
      </v-row>
      <v-row align="center" justify="center">
        <p class="head">ตรวจสอบที่นั่งสอบและสนามสอบ</p>
      </v-row>
      <v-row align="center" justify="center">
        <p
          class="sub-head"
        >สำหรับสอบคัดเลือกวันที่ ........... ณ อิมแพค เมืองทองธานี จังหวัด นนทบุรี</p>
      </v-row>
      <v-row justify="center">
        <v-col cols="12" sm="8">
          <v-card>
            <v-card-title class="cyan darken-1">
              <span class="headline white--text">ช้อมูลผู้สมัครสอบ</span>

              <v-spacer></v-spacer>
            </v-card-title>

            <v-list>
              <!-- <v-list-item @click=""> -->
              <v-list-item>
                <!-- <v-list-item-action>
                  เลขบัตรประจำตัวประชาชน ::
                  <v-icon>mdi-phone</v-icon>
                </v-list-item-action>-->

                <v-list-item-content>
                  <v-list-item-title>เลขบัตรประจำตัวประชาชน</v-list-item-title>
                  <!-- <v-list-item-subtitle>{{userData.student_persanal_id}}<v-list-item-subtitle> -->
                  <v-list-item-title>{{userData.student_persanal_id}}</v-list-item-title>
                </v-list-item-content>
                <!-- <v-list-item-action>

                  <v-icon>mdi-message-text</v-icon>
                </v-list-item-action>-->
              </v-list-item>

              <v-divider></v-divider>

              <v-list-item>
                <!-- <v-list-item-action>
                  ชื่อ - นามสกุล ::
                  <v-icon>mdi-phone</v-icon>
                </v-list-item-action>-->

                <v-list-item-content>
                  <v-list-item-title>ชื่อ - นามสกุล</v-list-item-title>
                  <v-list-item-title>{{userData.student_name}}</v-list-item-title>
                </v-list-item-content>
                <!-- 
                <v-list-item-action>
                  <v-icon>mdi-message-text</v-icon>
                </v-list-item-action>-->
              </v-list-item>

              <v-divider></v-divider>

              <v-list-item>
                <!-- <v-list-item-action>
                  ประเภทการสอบ ::
                  <v-icon>mdi-map-marker</v-icon>
                </v-list-item-action>-->

                <v-list-item-content>
                  <v-list-item-title>ประเภทการสมัคร</v-list-item-title>
                  <v-list-item-title>{{userData.student_type}}</v-list-item-title>
                </v-list-item-content>
              </v-list-item>

              <v-divider></v-divider>

              <v-list-item>
                <!-- <v-list-item-action>
                  แผนการเรียน ::
                  <v-icon>mdi-map-marker</v-icon>
                </v-list-item-action>-->

                <v-list-item-content>
                  <v-list-item-title>แผนการเรียน</v-list-item-title>
                  <v-list-item-title class="text-show">{{userData.student_course}}</v-list-item-title>
                </v-list-item-content>
              </v-list-item>

              <v-divider></v-divider>

              <v-list-item>
                <!-- <v-list-item-action>
                  เลขประจำตัวสอบ ::
                  <v-icon>mdi-email</v-icon>
                </v-list-item-action>-->

                <v-list-item-content>
                  <v-list-item-title>เลขประจำตัวสอบ</v-list-item-title>
                  <v-list-item-title class="text-show">{{userData.student_test_no}}</v-list-item-title>
                </v-list-item-content>
              </v-list-item>

              <v-divider></v-divider>

              <v-list-item>
                <!-- <v-list-item-action>
                  ห้องสอบ ::
                  <v-icon>mdi-map-marker</v-icon>
                </v-list-item-action>-->

                <v-list-item-content>
                  <v-list-item-title>ห้องสอบ</v-list-item-title>
                  <v-list-item-title class="text-show">{{userData.student_testroom}}</v-list-item-title>
                </v-list-item-content>
              </v-list-item>
            </v-list>
            <v-card-actions>
              <v-spacer />
              <v-btn @click="Logout" color="primary">Logout</v-btn>
            </v-card-actions>
          </v-card>
        </v-col>
      </v-row>
    </v-container>
  </v-content>
</template>

<script>
import { mapState, mapActions } from "vuex";
export default {
  data: () => ({
    // show : false,
  }),
  computed: {
    ...mapState({
      loading: "loading",
      userData: "userData"
      // Loginform : "Loginform" ,
      // pageStatus : "pageStatus"
    })
  },
  methods: {
    ...mapActions({
      Logout: "Logout"
    })
  }
};
</script>

<style scoped>
.head {
  font-size: 45px;
}
.sub-head {
  font-size: 30px;
}
.loading {
  text-align: center;
}
.text-show {
  /* text-align: center; */
  color: red;
}
</style>