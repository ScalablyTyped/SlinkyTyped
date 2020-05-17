package typingsSlinky.webpackBlocksDevServer.mod

import typingsSlinky.webpackBlocksDevServer.anon.Errors
import typingsSlinky.webpackBlocksDevServer.webpackBlocksDevServerStrings.`errors-only`
import typingsSlinky.webpackBlocksDevServer.webpackBlocksDevServerStrings.debug
import typingsSlinky.webpackBlocksDevServer.webpackBlocksDevServerStrings.error
import typingsSlinky.webpackBlocksDevServer.webpackBlocksDevServerStrings.info
import typingsSlinky.webpackBlocksDevServer.webpackBlocksDevServerStrings.minimal
import typingsSlinky.webpackBlocksDevServer.webpackBlocksDevServerStrings.none
import typingsSlinky.webpackBlocksDevServer.webpackBlocksDevServerStrings.normal
import typingsSlinky.webpackBlocksDevServer.webpackBlocksDevServerStrings.silent
import typingsSlinky.webpackBlocksDevServer.webpackBlocksDevServerStrings.sockjs
import typingsSlinky.webpackBlocksDevServer.webpackBlocksDevServerStrings.trace
import typingsSlinky.webpackBlocksDevServer.webpackBlocksDevServerStrings.verbose
import typingsSlinky.webpackBlocksDevServer.webpackBlocksDevServerStrings.warn
import typingsSlinky.webpackBlocksDevServer.webpackBlocksDevServerStrings.warning
import typingsSlinky.webpackBlocksDevServer.webpackBlocksDevServerStrings.ws
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var after: js.UndefOr[StartMiddlewareFunction] = js.native
  var allowedHosts: js.UndefOr[js.Array[String]] = js.native
  var before: js.UndefOr[StartMiddlewareFunction] = js.native
  var bonjour: js.UndefOr[Boolean] = js.native
  var clientLogLevel: js.UndefOr[silent | trace | debug | info | warn | error | none | warning] = js.native
  var compress: js.UndefOr[Boolean] = js.native
  var contentBase: js.UndefOr[Boolean | String | js.Array[String] | Double] = js.native
  var disableHostCheck: js.UndefOr[Boolean] = js.native
  var filename: js.UndefOr[String] = js.native
  var headers: js.UndefOr[js.Object] = js.native
  var historyApiFallback: js.UndefOr[Boolean | HistoryOptions] = js.native
  var host: js.UndefOr[String] = js.native
  var hot: js.UndefOr[Boolean] = js.native
  var hotOnly: js.UndefOr[Boolean] = js.native
  var http2: js.UndefOr[Boolean] = js.native
  var https: js.UndefOr[Boolean | js.Object] = js.native
  var index: js.UndefOr[String] = js.native
  var injectClient: js.UndefOr[Boolean | InjectClientFunction] = js.native
  var injectHot: js.UndefOr[Boolean | InjectClientFunction] = js.native
  var `inline`: js.UndefOr[Boolean] = js.native
  var `lazy`: js.UndefOr[Boolean] = js.native
  var liveReload: js.UndefOr[Boolean] = js.native
  var mimeTypes: js.UndefOr[typingsSlinky.webpackBlocksDevServer.anon.String] = js.native
  var noInfo: js.UndefOr[Boolean] = js.native
  var open: js.UndefOr[Boolean | String] = js.native
  var openPage: js.UndefOr[String] = js.native
  var overlay: js.UndefOr[Boolean | Errors] = js.native
  var pfx: js.UndefOr[String] = js.native
  var pfxPassphrase: js.UndefOr[String] = js.native
  var port: js.UndefOr[Double] = js.native
  var proxy: js.UndefOr[js.Object | js.Array[ProxyType]] = js.native
  var public: js.UndefOr[String] = js.native
  var publicPath: js.UndefOr[String] = js.native
  var quiet: js.UndefOr[Boolean] = js.native
  var serveIndex: js.UndefOr[Boolean] = js.native
  var setup: js.UndefOr[InjectClientFunction] = js.native
  var socket: js.UndefOr[String] = js.native
  var socketHost: js.UndefOr[String] = js.native
  var socketPath: js.UndefOr[String] = js.native
  var socketPort: js.UndefOr[Double | String] = js.native
  var staticOptions: js.UndefOr[SetHeadersFunction] = js.native
  var stats: js.UndefOr[none | `errors-only` | minimal | normal | verbose | js.Object] = js.native
  var transportMode: js.UndefOr[sockjs | ws | TransportMode] = js.native
  var useLocalIp: js.UndefOr[Boolean] = js.native
  var watchContentBase: js.UndefOr[Boolean] = js.native
  var watchOptions: js.UndefOr[WatchOptions] = js.native
  var writeToDisk: js.UndefOr[Boolean | WriteToDiskFunction] = js.native
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
    def withAfter(value: (/* app */ js.Any, /* server */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowedHosts(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedHosts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedHosts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedHosts")(js.undefined)
        ret
    }
    @scala.inline
    def withBefore(value: (/* app */ js.Any, /* server */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(js.undefined)
        ret
    }
    @scala.inline
    def withBonjour(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bonjour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBonjour: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bonjour")(js.undefined)
        ret
    }
    @scala.inline
    def withClientLogLevel(value: silent | trace | debug | info | warn | error | none | warning): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientLogLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientLogLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientLogLevel")(js.undefined)
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
    def withContentBase(value: Boolean | String | js.Array[String] | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentBase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentBase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentBase")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableHostCheck(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableHostCheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableHostCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableHostCheck")(js.undefined)
        ret
    }
    @scala.inline
    def withFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withHistoryApiFallback(value: Boolean | HistoryOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("historyApiFallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHistoryApiFallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("historyApiFallback")(js.undefined)
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
    def withHot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hot")(js.undefined)
        ret
    }
    @scala.inline
    def withHotOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hotOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHotOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hotOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withHttp2(value: Boolean): Self = {
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
    def withHttps(value: Boolean | js.Object): Self = {
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
    def withIndex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
    @scala.inline
    def withInjectClientFunction1(value: /* compilerConfig */ js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("injectClient")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInjectClient(value: Boolean | InjectClientFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("injectClient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInjectClient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("injectClient")(js.undefined)
        ret
    }
    @scala.inline
    def withInjectHotFunction1(value: /* compilerConfig */ js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("injectHot")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInjectHot(value: Boolean | InjectClientFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("injectHot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInjectHot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("injectHot")(js.undefined)
        ret
    }
    @scala.inline
    def withInline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline")(js.undefined)
        ret
    }
    @scala.inline
    def withLazy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLazy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazy")(js.undefined)
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
    def withMimeTypes(value: typingsSlinky.webpackBlocksDevServer.anon.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMimeTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withNoInfo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withOpen(value: Boolean | String): Self = {
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
    def withOpenPage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openPage")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlay(value: Boolean | Errors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlay")(js.undefined)
        ret
    }
    @scala.inline
    def withPfx(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pfx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPfx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pfx")(js.undefined)
        ret
    }
    @scala.inline
    def withPfxPassphrase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pfxPassphrase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPfxPassphrase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pfxPassphrase")(js.undefined)
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
    def withProxy(value: js.Object | js.Array[ProxyType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProxy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxy")(js.undefined)
        ret
    }
    @scala.inline
    def withPublic(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("public")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("public")(js.undefined)
        ret
    }
    @scala.inline
    def withPublicPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublicPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicPath")(js.undefined)
        ret
    }
    @scala.inline
    def withQuiet(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quiet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuiet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quiet")(js.undefined)
        ret
    }
    @scala.inline
    def withServeIndex(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serveIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServeIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serveIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withSetup(value: /* compilerConfig */ js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setup")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setup")(js.undefined)
        ret
    }
    @scala.inline
    def withSocket(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSocket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socket")(js.undefined)
        ret
    }
    @scala.inline
    def withSocketHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socketHost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSocketHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socketHost")(js.undefined)
        ret
    }
    @scala.inline
    def withSocketPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socketPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSocketPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socketPath")(js.undefined)
        ret
    }
    @scala.inline
    def withSocketPort(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socketPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSocketPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socketPort")(js.undefined)
        ret
    }
    @scala.inline
    def withStaticOptions(value: (/* res */ js.Object, /* path */ String, /* stat */ js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticOptions")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutStaticOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withStats(value: none | `errors-only` | minimal | normal | verbose | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stats")(js.undefined)
        ret
    }
    @scala.inline
    def withTransportMode(value: sockjs | ws | TransportMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transportMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransportMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transportMode")(js.undefined)
        ret
    }
    @scala.inline
    def withUseLocalIp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useLocalIp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseLocalIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useLocalIp")(js.undefined)
        ret
    }
    @scala.inline
    def withWatchContentBase(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchContentBase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWatchContentBase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchContentBase")(js.undefined)
        ret
    }
    @scala.inline
    def withWatchOptions(value: WatchOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWatchOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withWriteToDiskFunction1(value: /* filePath */ String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeToDisk")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWriteToDisk(value: Boolean | WriteToDiskFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeToDisk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWriteToDisk: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeToDisk")(js.undefined)
        ret
    }
  }
  
}

