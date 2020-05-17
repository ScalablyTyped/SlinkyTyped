package typingsSlinky.subscribeUiEvent.anon

import typingsSlinky.subscribeUiEvent.subscribeUiEventStrings._empty
import typingsSlinky.subscribeUiEvent.subscribeUiEventStrings.x
import typingsSlinky.subscribeUiEvent.subscribeUiEventStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AxisIntention extends js.Object {
  var axisIntention: x | y | _empty = js.native
  var deltaX: Double = js.native
  var deltaY: Double = js.native
  var startX: Double = js.native
  var startY: Double = js.native
}

object AxisIntention {
  @scala.inline
  def apply(axisIntention: x | y | _empty, deltaX: Double, deltaY: Double, startX: Double, startY: Double): AxisIntention = {
    val __obj = js.Dynamic.literal(axisIntention = axisIntention.asInstanceOf[js.Any], deltaX = deltaX.asInstanceOf[js.Any], deltaY = deltaY.asInstanceOf[js.Any], startX = startX.asInstanceOf[js.Any], startY = startY.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisIntention]
  }
  @scala.inline
  implicit class AxisIntentionOps[Self <: AxisIntention] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAxisIntention(value: typingsSlinky.subscribeUiEvent.subscribeUiEventStrings.x | y | _empty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisIntention")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeltaX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deltaX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeltaY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deltaY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startY")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

