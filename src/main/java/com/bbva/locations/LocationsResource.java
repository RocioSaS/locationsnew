package com.bbva.locations;

import com.bbva.locations.beans.Location;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 * A JAX-RS interface.  An implementation of this interface must be provided.
 */
@Path("/locations")
public interface LocationsResource {
  /**
   * Gets a list of all `Location` entities.
   */
  @GET
  @Produces("application/json")
  List<Location> getLocations();

  /**
   * Creates a new instance of a `Location`.
   */
  @POST
  @Consumes("application/json")
  void createLocation(Location data);

  /**
   * Gets the details of a single instance of a `Location`.
   */
  @Path("/{locationId}")
  @GET
  @Produces("application/json")
  Location getLocation(@PathParam("locationId") String locationId);

  /**
   * Updates an existing `Location`.
   */
  @Path("/{locationId}")
  @PUT
  @Consumes("application/json")
  void updateLocation(@PathParam("locationId") String locationId, Location data);

  /**
   * Deletes an existing `Location`.
   */
  @Path("/{locationId}")
  @DELETE
  void deleteLocation(@PathParam("locationId") String locationId);
}
