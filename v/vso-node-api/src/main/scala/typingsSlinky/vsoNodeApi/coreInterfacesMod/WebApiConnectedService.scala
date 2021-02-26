package typingsSlinky.vsoNodeApi.coreInterfacesMod

import typingsSlinky.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebApiConnectedService extends WebApiConnectedServiceRef {
  
  /**
    * The user who did the OAuth authentication to created this service
    */
  var authenticatedBy: IdentityRef = js.native
  
  /**
    * Extra description on the service.
    */
  var description: String = js.native
  
  /**
    * Friendly Name of service connection
    */
  var friendlyName: String = js.native
  
  /**
    * The kind of service.
    */
  var kind: String = js.native
  
  /**
    * The project associated with this service
    */
  var project: TeamProjectReference = js.native
  
  /**
    * Optional uri to connect directly to the service such as https://windows.azure.com
    */
  var serviceUri: String = js.native
}
object WebApiConnectedService {
  
  @scala.inline
  def apply(
    authenticatedBy: IdentityRef,
    description: String,
    friendlyName: String,
    id: String,
    kind: String,
    project: TeamProjectReference,
    serviceUri: String,
    url: String
  ): WebApiConnectedService = {
    val __obj = js.Dynamic.literal(authenticatedBy = authenticatedBy.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], friendlyName = friendlyName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], serviceUri = serviceUri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebApiConnectedService]
  }
  
  @scala.inline
  implicit class WebApiConnectedServiceMutableBuilder[Self <: WebApiConnectedService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthenticatedBy(value: IdentityRef): Self = StObject.set(x, "authenticatedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProject(value: TeamProjectReference): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceUri(value: String): Self = StObject.set(x, "serviceUri", value.asInstanceOf[js.Any])
  }
}
