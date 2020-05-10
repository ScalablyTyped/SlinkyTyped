package typingsSlinky.tinder.mod

import typingsSlinky.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * When out of recommendations it is set to "out of recs", a possible value is also "recs timeout",
  * otherwise does not seem to be used
  */
@js.native
trait TinderRecommendationsResult extends js.Object {
  var message: js.UndefOr[String] = js.native
  var results: js.Array[TinderRecommendation] = js.native
  var status: Number = js.native
}

object TinderRecommendationsResult {
  @scala.inline
  def apply(results: js.Array[TinderRecommendation], status: Number): TinderRecommendationsResult = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[TinderRecommendationsResult]
  }
  @scala.inline
  implicit class TinderRecommendationsResultOps[Self <: TinderRecommendationsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResults(value: js.Array[TinderRecommendation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: Number): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
  }
  
}

