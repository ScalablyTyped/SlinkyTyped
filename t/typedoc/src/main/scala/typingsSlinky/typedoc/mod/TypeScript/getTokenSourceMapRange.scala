package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.Node
import typingsSlinky.typescript.mod.SourceMapRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.getTokenSourceMapRange")
@js.native
object getTokenSourceMapRange extends js.Object {
  
  /**
    * Gets the TextRange to use for source maps for a token of a node.
    */
  def apply(node: Node, token: typingsSlinky.typescript.mod.SyntaxKind): js.UndefOr[SourceMapRange] = js.native
}
