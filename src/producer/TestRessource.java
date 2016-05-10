package producer;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import data.Transaction;

@Path("/producer")
public class TestRessource {

	@GET
	@Produces("text/plain")
	@Path("/transactionjson")
	public Transaction jsonTransaction() {
		return "hello World ! ";
	}

	/*@GET
	@Produces("application/xml")
	@Path("/transactionxml")
	public Transaction xmlTransaction() {
		Transaction t = new Transaction();
		return t;
	}*/
}
