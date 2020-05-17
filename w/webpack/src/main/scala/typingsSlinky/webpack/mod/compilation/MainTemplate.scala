package typingsSlinky.webpack.mod.compilation

import typingsSlinky.tapable.mod.Tapable
import typingsSlinky.webpack.anon.AfterStartup
import typingsSlinky.webpack.mod.Output
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack", "compilation.MainTemplate")
@js.native
class MainTemplate () extends Tapable {
  var hooks: AfterStartup = js.native
  var outputOptions: Output = js.native
  var requireFn: String = js.native
  def renderAddModule(hash: String, chunk: Chunk, varModuleId: js.UndefOr[Double | String], varModule: String): String = js.native
  def renderRequireFunctionForModule(hash: String, chunk: Chunk): String = js.native
  def renderRequireFunctionForModule(hash: String, chunk: Chunk, varModuleId: String): String = js.native
  def renderRequireFunctionForModule(hash: String, chunk: Chunk, varModuleId: Double): String = js.native
}

