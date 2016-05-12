package producer;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import data.Account;

@Path("/restJson")
public class TestRessource {

	@GET
	@Produces("application/json")
	@Path("/getAccount")
	public Account jsonTransaction() {
		Account a = new Account("1", 16846.94, "Roux");

		return a;
	}

	/*
	 * @GET
	 * 
	 * @Produces("application/xml")
	 * 
	 * @Path("/transactionxml") public Transaction xmlTransaction() {
	 * Transaction t = new Transaction(); return t; }
	 */
}
