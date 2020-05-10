package typingsSlinky.uws.mod

import typingsSlinky.uws.AnonOrigin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IServerOptions extends js.Object {
  var clientTracking: js.UndefOr[Boolean] = js.native
  var disableHixie: js.UndefOr[Boolean] = js.native
  var handleProtocols: js.UndefOr[js.Any] = js.native
  var host: js.UndefOr[String] = js.native
  var noServer: js.UndefOr[Boolean] = js.native
  var path: js.UndefOr[String] = js.native
  var perMessageDeflate: js.UndefOr[Boolean | IPerMessageDeflateOptions] = js.native
  var port: js.UndefOr[Double] = js.native
  var server: js.UndefOr[typingsSlinky.node.httpMod.Server | typingsSlinky.node.httpsMod.Server] = js.native
  var verifyClient: js.UndefOr[VerifyClientCallbackAsync | VerifyClientCallbackSync] = js.native
}

object IServerOptions {
  @scala.inline
  def apply(): IServerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IServerOptions]
  }
  @scala.inline
  implicit class IServerOptionsOps[Self <: IServerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientTracking(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientTracking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientTracking: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientTracking")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableHixie(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableHixie")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableHixie: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableHixie")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleProtocols(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleProtocols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandleProtocols: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleProtocols")(js.undefined)
        ret
    }
    @scala.inline
    def withHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(js.undefined)
        ret
    }
    @scala.inline
    def withNoServer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noServer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoServer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noServer")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withPerMessageDeflate(value: Boolean | IPerMessageDeflateOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perMessageDeflate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerMessageDeflate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perMessageDeflate")(js.undefined)
        ret
    }
    @scala.inline
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(js.undefined)
        ret
    }
    @scala.inline
    def withServer(value: typingsSlinky.node.httpMod.Server | typingsSlinky.node.httpsMod.Server): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("server")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("server")(js.undefined)
        ret
    }
    @scala.inline
    def withVerifyClientFunction2(value: (/* info */ AnonOrigin, /* callback */ js.Function1[/* res */ Boolean, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verifyClient")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withVerifyClientFunction1(value: /* info */ AnonOrigin => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verifyClient")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withVerifyClient(value: VerifyClientCallbackAsync | VerifyClientCallbackSync): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verifyClient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerifyClient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verifyClient")(js.undefined)
        ret
    }
  }
  
}

