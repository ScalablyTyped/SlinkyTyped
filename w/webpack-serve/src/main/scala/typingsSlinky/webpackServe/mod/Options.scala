package typingsSlinky.webpackServe.mod

import typingsSlinky.node.httpsMod.ServerOptions
import typingsSlinky.webpack.mod.Compiler_
import typingsSlinky.webpack.mod.Configuration
import typingsSlinky.webpackServe.webpackServeStrings.debug
import typingsSlinky.webpackServe.webpackServeStrings.error
import typingsSlinky.webpackServe.webpackServeStrings.info
import typingsSlinky.webpackServe.webpackServeStrings.silent
import typingsSlinky.webpackServe.webpackServeStrings.trace
import typingsSlinky.webpackServe.webpackServeStrings.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /** Addon to webpack-serve that allows access to the Koa server instance */
  var add: js.UndefOr[
    js.Function3[/* app */ InitializedKoa, /* middleware */ Middleware, /* options */ Options, Unit]
  ] = js.native
  /** Copy the server URL to the clipboard when the server is started */
  var clipboard: js.UndefOr[Boolean] = js.native
  /** Custom instance of a webpack compiler */
  var compiler: js.UndefOr[Compiler_] = js.native
  /** Webpack configuration for creating a new webpack compiler instance */
  var config: js.UndefOr[Configuration] = js.native
  /** A path or array of paths where content will be served from */
  var content: js.UndefOr[String | js.Array[String]] = js.native
  /** Options for webpack-dev-middleware */
  var devMiddleware: js.UndefOr[typingsSlinky.webpackDevMiddleware.mod.Options] = js.native
  /** The host the server will listen on */
  var host: js.UndefOr[String] = js.native
  /** Options for webpack-hot-client */
  var hotClient: js.UndefOr[typingsSlinky.webpackHotClient.mod.Options | Boolean] = js.native
  /** Enable HTTP2 support */
  var http2: js.UndefOr[Boolean] = js.native
  /** Configuration object for the server to use HTTPS */
  var https: js.UndefOr[ServerOptions] = js.native
  /** Level of information for webpack-serve to output */
  var logLevel: js.UndefOr[trace | debug | info | warn | error | silent] = js.native
  /** Prepend timestamp to each log line */
  var logTime: js.UndefOr[Boolean] = js.native
  /** Object of subscribers to webpack-serve bus events */
  var on: js.UndefOr[OnOptions] = js.native
  /** Open the browser when started */
  var open: js.UndefOr[OpenOptions | Boolean] = js.native
  /** Port that the server listens on */
  var port: js.UndefOr[Double] = js.native
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
    def withAdd(value: (/* app */ InitializedKoa, /* middleware */ Middleware, /* options */ Options) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAdd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.undefined)
        ret
    }
    @scala.inline
    def withClipboard(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipboard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClipboard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipboard")(js.undefined)
        ret
    }
    @scala.inline
    def withCompiler(value: Compiler_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compiler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompiler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compiler")(js.undefined)
        ret
    }
    @scala.inline
    def withConfig(value: Configuration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(js.undefined)
        ret
    }
    @scala.inline
    def withContent(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
    @scala.inline
    def withDevMiddleware(value: typingsSlinky.webpackDevMiddleware.mod.Options): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devMiddleware")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevMiddleware: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devMiddleware")(js.undefined)
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
    def withHotClient(value: typingsSlinky.webpackHotClient.mod.Options | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hotClient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHotClient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hotClient")(js.undefined)
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
    def withHttps(value: ServerOptions): Self = {
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
    def withLogLevel(value: trace | debug | info | warn | error | silent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withLogTime(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logTime")(js.undefined)
        ret
    }
    @scala.inline
    def withOn(value: OnOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(js.undefined)
        ret
    }
    @scala.inline
    def withOpen(value: OpenOptions | Boolean): Self = {
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
  }
  
}

