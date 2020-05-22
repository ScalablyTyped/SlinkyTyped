package typingsSlinky.yadda.featureParserMod

import typingsSlinky.yadda.languageMod.Library
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var language: js.UndefOr[typingsSlinky.yadda.languageMod.^[Library]] = js.undefined
  var leftPlaceholderChar: String
  var rightPlaceholderChar: String
}

object Options {
  @scala.inline
  def apply(
    leftPlaceholderChar: String,
    rightPlaceholderChar: String,
    language: typingsSlinky.yadda.languageMod.^[Library] = null
  ): Options = {
    val __obj = js.Dynamic.literal(leftPlaceholderChar = leftPlaceholderChar.asInstanceOf[js.Any], rightPlaceholderChar = rightPlaceholderChar.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

