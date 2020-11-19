package typingsSlinky.sha.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sha", "check")
@js.native
object check extends js.Object {
  
  def apply[R](fileName: String, expected: String, cb: CheckCallback[R]): Unit | R = js.native
  def apply[R](fileName: String, expected: String, options: ShaOptions, cb: CheckCallback[R]): Unit | R = js.native
}
