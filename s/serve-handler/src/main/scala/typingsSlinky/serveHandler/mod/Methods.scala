package typingsSlinky.serveHandler.mod

import typingsSlinky.node.httpMod.ServerResponse
import typingsSlinky.serveHandler.FnCall
import typingsSlinky.serveHandler.Typeoflstat
import typingsSlinky.serveHandler.Typeofreaddir
import typingsSlinky.serveHandler.Typeofrealpath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Methods extends js.Object {
  var createReadStream: js.UndefOr[FnCall] = js.native
  var lstat: js.UndefOr[Typeoflstat] = js.native
  var readdir: js.UndefOr[Typeofreaddir] = js.native
  var realpath: js.UndefOr[Typeofrealpath] = js.native
  var sendError: js.UndefOr[SendErrorHandler] = js.native
}

object Methods {
  @scala.inline
  def apply(): Methods = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Methods]
  }
  @scala.inline
  implicit class MethodsOps[Self <: Methods] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateReadStream(value: FnCall): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createReadStream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateReadStream: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createReadStream")(js.undefined)
        ret
    }
    @scala.inline
    def withLstat(value: Typeoflstat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lstat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLstat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lstat")(js.undefined)
        ret
    }
    @scala.inline
    def withReaddir(value: Typeofreaddir): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readdir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReaddir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readdir")(js.undefined)
        ret
    }
    @scala.inline
    def withRealpath(value: Typeofrealpath): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realpath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRealpath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realpath")(js.undefined)
        ret
    }
    @scala.inline
    def withSendError(
      value: (/* absolutePath */ js.UndefOr[String], /* response */ js.UndefOr[ServerResponse], /* acceptsJSON */ js.UndefOr[Boolean], /* current */ js.UndefOr[String], /* handlers */ js.UndefOr[Methods], /* config */ js.UndefOr[Config], /* spec */ js.UndefOr[js.Any]) => js.Promise[Unit]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendError")(js.Any.fromFunction7(value))
        ret
    }
    @scala.inline
    def withoutSendError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendError")(js.undefined)
        ret
    }
  }
  
}

