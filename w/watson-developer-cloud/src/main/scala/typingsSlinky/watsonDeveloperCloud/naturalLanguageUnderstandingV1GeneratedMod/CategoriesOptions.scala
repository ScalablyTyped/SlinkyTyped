package typingsSlinky.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Returns a five-level taxonomy of the content. The top three categories are returned. Supported languages: Arabic, English, French, German, Italian, Japanese, Korean, Portuguese, Spanish. */
@js.native
trait CategoriesOptions extends js.Object {
  /** Maximum number of categories to return. */
  var limit: js.UndefOr[Double] = js.native
  /** Enter a [custom model](https://cloud.ibm.com/docs/services/natural-language-understanding/customizing.html) ID to override the standard categories model. */
  var model: js.UndefOr[String] = js.native
}

object CategoriesOptions {
  @scala.inline
  def apply(): CategoriesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CategoriesOptions]
  }
  @scala.inline
  implicit class CategoriesOptionsOps[Self <: CategoriesOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.undefined)
        ret
    }
    @scala.inline
    def withModel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(js.undefined)
        ret
    }
  }
  
}

