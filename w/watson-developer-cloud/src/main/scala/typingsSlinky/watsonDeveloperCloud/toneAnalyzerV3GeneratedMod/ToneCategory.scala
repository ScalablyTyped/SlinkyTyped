package typingsSlinky.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** ToneCategory. */
@js.native
trait ToneCategory extends js.Object {
  /** The unique, non-localized identifier of the category for the results. The service can return results for the following category IDs: `emotion_tone`, `language_tone`, and `social_tone`. */
  var category_id: String = js.native
  /** The user-visible, localized name of the category. */
  var category_name: String = js.native
  /** An array of `ToneScore` objects that provides the results for the tones of the category. */
  var tones: js.Array[ToneScore] = js.native
}

object ToneCategory {
  @scala.inline
  def apply(category_id: String, category_name: String, tones: js.Array[ToneScore]): ToneCategory = {
    val __obj = js.Dynamic.literal(category_id = category_id.asInstanceOf[js.Any], category_name = category_name.asInstanceOf[js.Any], tones = tones.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToneCategory]
  }
  @scala.inline
  implicit class ToneCategoryOps[Self <: ToneCategory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCategory_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCategory_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTones(value: js.Array[ToneScore]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tones")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

