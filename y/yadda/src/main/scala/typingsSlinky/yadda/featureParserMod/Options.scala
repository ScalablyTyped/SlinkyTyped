package typingsSlinky.yadda.featureParserMod

import typingsSlinky.yadda.languageMod.Library
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var language: js.UndefOr[typingsSlinky.yadda.languageMod.^[Library]] = js.native
  var leftPlaceholderChar: String = js.native
  var rightPlaceholderChar: String = js.native
}

object Options {
  @scala.inline
  def apply(leftPlaceholderChar: String, rightPlaceholderChar: String): Options = {
    val __obj = js.Dynamic.literal(leftPlaceholderChar = leftPlaceholderChar.asInstanceOf[js.Any], rightPlaceholderChar = rightPlaceholderChar.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLeftPlaceholderChar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftPlaceholderChar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRightPlaceholderChar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightPlaceholderChar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguage(value: typingsSlinky.yadda.languageMod.^[Library]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
  }
  
}

