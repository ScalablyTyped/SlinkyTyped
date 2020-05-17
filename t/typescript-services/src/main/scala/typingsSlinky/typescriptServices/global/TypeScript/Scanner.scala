package typingsSlinky.typescriptServices.global.TypeScript

import typingsSlinky.typescriptServices.TypeScript.ISimpleText
import typingsSlinky.typescriptServices.TypeScript.ISyntaxTriviaList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Scanner")
@js.native
class Scanner protected ()
  extends typingsSlinky.typescriptServices.TypeScript.Scanner {
  def this(
    fileName: String,
    text: ISimpleText,
    languageVersion: typingsSlinky.typescriptServices.TypeScript.LanguageVersion
  ) = this()
  def this(
    fileName: String,
    text: ISimpleText,
    languageVersion: typingsSlinky.typescriptServices.TypeScript.LanguageVersion,
    window: js.Array[Double]
  ) = this()
}

/* static members */
@JSGlobal("TypeScript.Scanner")
@js.native
object Scanner extends js.Object {
  var triviaWindow: js.Any = js.native
  def isValidIdentifier(text: ISimpleText, languageVersion: typingsSlinky.typescriptServices.TypeScript.LanguageVersion): Boolean = js.native
  def scanTrivia(text: ISimpleText, start: Double, length: Double, isTrailing: Boolean): ISyntaxTriviaList = js.native
}

