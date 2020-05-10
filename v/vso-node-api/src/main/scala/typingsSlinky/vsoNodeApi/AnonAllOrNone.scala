package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAllOrNone extends js.Object {
  var allOrNone: Double = js.native
  var bestEffort: Double = js.native
}

object AnonAllOrNone {
  @scala.inline
  def apply(allOrNone: Double, bestEffort: Double): AnonAllOrNone = {
    val __obj = js.Dynamic.literal(allOrNone = allOrNone.asInstanceOf[js.Any], bestEffort = bestEffort.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAllOrNone]
  }
  @scala.inline
  implicit class AnonAllOrNoneOps[Self <: AnonAllOrNone] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllOrNone(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allOrNone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBestEffort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bestEffort")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

