import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

/**
 * Servlet implementation class TwilioSMS
 */
public class TwilioSMS extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TwilioSMS() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.getWriter().println("Check phone for the message! Thanks!");;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		
		String accountSid = "ACb99f565f42e39ae55c5acaa40ee85749";
		String authToken = "5cfaccd7d74984b8224cc6d99fbae98f";

		Twilio.init(accountSid, authToken);
		Message message = Message.creator(
				new PhoneNumber("+19735683366"), // to			
				new PhoneNumber("+14154633669"), // from
				"Hello from VINITKUMAR SURATI CS 643 Fall 2017" // body
		).create();

		System.out.println(message.getSid());
	}

}
