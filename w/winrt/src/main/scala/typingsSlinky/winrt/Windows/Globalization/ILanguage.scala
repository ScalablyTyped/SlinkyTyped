package typingsSlinky.winrt.Windows.Globalization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILanguage extends js.Object {
  var displayName: String = js.native
  var languageTag: String = js.native
  var nativeName: String = js.native
  var script: String = js.native
}

object ILanguage {
  @scala.inline
  def apply(displayName: String, languageTag: String, nativeName: String, script: String): ILanguage = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], languageTag = languageTag.asInstanceOf[js.Any], nativeName = nativeName.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILanguage]
  }
  @scala.inline
  implicit class ILanguageOps[Self <: ILanguage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguageTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNativeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScript(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("script")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

