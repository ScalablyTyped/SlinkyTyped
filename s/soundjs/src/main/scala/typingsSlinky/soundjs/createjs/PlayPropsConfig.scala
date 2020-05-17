package typingsSlinky.soundjs.createjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlayPropsConfig extends js.Object {
  var delay: Double = js.native
  var duration: Double = js.native
  var interrupt: String = js.native
  var loop: Double = js.native
  var offset: Double = js.native
  var pan: Double = js.native
  var startTime: Double = js.native
  var volume: Double = js.native
  def set(props: js.Any): PlayPropsConfig = js.native
}

object PlayPropsConfig {
  @scala.inline
  def apply(
    delay: Double,
    duration: Double,
    interrupt: String,
    loop: Double,
    offset: Double,
    pan: Double,
    set: js.Any => PlayPropsConfig,
    startTime: Double,
    volume: Double
  ): PlayPropsConfig = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], interrupt = interrupt.asInstanceOf[js.Any], loop = loop.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], pan = pan.asInstanceOf[js.Any], set = js.Any.fromFunction1(set), startTime = startTime.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayPropsConfig]
  }
  @scala.inline
  implicit class PlayPropsConfigOps[Self <: PlayPropsConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInterrupt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interrupt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPan(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSet(value: js.Any => PlayPropsConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStartTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVolume(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volume")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

