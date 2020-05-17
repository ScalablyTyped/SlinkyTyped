package typingsSlinky.stripeV3.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Supported extends js.Object {
  var supported: js.UndefOr[Boolean] = js.native
}

object Supported {
  @scala.inline
  def apply(): Supported = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Supported]
  }
  @scala.inline
  implicit class SupportedOps[Self <: Supported] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSupported(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupported: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supported")(js.undefined)
        ret
    }
  }
  
}

