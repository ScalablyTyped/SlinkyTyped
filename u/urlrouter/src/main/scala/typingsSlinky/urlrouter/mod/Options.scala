package typingsSlinky.urlrouter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var errorHandler: js.UndefOr[
    js.Function3[/* err */ js.Error, /* req */ ServerRequest, /* res */ ServerResponse, Unit]
  ] = js.native
  var pageNotFound: js.UndefOr[js.Function2[/* req */ ServerRequest, /* res */ ServerResponse, Unit]] = js.native
  var paramsName: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorHandler(value: (/* err */ js.Error, /* req */ ServerRequest, /* res */ ServerResponse) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorHandler")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutErrorHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withPageNotFound(value: (/* req */ ServerRequest, /* res */ ServerResponse) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageNotFound")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPageNotFound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageNotFound")(js.undefined)
        ret
    }
    @scala.inline
    def withParamsName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paramsName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParamsName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paramsName")(js.undefined)
        ret
    }
  }
  
}

