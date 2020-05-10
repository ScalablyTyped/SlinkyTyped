package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFirstParent extends js.Object {
  var firstParent: Double = js.native
  var fullHistory: Double = js.native
  var fullHistorySimplifyMerges: Double = js.native
  var simplifiedHistory: Double = js.native
}

object AnonFirstParent {
  @scala.inline
  def apply(
    firstParent: Double,
    fullHistory: Double,
    fullHistorySimplifyMerges: Double,
    simplifiedHistory: Double
  ): AnonFirstParent = {
    val __obj = js.Dynamic.literal(firstParent = firstParent.asInstanceOf[js.Any], fullHistory = fullHistory.asInstanceOf[js.Any], fullHistorySimplifyMerges = fullHistorySimplifyMerges.asInstanceOf[js.Any], simplifiedHistory = simplifiedHistory.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFirstParent]
  }
  @scala.inline
  implicit class AnonFirstParentOps[Self <: AnonFirstParent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFirstParent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstParent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFullHistory(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullHistory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFullHistorySimplifyMerges(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullHistorySimplifyMerges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSimplifiedHistory(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simplifiedHistory")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

