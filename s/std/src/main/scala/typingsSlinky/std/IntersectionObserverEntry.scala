package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This Intersection Observer API interface describes the intersection between the target element and its root container at a specific moment of transition. */
@js.native
trait IntersectionObserverEntry extends js.Object {
  val boundingClientRect: DOMRectReadOnly = js.native
  val intersectionRatio: Double = js.native
  val intersectionRect: DOMRectReadOnly = js.native
  val isIntersecting: scala.Boolean = js.native
  val rootBounds: DOMRectReadOnly | Null = js.native
  val target: org.scalajs.dom.raw.Element = js.native
  val time: Double = js.native
}

object IntersectionObserverEntry {
  @scala.inline
  def apply(
    boundingClientRect: DOMRectReadOnly,
    intersectionRatio: Double,
    intersectionRect: DOMRectReadOnly,
    isIntersecting: scala.Boolean,
    target: org.scalajs.dom.raw.Element,
    time: Double
  ): IntersectionObserverEntry = {
    val __obj = js.Dynamic.literal(boundingClientRect = boundingClientRect.asInstanceOf[js.Any], intersectionRatio = intersectionRatio.asInstanceOf[js.Any], intersectionRect = intersectionRect.asInstanceOf[js.Any], isIntersecting = isIntersecting.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntersectionObserverEntry]
  }
  @scala.inline
  implicit class IntersectionObserverEntryOps[Self <: IntersectionObserverEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoundingClientRect(value: DOMRectReadOnly): Self = {
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
    def withIntersectionRect(value: DOMRectReadOnly): Self = {
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
    def withRootBounds(value: DOMRectReadOnly): Self = {
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

