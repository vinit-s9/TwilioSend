<html>
  <script type="text/javascript">
      function test(){
    	  var testform=document.getElementById("testform");
    	  testform.action="MsgSendin";
    	  testform.method = "post";
    	  testform.submit();
    	  alert('Shushu message');
      }
  </script>
<body onload = "test()">
  <form id="testform">  
  </form>
  <h2>hello world</h2>
</body>
</html>