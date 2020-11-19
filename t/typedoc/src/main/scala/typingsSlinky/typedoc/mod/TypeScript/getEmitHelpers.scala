package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.EmitHelper
import typingsSlinky.typescript.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.getEmitHelpers")
@js.native
object getEmitHelpers extends js.Object {
  
  /**
    * Gets the EmitHelpers of a node.
    */
  def apply(node: Node): js.UndefOr[js.Array[EmitHelper]] = js.native
}
