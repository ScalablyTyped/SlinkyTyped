package typingsSlinky.wordpressWordcount.mod

import typingsSlinky.wordpressWordcount.AnonShortcodes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var HTMLEntityRegExp: js.RegExp
  var HTMLRegExp: js.RegExp
  var HTMLcommentRegExp: js.RegExp
  var astralRegExp: js.RegExp
  var characters_excluding_spacesRegExp: js.RegExp
  var characters_including_spacesRegExp: js.RegExp
  var connectorRegExp: js.RegExp
  var l10n: AnonShortcodes
  /** Characters to be removed from input text. */
  var removeRegExp: js.RegExp
  var spaceRegExp: js.RegExp
  var wordsRegExp: js.RegExp
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
}

