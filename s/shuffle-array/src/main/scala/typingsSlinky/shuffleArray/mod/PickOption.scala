package typingsSlinky.shuffleArray.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * picks - Specifies how many random elements you want to pick. By default it picks 1.
  * rng - Specifies a custom random number generator.
  */
@js.native
trait PickOption extends js.Object {
  var picks: js.UndefOr[Double] = js.native
  var rng: js.UndefOr[js.Function0[Double]] = js.native
}

object PickOption {
  @scala.inline
  def apply(): PickOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickOption]
  }
  @scala.inline
  implicit class PickOptionOps[Self <: PickOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPicks(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("picks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPicks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("picks")(js.undefined)
        ret
    }
    @scala.inline
    def withRng(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rng")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRng: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rng")(js.undefined)
        ret
    }
  }
  
}

