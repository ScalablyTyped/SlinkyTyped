package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntersectionObserverEntryInit extends js.Object {
  var boundingClientRect: DOMRectInit = js.native
  var intersectionRatio: Double = js.native
  var intersectionRect: DOMRectInit = js.native
  var isIntersecting: scala.Boolean = js.native
  var rootBounds: DOMRectInit | Null = js.native
  var target: org.scalajs.dom.raw.Element = js.native
  var time: Double = js.native
}

object IntersectionObserverEntryInit {
  @scala.inline
  def apply(
    boundingClientRect: DOMRectInit,
    intersectionRatio: Double,
    intersectionRect: DOMRectInit,
    isIntersecting: scala.Boolean,
    target: org.scalajs.dom.raw.Element,
    time: Double
  ): IntersectionObserverEntryInit = {
    val __obj = js.Dynamic.literal(boundingClientRect = boundingClientRect.asInstanceOf[js.Any], intersectionRatio = intersectionRatio.asInstanceOf[js.Any], intersectionRect = intersectionRect.asInstanceOf[js.Any], isIntersecting = isIntersecting.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntersectionObserverEntryInit]
  }
  @scala.inline
  implicit class IntersectionObserverEntryInitOps[Self <: IntersectionObserverEntryInit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoundingClientRect(value: DOMRectInit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundingClientRect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIntersectionRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intersectionRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIntersectionRect(value: DOMRectInit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intersectionRect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsIntersecting(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIntersecting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: org.scalajs.dom.raw.Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRootBounds(value: DOMRectInit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootBounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRootBoundsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootBounds")(null)
        ret
    }
  }
  
}

