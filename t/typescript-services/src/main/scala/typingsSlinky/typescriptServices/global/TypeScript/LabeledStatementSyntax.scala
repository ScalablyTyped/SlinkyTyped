package typingsSlinky.typescriptServices.global.TypeScript

import typingsSlinky.typescriptServices.TypeScript.IStatementSyntax
import typingsSlinky.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.LabeledStatementSyntax")
@js.native
class LabeledStatementSyntax protected ()
  extends typingsSlinky.typescriptServices.TypeScript.LabeledStatementSyntax {
  def this(
    identifier: ISyntaxToken,
    colonToken: ISyntaxToken,
    statement: IStatementSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}
/* static members */
@JSGlobal("TypeScript.LabeledStatementSyntax")
@js.native
object LabeledStatementSyntax extends js.Object {
  
  def create1(identifier: ISyntaxToken, statement: IStatementSyntax): typingsSlinky.typescriptServices.TypeScript.LabeledStatementSyntax = js.native
}
