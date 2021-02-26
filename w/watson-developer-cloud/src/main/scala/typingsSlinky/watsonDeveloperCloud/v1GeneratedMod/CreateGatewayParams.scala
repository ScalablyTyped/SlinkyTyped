package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `createGateway` operation. */
@js.native
trait CreateGatewayParams extends StObject {
  
  /** The ID of the environment. */
  var environment_id: String = js.native
  
  var headers: js.UndefOr[js.Object] = js.native
  
  /** User-defined name. */
  var name: js.UndefOr[String] = js.native
  
  var return_response: js.UndefOr[Boolean] = js.native
}
object CreateGatewayParams {
  
  @scala.inline
  def apply(environment_id: String): CreateGatewayParams = {
    val __obj = js.Dynamic.literal(environment_id = environment_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGatewayParams]
  }
  
  @scala.inline
  implicit class CreateGatewayParamsMutableBuilder[Self <: CreateGatewayParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnvironment_id(value: String): Self = StObject.set(x, "environment_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
  }
}
