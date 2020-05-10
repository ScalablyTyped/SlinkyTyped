package typingsSlinky.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A JavaScript object holding `animated` and `duration` properties. Used on iOS For [TablewView](Titanium.UI.TableView) and [ListView](Titanium.UI.ListView) content offset transitions.
  */
@js.native
trait AnimatedWithDurationOptions extends AnimatedOptions {
  /**
  	 * The duration in `milliseconds` for animation
  	 */
  var duration: js.UndefOr[Double] = js.native
}

object AnimatedWithDurationOptions {
  @scala.inline
  def apply(): AnimatedWithDurationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimatedWithDurationOptions]
  }
  @scala.inline
  implicit class AnimatedWithDurationOptionsOps[Self <: AnimatedWithDurationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
  }
  
}

