

<script>

import Header from './fragments/header';
import Footer from './fragments/footer';

export default {
  name: 'mylayout',
  components: {
    Header,
    Footer,
  }
}
</script>


    <template>
    <div id="mylayout">
      <Header></Header>
      <router-view></router-view>
      <Footer></Footer>
    </div>
</template>


