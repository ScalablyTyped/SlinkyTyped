package typingsSlinky.winrtUwp.global.Windows.Globalization

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Reads a Japanese string that is a combination of Kanji characters and Hiragana characters, and returns a collection of proper readings from the string with word breaks. */
@JSGlobal("Windows.Globalization.JapanesePhoneticAnalyzer")
@js.native
abstract class JapanesePhoneticAnalyzer ()
  extends typingsSlinky.winrtUwp.Windows.Globalization.JapanesePhoneticAnalyzer
/* static members */
@JSGlobal("Windows.Globalization.JapanesePhoneticAnalyzer")
@js.native
object JapanesePhoneticAnalyzer extends js.Object {
  
  /**
    * Reads a Japanese string that is a combination of Kanji characters and Hiragana characters, and returns a collection of proper readings from the string with word breaks.
    * @param input A Japanese string that is a combination of Kanji characters and Hiragana characters.
    * @return A collection of JapanesePhoneme objects that represent proper readings from the string with word breaks.
    */
  def getWords(input: String): IVectorView[typingsSlinky.winrtUwp.Windows.Globalization.JapanesePhoneme] = js.native
  /**
    * Reads a Japanese string that is a combination of Kanji characters and Hiragana characters, and returns a collection of proper readings from the string with word breaks. Optionally uses the "Mono Ruby" strategy in breaking multi-Kanji words into multiple Kanji words.
    * @param input A Japanese string that is a combination of Kanji characters and Hiragana characters.
    * @param monoRuby Specifies the use of the word-breaking strategy "Mono Ruby".
    * @return A collection of JapanesePhoneme objects that represent proper readings from the string with word breaks.
    */
  def getWords(input: String, monoRuby: Boolean): IVectorView[typingsSlinky.winrtUwp.Windows.Globalization.JapanesePhoneme] = js.native
}
