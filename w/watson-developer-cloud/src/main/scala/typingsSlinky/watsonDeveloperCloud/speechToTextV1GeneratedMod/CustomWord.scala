package typingsSlinky.watsonDeveloperCloud.speechToTextV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** CustomWord. */
@js.native
trait CustomWord extends js.Object {
  /** An alternative spelling for the custom word when it appears in a transcript. Use the parameter when you want the word to have a spelling that is different from its usual representation or from its spelling in corpora training data. */
  var display_as: js.UndefOr[String] = js.native
  /** An array of sounds-like pronunciations for the custom word. Specify how words that are difficult to pronounce, foreign words, acronyms, and so on can be pronounced by users. * For a word that is not in the service's base vocabulary, omit the parameter to have the service automatically generate a sounds-like pronunciation for the word. * For a word that is in the service's base vocabulary, use the parameter to specify additional pronunciations for the word. You cannot override the default pronunciation of a word; pronunciations you add augment the pronunciation from the base vocabulary. A word can have at most five sounds-like pronunciations. A pronunciation can include at most 40 characters not including spaces. */
  var sounds_like: js.UndefOr[js.Array[String]] = js.native
  /** For the **Add custom words** method, you must specify the custom word that is to be added to or updated in the custom model. Do not include spaces in the word. Use a `-` (dash) or `_` (underscore) to connect the tokens of compound words. Omit this parameter for the **Add a custom word** method. */
  var word: js.UndefOr[String] = js.native
}

object CustomWord {
  @scala.inline
  def apply(): CustomWord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomWord]
  }
  @scala.inline
  implicit class CustomWordOps[Self <: CustomWord] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplay_as(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display_as")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplay_as: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display_as")(js.undefined)
        ret
    }
    @scala.inline
    def withSounds_like(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sounds_like")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSounds_like: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sounds_like")(js.undefined)
        ret
    }
    @scala.inline
    def withWord(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("word")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWord: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("word")(js.undefined)
        ret
    }
  }
  
}

