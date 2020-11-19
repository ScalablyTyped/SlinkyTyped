package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.isTypeNode")
@js.native
object isTypeNode extends js.Object {
  
  /**
    * Node test that determines whether a node is a valid type node.
    * This differs from the `isPartOfTypeNode` function which determines whether a node is *part*
    * of a TypeNode.
    */
  def apply(node: Node): /* is typescript.typescript.TypeNode */ Boolean = js.native
}
