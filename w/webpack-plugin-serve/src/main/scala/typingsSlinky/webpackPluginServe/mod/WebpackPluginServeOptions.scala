package typingsSlinky.webpackPluginServe.mod

import typingsSlinky.connectHistoryApiFallback.mod.Options
import typingsSlinky.koa.mod.DefaultContext
import typingsSlinky.koa.mod.DefaultState
import typingsSlinky.koa.mod.^
import typingsSlinky.node.http2Mod.SecureServerOptions
import typingsSlinky.node.http2Mod.ServerOptions
import typingsSlinky.webpackPluginServe.anon.Address
import typingsSlinky.webpackPluginServe.anon.App
import typingsSlinky.webpackPluginServe.anon.Level
import typingsSlinky.webpackPluginServe.webpackPluginServeStrings.minimal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebpackPluginServeOptions extends js.Object {
  var client: js.UndefOr[Address] = js.native
  var compress: js.UndefOr[Boolean] = js.native
  var historyFallback: js.UndefOr[Boolean | Options] = js.native
  var hmr: js.UndefOr[Boolean] = js.native
  var host: js.UndefOr[String | js.Promise[String]] = js.native
  var http2: js.UndefOr[Boolean | ServerOptions | SecureServerOptions] = js.native
  var https: js.UndefOr[typingsSlinky.node.httpsMod.ServerOptions] = js.native
  var liveReload: js.UndefOr[Boolean] = js.native
  var log: js.UndefOr[Level] = js.native
  var middleware: js.UndefOr[
    js.Function2[/* app */ ^[DefaultState, DefaultContext], /* builtins */ Builtins, Unit]
  ] = js.native
  var open: js.UndefOr[Boolean | App] = js.native
  var port: js.UndefOr[Double | js.Promise[Double]] = js.native
  var progress: js.UndefOr[Boolean | minimal] = js.native
  var static: js.UndefOr[String | js.Array[String] | StaticObject] = js.native
  var status: js.UndefOr[Boolean] = js.native
  var waitForBuild: js.UndefOr[Boolean] = js.native
}

object WebpackPluginServeOptions {
  @scala.inline
  def apply(): WebpackPluginServeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebpackPluginServeOptions]
  }
  @scala.inline
  implicit class WebpackPluginServeOptionsOps[Self <: WebpackPluginServeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClient(value: Address): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(js.undefined)
        ret
    }
    @scala.inline
    def withCompress(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compress")(js.undefined)
        ret
    }
    @scala.inline
    def withHistoryFallback(value: Boolean | Options): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("historyFallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHistoryFallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("historyFallback")(js.undefined)
        ret
    }
    @scala.inline
    def withHmr(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hmr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHmr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hmr")(js.undefined)
        ret
    }
    @scala.inline
    def withHost(value: String | js.Promise[String]): Self = {
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
    def withHttp2(value: Boolean | ServerOptions | SecureServerOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("http2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttp2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("http2")(js.undefined)
        ret
    }
    @scala.inline
    def withHttps(value: typingsSlinky.node.httpsMod.ServerOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("https")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("https")(js.undefined)
        ret
    }
    @scala.inline
    def withLiveReload(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liveReload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLiveReload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liveReload")(js.undefined)
        ret
    }
    @scala.inline
    def withLog(value: Level): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLog: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(js.undefined)
        ret
    }
    @scala.inline
    def withMiddleware(value: (/* app */ ^[DefaultState, DefaultContext], /* builtins */ Builtins) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("middleware")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutMiddleware: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("middleware")(js.undefined)
        ret
    }
    @scala.inline
    def withOpen(value: Boolean | App): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.undefined)
        ret
    }
    @scala.inline
    def withPort(value: Double | js.Promise[Double]): Self = {
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
    def withProgress(value: Boolean | minimal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(js.undefined)
        ret
    }
    @scala.inline
    def withStatic(value: String | js.Array[String] | StaticObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("static")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("static")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withWaitForBuild(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForBuild")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitForBuild: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForBuild")(js.undefined)
        ret
    }
  }
  
}

