package typingsSlinky.stylableCore.typesMod

import typingsSlinky.postcss.mod.Root_
import typingsSlinky.std.Record
import typingsSlinky.stylableCore.stylableTransformerMod.StylableResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStylableOptimizer extends js.Object {
  
  var classNameOptimizer: IStylableClassNameOptimizer = js.native
  
  def minifyCSS(css: String): String = js.native
  
  var namespaceOptimizer: IStylableNamespaceOptimizer = js.native
  
  def optimize(config: js.Object, stylableResult: StylableResults, usageMapping: Record[String, Boolean]): Unit = js.native
  def optimize(
    config: js.Object,
    stylableResult: StylableResults,
    usageMapping: Record[String, Boolean],
    delimiter: String
  ): Unit = js.native
  
  def removeStylableDirectives(root: Root_, shouldComment: Boolean): Unit = js.native
}
