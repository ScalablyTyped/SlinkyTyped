package typingsSlinky.webpack.mod.DefinePlugin

import typingsSlinky.webpack.anon.Module
import typingsSlinky.webpack.mod.compilation.normalModuleFactory.Parser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack", "DefinePlugin.RuntimeValue")
@js.native
class RuntimeValue protected () extends CodeValuePrimitive {
  def this(fn: js.Function1[/* hasModule */ Module, CodeValuePrimitive]) = this()
  def this(fn: js.Function1[/* hasModule */ Module, CodeValuePrimitive], fileDependencies: js.Array[String]) = this()
  def exec(parser: Parser): CodeValuePrimitive = js.native
}

