package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An object specifiying the concepts enrichment and related parameters. */
@js.native
trait NluEnrichmentConcepts extends js.Object {
  /** The maximum number of concepts enrichments to extact from each instance of the specified field. */
  var limit: js.UndefOr[Double] = js.native
}

object NluEnrichmentConcepts {
  @scala.inline
  def apply(): NluEnrichmentConcepts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NluEnrichmentConcepts]
  }
  @scala.inline
  implicit class NluEnrichmentConceptsOps[Self <: NluEnrichmentConcepts] (val x: Self) extends AnyVal {
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

