package typingsSlinky.slickCarousel.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CurX extends js.Object {
  var curX: js.UndefOr[Double] = js.native
  var curY: js.UndefOr[Double] = js.native
  var edgeHit: js.UndefOr[Boolean] = js.native
  var fingerCount: js.UndefOr[Double] = js.native
  var minSwipe: js.UndefOr[Double] = js.native
  var startX: js.UndefOr[Double] = js.native
  var startY: js.UndefOr[Double] = js.native
  var swipeLength: js.UndefOr[Double] = js.native
  var verticalSwiping: js.UndefOr[Boolean] = js.native
}

object CurX {
  @scala.inline
  def apply(): CurX = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CurX]
  }
  @scala.inline
  implicit class CurXOps[Self <: CurX] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("curX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("curX")(js.undefined)
        ret
    }
    @scala.inline
    def withCurY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("curY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("curY")(js.undefined)
        ret
    }
    @scala.inline
    def withEdgeHit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeHit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdgeHit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeHit")(js.undefined)
        ret
    }
    @scala.inline
    def withFingerCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fingerCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFingerCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fingerCount")(js.undefined)
        ret
    }
    @scala.inline
    def withMinSwipe(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSwipe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinSwipe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSwipe")(js.undefined)
        ret
    }
    @scala.inline
    def withStartX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startX")(js.undefined)
        ret
    }
    @scala.inline
    def withStartY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startY")(js.undefined)
        ret
    }
    @scala.inline
    def withSwipeLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwipeLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeLength")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalSwiping(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalSwiping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalSwiping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalSwiping")(js.undefined)
        ret
    }
  }
  
}

