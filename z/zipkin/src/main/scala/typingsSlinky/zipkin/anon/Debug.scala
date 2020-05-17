package typingsSlinky.zipkin.anon

import typingsSlinky.zipkin.mod.option.IOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Debug extends js.Object {
  var debug: js.UndefOr[Boolean] = js.native
  var parentId: js.UndefOr[IOption[String]] = js.native
  var sampled: js.UndefOr[IOption[Boolean]] = js.native
  var shared: js.UndefOr[Boolean] = js.native
  var spanId: js.UndefOr[String] = js.native
  var traceId: js.UndefOr[String] = js.native
}

object Debug {
  @scala.inline
  def apply(): Debug = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Debug]
  }
  @scala.inline
  implicit class DebugOps[Self <: Debug] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withParentId(value: IOption[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentId")(js.undefined)
        ret
    }
    @scala.inline
    def withSampled(value: IOption[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSampled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampled")(js.undefined)
        ret
    }
    @scala.inline
    def withShared(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shared")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShared: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shared")(js.undefined)
        ret
    }
    @scala.inline
    def withSpanId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spanId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpanId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spanId")(js.undefined)
        ret
    }
    @scala.inline
    def withTraceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("traceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTraceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("traceId")(js.undefined)
        ret
    }
  }
  
}

