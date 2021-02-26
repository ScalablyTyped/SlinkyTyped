package typingsSlinky.typescriptServices.mod

import typingsSlinky.typescriptServices.FormattingOptions
import typingsSlinky.typescriptServices.TypeScript.ISyntaxNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "SyntaxDedenter")
@js.native
class SyntaxDedenter protected ()
  extends typingsSlinky.typescriptServices.TypeScript.SyntaxDedenter {
  def this(
    dedentFirstToken: Boolean,
    dedentationAmount: Double,
    minimumIndent: Double,
    options: FormattingOptions
  ) = this()
}
object SyntaxDedenter {
  
  /* static member */
  @JSImport("typescript-services", "SyntaxDedenter.dedentNode")
  @js.native
  def dedentNode(
    node: ISyntaxNode,
    dedentFirstToken: Boolean,
    dedentAmount: Double,
    minimumIndent: Double,
    options: FormattingOptions
  ): ISyntaxNode = js.native
}
