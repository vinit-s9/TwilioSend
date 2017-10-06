<html>
  <script type="text/javascript">
      function test(){
    	  var testform=document.getElementById("demo");
    	  testform.action="TwilioSMS";
    	  testform.method = "post";
    	  testform.submit();
    	  alert('Message from Vinitkumar Surati');
      }
  </script>
<body onload = "test()">
 <form id="demo" action="TwilioSMS" method="post">
  </form>
  <h2>Hello, World!</h2>
</body>
</html>