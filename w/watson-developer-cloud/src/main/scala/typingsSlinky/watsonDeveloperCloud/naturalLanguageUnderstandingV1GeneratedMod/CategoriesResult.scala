package typingsSlinky.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A categorization of the analyzed text. */
@js.native
trait CategoriesResult extends js.Object {
  /** The path to the category through the 5-level taxonomy hierarchy. For the complete list of categories, see the [Categories hierarchy](https://cloud.ibm.com/docs/services/natural-language-understanding/categories.html#categories-hierarchy) documentation. */
  var label: js.UndefOr[String] = js.native
  /** Confidence score for the category classification. Higher values indicate greater confidence. */
  var score: js.UndefOr[Double] = js.native
}

object CategoriesResult {
  @scala.inline
  def apply(): CategoriesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CategoriesResult]
  }
  @scala.inline
  implicit class CategoriesResultOps[Self <: CategoriesResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withScore(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("score")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("score")(js.undefined)
        ret
    }
  }
  
}

