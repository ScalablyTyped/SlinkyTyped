package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirstParent extends js.Object {
  var firstParent: scala.Double = js.native
  var fullHistory: scala.Double = js.native
  var fullHistorySimplifyMerges: scala.Double = js.native
  var simplifiedHistory: scala.Double = js.native
}

object FirstParent {
  @scala.inline
  def apply(
    firstParent: scala.Double,
    fullHistory: scala.Double,
    fullHistorySimplifyMerges: scala.Double,
    simplifiedHistory: scala.Double
  ): FirstParent = {
    val __obj = js.Dynamic.literal(firstParent = firstParent.asInstanceOf[js.Any], fullHistory = fullHistory.asInstanceOf[js.Any], fullHistorySimplifyMerges = fullHistorySimplifyMerges.asInstanceOf[js.Any], simplifiedHistory = simplifiedHistory.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirstParent]
  }
  @scala.inline
  implicit class FirstParentOps[Self <: FirstParent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFirstParent(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstParent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFullHistory(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullHistory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFullHistorySimplifyMerges(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullHistorySimplifyMerges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSimplifiedHistory(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simplifiedHistory")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

