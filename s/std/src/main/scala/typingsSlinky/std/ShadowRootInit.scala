package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShadowRootInit extends js.Object {
  var delegatesFocus: js.UndefOr[scala.Boolean] = js.native
  var mode: ShadowRootMode = js.native
}

object ShadowRootInit {
  @scala.inline
  def apply(mode: ShadowRootMode): ShadowRootInit = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShadowRootInit]
  }
  @scala.inline
  implicit class ShadowRootInitOps[Self <: ShadowRootInit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMode(value: ShadowRootMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelegatesFocus(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delegatesFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelegatesFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delegatesFocus")(js.undefined)
        ret
    }
  }
  
}

