package typingsSlinky.sha256File

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sha256-file", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(filename: String): String = js.native
  def apply(filename: String, callback: CallbackFunction): Unit = js.native
  
  type CallbackFunction = js.Function2[/* error */ js.Error | Null, /* sum */ String, Unit]
}
