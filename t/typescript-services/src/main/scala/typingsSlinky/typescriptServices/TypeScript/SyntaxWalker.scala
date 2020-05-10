package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.SyntaxWalker")
@js.native
class SyntaxWalker () extends ISyntaxVisitor {
  def visitList(list: ISyntaxList): Unit = js.native
  def visitNode(node: SyntaxNode): Unit = js.native
  def visitNodeOrToken(nodeOrToken: ISyntaxNodeOrToken): Unit = js.native
  def visitOptionalNode(node: SyntaxNode): Unit = js.native
  def visitOptionalNodeOrToken(nodeOrToken: ISyntaxNodeOrToken): Unit = js.native
  /* private */ def visitOptionalToken(token: js.Any): js.Any = js.native
  def visitSeparatedList(list: ISeparatedSyntaxList): Unit = js.native
}

