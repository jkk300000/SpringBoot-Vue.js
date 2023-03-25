

<template>
    <div class="header">
      <h1>Header</h1>
      <nav class="navbar navbar-expand-sm bg-primary navbar-dark">
        <button class="navbar-toggler" type="button" data-toggle="collapse"
                data-target="#navbarTogglerDemo03" aria-controls="navbarTogglerDemo03"
                aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <a class="navbar-brand" href="/">Shop</a>

        <div class="collapse navbar-collapse" id="navbarTogglerDemo03">
            <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
      <router-link to="/employee/list">직원정보</router-link>
    </ul>
         
        </div>
    </nav>
</div>
    
  </template>
  <script>
  import BootstrapVue from 'bootstrap-vue';
  import 'bootstrap/dist/css/bootstrap.min.css';
  import 'bootstrap-vue/dist/bootstrap-vue.css';
  
  Vue.use(BootstrapVue)

</script>



<div>
   
                
              
                
             
           
