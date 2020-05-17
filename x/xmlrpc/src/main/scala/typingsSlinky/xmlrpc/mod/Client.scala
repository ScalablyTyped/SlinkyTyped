package typingsSlinky.xmlrpc.mod

import typingsSlinky.xmlrpc.anon.Processors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Client extends js.Object {
  var cookies: js.UndefOr[Cookies] = js.native
  var headersProcessors: Processors = js.native
  var isSecure: Boolean = js.native
  var options: ClientOptions = js.native
  def getCookie(name: String): String = js.native
  def methodCall(
    method: String,
    params: js.Array[_],
    callback: js.Function2[/* error */ js.Object, /* value */ js.Any, Unit]
  ): Unit = js.native
  def setCookie(name: String, value: String): this.type = js.native
}

object Client {
  @scala.inline
  def apply(
    getCookie: String => String,
    headersProcessors: Processors,
    isSecure: Boolean,
    methodCall: (String, js.Array[_], js.Function2[/* error */ js.Object, /* value */ js.Any, Unit]) => Unit,
    options: ClientOptions,
    setCookie: (String, String) => Client
  ): Client = {
    val __obj = js.Dynamic.literal(getCookie = js.Any.fromFunction1(getCookie), headersProcessors = headersProcessors.asInstanceOf[js.Any], isSecure = isSecure.asInstanceOf[js.Any], methodCall = js.Any.fromFunction3(methodCall), options = options.asInstanceOf[js.Any], setCookie = js.Any.fromFunction2(setCookie))
    __obj.asInstanceOf[Client]
  }
  @scala.inline
  implicit class ClientOps[Self <: Client] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetCookie(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCookie")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHeadersProcessors(value: Processors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headersProcessors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSecure(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSecure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMethodCall(
      value: (String, js.Array[_], js.Function2[/* error */ js.Object, /* value */ js.Any, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methodCall")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withOptions(value: ClientOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetCookie(value: (String, String) => Client): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCookie")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCookies(value: Cookies): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCookies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookies")(js.undefined)
        ret
    }
  }
  
}

