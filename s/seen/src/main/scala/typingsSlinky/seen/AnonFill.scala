package typingsSlinky.seen

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFill extends js.Object {
  var fill: js.UndefOr[String] = js.native
  var `fill-opacity`: js.UndefOr[Double] = js.native
  var `text-anchor`: js.UndefOr[String] = js.native
}

object AnonFill {
  @scala.inline
  def apply(): AnonFill = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonFill]
  }
  @scala.inline
  implicit class AnonFillOps[Self <: AnonFill] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFill(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(js.undefined)
        ret
    }
    @scala.inline
    def `withFill-opacity`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill-opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFill-opacity`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill-opacity")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-anchor`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-anchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-anchor`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-anchor")(js.undefined)
        ret
    }
  }
  
}

