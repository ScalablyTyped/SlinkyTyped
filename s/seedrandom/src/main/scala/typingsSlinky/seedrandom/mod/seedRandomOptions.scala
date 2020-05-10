package typingsSlinky.seedrandom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait seedRandomOptions extends js.Object {
  var entropy: js.UndefOr[Boolean] = js.native
  var global: js.UndefOr[Boolean] = js.native
  var pass: js.UndefOr[seedrandomCallback] = js.native
  var state: js.UndefOr[Boolean | State] = js.native
}

object seedRandomOptions {
  @scala.inline
  def apply(): seedRandomOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[seedRandomOptions]
  }
  @scala.inline
  implicit class seedRandomOptionsOps[Self <: seedRandomOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntropy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entropy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntropy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entropy")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("global")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("global")(js.undefined)
        ret
    }
    @scala.inline
    def withPass(
      value: (/* prng */ js.UndefOr[prng], /* shortseed */ js.UndefOr[String], /* global */ js.UndefOr[Boolean], /* state */ js.UndefOr[State]) => prng
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pass")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutPass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pass")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: Boolean | State): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
  }
  
}

