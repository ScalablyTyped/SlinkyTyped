package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StereoPannerOptions extends AudioNodeOptions {
  var pan: js.UndefOr[Double] = js.native
}

object StereoPannerOptions {
  @scala.inline
  def apply(): StereoPannerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StereoPannerOptions]
  }
  @scala.inline
  implicit class StereoPannerOptionsOps[Self <: StereoPannerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPan(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pan")(js.undefined)
        ret
    }
  }
  
}

