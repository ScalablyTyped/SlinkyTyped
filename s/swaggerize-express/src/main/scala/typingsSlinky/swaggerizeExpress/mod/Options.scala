package typingsSlinky.swaggerizeExpress.mod

import typingsSlinky.swaggerizeExpress.mod.Swagger.ApiDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends StObject {
  
  var api: ApiDefinition = js.native
  
  var docspath: String = js.native
  
  var handlers: String | RouteSegment = js.native
}
object Options {
  
  @scala.inline
  def apply(api: ApiDefinition, docspath: String, handlers: String | RouteSegment): Options = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], docspath = docspath.asInstanceOf[js.Any], handlers = handlers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApi(value: ApiDefinition): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocspath(value: String): Self = StObject.set(x, "docspath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandlers(value: String | RouteSegment): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
  }
}
