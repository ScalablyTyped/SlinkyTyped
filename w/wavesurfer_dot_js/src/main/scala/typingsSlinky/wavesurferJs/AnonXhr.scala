package typingsSlinky.wavesurferJs

import typingsSlinky.wavesurferJs.mod.XHROptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonXhr extends js.Object {
  var xhr: js.UndefOr[XHROptions] = js.native
}

object AnonXhr {
  @scala.inline
  def apply(): AnonXhr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonXhr]
  }
  @scala.inline
  implicit class AnonXhrOps[Self <: AnonXhr] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withXhr(value: XHROptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xhr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXhr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xhr")(js.undefined)
        ret
    }
  }
  
}

