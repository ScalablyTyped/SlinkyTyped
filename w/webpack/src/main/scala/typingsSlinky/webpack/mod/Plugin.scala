package typingsSlinky.webpack.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack", "Plugin")
@js.native
abstract class Plugin ()
  extends typingsSlinky.tapable.mod.Tapable.Plugin {
  /* CompleteClass */
  @JSName("apply")
  override def apply(args: js.Any*): Unit = js.native
  @JSName("apply")
  def apply(compiler: Compiler_): Unit = js.native
}

