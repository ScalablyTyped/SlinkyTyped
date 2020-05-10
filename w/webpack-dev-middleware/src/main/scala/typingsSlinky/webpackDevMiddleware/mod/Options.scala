package typingsSlinky.webpackDevMiddleware.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.webpack.mod.Options.Stats
import typingsSlinky.webpack.mod.Options.WatchOptions
import typingsSlinky.webpackDevMiddleware.webpackDevMiddlewareStrings.debug
import typingsSlinky.webpackDevMiddleware.webpackDevMiddlewareStrings.error
import typingsSlinky.webpackDevMiddleware.webpackDevMiddlewareStrings.info
import typingsSlinky.webpackDevMiddleware.webpackDevMiddlewareStrings.silent
import typingsSlinky.webpackDevMiddleware.webpackDevMiddlewareStrings.trace
import typingsSlinky.webpackDevMiddleware.webpackDevMiddlewareStrings.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var filename: js.UndefOr[String] = js.native
  /**
    * Set the default file system which will be used by webpack as primary destination of generated files
    */
  var fs: js.UndefOr[typingsSlinky.memoryFs.mod.^] = js.native
  /** This property allows a user to pass custom HTTP headers on each request. eg. { "X-Custom-Header": "yes" } */
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The index path for web server, defaults to "index.html".
    * If falsy (but not undefined), the server will not respond to requests to the root URL.
    */
  var index: js.UndefOr[String | Boolean] = js.native
  /**
    * This option instructs the module to operate in 'lazy' mode,
    * meaning that it won't recompile when files change, but rather on each request.
    */
  var `lazy`: js.UndefOr[Boolean] = js.native
  /** This property defines the level of messages that the module will log */
  var logLevel: js.UndefOr[info | warn | error | trace | debug | silent] = js.native
  /**
    * If true the log output of the module will be prefixed by a timestamp in the HH:mm:ss format.
    * @default false
    */
  var logTime: js.UndefOr[Boolean] = js.native
  /**
    * In the rare event that a user would like to provide a custom logging interface,
    * this property allows the user to assign one
    */
  var logger: js.UndefOr[Logger] = js.native
  /**
    * This property allows a user to pass the list of HTTP request methods accepted by the server.
    * @default [ 'GET', 'HEAD' ]
    */
  var methods: js.UndefOr[js.Array[String]] = js.native
  /**
    * This property allows a user to register custom mime types or extension mappings
    * @default null
    */
  var mimeTypes: js.UndefOr[MimeTypeMap | OverrideMimeTypeMap | Null] = js.native
  /** The public path that the middleware is bound to */
  var publicPath: String = js.native
  /** Allows users to provide a custom reporter to handle logging within the module */
  var reporter: js.UndefOr[Reporter | Null] = js.native
  /** Instructs the module to enable or disable the server-side rendering mode */
  var serverSideRender: js.UndefOr[Boolean] = js.native
  /** Options for formatting statistics displayed during and after compile */
  var stats: js.UndefOr[Stats] = js.native
  /** The module accepts an Object containing options for file watching, which is passed directly to the compiler provided */
  var watchOptions: js.UndefOr[WatchOptions] = js.native
  /**
    * If true, the option will instruct the module to write files to the configured location on disk as specified in your webpack config file
    * This option also accepts a Function value, which can be used to filter which files are written to disk
    */
  var writeToDisk: js.UndefOr[Boolean | (js.Function1[/* filename */ String, Boolean])] = js.native
}

object Options {
  @scala.inline
  def apply(publicPath: String): Options = {
    val __obj = js.Dynamic.literal(publicPath = publicPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPublicPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicPath")(value.asInstanceOf[js.Any])
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
    def withFs(value: typingsSlinky.memoryFs.mod.^): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fs")(js.undefined)
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
    def withIndex(value: String | Boolean): Self = {
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
    def withLogLevel(value: info | warn | error | trace | debug | silent): Self = {
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
    def withLogger(value: Logger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(js.undefined)
        ret
    }
    @scala.inline
    def withMethods(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethods: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methods")(js.undefined)
        ret
    }
    @scala.inline
    def withMimeTypes(value: MimeTypeMap | OverrideMimeTypeMap): Self = {
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
    def withMimeTypesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeTypes")(null)
        ret
    }
    @scala.inline
    def withReporter(value: (/* middlewareOptions */ Options, /* reporterOptions */ ReporterOptions) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reporter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutReporter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reporter")(js.undefined)
        ret
    }
    @scala.inline
    def withReporterNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reporter")(null)
        ret
    }
    @scala.inline
    def withServerSideRender(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverSideRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerSideRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverSideRender")(js.undefined)
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
    def withWriteToDiskFunction1(value: /* filename */ String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeToDisk")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWriteToDisk(value: Boolean | (js.Function1[/* filename */ String, Boolean])): Self = {
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

