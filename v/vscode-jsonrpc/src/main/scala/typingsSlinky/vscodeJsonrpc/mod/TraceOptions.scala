package typingsSlinky.vscodeJsonrpc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TraceOptions extends js.Object {
  var sendNotification: js.UndefOr[Boolean] = js.native
  var traceFormat: js.UndefOr[TraceFormat] = js.native
}

object TraceOptions {
  @scala.inline
  def apply(): TraceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TraceOptions]
  }
  @scala.inline
  implicit class TraceOptionsOps[Self <: TraceOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSendNotification(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendNotification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSendNotification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendNotification")(js.undefined)
        ret
    }
    @scala.inline
    def withTraceFormat(value: TraceFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("traceFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTraceFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("traceFormat")(js.undefined)
        ret
    }
  }
  
}

