package typingsSlinky.smartystreetsJavascriptSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("smartystreets-javascript-sdk", "usAutocomplete")
@js.native
object usAutocomplete extends js.Object {
  
  @js.native
  class Lookup protected ()
    extends typingsSlinky.smartystreetsJavascriptSdk.mod.core.Lookup {
    def this(prefix: String) = this()
    
    var cityFilter: js.Array[_] = js.native
    
    var geolocate: js.Any = js.native
    
    var geolocatePrecision: js.Any = js.native
    
    var maxSuggestions: Double = js.native
    
    var prefer: js.Array[_] = js.native
    
    var preferRation: js.Any = js.native
    
    var prefix: String = js.native
    
    var stateFilter: js.Array[_] = js.native
  }
  
  @js.native
  class Suggestion protected () extends js.Object {
    def this(responseData: js.Any) = this()
    
    var city: String = js.native
    
    var state: String = js.native
    
    var streetLine: String = js.native
    
    var text: String = js.native
  }
}
