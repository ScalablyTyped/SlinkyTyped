package typingsSlinky.uuid.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RngOptions extends V4Options {
  var rng: js.UndefOr[js.Function0[InputBuffer]] = js.native
}

object RngOptions {
  @scala.inline
  def apply(): RngOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RngOptions]
  }
  @scala.inline
  implicit class RngOptionsOps[Self <: RngOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRng(value: () => InputBuffer): Self = {
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

