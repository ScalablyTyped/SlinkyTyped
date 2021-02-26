package typingsSlinky.typedGraphql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GraphQLFormattedError extends StObject {
  
  var locations: js.Array[GraphQLErrorLocation] = js.native
  
  var message: String = js.native
}
object GraphQLFormattedError {
  
  @scala.inline
  def apply(locations: js.Array[GraphQLErrorLocation], message: String): GraphQLFormattedError = {
    val __obj = js.Dynamic.literal(locations = locations.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLFormattedError]
  }
  
  @scala.inline
  implicit class GraphQLFormattedErrorMutableBuilder[Self <: GraphQLFormattedError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocations(value: js.Array[GraphQLErrorLocation]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationsVarargs(value: GraphQLErrorLocation*): Self = StObject.set(x, "locations", js.Array(value :_*))
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
