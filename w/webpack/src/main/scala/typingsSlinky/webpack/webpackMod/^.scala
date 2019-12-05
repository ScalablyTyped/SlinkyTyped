package typingsSlinky.webpack.webpackMod

import typingsSlinky.webpack.webpackMod.Compiler.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): Compiler = js.native
  def apply(
    options: ConfigurationFactory | MultiConfigurationFactory,
    handler: Handler | typingsSlinky.webpack.webpackMod.MultiCompiler.Handler
  ): typingsSlinky.webpack.webpackMod.Compiler.Watching | Compiler = js.native
  def apply(options: js.Array[Configuration]): MultiCompiler = js.native
  def apply(options: js.Array[Configuration], handler: typingsSlinky.webpack.webpackMod.MultiCompiler.Handler): MultiWatching | MultiCompiler = js.native
  def apply(options: Configuration): Compiler = js.native
  def apply(options: Configuration, handler: Handler): typingsSlinky.webpack.webpackMod.Compiler.Watching | Compiler = js.native
}

