package typingsSlinky.wordpressWordcount.mod

import typingsSlinky.wordpressWordcount.AnonShortcodes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Settings extends js.Object {
  var HTMLEntityRegExp: js.RegExp = js.native
  var HTMLRegExp: js.RegExp = js.native
  var HTMLcommentRegExp: js.RegExp = js.native
  var astralRegExp: js.RegExp = js.native
  var characters_excluding_spacesRegExp: js.RegExp = js.native
  var characters_including_spacesRegExp: js.RegExp = js.native
  var connectorRegExp: js.RegExp = js.native
  var l10n: AnonShortcodes = js.native
  /** Characters to be removed from input text. */
  var removeRegExp: js.RegExp = js.native
  var spaceRegExp: js.RegExp = js.native
  var wordsRegExp: js.RegExp = js.native
}

object Settings {
  @scala.inline
  def apply(
    HTMLEntityRegExp: js.RegExp,
    HTMLRegExp: js.RegExp,
    HTMLcommentRegExp: js.RegExp,
    astralRegExp: js.RegExp,
    characters_excluding_spacesRegExp: js.RegExp,
    characters_including_spacesRegExp: js.RegExp,
    connectorRegExp: js.RegExp,
    l10n: AnonShortcodes,
    removeRegExp: js.RegExp,
    spaceRegExp: js.RegExp,
    wordsRegExp: js.RegExp
  ): Settings = {
    val __obj = js.Dynamic.literal(HTMLEntityRegExp = HTMLEntityRegExp.asInstanceOf[js.Any], HTMLRegExp = HTMLRegExp.asInstanceOf[js.Any], HTMLcommentRegExp = HTMLcommentRegExp.asInstanceOf[js.Any], astralRegExp = astralRegExp.asInstanceOf[js.Any], characters_excluding_spacesRegExp = characters_excluding_spacesRegExp.asInstanceOf[js.Any], characters_including_spacesRegExp = characters_including_spacesRegExp.asInstanceOf[js.Any], connectorRegExp = connectorRegExp.asInstanceOf[js.Any], l10n = l10n.asInstanceOf[js.Any], removeRegExp = removeRegExp.asInstanceOf[js.Any], spaceRegExp = spaceRegExp.asInstanceOf[js.Any], wordsRegExp = wordsRegExp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
  @scala.inline
  implicit class SettingsOps[Self <: Settings] (val x: Self) extends AnyVal {
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
    def withHTMLRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HTMLRegExp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHTMLcommentRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HTMLcommentRegExp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAstralRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("astralRegExp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharacters_excluding_spacesRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("characters_excluding_spacesRegExp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharacters_including_spacesRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("characters_including_spacesRegExp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnectorRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectorRegExp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withL10n(value: AnonShortcodes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("l10n")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeRegExp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpaceRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spaceRegExp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordsRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordsRegExp")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

