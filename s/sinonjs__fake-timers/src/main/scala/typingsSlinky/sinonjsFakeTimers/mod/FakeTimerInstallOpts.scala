package typingsSlinky.sinonjsFakeTimers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FakeTimerInstallOpts extends js.Object {
  /**
    * Relevant only when using with shouldAdvanceTime: true. increment mocked time by advanceTimeDelta ms every advanceTimeDelta ms change
    * in the real system time (default: 20)
    */
  var advanceTimeDelta: js.UndefOr[Double] = js.native
  /**
    * The maximum number of timers that will be run when calling runAll() (default: 1000)
    */
  var loopLimit: js.UndefOr[Double] = js.native
  /**
    * Installs fake timers with the specified unix epoch (default: 0)
    */
  var now: js.UndefOr[Double | js.Date] = js.native
  /**
    * Tells @sinonjs/fake-timers to increment mocked time automatically based on the real system time shift (e.g. the mocked time will be incremented by
    * 20ms for every 20ms change in the real system time) (default: false)
    */
  var shouldAdvanceTime: js.UndefOr[Boolean] = js.native
  /**
    * Installs fake timers onto the specified target context (default: global)
    */
  var target: js.UndefOr[js.Any] = js.native
  /**
    * An array with explicit function names to hijack. When not set, @sinonjs/fake-timers will automatically fake all methods except nextTick
    * e.g., FakeTimers.install({ toFake: ["setTimeout", "nextTick"]}) will fake only setTimeout and nextTick
    */
  var toFake: js.UndefOr[js.Array[FakeMethod]] = js.native
}

object FakeTimerInstallOpts {
  @scala.inline
  def apply(): FakeTimerInstallOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FakeTimerInstallOpts]
  }
  @scala.inline
  implicit class FakeTimerInstallOptsOps[Self <: FakeTimerInstallOpts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdvanceTimeDelta(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advanceTimeDelta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdvanceTimeDelta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advanceTimeDelta")(js.undefined)
        ret
    }
    @scala.inline
    def withLoopLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loopLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoopLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loopLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withNowDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("now")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNow(value: Double | js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("now")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("now")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldAdvanceTime(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldAdvanceTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShouldAdvanceTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldAdvanceTime")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
    @scala.inline
    def withToFake(value: js.Array[FakeMethod]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toFake")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToFake: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toFake")(js.undefined)
        ret
    }
  }
  
}

