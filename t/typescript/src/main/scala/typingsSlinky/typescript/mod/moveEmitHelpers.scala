package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "moveEmitHelpers")
@js.native
object moveEmitHelpers extends js.Object {
  
  /**
    * Moves matching emit helpers from a source node to a target node.
    */
  def apply(source: Node, target: Node, predicate: js.Function1[/* helper */ EmitHelper, Boolean]): Unit = js.native
}
