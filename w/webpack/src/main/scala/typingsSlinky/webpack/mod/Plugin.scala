package typingsSlinky.webpack.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack", "Plugin")
@js.native
abstract class Plugin ()
  extends typingsSlinky.tapable.mod.Tapable.Plugin {
  @JSName("apply")
  def apply(compiler: Compiler_): Unit = js.native
}

