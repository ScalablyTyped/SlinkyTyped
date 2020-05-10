package typingsSlinky.watsonDeveloperCloud.v3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** TranslationResult. */
@js.native
trait TranslationResult extends js.Object {
  /** Number of characters in the input text. */
  var character_count: Double = js.native
  /** List of translation output in UTF-8, corresponding to the input text entries. */
  var translations: js.Array[Translation] = js.native
  /** Number of words in the input text. */
  var word_count: Double = js.native
}

object TranslationResult {
  @scala.inline
  def apply(character_count: Double, translations: js.Array[Translation], word_count: Double): TranslationResult = {
    val __obj = js.Dynamic.literal(character_count = character_count.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], word_count = word_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranslationResult]
  }
  @scala.inline
  implicit class TranslationResultOps[Self <: TranslationResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCharacter_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("character_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTranslations(value: js.Array[Translation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWord_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("word_count")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

