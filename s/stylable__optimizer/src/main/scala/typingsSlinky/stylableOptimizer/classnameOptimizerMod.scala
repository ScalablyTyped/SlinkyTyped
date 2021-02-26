package typingsSlinky.stylableOptimizer

import typingsSlinky.postcss.mod.Root_
import typingsSlinky.std.Record
import typingsSlinky.stylableCore.typesMod.IStylableClassNameOptimizer
import typingsSlinky.stylableOptimizer.anon.Names
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object classnameOptimizerMod {
  
  @JSImport("@stylable/optimizer/cjs/classname-optimizer", "StylableClassNameOptimizer")
  @js.native
  class StylableClassNameOptimizer () extends IStylableClassNameOptimizer {
    
    @JSName("context")
    var context_StylableClassNameOptimizer: Names = js.native
    
    def optimizeAstAndExports(
      ast: Root_,
      exported: Record[String, String],
      classes: js.UndefOr[scala.Nothing],
      usageMapping: Record[String, Boolean]
    ): Unit = js.native
    def optimizeAstAndExports(
      ast: Root_,
      exported: Record[String, String],
      classes: js.UndefOr[scala.Nothing],
      usageMapping: Record[String, Boolean],
      globals: Record[String, Boolean]
    ): Unit = js.native
    
    def rewriteSelector(selector: String, usageMapping: Record[String, Boolean]): String = js.native
  }
}
