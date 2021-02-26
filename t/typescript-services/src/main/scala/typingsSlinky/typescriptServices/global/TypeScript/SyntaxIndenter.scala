package typingsSlinky.typescriptServices.global.TypeScript

import typingsSlinky.typescriptServices.FormattingOptions
import typingsSlinky.typescriptServices.TypeScript.ISyntaxNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.SyntaxIndenter")
@js.native
class SyntaxIndenter protected ()
  extends typingsSlinky.typescriptServices.TypeScript.SyntaxIndenter {
  def this(indentFirstToken: Boolean, indentationAmount: Double, options: FormattingOptions) = this()
}
object SyntaxIndenter {
  
  /* static member */
  @JSGlobal("TypeScript.SyntaxIndenter.indentNode")
  @js.native
  def indentNode(node: ISyntaxNode, indentFirstToken: Boolean, indentAmount: Double, options: FormattingOptions): typingsSlinky.typescriptServices.TypeScript.SyntaxNode = js.native
  
  /* static member */
  @JSGlobal("TypeScript.SyntaxIndenter.indentNodes")
  @js.native
  def indentNodes(
    nodes: js.Array[typingsSlinky.typescriptServices.TypeScript.SyntaxNode],
    indentFirstToken: Boolean,
    indentAmount: Double,
    options: FormattingOptions
  ): js.Array[typingsSlinky.typescriptServices.TypeScript.SyntaxNode] = js.native
}
