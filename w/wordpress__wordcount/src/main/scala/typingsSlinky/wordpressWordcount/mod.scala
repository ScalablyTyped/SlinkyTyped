package typingsSlinky.wordpressWordcount

import typingsSlinky.wordpressWordcount.anon.PartialSettings
import typingsSlinky.wordpressWordcount.anon.Shortcodes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@wordpress/wordcount", "count")
  @js.native
  def count(text: String, `type`: CountType): Double = js.native
  @JSImport("@wordpress/wordcount", "count")
  @js.native
  def count(text: String, `type`: CountType, userSettings: PartialSettings): Double = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.wordpressWordcount.wordpressWordcountStrings.words
    - typingsSlinky.wordpressWordcount.wordpressWordcountStrings.characters_excluding_spaces
    - typingsSlinky.wordpressWordcount.wordpressWordcountStrings.characters_including_spaces
  */
  trait CountType extends StObject
  object CountType {
    
    @scala.inline
    def characters_excluding_spaces: typingsSlinky.wordpressWordcount.wordpressWordcountStrings.characters_excluding_spaces = "characters_excluding_spaces".asInstanceOf[typingsSlinky.wordpressWordcount.wordpressWordcountStrings.characters_excluding_spaces]
    
    @scala.inline
    def characters_including_spaces: typingsSlinky.wordpressWordcount.wordpressWordcountStrings.characters_including_spaces = "characters_including_spaces".asInstanceOf[typingsSlinky.wordpressWordcount.wordpressWordcountStrings.characters_including_spaces]
    
    @scala.inline
    def words: typingsSlinky.wordpressWordcount.wordpressWordcountStrings.words = "words".asInstanceOf[typingsSlinky.wordpressWordcount.wordpressWordcountStrings.words]
  }
  
  @js.native
  trait Settings extends StObject {
    
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
    implicit class SettingsMutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAstralRegExp(value: js.RegExp): Self = StObject.set(x, "astralRegExp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharacters_excluding_spacesRegExp(value: js.RegExp): Self = StObject.set(x, "characters_excluding_spacesRegExp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharacters_including_spacesRegExp(value: js.RegExp): Self = StObject.set(x, "characters_including_spacesRegExp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectorRegExp(value: js.RegExp): Self = StObject.set(x, "connectorRegExp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHTMLEntityRegExp(value: js.RegExp): Self = StObject.set(x, "HTMLEntityRegExp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHTMLRegExp(value: js.RegExp): Self = StObject.set(x, "HTMLRegExp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHTMLcommentRegExp(value: js.RegExp): Self = StObject.set(x, "HTMLcommentRegExp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setL10n(value: Shortcodes): Self = StObject.set(x, "l10n", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveRegExp(value: js.RegExp): Self = StObject.set(x, "removeRegExp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpaceRegExp(value: js.RegExp): Self = StObject.set(x, "spaceRegExp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWordsRegExp(value: js.RegExp): Self = StObject.set(x, "wordsRegExp", value.asInstanceOf[js.Any])
    }
  }
}
