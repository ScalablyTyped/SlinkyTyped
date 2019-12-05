package typingsSlinky.typescriptDashServices.typescriptDashServicesMod

import typingsSlinky.typescriptDashServices.TypeScript.ISimpleText
import typingsSlinky.typescriptDashServices.TypeScript.ISyntaxTriviaList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Scanner")
@js.native
class Scanner protected ()
  extends typingsSlinky.typescriptDashServices.TypeScript.Scanner {
  def this(
    fileName: String,
    text: ISimpleText,
    languageVersion: typingsSlinky.typescriptDashServices.TypeScript.LanguageVersion
  ) = this()
  def this(
    fileName: String,
    text: ISimpleText,
    languageVersion: typingsSlinky.typescriptDashServices.TypeScript.LanguageVersion,
    window: js.Array[Double]
  ) = this()
}

/* static members */
@JSImport("typescript-services", "Scanner")
@js.native
object Scanner extends js.Object {
  var triviaWindow: js.Any = js.native
  def isValidIdentifier(
    text: ISimpleText,
    languageVersion: typingsSlinky.typescriptDashServices.TypeScript.LanguageVersion
  ): Boolean = js.native
  def scanTrivia(text: ISimpleText, start: Double, length: Double, isTrailing: Boolean): ISyntaxTriviaList = js.native
}

