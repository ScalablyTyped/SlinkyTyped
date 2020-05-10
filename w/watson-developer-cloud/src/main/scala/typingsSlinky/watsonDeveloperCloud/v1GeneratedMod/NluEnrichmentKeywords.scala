package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An object specifying the Keyword enrichment and related parameters. */
@js.native
trait NluEnrichmentKeywords extends js.Object {
  /** When `true`, emotion detection of keywords will be performed on the specified field. */
  var emotion: js.UndefOr[Boolean] = js.native
  /** The maximum number of keywords to extract for each instance of the specified field. */
  var limit: js.UndefOr[Double] = js.native
  /** When `true`, sentiment analysis of keywords will be performed on the specified field. */
  var sentiment: js.UndefOr[Boolean] = js.native
}

object NluEnrichmentKeywords {
  @scala.inline
  def apply(): NluEnrichmentKeywords = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NluEnrichmentKeywords]
  }
  @scala.inline
  implicit class NluEnrichmentKeywordsOps[Self <: NluEnrichmentKeywords] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmotion(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emotion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmotion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emotion")(js.undefined)
        ret
    }
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
    def withSentiment(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sentiment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSentiment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sentiment")(js.undefined)
        ret
    }
  }
  
}

