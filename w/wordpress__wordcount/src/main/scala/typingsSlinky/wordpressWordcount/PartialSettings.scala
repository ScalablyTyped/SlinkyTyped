package typingsSlinky.wordpressWordcount

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@wordpress/wordcount.@wordpress/wordcount.Settings> */
@js.native
trait PartialSettings extends js.Object {
  var HTMLEntityRegExp: js.UndefOr[js.RegExp] = js.native
  var HTMLRegExp: js.UndefOr[js.RegExp] = js.native
  var HTMLcommentRegExp: js.UndefOr[js.RegExp] = js.native
  var astralRegExp: js.UndefOr[js.RegExp] = js.native
  var characters_excluding_spacesRegExp: js.UndefOr[js.RegExp] = js.native
  var characters_including_spacesRegExp: js.UndefOr[js.RegExp] = js.native
  var connectorRegExp: js.UndefOr[js.RegExp] = js.native
  var l10n: js.UndefOr[AnonShortcodes] = js.native
  var removeRegExp: js.UndefOr[js.RegExp] = js.native
  var spaceRegExp: js.UndefOr[js.RegExp] = js.native
  var wordsRegExp: js.UndefOr[js.RegExp] = js.native
}

object PartialSettings {
  @scala.inline
  def apply(): PartialSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSettings]
  }
  @scala.inline
  implicit class PartialSettingsOps[Self <: PartialSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHTMLEntityRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HTMLEntityRegExp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHTMLEntityRegExp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HTMLEntityRegExp")(js.undefined)
        ret
    }
    @scala.inline
    def withHTMLRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HTMLRegExp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHTMLRegExp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HTMLRegExp")(js.undefined)
        ret
    }
    @scala.inline
    def withHTMLcommentRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HTMLcommentRegExp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHTMLcommentRegExp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HTMLcommentRegExp")(js.undefined)
        ret
    }
    @scala.inline
    def withAstralRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("astralRegExp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAstralRegExp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("astralRegExp")(js.undefined)
        ret
    }
    @scala.inline
    def withCharacters_excluding_spacesRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("characters_excluding_spacesRegExp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCharacters_excluding_spacesRegExp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("characters_excluding_spacesRegExp")(js.undefined)
        ret
    }
    @scala.inline
    def withCharacters_including_spacesRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("characters_including_spacesRegExp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCharacters_including_spacesRegExp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("characters_including_spacesRegExp")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectorRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectorRegExp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectorRegExp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectorRegExp")(js.undefined)
        ret
    }
    @scala.inline
    def withL10n(value: AnonShortcodes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("l10n")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutL10n: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("l10n")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeRegExp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveRegExp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeRegExp")(js.undefined)
        ret
    }
    @scala.inline
    def withSpaceRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spaceRegExp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpaceRegExp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spaceRegExp")(js.undefined)
        ret
    }
    @scala.inline
    def withWordsRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordsRegExp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWordsRegExp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordsRegExp")(js.undefined)
        ret
    }
  }
  
}

