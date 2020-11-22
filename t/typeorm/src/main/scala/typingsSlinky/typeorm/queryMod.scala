package typingsSlinky.typeorm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/driver/Query", JSImport.Namespace)
@js.native
object queryMod extends js.Object {
  
  @js.native
  class Query protected () extends js.Object {
    def this(query: String) = this()
    def this(query: String, parameters: js.Array[_]) = this()
    
    var parameters: js.UndefOr[js.Array[_]] = js.native
    
    var query: String = js.native
  }
}
