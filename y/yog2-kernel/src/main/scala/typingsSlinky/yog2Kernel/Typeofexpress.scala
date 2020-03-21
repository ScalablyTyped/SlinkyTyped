package typingsSlinky.yog2Kernel

import typingsSlinky.bodyParser.mod.Options
import typingsSlinky.bodyParser.mod.OptionsJson
import typingsSlinky.bodyParser.mod.OptionsText
import typingsSlinky.bodyParser.mod.OptionsUrlencoded
import typingsSlinky.connect.mod.NextHandleFunction
import typingsSlinky.express.mod.Application_
import typingsSlinky.express.mod.Request_
import typingsSlinky.express.mod.Response_
import typingsSlinky.express.mod.RouterOptions
import typingsSlinky.expressServeStaticCore.mod.Handler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Request
import typingsSlinky.expressServeStaticCore.mod.Response
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import typingsSlinky.serveStatic.mod.ServeStaticOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofexpress extends js.Object {
  /**
    * These are the exposed prototypes.
    */
  @JSName("application")
  var application_Original: Application_ = js.native
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with JSON payloads and is based on body-parser.
    * @since 4.16.0
    */
  @JSName("json")
  var json_Original: Fn0 = js.native
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with Buffer payloads and is based on body-parser.
    * @since 4.17.0
    */
  @JSName("raw")
  var raw_Original: Fn1 = js.native
  var request: Request_[ParamsDictionary] = js.native
  var response: Response_ = js.native
  /**
    * This is a built-in middleware function in Express. It serves static files and is based on serve-static.
    */
  @JSName("static")
  var static_Original: AnonCall = js.native
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with text payloads and is based on body-parser.
    * @since 4.17.0
    */
  @JSName("text")
  var text_Original: FnCallOptions = js.native
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with urlencoded payloads and is based on body-parser.
    * @since 4.16.0
    */
  @JSName("urlencoded")
  var urlencoded_Original: FnCall = js.native
  def Router(): typingsSlinky.expressServeStaticCore.mod.Router = js.native
  def Router(options: RouterOptions): typingsSlinky.expressServeStaticCore.mod.Router = js.native
  /**
    * Express instance itself is a request handler, which could be invoked without
    * third argument.
    */
  /**
    * These are the exposed prototypes.
    */
  def application(req: Request[ParamsDictionary, _, _], res: Response[_]): js.Any = js.native
  /**
    * These are the exposed prototypes.
    */
  def application(req: Request[ParamsDictionary, _, _], res: ServerResponse): js.Any = js.native
  /**
    * These are the exposed prototypes.
    */
  def application(req: IncomingMessage, res: Response[_]): js.Any = js.native
  /**
    * These are the exposed prototypes.
    */
  def application(req: IncomingMessage, res: ServerResponse): js.Any = js.native
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with JSON payloads and is based on body-parser.
    * @since 4.16.0
    */
  def json(): NextHandleFunction = js.native
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with JSON payloads and is based on body-parser.
    * @since 4.16.0
    */
  def json(options: OptionsJson): NextHandleFunction = js.native
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with Buffer payloads and is based on body-parser.
    * @since 4.17.0
    */
  def raw(): NextHandleFunction = js.native
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with Buffer payloads and is based on body-parser.
    * @since 4.17.0
    */
  def raw(options: Options): NextHandleFunction = js.native
  /**
    * This is a built-in middleware function in Express. It serves static files and is based on serve-static.
    */
  def static(root: String): Handler = js.native
  /**
    * This is a built-in middleware function in Express. It serves static files and is based on serve-static.
    */
  def static(root: String, options: ServeStaticOptions): Handler = js.native
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with text payloads and is based on body-parser.
    * @since 4.17.0
    */
  def text(): NextHandleFunction = js.native
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with text payloads and is based on body-parser.
    * @since 4.17.0
    */
  def text(options: OptionsText): NextHandleFunction = js.native
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with urlencoded payloads and is based on body-parser.
    * @since 4.16.0
    */
  def urlencoded(): NextHandleFunction = js.native
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with urlencoded payloads and is based on body-parser.
    * @since 4.16.0
    */
  def urlencoded(options: OptionsUrlencoded): NextHandleFunction = js.native
}

