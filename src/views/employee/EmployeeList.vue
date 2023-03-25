<template>
    <div class="employee-list">
      <div class="common-buttons">
        <button type="button" class="w3-button w3-round w3-blue-gray" v-on:click="fnWrite">등록</button>
      </div>
      <table class="w3-table-all">
        
        <thead>
        <tr>
          <th>사원번호</th>
          <th>이름</th>
          <th>성</th>
          <th>이메일</th>
          <th>전화번호</th>
          <th>고용일</th>
          <th>관리자번호</th>
          <th>직무</th>
        </tr>
        </thead>
        <tbody>
        <tr v-for="(employee, employee_id) in list" :key="employee_id">
          <td>{{ employee.employee_id }}</td>
          <td>{{ employee.last_name }}</td>
          <td>{{ employee.first_name }}</td>
          <td>{{ employee.email }}</td>
          <td>{{ employee.phone }}</td>
          <td>{{ employee.hire_date }}</td>
          <td>{{ employee.manager_id }}</td>
          <td>{{ employee.job_title }}</td>
        </tr>
        </tbody>
      </table>
    </div>
   

  
   
 <!-- <ag-grid-vue
   class="ag-theme-alpine"
   style="height: 500px"
   :columnDefs="columnDefs.value"
   :rowData="rowData.value"
   :defaultColDef="defaultColDef"
   rowSelection="multiple"
   animateRows="true"
   
 >
 </ag-grid-vue> -->
 

  </template>
  
  <script>
    
 export default {
  
  
  
  data() { //변수생성
    return {
        
      list: {}, //리스트 데이터
     
    }
  },
  mounted() {
    this.fnGetList()
  },


  methods: {
    fnGetList() {
    

      this.$axios.get(this.$serverUrl + "/employee/list") //$axios, $serverUrl은 main.js에서 설정한 전역 변수, this.~으로 호출
      .then((res) => {      

        this.list = res.data  //서버에서 데이터를 목록으로 보내므로 바로 할당하여 사용할 수 있다.

      }).catch((err) => {
        if (err.message.indexOf('Network Error') > -1) {
          alert('네트워크가 원활하지 않습니다.\n잠시 후 다시 시도해주세요.')
        }
      })
    }
  }
}
// import { AgGridVue } from "ag-grid-vue3";  // the AG Grid Vue Component
// import { reactive, onMounted, inject, ref } from "vue";

// import "ag-grid-community/styles/ag-grid.css"; // Core grid CSS, always needed
// import "ag-grid-community/styles/ag-theme-alpine.css"; // Optional theme CSS

// export default {
//  name: "App",
//  components: {
//    AgGridVue
//  },
//  setup() {
//   const gridApi = ref(null);

//   const onGridReady = (params) => {
//      gridApi.value = params.api;
//    };


//    const rowData = reactive({
// }); // Set rowData to Array of Objects, one Object per Row

//    // Each Column Definition results in one Column.
//    const columnDefs = reactive({
//      value: [
//           { field: "imployee_id" },
//           { field: "first_name" },
//           { field: "last_name" },
//           { field: "email" },
//           { field: "phone" },
//           { field: "hire_date" },
//           { field: "manager_id" },
//           { field: "job_title" },
//      ],
//    });

//    // DefaultColDef sets props common to all Columns
//    const defaultColDef = {
//      sortable: true,
//      filter: true,
//      flex: 1
//    };
//     const axios = inject('axios');
//     const serverUrl = inject('serverUrl');
//    // Example load data from sever
//    onMounted(() => {
//     axios.get(serverUrl + "/employee/list")
//        .then((result) => console.log(result.data))
//        .then((remoteRowData) => console.log(rowData.value = remoteRowData));
//    });

//    return {
//     onGridReady,
//      columnDefs,
//      rowData,
//      defaultColDef,
//      deselectRows: () =>{
//        gridApi.value.deselectAll()
//      }
   
//    };
//  },
// };




  </script>