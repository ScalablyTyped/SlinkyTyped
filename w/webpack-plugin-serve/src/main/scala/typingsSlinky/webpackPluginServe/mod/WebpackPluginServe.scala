package typingsSlinky.webpackPluginServe.mod

import typingsSlinky.webpack.mod.Compiler_
import typingsSlinky.webpackPluginServe.AnonApply
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack-plugin-serve", "WebpackPluginServe")
@js.native
class WebpackPluginServe () extends js.Object {
  def this(opts: WebpackPluginServeOptions) = this()
  @JSName("apply")
  def apply(compiler: Compiler_): Unit = js.native
  def attach(): AnonApply = js.native
  def hook(compiler: Compiler_): Unit = js.native
}

