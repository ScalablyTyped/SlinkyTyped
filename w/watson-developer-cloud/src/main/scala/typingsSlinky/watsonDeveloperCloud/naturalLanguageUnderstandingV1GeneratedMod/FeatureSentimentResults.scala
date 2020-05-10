package typingsSlinky.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FeatureSentimentResults. */
@js.native
trait FeatureSentimentResults extends js.Object {
  /** Sentiment score from -1 (negative) to 1 (positive). */
  var score: js.UndefOr[Double] = js.native
}

object FeatureSentimentResults {
  @scala.inline
  def apply(): FeatureSentimentResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureSentimentResults]
  }
  @scala.inline
  implicit class FeatureSentimentResultsOps[Self <: FeatureSentimentResults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

