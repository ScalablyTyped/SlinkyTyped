package typingsSlinky.zipkin

import typingsSlinky.zipkin.zipkinStrings.`0`
import typingsSlinky.zipkin.zipkinStrings.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonXB3Flags extends js.Object {
  var `X-B3-Flags`: js.UndefOr[`1` | `0`] = js.native
  var `X-B3-ParentSpanId`: js.UndefOr[String] = js.native
  var `X-B3-Sampled`: js.UndefOr[`1` | `0`] = js.native
  var `X-B3-SpanId`: String = js.native
  var `X-B3-TraceId`: String = js.native
}

object AnonXB3Flags {
  @scala.inline
  def apply(`X-B3-SpanId`: String, `X-B3-TraceId`: String): AnonXB3Flags = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("X-B3-SpanId")(`X-B3-SpanId`.asInstanceOf[js.Any])
    __obj.updateDynamic("X-B3-TraceId")(`X-B3-TraceId`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonXB3Flags]
  }
  @scala.inline
  implicit class AnonXB3FlagsOps[Self <: AnonXB3Flags] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withX-B3-SpanId`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("X-B3-SpanId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withX-B3-TraceId`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("X-B3-TraceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withX-B3-Flags`(value: `1` | `0`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("X-B3-Flags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutX-B3-Flags`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("X-B3-Flags")(js.undefined)
        ret
    }
    @scala.inline
    def `withX-B3-ParentSpanId`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("X-B3-ParentSpanId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutX-B3-ParentSpanId`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("X-B3-ParentSpanId")(js.undefined)
        ret
    }
    @scala.inline
    def `withX-B3-Sampled`(value: `1` | `0`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("X-B3-Sampled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutX-B3-Sampled`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("X-B3-Sampled")(js.undefined)
        ret
    }
  }
  
}

