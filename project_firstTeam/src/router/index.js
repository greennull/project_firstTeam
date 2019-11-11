import  Vue from 'vue';
//引入路由
import  Vuerouter from 'vue-router';
Vue.use(Vuerouter);
//引入组件
import Home from '../components/HomePage/Home.vue';
//配置路由
export  default new Vuerouter({
  mode:'history',
  routes:[
    {
      path:'/',
      component:Home
    },
    {
      path:'/home',
      component:Home
    },
  ]

})
