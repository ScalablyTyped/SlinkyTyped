package typingsSlinky.skinTone

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  Change the skin tone of an emoji 👌👌🏻👌🏼👌🏽👌🏾👌🏿.
  @param emoji - Emoji to modify.
  @param tone - Skin tone to use for `emoji`.
  - `'none'`       :      *(Removes skin tone)*
  - `'white'`      : 🏻   *(Fitzpatrick Type-1–2)*
  - `'creamWhite'` : 🏼   *(Fitzpatrick Type-3)*
  - `'lightBrown'` : 🏽   *(Fitzpatrick Type-4)*
  - `'brown'`      : 🏾   *(Fitzpatrick Type-5)*
  - `'darkBrown'`  : 🏿   *(Fitzpatrick Type-6)*
  @example
  ```
  import skinTone = require('skin-tone');
  skinTone('👍', 'brown');
  //=> '👍🏾'
  skinTone('👍', 'white');
  //=> '👍🏻'
  // can also remove skin tone
  skinTone('👍🏾', 'none');
  //=> '👍'
  // just passes it through when not supported
  skinTone('🦄', 'darkBrown');
  //=> '🦄'
  ```
  */
  @JSImport("skin-tone", JSImport.Namespace)
  @js.native
  def apply(emoji: String, tone: Tone): String = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.skinTone.skinToneStrings.none
    - typingsSlinky.skinTone.skinToneStrings.white
    - typingsSlinky.skinTone.skinToneStrings.creamWhite
    - typingsSlinky.skinTone.skinToneStrings.lightBrown
    - typingsSlinky.skinTone.skinToneStrings.brown
    - typingsSlinky.skinTone.skinToneStrings.darkBrown
  */
  trait Tone extends StObject
  object Tone {
    
    @scala.inline
    def brown: typingsSlinky.skinTone.skinToneStrings.brown = "brown".asInstanceOf[typingsSlinky.skinTone.skinToneStrings.brown]
    
    @scala.inline
    def creamWhite: typingsSlinky.skinTone.skinToneStrings.creamWhite = "creamWhite".asInstanceOf[typingsSlinky.skinTone.skinToneStrings.creamWhite]
    
    @scala.inline
    def darkBrown: typingsSlinky.skinTone.skinToneStrings.darkBrown = "darkBrown".asInstanceOf[typingsSlinky.skinTone.skinToneStrings.darkBrown]
    
    @scala.inline
    def lightBrown: typingsSlinky.skinTone.skinToneStrings.lightBrown = "lightBrown".asInstanceOf[typingsSlinky.skinTone.skinToneStrings.lightBrown]
    
    @scala.inline
    def none: typingsSlinky.skinTone.skinToneStrings.none = "none".asInstanceOf[typingsSlinky.skinTone.skinToneStrings.none]
    
    @scala.inline
    def white: typingsSlinky.skinTone.skinToneStrings.white = "white".asInstanceOf[typingsSlinky.skinTone.skinToneStrings.white]
  }
}
