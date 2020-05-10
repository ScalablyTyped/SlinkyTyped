package typingsSlinky.webAnimationsJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimationEffectReadOnly extends js.Object {
  val timing: Double = js.native
  def getComputedTiming(): ComputedTimingProperties = js.native
}

object AnimationEffectReadOnly {
  @scala.inline
  def apply(getComputedTiming: () => ComputedTimingProperties, timing: Double): AnimationEffectReadOnly = {
    val __obj = js.Dynamic.literal(getComputedTiming = js.Any.fromFunction0(getComputedTiming), timing = timing.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationEffectReadOnly]
  }
  @scala.inline
  implicit class AnimationEffectReadOnlyOps[Self <: AnimationEffectReadOnly] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetComputedTiming(value: () => ComputedTimingProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getComputedTiming")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTiming(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timing")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

