package typingsSlinky.wordpressWordcount.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@wordpress/wordcount.@wordpress/wordcount.Settings> */
trait PartialSettings extends js.Object {
  var HTMLEntityRegExp: js.UndefOr[js.RegExp] = js.undefined
  var HTMLRegExp: js.UndefOr[js.RegExp] = js.undefined
  var HTMLcommentRegExp: js.UndefOr[js.RegExp] = js.undefined
  var astralRegExp: js.UndefOr[js.RegExp] = js.undefined
  var characters_excluding_spacesRegExp: js.UndefOr[js.RegExp] = js.undefined
  var characters_including_spacesRegExp: js.UndefOr[js.RegExp] = js.undefined
  var connectorRegExp: js.UndefOr[js.RegExp] = js.undefined
  var l10n: js.UndefOr[Shortcodes] = js.undefined
  var removeRegExp: js.UndefOr[js.RegExp] = js.undefined
  var spaceRegExp: js.UndefOr[js.RegExp] = js.undefined
  var wordsRegExp: js.UndefOr[js.RegExp] = js.undefined
}

object PartialSettings {
  @scala.inline
  def apply(
    HTMLEntityRegExp: js.RegExp = null,
    HTMLRegExp: js.RegExp = null,
    HTMLcommentRegExp: js.RegExp = null,
    astralRegExp: js.RegExp = null,
    characters_excluding_spacesRegExp: js.RegExp = null,
    characters_including_spacesRegExp: js.RegExp = null,
    connectorRegExp: js.RegExp = null,
    l10n: Shortcodes = null,
    removeRegExp: js.RegExp = null,
    spaceRegExp: js.RegExp = null,
    wordsRegExp: js.RegExp = null
  ): PartialSettings = {
    val __obj = js.Dynamic.literal()
    if (HTMLEntityRegExp != null) __obj.updateDynamic("HTMLEntityRegExp")(HTMLEntityRegExp.asInstanceOf[js.Any])
    if (HTMLRegExp != null) __obj.updateDynamic("HTMLRegExp")(HTMLRegExp.asInstanceOf[js.Any])
    if (HTMLcommentRegExp != null) __obj.updateDynamic("HTMLcommentRegExp")(HTMLcommentRegExp.asInstanceOf[js.Any])
    if (astralRegExp != null) __obj.updateDynamic("astralRegExp")(astralRegExp.asInstanceOf[js.Any])
    if (characters_excluding_spacesRegExp != null) __obj.updateDynamic("characters_excluding_spacesRegExp")(characters_excluding_spacesRegExp.asInstanceOf[js.Any])
    if (characters_including_spacesRegExp != null) __obj.updateDynamic("characters_including_spacesRegExp")(characters_including_spacesRegExp.asInstanceOf[js.Any])
    if (connectorRegExp != null) __obj.updateDynamic("connectorRegExp")(connectorRegExp.asInstanceOf[js.Any])
    if (l10n != null) __obj.updateDynamic("l10n")(l10n.asInstanceOf[js.Any])
    if (removeRegExp != null) __obj.updateDynamic("removeRegExp")(removeRegExp.asInstanceOf[js.Any])
    if (spaceRegExp != null) __obj.updateDynamic("spaceRegExp")(spaceRegExp.asInstanceOf[js.Any])
    if (wordsRegExp != null) __obj.updateDynamic("wordsRegExp")(wordsRegExp.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialSettings]
  }
}

