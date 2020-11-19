package typingsSlinky.theo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("theo", "registerFormat")
@js.native
object registerFormat extends js.Object {
  
  def apply[T /* <: String */](name: T, format: String): Unit = js.native
  def apply[T /* <: String */](name: T, format: FormatResultFn): Unit = js.native
  def apply[T /* <: String */](name: Format, format: String): Unit = js.native
  def apply[T /* <: String */](name: Format, format: FormatResultFn): Unit = js.native
}
