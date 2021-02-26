package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import typingsSlinky.watsonDeveloperCloud.v1GeneratedMod.CreateEventConstants.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `createEvent` operation. */
@js.native
trait CreateEventParams extends StObject {
  
  /** Query event data object. */
  var data: EventData = js.native
  
  var headers: js.UndefOr[js.Object] = js.native
  
  var return_response: js.UndefOr[Boolean] = js.native
  
  /** The event type to be created. */
  var `type`: Type | String = js.native
}
object CreateEventParams {
  
  @scala.inline
  def apply(data: EventData, `type`: Type | String): CreateEventParams = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEventParams]
  }
  
  @scala.inline
  implicit class CreateEventParamsMutableBuilder[Self <: CreateEventParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: EventData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
    
    @scala.inline
    def setType(value: Type | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
