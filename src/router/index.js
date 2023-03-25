import { createRouter, createWebHistory } from 'vue-router'
import PageHome from '@/views/PageHome.vue'
import EmployeeList from "./../views/employee/EmployeeList.vue"

const routes = [
  {
    path: '/', //경로
    name: 'PageHome', //각 페이지를 구분하기 위해 작성
    component: PageHome
  },
  {
    path: '/about',
    name: 'About',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import(/* webpackChunkName: "about" */ '../views/PageAbout.vue')
  },
  {
    path: '/employee/list', 
    name: 'EmployeeList',
    component: EmployeeList
  }
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router