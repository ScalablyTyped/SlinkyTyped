package typingsSlinky.webpackDashPluginDashServe.webpackDashPluginDashServeMod

import typingsSlinky.connectDashHistoryDashApiDashFallback.connectDashHistoryDashApiDashFallbackMod.Options
import typingsSlinky.httpDashProxyDashMiddleware.httpDashProxyDashMiddlewareMod.Config
import typingsSlinky.httpDashProxyDashMiddleware.httpDashProxyDashMiddlewareMod.Proxy
import typingsSlinky.koa.koaMod.Context
import typingsSlinky.koaDashCompress.koaDashCompressMod.CompressOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Builtins extends js.Object {
  def compress(opts: CompressOptions): Unit = js.native
  def four0four(): Unit = js.native
  def four0four(fn: js.Function1[/* ctx */ Context, Unit]): Unit = js.native
  def historyFallback(opts: Options): Unit = js.native
  def proxy(args: Config): Proxy = js.native
  def static(paths: js.Array[String]): Unit = js.native
  def static(paths: js.Array[String], opts: typingsSlinky.koaDashStatic.koaDashStaticMod.Options): Unit = js.native
  def websocket(): Unit = js.native
}

