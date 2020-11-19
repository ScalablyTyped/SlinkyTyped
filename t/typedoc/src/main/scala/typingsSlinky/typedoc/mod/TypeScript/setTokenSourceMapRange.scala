package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.Node
import typingsSlinky.typescript.mod.SourceMapRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.setTokenSourceMapRange")
@js.native
object setTokenSourceMapRange extends js.Object {
  
  /**
    * Sets the TextRange to use for source maps for a token of a node.
    */
  def apply[T /* <: Node */](node: T, token: typingsSlinky.typescript.mod.SyntaxKind): T = js.native
  def apply[T /* <: Node */](node: T, token: typingsSlinky.typescript.mod.SyntaxKind, range: SourceMapRange): T = js.native
}
