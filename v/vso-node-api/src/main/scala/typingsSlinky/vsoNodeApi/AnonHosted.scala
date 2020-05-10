package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHosted extends js.Object {
  var all: Double = js.native
  var hosted: Double = js.native
  var onPremises: Double = js.native
}

object AnonHosted {
  @scala.inline
  def apply(all: Double, hosted: Double, onPremises: Double): AnonHosted = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], hosted = hosted.asInstanceOf[js.Any], onPremises = onPremises.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHosted]
  }
  @scala.inline
  implicit class AnonHostedOps[Self <: AnonHosted] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAll(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHosted(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hosted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnPremises(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPremises")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

