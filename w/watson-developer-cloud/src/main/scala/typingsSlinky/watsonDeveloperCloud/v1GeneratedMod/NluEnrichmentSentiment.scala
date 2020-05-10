package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An object specifying the sentiment extraction enrichment and related parameters. */
@js.native
trait NluEnrichmentSentiment extends js.Object {
  /** When `true`, sentiment analysis is performed on the entire field. */
  var document: js.UndefOr[Boolean] = js.native
  /** A comma-separated list of target strings that will have any associated sentiment analyzed. */
  var targets: js.UndefOr[js.Array[String]] = js.native
}

object NluEnrichmentSentiment {
  @scala.inline
  def apply(): NluEnrichmentSentiment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NluEnrichmentSentiment]
  }
  @scala.inline
  implicit class NluEnrichmentSentimentOps[Self <: NluEnrichmentSentiment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocument(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocument: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document")(js.undefined)
        ret
    }
    @scala.inline
    def withTargets(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targets")(js.undefined)
        ret
    }
  }
  
}

