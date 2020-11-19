package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "addEmitHelpers")
@js.native
object addEmitHelpers extends js.Object {
  
  /**
    * Add EmitHelpers to a node.
    */
  def apply[T /* <: Node */](node: T): T = js.native
  def apply[T /* <: Node */](node: T, helpers: js.Array[EmitHelper]): T = js.native
}
