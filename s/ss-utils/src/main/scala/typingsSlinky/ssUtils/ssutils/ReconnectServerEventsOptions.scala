package typingsSlinky.ssUtils.ssutils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReconnectServerEventsOptions extends js.Object {
  var errorArgs: js.UndefOr[js.Array[_]] = js.native
  var onerror: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  var onmessage: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  var url: js.UndefOr[String] = js.native
}

object ReconnectServerEventsOptions {
  @scala.inline
  def apply(): ReconnectServerEventsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReconnectServerEventsOptions]
  }
  @scala.inline
  implicit class ReconnectServerEventsOptionsOps[Self <: ReconnectServerEventsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorArgs(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorArgs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorArgs")(js.undefined)
        ret
    }
    @scala.inline
    def withOnerror(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onerror")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnerror: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onerror")(js.undefined)
        ret
    }
    @scala.inline
    def withOnmessage(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmessage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnmessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmessage")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

