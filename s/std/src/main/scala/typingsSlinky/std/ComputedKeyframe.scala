package typingsSlinky.std

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComputedKeyframe
  extends /* property */ StringDictionary[js.UndefOr[java.lang.String | Double | Null]] {
  var composite: CompositeOperationOrAuto = js.native
  var computedOffset: Double = js.native
  var easing: java.lang.String = js.native
  var offset: Double | Null = js.native
}

object ComputedKeyframe {
  @scala.inline
  def apply(composite: CompositeOperationOrAuto, computedOffset: Double, easing: java.lang.String): ComputedKeyframe = {
    val __obj = js.Dynamic.literal(composite = composite.asInstanceOf[js.Any], computedOffset = computedOffset.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComputedKeyframe]
  }
  @scala.inline
  implicit class ComputedKeyframeOps[Self <: ComputedKeyframe] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComposite(value: CompositeOperationOrAuto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("composite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComputedOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computedOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEasing(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffsetNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(null)
        ret
    }
  }
  
}

