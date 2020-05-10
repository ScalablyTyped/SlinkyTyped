package typingsSlinky.winstonTransport.mod

import typingsSlinky.logform.mod.Format_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransportStreamOptions extends js.Object {
  var close: js.UndefOr[js.Function0[Unit]] = js.native
  var format: js.UndefOr[Format_] = js.native
  var handleExceptions: js.UndefOr[Boolean] = js.native
  var level: js.UndefOr[String] = js.native
  var log: js.UndefOr[js.Function2[/* info */ js.Any, /* next */ js.Function0[Unit], _]] = js.native
  var logv: js.UndefOr[js.Function2[/* info */ js.Any, /* next */ js.Function0[Unit], _]] = js.native
  var silent: js.UndefOr[Boolean] = js.native
}

object TransportStreamOptions {
  @scala.inline
  def apply(): TransportStreamOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransportStreamOptions]
  }
  @scala.inline
  implicit class TransportStreamOptionsOps[Self <: TransportStreamOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: Format_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleExceptions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleExceptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandleExceptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleExceptions")(js.undefined)
        ret
    }
    @scala.inline
    def withLevel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(js.undefined)
        ret
    }
    @scala.inline
    def withLog(value: (/* info */ js.Any, /* next */ js.Function0[Unit]) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutLog: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(js.undefined)
        ret
    }
    @scala.inline
    def withLogv(value: (/* info */ js.Any, /* next */ js.Function0[Unit]) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logv")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutLogv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logv")(js.undefined)
        ret
    }
    @scala.inline
    def withSilent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSilent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(js.undefined)
        ret
    }
  }
  
}

