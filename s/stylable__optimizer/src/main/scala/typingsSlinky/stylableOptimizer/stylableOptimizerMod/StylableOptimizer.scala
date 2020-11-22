package typingsSlinky.stylableOptimizer.stylableOptimizerMod

import typingsSlinky.postcss.mod.Root_
import typingsSlinky.std.Record
import typingsSlinky.stylableCore.stylableTransformerMod.StylableResults
import typingsSlinky.stylableCore.typesMod.IStylableOptimizer
import typingsSlinky.stylableOptimizer.classnameOptimizerMod.StylableClassNameOptimizer
import typingsSlinky.stylableOptimizer.namespaceOptimizerMod.StylableNamespaceOptimizer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@stylable/optimizer/cjs/stylable-optimizer", "StylableOptimizer")
@js.native
class StylableOptimizer () extends IStylableOptimizer {
  def this(classNameOptimizer: StylableClassNameOptimizer) = this()
  def this(classNameOptimizer: js.UndefOr[scala.Nothing], namespaceOptimizer: StylableNamespaceOptimizer) = this()
  def this(classNameOptimizer: StylableClassNameOptimizer, namespaceOptimizer: StylableNamespaceOptimizer) = this()
  
  @JSName("classNameOptimizer")
  var classNameOptimizer_StylableOptimizer: StylableClassNameOptimizer = js.native
  
  var isContainsUnusedParts: js.Any = js.native
  
  @JSName("namespaceOptimizer")
  var namespaceOptimizer_StylableOptimizer: StylableNamespaceOptimizer = js.native
  
  def optimize(config: OptimizeConfig, stylableResults: StylableResults, usageMapping: Record[String, Boolean]): Unit = js.native
  def optimize(
    config: OptimizeConfig,
    stylableResults: StylableResults,
    usageMapping: Record[String, Boolean],
    delimiter: String
  ): Unit = js.native
  
  var removeComments: js.Any = js.native
  
  var removeEmptyNodes: js.Any = js.native
  
  def removeStylableDirectives(root: Root_): Unit = js.native
  
  var removeUnusedComponents: js.Any = js.native
}
