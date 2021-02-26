package typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Word. */
@js.native
trait Word extends StObject {
  
  /** **Japanese only.** The part of speech for the word. The service uses the value to produce the correct intonation for the word. You can create only a single entry, with or without a single part of speech, for any word; you cannot create multiple entries with different parts of speech for the same word. For more information, see [Working with Japanese entries](https://cloud.ibm.com/docs/services/text-to-speech/custom-rules.html#jaNotes). */
  var part_of_speech: js.UndefOr[String] = js.native
  
  /** The phonetic or sounds-like translation for the word. A phonetic translation is based on the SSML format for representing the phonetic string of a word either as an IPA or IBM SPR translation. A sounds-like translation consists of one or more words that, when combined, sound like the word. */
  var translation: String = js.native
  
  /** A word from the custom voice model. */
  var word: String = js.native
}
object Word {
  
  @scala.inline
  def apply(translation: String, word: String): Word = {
    val __obj = js.Dynamic.literal(translation = translation.asInstanceOf[js.Any], word = word.asInstanceOf[js.Any])
    __obj.asInstanceOf[Word]
  }
  
  @scala.inline
  implicit class WordMutableBuilder[Self <: Word] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPart_of_speech(value: String): Self = StObject.set(x, "part_of_speech", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPart_of_speechUndefined: Self = StObject.set(x, "part_of_speech", js.undefined)
    
    @scala.inline
    def setTranslation(value: String): Self = StObject.set(x, "translation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWord(value: String): Self = StObject.set(x, "word", value.asInstanceOf[js.Any])
  }
}
