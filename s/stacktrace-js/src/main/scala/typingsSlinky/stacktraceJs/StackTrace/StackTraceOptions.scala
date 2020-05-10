package typingsSlinky.stacktraceJs.StackTrace

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StackTraceOptions extends js.Object {
  var filter: js.UndefOr[js.Function1[/* stackFrame */ StackFrame, Boolean]] = js.native
  var offline: js.UndefOr[Boolean] = js.native
  var sourceCache: js.UndefOr[SourceCache] = js.native
}

object StackTraceOptions {
  @scala.inline
  def apply(): StackTraceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackTraceOptions]
  }
  @scala.inline
  implicit class StackTraceOptionsOps[Self <: StackTraceOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilter(value: /* stackFrame */ StackFrame => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withOffline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offline")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceCache(value: SourceCache): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceCache")(js.undefined)
        ret
    }
  }
  
}

