package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.EmitHelper
import typingsSlinky.typescript.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.addEmitHelper")
@js.native
object addEmitHelper extends js.Object {
  /**
    * Adds an EmitHelper to a node.
    */
  def apply[T /* <: Node */](node: T, helper: EmitHelper): T = js.native
}

