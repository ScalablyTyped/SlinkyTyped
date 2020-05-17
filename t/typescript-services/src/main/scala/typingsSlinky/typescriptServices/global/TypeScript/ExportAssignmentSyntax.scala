package typingsSlinky.typescriptServices.global.TypeScript

import typingsSlinky.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.ExportAssignmentSyntax")
@js.native
class ExportAssignmentSyntax protected ()
  extends typingsSlinky.typescriptServices.TypeScript.ExportAssignmentSyntax {
  def this(
    exportKeyword: ISyntaxToken,
    equalsToken: ISyntaxToken,
    identifier: ISyntaxToken,
    semicolonToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSGlobal("TypeScript.ExportAssignmentSyntax")
@js.native
object ExportAssignmentSyntax extends js.Object {
  def create1(identifier: ISyntaxToken): typingsSlinky.typescriptServices.TypeScript.ExportAssignmentSyntax = js.native
}

