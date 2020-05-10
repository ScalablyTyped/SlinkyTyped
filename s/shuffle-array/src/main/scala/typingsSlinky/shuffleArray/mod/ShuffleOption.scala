package typingsSlinky.shuffleArray.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShuffleOption extends js.Object {
  var copy: js.UndefOr[Boolean] = js.native
  var rng: js.UndefOr[js.Function0[Double]] = js.native
}

object ShuffleOption {
  @scala.inline
  def apply(): ShuffleOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShuffleOption]
  }
  @scala.inline
  implicit class ShuffleOptionOps[Self <: ShuffleOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCopy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copy")(js.undefined)
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

