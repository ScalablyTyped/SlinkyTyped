package typingsSlinky.typescriptServices.TypeScript

import typingsSlinky.typescriptServices.anon.AllowAutomaticSemicolonInsertion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParseOptions extends js.Object {
  var _allowAutomaticSemicolonInsertion: js.Any = js.native
  var _languageVersion: js.Any = js.native
  def allowAutomaticSemicolonInsertion(): Boolean = js.native
  def languageVersion(): LanguageVersion = js.native
  def toJSON(key: js.Any): AllowAutomaticSemicolonInsertion = js.native
}

object ParseOptions {
  @scala.inline
  def apply(
    _allowAutomaticSemicolonInsertion: js.Any,
    _languageVersion: js.Any,
    allowAutomaticSemicolonInsertion: () => Boolean,
    languageVersion: () => LanguageVersion,
    toJSON: js.Any => AllowAutomaticSemicolonInsertion
  ): ParseOptions = {
    val __obj = js.Dynamic.literal(_allowAutomaticSemicolonInsertion = _allowAutomaticSemicolonInsertion.asInstanceOf[js.Any], _languageVersion = _languageVersion.asInstanceOf[js.Any], allowAutomaticSemicolonInsertion = js.Any.fromFunction0(allowAutomaticSemicolonInsertion), languageVersion = js.Any.fromFunction0(languageVersion), toJSON = js.Any.fromFunction1(toJSON))
    __obj.asInstanceOf[ParseOptions]
  }
  @scala.inline
  implicit class ParseOptionsOps[Self <: ParseOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_allowAutomaticSemicolonInsertion(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_allowAutomaticSemicolonInsertion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_languageVersion(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_languageVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowAutomaticSemicolonInsertion(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowAutomaticSemicolonInsertion")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLanguageVersion(value: () => LanguageVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageVersion")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToJSON(value: js.Any => AllowAutomaticSemicolonInsertion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

