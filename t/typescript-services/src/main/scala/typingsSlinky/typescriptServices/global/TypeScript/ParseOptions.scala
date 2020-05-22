package typingsSlinky.typescriptServices.global.TypeScript

import typingsSlinky.typescriptServices.anon.AllowAutomaticSemicolonInsertion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.ParseOptions")
@js.native
class ParseOptions protected ()
  extends typingsSlinky.typescriptServices.TypeScript.ParseOptions {
  def this(
    languageVersion: typingsSlinky.typescriptServices.TypeScript.LanguageVersion,
    allowAutomaticSemicolonInsertion: Boolean
  ) = this()
  /* CompleteClass */
  override var _allowAutomaticSemicolonInsertion: js.Any = js.native
  /* CompleteClass */
  override var _languageVersion: js.Any = js.native
  /* CompleteClass */
  override def allowAutomaticSemicolonInsertion(): Boolean = js.native
  /* CompleteClass */
  override def languageVersion(): typingsSlinky.typescriptServices.TypeScript.LanguageVersion = js.native
  /* CompleteClass */
  override def toJSON(key: js.Any): AllowAutomaticSemicolonInsertion = js.native
}

