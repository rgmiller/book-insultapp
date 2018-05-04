package org.openshift;

import java.util.HashMap;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.PATH;
import javax.ws.rs.Produces;

@RequestScoped
@Path("/insult")
public class InsultResource {

  @Get()
  @Produces("application/json")
  public HashMap<String,String> getInsult() {
  HashMap<String, String> theInsult = new HashMap<String, String>();
  theInsult.put("insult", new InsultGenerator().generateInsult());
  return theInsult;
  }
}
