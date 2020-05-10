package typingsSlinky.utility.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ----------------0_0-----------------------
  * @description Defines For JSON methods
  * @see https://github.com/node-modules/utility#json
  * -----------------0^0-----------------------
  */
@js.native
trait IJSONStaticOptions extends js.Object {
  var replacer: js.UndefOr[js.Function2[/* key */ String, /* value */ js.Any, _]] = js.native
  var space: js.UndefOr[Double | String] = js.native
}

object IJSONStaticOptions {
  @scala.inline
  def apply(): IJSONStaticOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IJSONStaticOptions]
  }
  @scala.inline
  implicit class IJSONStaticOptionsOps[Self <: IJSONStaticOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReplacer(value: (/* key */ String, /* value */ js.Any) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replacer")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutReplacer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replacer")(js.undefined)
        ret
    }
    @scala.inline
    def withSpace(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("space")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("space")(js.undefined)
        ret
    }
  }
  
}

