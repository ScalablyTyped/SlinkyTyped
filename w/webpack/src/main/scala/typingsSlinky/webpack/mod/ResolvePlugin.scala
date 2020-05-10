package typingsSlinky.webpack.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack", "ResolvePlugin")
@js.native
abstract class ResolvePlugin ()
  extends typingsSlinky.tapable.mod.Tapable.Plugin {
  @JSName("apply")
  def apply(resolver: js.Any): Unit = js.native
}

