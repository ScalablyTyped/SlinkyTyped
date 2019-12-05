package typingsSlinky.typescriptDashServices.typescriptDashServicesMod.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Services.BraceMatcher")
@js.native
class BraceMatcher ()
  extends typingsSlinky.typescriptDashServices.TypeScript.Services.BraceMatcher

/* static members */
@JSImport("typescript-services", "Services.BraceMatcher")
@js.native
object BraceMatcher extends js.Object {
  def getMatchSpans(syntaxTree: typingsSlinky.typescriptDashServices.TypeScript.SyntaxTree, position: Double): js.Array[typingsSlinky.typescriptDashServices.TypeScript.TextSpan] = js.native
  /* private */ def getMatchingCloseBrace(currentToken: js.Any, position: js.Any, result: js.Any): js.Any = js.native
  /* private */ def getMatchingCloseBraceTokenKind(positionedElement: js.Any): js.Any = js.native
  /* private */ def getMatchingOpenBrace(currentToken: js.Any, position: js.Any, result: js.Any): js.Any = js.native
  /* private */ def getMatchingOpenBraceTokenKind(positionedElement: js.Any): js.Any = js.native
}

