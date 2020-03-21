package typingsSlinky.webpackDevServer.mod

import typingsSlinky.webpack.mod.Compiler_
import typingsSlinky.webpack.mod.MultiCompiler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack-dev-server", JSImport.Namespace)
@js.native
class ^ protected () extends WebpackDevServer {
  def this(webpack: Compiler_) = this()
  def this(webpack: MultiCompiler) = this()
  def this(webpack: Compiler_, config: Configuration) = this()
  def this(webpack: MultiCompiler, config: Configuration) = this()
}

@JSImport("webpack-dev-server", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def addDevServerEntrypoints(webpackOptions: js.Array[typingsSlinky.webpack.mod.Configuration], config: Configuration): Unit = js.native
  def addDevServerEntrypoints(
    webpackOptions: js.Array[typingsSlinky.webpack.mod.Configuration],
    config: Configuration,
    listeningApp: ListeningApp
  ): Unit = js.native
  def addDevServerEntrypoints(webpackOptions: typingsSlinky.webpack.mod.Configuration, config: Configuration): Unit = js.native
  def addDevServerEntrypoints(
    webpackOptions: typingsSlinky.webpack.mod.Configuration,
    config: Configuration,
    listeningApp: ListeningApp
  ): Unit = js.native
}

