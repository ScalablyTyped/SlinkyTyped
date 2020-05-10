package typingsSlinky.typescriptServices.TypeScript.Syntax

import typingsSlinky.typescriptServices.TypeScript.ISyntaxToken
import typingsSlinky.typescriptServices.TypeScript.SyntaxKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Syntax.VariableWidthTokenWithLeadingTrivia")
@js.native
class VariableWidthTokenWithLeadingTrivia protected () extends ISyntaxToken {
  def this(fullText: String, kind: SyntaxKind, leadingTriviaInfo: Double) = this()
  var _fullText: js.Any = js.native
  var _leadingTriviaInfo: js.Any = js.native
  /* private */ def findTokenInternal(parent: js.Any, position: js.Any, fullStart: js.Any): js.Any = js.native
  /* private */ def realize(): js.Any = js.native
  def toJSON(key: js.Any): js.Any = js.native
}

