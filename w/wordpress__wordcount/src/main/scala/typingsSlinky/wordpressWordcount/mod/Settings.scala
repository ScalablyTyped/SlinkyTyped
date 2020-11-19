package typingsSlinky.wordpressWordcount.mod

import typingsSlinky.wordpressWordcount.anon.Shortcodes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Settings extends js.Object {
  
  var HTMLEntityRegExp: js.RegExp = js.native
  
  var HTMLRegExp: js.RegExp = js.native
  
  var HTMLcommentRegExp: js.RegExp = js.native
  
  var astralRegExp: js.RegExp = js.native
  
  var characters_excluding_spacesRegExp: js.RegExp = js.native
  
  var characters_including_spacesRegExp: js.RegExp = js.native
  
  var connectorRegExp: js.RegExp = js.native
  
  var l10n: Shortcodes = js.native
  
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
    l10n: Shortcodes,
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHTMLEntityRegExp(value: js.RegExp): Self = this.set("HTMLEntityRegExp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHTMLRegExp(value: js.RegExp): Self = this.set("HTMLRegExp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHTMLcommentRegExp(value: js.RegExp): Self = this.set("HTMLcommentRegExp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAstralRegExp(value: js.RegExp): Self = this.set("astralRegExp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharacters_excluding_spacesRegExp(value: js.RegExp): Self = this.set("characters_excluding_spacesRegExp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharacters_including_spacesRegExp(value: js.RegExp): Self = this.set("characters_including_spacesRegExp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectorRegExp(value: js.RegExp): Self = this.set("connectorRegExp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setL10n(value: Shortcodes): Self = this.set("l10n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveRegExp(value: js.RegExp): Self = this.set("removeRegExp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaceRegExp(value: js.RegExp): Self = this.set("spaceRegExp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordsRegExp(value: js.RegExp): Self = this.set("wordsRegExp", value.asInstanceOf[js.Any])
  }
}
