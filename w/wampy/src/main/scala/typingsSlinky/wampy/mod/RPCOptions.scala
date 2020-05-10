package typingsSlinky.wampy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RPCOptions extends js.Object {
  var process: js.UndefOr[Boolean] = js.native
}

object RPCOptions {
  @scala.inline
  def apply(): RPCOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RPCOptions]
  }
  @scala.inline
  implicit class RPCOptionsOps[Self <: RPCOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProcess(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("process")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("process")(js.undefined)
        ret
    }
  }
  
}

