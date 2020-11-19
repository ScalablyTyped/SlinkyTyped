package typingsSlinky.webpackPluginServe.mod

import typingsSlinky.connectHistoryApiFallback.mod.Options
import typingsSlinky.httpProxyMiddleware.mod.Config
import typingsSlinky.httpProxyMiddleware.mod.Proxy
import typingsSlinky.koa.mod.Context
import typingsSlinky.koaCompress.mod.CompressOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Builtins extends js.Object {
  
  def compress(opts: CompressOptions): Unit = js.native
  
  def four0four(): Unit = js.native
  def four0four(fn: js.Function1[/* ctx */ Context, Unit]): Unit = js.native
  
  def historyFallback(opts: Options): Unit = js.native
  
  def proxy(args: Config): Proxy = js.native
  
  def static(paths: js.Array[String]): Unit = js.native
  def static(paths: js.Array[String], opts: typingsSlinky.koaStatic.mod.Options): Unit = js.native
  
  def websocket(): Unit = js.native
}
