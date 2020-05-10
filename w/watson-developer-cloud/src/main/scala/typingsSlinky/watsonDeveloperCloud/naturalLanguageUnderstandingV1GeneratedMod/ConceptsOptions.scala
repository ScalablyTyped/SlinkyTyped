package typingsSlinky.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Returns high-level concepts in the content. For example, a research paper about deep learning might return the concept, "Artificial Intelligence" although the term is not mentioned. Supported languages: English, French, German, Italian, Japanese, Korean, Portuguese, Spanish. */
@js.native
trait ConceptsOptions extends js.Object {
  /** Maximum number of concepts to return. */
  var limit: js.UndefOr[Double] = js.native
}

object ConceptsOptions {
  @scala.inline
  def apply(): ConceptsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConceptsOptions]
  }
  @scala.inline
  implicit class ConceptsOptionsOps[Self <: ConceptsOptions] (val x: Self) extends AnyVal {
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
  }
  
}

