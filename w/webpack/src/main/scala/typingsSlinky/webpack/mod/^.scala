package typingsSlinky.webpack.mod

import typingsSlinky.webpack.mod.Compiler_.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): Compiler_ = js.native
  def apply(
    options: ConfigurationFactory | MultiConfigurationFactory,
    handler: Handler | typingsSlinky.webpack.mod.MultiCompiler.Handler
  ): typingsSlinky.webpack.mod.Compiler_.Watching | Compiler_ = js.native
  def apply(options: js.Array[Configuration]): MultiCompiler = js.native
  def apply(options: js.Array[Configuration], handler: typingsSlinky.webpack.mod.MultiCompiler.Handler): MultiWatching | MultiCompiler = js.native
  def apply(options: Configuration): Compiler_ = js.native
  def apply(options: Configuration, handler: Handler): typingsSlinky.webpack.mod.Compiler_.Watching | Compiler_ = js.native
}

