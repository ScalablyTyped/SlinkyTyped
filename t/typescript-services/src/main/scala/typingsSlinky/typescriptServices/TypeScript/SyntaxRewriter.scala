package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.SyntaxRewriter")
@js.native
class SyntaxRewriter () extends ISyntaxVisitor {
  def visitList(list: ISyntaxList): ISyntaxList = js.native
  def visitNode(node: SyntaxNode): SyntaxNode = js.native
  def visitNodeOrToken(node: ISyntaxNodeOrToken): ISyntaxNodeOrToken = js.native
  def visitSeparatedList(list: ISeparatedSyntaxList): ISeparatedSyntaxList = js.native
}

