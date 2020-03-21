package typingsSlinky.typescriptServices.mod

import typingsSlinky.typescriptServices.FormattingOptions
import typingsSlinky.typescriptServices.TypeScript.ISyntaxNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "SyntaxIndenter")
@js.native
class SyntaxIndenter protected ()
  extends typingsSlinky.typescriptServices.TypeScript.SyntaxIndenter {
  def this(indentFirstToken: Boolean, indentationAmount: Double, options: FormattingOptions) = this()
}

/* static members */
@JSImport("typescript-services", "SyntaxIndenter")
@js.native
object SyntaxIndenter extends js.Object {
  def indentNode(node: ISyntaxNode, indentFirstToken: Boolean, indentAmount: Double, options: FormattingOptions): typingsSlinky.typescriptServices.TypeScript.SyntaxNode = js.native
  def indentNodes(
    nodes: js.Array[typingsSlinky.typescriptServices.TypeScript.SyntaxNode],
    indentFirstToken: Boolean,
    indentAmount: Double,
    options: FormattingOptions
  ): js.Array[typingsSlinky.typescriptServices.TypeScript.SyntaxNode] = js.native
}

