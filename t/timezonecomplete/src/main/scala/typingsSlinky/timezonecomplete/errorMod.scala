package typingsSlinky.timezonecomplete

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("timezonecomplete/dist/lib/error", JSImport.Namespace)
@js.native
object errorMod extends js.Object {
  
  def convertError[T](errorName: String, cb: js.Function0[T]): T = js.native
  
  def error(name: String, format: String, args: js.Any*): js.Error = js.native
  
  def errorIs(error: js.Error, name: String): Boolean = js.native
  def errorIs(error: js.Error, name: js.Array[String]): Boolean = js.native
  
  def throwError(name: String, format: String, args: js.Any*): scala.Nothing = js.native
}
