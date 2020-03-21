package typingsSlinky.webpack.mod

import typingsSlinky.webpack.Anon0
import typingsSlinky.webpack.mod.compilation.Chunk
import typingsSlinky.webpack.mod.compilation.ModuleTemplate
import typingsSlinky.webpack.webpackBooleans.`false`
import typingsSlinky.webpackSources.mod.ConcatSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack", "Template")
@js.native
object Template extends js.Object {
  def asString(str: String): String = js.native
  def asString(str: js.Array[String]): String = js.native
  def getFunctionContent(fn: js.Function1[/* repeated */ js.Any, _]): String = js.native
  def getModulesArrayBounds(modules: js.Array[Anon0]): (js.Tuple2[Double, Double]) | `false` = js.native
  def indent(s: String): String = js.native
  def indent(s: js.Array[String]): String = js.native
  def numberToIdentifer(n: Double): String = js.native
  def prefix(s: String, prefix: String): String = js.native
  def prefix(s: js.Array[String], prefix: String): String = js.native
  def renderChunkModules(
    chunk: Chunk,
    filterFn: js.Function2[/* module */ typingsSlinky.webpack.mod.compilation.Module, /* num */ Double, Boolean],
    moduleTemplate: ModuleTemplate,
    dependencyTemplates: js.Any
  ): ConcatSource = js.native
  def renderChunkModules(
    chunk: Chunk,
    filterFn: js.Function2[/* module */ typingsSlinky.webpack.mod.compilation.Module, /* num */ Double, Boolean],
    moduleTemplate: ModuleTemplate,
    dependencyTemplates: js.Any,
    prefix: String
  ): ConcatSource = js.native
  def toComment(str: String): String = js.native
  def toIdentifier(str: String): String = js.native
  def toNormalComment(str: String): String = js.native
  def toPath(str: String): String = js.native
}

