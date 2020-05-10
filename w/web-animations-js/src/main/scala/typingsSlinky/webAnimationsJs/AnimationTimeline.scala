package typingsSlinky.webAnimationsJs

import typingsSlinky.std.KeyframeEffect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimationTimeline extends js.Object {
  val currentTime: Double | Null = js.native
  def getAnimations(): js.Array[Animation] = js.native
  def play(effect: KeyframeEffect): Animation = js.native
}

object AnimationTimeline {
  @scala.inline
  def apply(getAnimations: () => js.Array[Animation], play: KeyframeEffect => Animation): AnimationTimeline = {
    val __obj = js.Dynamic.literal(getAnimations = js.Any.fromFunction0(getAnimations), play = js.Any.fromFunction1(play))
    __obj.asInstanceOf[AnimationTimeline]
  }
  @scala.inline
  implicit class AnimationTimelineOps[Self <: AnimationTimeline] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetAnimations(value: () => js.Array[Animation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAnimations")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPlay(value: KeyframeEffect => Animation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("play")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCurrentTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentTimeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentTime")(null)
        ret
    }
  }
  
}

