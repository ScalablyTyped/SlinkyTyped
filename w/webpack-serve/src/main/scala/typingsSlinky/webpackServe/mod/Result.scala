package typingsSlinky.webpackServe.mod

import typingsSlinky.webpackServe.AnonCompiler
import typingsSlinky.webpackServe.AnonCompilerStats
import typingsSlinky.webpackServe.AnonOptions
import typingsSlinky.webpackServe.AnonStats
import typingsSlinky.webpackServe.webpackServeStrings.`build-finished`
import typingsSlinky.webpackServe.webpackServeStrings.`build-started`
import typingsSlinky.webpackServe.webpackServeStrings.`compiler-error`
import typingsSlinky.webpackServe.webpackServeStrings.`compiler-warning`
import typingsSlinky.webpackServe.webpackServeStrings.listening
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Result extends js.Object {
  /** An instance of a Koa application, extended with a server property, and stop method, which is used to programatically stop the server */
  var app: InitializedKoa = js.native
  /** Access to a frozen copy of the internal options object used by the module. */
  var options: InitializedOptions = js.native
  @JSName("on")
  def on_buildfinished(`type`: `build-finished`, callback: js.Function1[/* args */ AnonStats, Unit]): Unit = js.native
  /** A function which binds a serve event-name to a function */
  @JSName("on")
  def on_buildstarted(`type`: `build-started`, callback: js.Function1[/* args */ AnonCompiler, Unit]): Unit = js.native
  @JSName("on")
  def on_compilererror(`type`: `compiler-error`, callback: js.Function1[/* args */ AnonCompilerStats, Unit]): Unit = js.native
  @JSName("on")
  def on_compilerwarning(`type`: `compiler-warning`, callback: js.Function1[/* args */ AnonCompilerStats, Unit]): Unit = js.native
  @JSName("on")
  def on_listening(`type`: listening, callback: js.Function1[/* args */ AnonOptions, Unit]): Unit = js.native
}

