package typingsSlinky.webpackDevServer.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.connectHistoryApiFallback.mod.Options
import typingsSlinky.express.mod.Application_
import typingsSlinky.node.httpsMod.ServerOptions
import typingsSlinky.serveStatic.mod.ServeStaticOptions
import typingsSlinky.webpack.mod.Compiler_
import typingsSlinky.webpack.mod.Options.Stats
import typingsSlinky.webpack.mod.WatchOptions
import typingsSlinky.webpackDevServer.anon.Client
import typingsSlinky.webpackDevServer.anon.ClientServer
import typingsSlinky.webpackDevServer.anon.Errors
import typingsSlinky.webpackDevServer.anon.Server
import typingsSlinky.webpackDevServer.anon.TypeMap
import typingsSlinky.webpackDevServer.webpackDevServerStrings.debug
import typingsSlinky.webpackDevServer.webpackDevServerStrings.error
import typingsSlinky.webpackDevServer.webpackDevServerStrings.info
import typingsSlinky.webpackDevServer.webpackDevServerStrings.none
import typingsSlinky.webpackDevServer.webpackDevServerStrings.silent
import typingsSlinky.webpackDevServer.webpackDevServerStrings.sockjs
import typingsSlinky.webpackDevServer.webpackDevServerStrings.trace
import typingsSlinky.webpackDevServer.webpackDevServerStrings.warn
import typingsSlinky.webpackDevServer.webpackDevServerStrings.warning
import typingsSlinky.webpackDevServer.webpackDevServerStrings.ws
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Configuration extends js.Object {
  /**
    * Provides the ability to execute custom middleware after all other
    * middleware internally within the server.
    */
  var after: js.UndefOr[
    js.Function3[/* app */ Application_, /* server */ WebpackDevServer, /* compiler */ Compiler_, Unit]
  ] = js.native
  /**
    * This option allows you to whitelist services that are allowed to
    * access the dev server.
    */
  var allowedHosts: js.UndefOr[js.Array[String]] = js.native
  /**
    * Provides the ability to execute custom middleware prior to all
    * other middleware internally within the server.
    */
  var before: js.UndefOr[
    js.Function3[/* app */ Application_, /* server */ WebpackDevServer, /* compiler */ Compiler_, Unit]
  ] = js.native
  /**
    * This option broadcasts the server via ZeroConf networking on start.
    */
  var bonjour: js.UndefOr[Boolean] = js.native
  /**
    * When using inline mode, the console in your DevTools will show you
    * messages e.g. before reloading, before an error or when Hot Module
    * Replacement is enabled. This may be too verbose.
    *
    * 'none' and 'warning' are going to be deprecated at the next major
    * version.
    */
  var clientLogLevel: js.UndefOr[silent | trace | debug | info | warn | error | none | warning] = js.native
  /**
    * Enable gzip compression for everything served.
    */
  var compress: js.UndefOr[Boolean] = js.native
  /**
    * Tell the server where to serve content from. This is only necessary
    * if you want to serve static files. devServer.publicPath will be used
    * to determine where the bundles should be served from, and takes
    * precedence.
    */
  var contentBase: js.UndefOr[Boolean | String | js.Array[String] | Double] = js.native
  /**
    * Tell the server at what URL to serve `devServer.contentBase`.
    * If there was a file `assets/manifest.json`,
    * it would be served at `/serve-content-base-at-this-url/manifest.json`
    */
  var contentBasePublicPath: js.UndefOr[String] = js.native
  /**
    * When set to true this option bypasses host checking.  THIS IS NOT
    * RECOMMENDED as apps that do not check the host are vulnerable to DNS
    * rebinding attacks.
    */
  var disableHostCheck: js.UndefOr[Boolean] = js.native
  /**
    * This option lets you reduce the compilations in lazy mode.
    * By default in lazy mode, every request results in a new compilation.
    * With filename, it's possible to only compile when a certain file is requested.
    */
  var filename: js.UndefOr[String] = js.native
  /** Adds headers to all responses. */
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * When using the HTML5 History API, the index.html page will likely
    * have to be served in place of any 404 responses.
    */
  var historyApiFallback: js.UndefOr[Boolean | Options] = js.native
  /**
    * Specify a host to use. By default this is localhost.
    */
  var host: js.UndefOr[String] = js.native
  /**
    * Enable webpack's Hot Module Replacement feature.
    * Note that webpack.HotModuleReplacementPlugin is required to fully
    * enable HMR. If webpack or webpack-dev-server are launched with the
    * --hot option, this plugin will be added automatically, so you may
    * not need to add this to your webpack.config.js.
    */
  var hot: js.UndefOr[Boolean] = js.native
  /**
    * Enables Hot Module Replacement (see devServer.hot) without page
    * refresh as fallback in case of build failures.
    */
  var hotOnly: js.UndefOr[Boolean] = js.native
  /**
    * Serve over HTTP/2 using spdy. This option is ignored for Node 10.0.0
    * and above, as spdy is broken for those versions. The dev server will
    * migrate over to Node's built-in HTTP/2 once Express supports it.
    */
  var http2: js.UndefOr[Boolean] = js.native
  /**
    * By default dev-server will be served over HTTP. It can optionally be
    * served over HTTP/2 with HTTPS.
    */
  var https: js.UndefOr[Boolean | ServerOptions] = js.native
  /**
    * The filename that is considered the index file.
    */
  var index: js.UndefOr[String] = js.native
  /**
    * Tells devServer to inject a client. Setting devServer.injectClient
    * to true will result in always injecting a client. It is possible to
    * provide a function to inject conditionally
    */
  var injectClient: js.UndefOr[Boolean | (js.Function1[/* compilerConfig */ Compiler_, Boolean])] = js.native
  /**
    * Tells devServer to inject a Hot Module Replacement. Setting
    * devServer.injectHot to true will result in always injecting. It is
    * possible to provide a function to inject conditionally
    */
  var injectHot: js.UndefOr[Boolean | (js.Function1[/* compilerConfig */ Compiler_, Boolean])] = js.native
  /**
    * Toggle between the dev-server's two different modes.  By default the
    * application will be served with inline mode enabled.  This means
    * that a script will be inserted in your bundle to take care of live
    * reloading, and build messages will appear in the browser console.
    */
  var `inline`: js.UndefOr[Boolean] = js.native
  /**
    * When lazy is enabled, the dev-server will only compile the bundle
    * when it gets requested.  This means that webpack will not watch any
    * file changes.
    */
  var `lazy`: js.UndefOr[Boolean] = js.native
  /**
    * By default, the dev-server will reload/refresh the page when file
    * changes are detected. devServer.hot option must be disabled or
    * devServer.watchContentBase option must be enabled in order for
    * liveReload to take effect. Disable devServer.liveReload by setting
    * it to false
    */
  var liveReload: js.UndefOr[Boolean] = js.native
  /**
    * The object is passed to the underlying webpack-dev-middleware. See
    * [documentation](https://github.com/webpack/webpack-dev-middleware#mimetypes)
    * for usage notes.
    */
  var mimeTypes: js.UndefOr[StringDictionary[js.Array[String]] | TypeMap] = js.native
  /**
    * With noInfo enabled, messages like the webpack bundle information
    * that is shown when starting up and after each save,will be hidden.
    * Errors and warnings will still be shown.
    */
  var noInfo: js.UndefOr[Boolean] = js.native
  /**
    * Provides an option to execute a custom function when
    * webpack-dev-server starts listening for connections on a port.
    */
  var onListening: js.UndefOr[js.Function1[/* server */ WebpackDevServer, Unit]] = js.native
  /** When open is enabled, the dev server will open the browser. */
  var open: js.UndefOr[Boolean | String] = js.native
  /** Specify a page to navigate to when opening the browser. */
  var openPage: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * Shows a full-screen overlay in the browser when there are compiler
    * errors or warnings. Disabled by default.
    */
  var overlay: js.UndefOr[Boolean | Errors] = js.native
  /**
    * When used via the CLI, a path to an SSL .pfx file. If used in
    * options, it should be the bytestream of the .pfx file.
    */
  var pfx: js.UndefOr[String] = js.native
  /** The passphrase to a SSL PFX file. */
  var pfxPassphrase: js.UndefOr[String] = js.native
  /** Specify a port number to listen for requests on. */
  var port: js.UndefOr[Double] = js.native
  /**
    * Proxying some URLs can be useful when you have a separate API
    * backend development server and you want to send API requests on the
    * same domain.
    *
    * The dev-server makes use of the powerful http-proxy-middleware
    * package. Check out its
    * [documentation](https://github.com/chimurai/http-proxy-middleware#options)
    * for more advanced usages. Note that some of http-proxy-middleware's
    * features do not require a target key, e.g. its router feature, but
    * you will still need to include a target key in your config here,
    * otherwise webpack-dev-server won't pass it along to
    * http-proxy-middleware).
    */
  var proxy: js.UndefOr[ProxyConfigMap | ProxyConfigArray] = js.native
  /**
    * When using inline mode and you're proxying dev-server, the inline
    * client script does not always know where to connect to.  It will try
    * to guess the URL of the server based on window.location, but if that
    * fails you'll need to use this.
    */
  var public: js.UndefOr[String] = js.native
  /**
    * The bundled files will be available in the browser under this path.
    * default is '/'
    */
  var publicPath: js.UndefOr[String] = js.native
  /**
    * With quiet enabled, nothing except the initial startup information
    * will be written to the console.  This also means that errors or
    * warnings from webpack are not visible.
    */
  var quiet: js.UndefOr[Boolean] = js.native
  /**
    * Tells dev-server to use serveIndex middleware when enabled.
    *
    * serveIndex middleware generates directory listings on viewing
    * directories that don't have an index.html file.
    */
  var serveIndex: js.UndefOr[Boolean] = js.native
  /**
    * @deprecated This option is deprecated in favor of devServer.before
    * and will be removed in v3.0.0. Here you can access the Express app
    * object and add your own custom middleware to it.
    */
  var setup: js.UndefOr[js.Function2[/* app */ Application_, /* server */ WebpackDevServer, Unit]] = js.native
  /**
    * Tells clients connected to devServer to use provided socket host.
    */
  var sockHost: js.UndefOr[String] = js.native
  /**
    * The path at which to connect to the reloading socket. Default is
    * '/sockjs-node'
    */
  var sockPath: js.UndefOr[String] = js.native
  /**
    * Tells clients connected to devServer to use provided socket port.
    */
  var sockPort: js.UndefOr[String | Double] = js.native
  /** The Unix socket to listen to (instead of a host). */
  var socket: js.UndefOr[String] = js.native
  /**
    * It is possible to configure advanced options for serving static
    * files from contentBase.
    *
    * This only works when using devServer.contentBase as a string.
    */
  var staticOptions: js.UndefOr[ServeStaticOptions] = js.native
  /**
    * This option lets you precisely control what bundle information gets
    * displayed.  This can be a nice middle ground if you want some bundle
    * information, but not all of it.
    */
  var stats: js.UndefOr[Stats] = js.native
  /**
    * transportMode is an experimental option, meaning its usage could
    * potentially change without warning.
    *
    * Providing a string to devServer.transportMode is a shortcut to
    * setting both devServer.transportMode.client and
    * devServer.transportMode.server to the given string value.
    *
    * This option allows us either to choose the current devServer
    * transport mode for client/server individually or to provide custom
    * client/server implementation. This allows to specify how browser or
    * other client communicates with the devServer.
    *
    * The current default mode is 'sockjs'. This mode uses SockJS-node as
    * a server, and SockJS-client on the client.
    *
    * 'ws' mode will become the default mode in the next major devServer
    * version. This mode uses ws as a server, and native WebSockets on the
    * client.
    */
  var transportMode: js.UndefOr[sockjs | ws | Client | Server | ClientServer] = js.native
  /** This option lets the browser open with your local IP. */
  var useLocalIp: js.UndefOr[Boolean] = js.native
  /**
    * Tell the server to watch the files served by the
    * devServer.contentBase option. File changes will trigger a full page
    * reload.
    */
  var watchContentBase: js.UndefOr[Boolean] = js.native
  /** Control options related to watching the files. */
  var watchOptions: js.UndefOr[WatchOptions] = js.native
  /** Tells devServer to write generated assets to the disk. */
  var writeToDisk: js.UndefOr[Boolean | (js.Function1[/* filePath */ String, Boolean])] = js.native
}

object Configuration {
  @scala.inline
  def apply(): Configuration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Configuration]
  }
  @scala.inline
  implicit class ConfigurationOps[Self <: Configuration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfter(value: (/* app */ Application_, /* server */ WebpackDevServer, /* compiler */ Compiler_) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(js.Any.fromFunction3(value))
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
    def withBefore(value: (/* app */ Application_, /* server */ WebpackDevServer, /* compiler */ Compiler_) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(js.Any.fromFunction3(value))
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
    def withContentBasePublicPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentBasePublicPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentBasePublicPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentBasePublicPath")(js.undefined)
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
    def withHeaders(value: StringDictionary[String]): Self = {
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
    def withHistoryApiFallback(value: Boolean | Options): Self = {
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
    def withHttps(value: Boolean | ServerOptions): Self = {
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
    def withInjectClientFunction1(value: /* compilerConfig */ Compiler_ => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("injectClient")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInjectClient(value: Boolean | (js.Function1[/* compilerConfig */ Compiler_, Boolean])): Self = {
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
    def withInjectHotFunction1(value: /* compilerConfig */ Compiler_ => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("injectHot")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInjectHot(value: Boolean | (js.Function1[/* compilerConfig */ Compiler_, Boolean])): Self = {
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
    def withMimeTypes(value: StringDictionary[js.Array[String]] | TypeMap): Self = {
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
    def withOnListening(value: /* server */ WebpackDevServer => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onListening")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnListening: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onListening")(js.undefined)
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
    def withOpenPage(value: String | js.Array[String]): Self = {
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
    def withProxy(value: ProxyConfigMap | ProxyConfigArray): Self = {
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
    def withSetup(value: (/* app */ Application_, /* server */ WebpackDevServer) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setup")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setup")(js.undefined)
        ret
    }
    @scala.inline
    def withSockHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sockHost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSockHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sockHost")(js.undefined)
        ret
    }
    @scala.inline
    def withSockPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sockPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSockPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sockPath")(js.undefined)
        ret
    }
    @scala.inline
    def withSockPort(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sockPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSockPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sockPort")(js.undefined)
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
    def withStaticOptions(value: ServeStaticOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStaticOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withStats(value: Stats): Self = {
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
    def withTransportMode(value: sockjs | ws | Client | Server | ClientServer): Self = {
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
    def withWriteToDisk(value: Boolean | (js.Function1[/* filePath */ String, Boolean])): Self = {
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

