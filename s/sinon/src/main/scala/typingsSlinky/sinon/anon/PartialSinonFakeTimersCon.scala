package typingsSlinky.sinon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<sinon.sinon.SinonFakeTimersConfig> */
@js.native
trait PartialSinonFakeTimersCon extends js.Object {
  var now: js.UndefOr[Double | js.Date] = js.native
  var shouldAdvanceTime: js.UndefOr[Boolean] = js.native
  var toFake: js.UndefOr[js.Array[String]] = js.native
}

object PartialSinonFakeTimersCon {
  @scala.inline
  def apply(): PartialSinonFakeTimersCon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSinonFakeTimersCon]
  }
  @scala.inline
  implicit class PartialSinonFakeTimersConOps[Self <: PartialSinonFakeTimersCon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withToFake(value: js.Array[String]): Self = {
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

