
package at.svc.chips.doctors.boundary;

import javax.ejb.Stateless;
import javax.json.Json;
import javax.json.JsonArray;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Stateless
@Path("doctors")
public class DoctorsResource {

    @GET
    public JsonArray all() {
        return Json.createArrayBuilder().
                add("good").
                add("evil").
                add("mad").
                build();
    }


}
