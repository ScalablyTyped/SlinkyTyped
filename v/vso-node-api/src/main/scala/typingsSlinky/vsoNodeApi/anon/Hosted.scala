package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hosted extends js.Object {
  var all: scala.Double = js.native
  var hosted: scala.Double = js.native
  var onPremises: scala.Double = js.native
}

object Hosted {
  @scala.inline
  def apply(all: scala.Double, hosted: scala.Double, onPremises: scala.Double): Hosted = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], hosted = hosted.asInstanceOf[js.Any], onPremises = onPremises.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hosted]
  }
  @scala.inline
  implicit class HostedOps[Self <: Hosted] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAll(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHosted(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hosted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnPremises(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPremises")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

