package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.DebuggerStatementSyntax")
@js.native
class DebuggerStatementSyntax protected ()
  extends SyntaxNode
     with IStatementSyntax {
  def this(debuggerKeyword: ISyntaxToken, semicolonToken: ISyntaxToken, parsedInStrictMode: Boolean) = this()
  var debuggerKeyword: ISyntaxToken = js.native
  var semicolonToken: ISyntaxToken = js.native
  /* InferMemberOverrides */
  override def isStatement(): Boolean = js.native
  def update(debuggerKeyword: ISyntaxToken, semicolonToken: ISyntaxToken): DebuggerStatementSyntax = js.native
  def withDebuggerKeyword(debuggerKeyword: ISyntaxToken): DebuggerStatementSyntax = js.native
  def withSemicolonToken(semicolonToken: ISyntaxToken): DebuggerStatementSyntax = js.native
}

/* static members */
@JSGlobal("TypeScript.DebuggerStatementSyntax")
@js.native
object DebuggerStatementSyntax extends js.Object {
  def create1(): DebuggerStatementSyntax = js.native
}

