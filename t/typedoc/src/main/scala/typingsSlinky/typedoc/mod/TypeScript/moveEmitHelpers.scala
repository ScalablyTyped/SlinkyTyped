package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.EmitHelper
import typingsSlinky.typescript.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.moveEmitHelpers")
@js.native
object moveEmitHelpers extends js.Object {
  
  /**
    * Moves matching emit helpers from a source node to a target node.
    */
  def apply(source: Node, target: Node, predicate: js.Function1[/* helper */ EmitHelper, Boolean]): Unit = js.native
}
