<html>
  <script type="text/javascript">
      function test(){
    	  var testform=document.getElementById("testform");
    	  testform.action="TwilioSendSMS";
    	  testform.method = "post";
    	  testform.submit();
    	  alert('Message from Vinitkumar Surati');
      }
  </script>
<body onload = "test()">
  <form id="testform">  
  </form>
  <h2>hello world</h2>
</body>
</html>