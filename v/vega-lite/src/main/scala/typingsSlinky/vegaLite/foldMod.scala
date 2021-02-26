package typingsSlinky.vegaLite

import typingsSlinky.vegaLite.dataflowMod.DataFlowNode
import typingsSlinky.vegaLite.transformMod.FoldTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object foldMod {
  
  @JSImport("vega-lite/build/src/compile/data/fold", "FoldTransformNode")
  @js.native
  class FoldTransformNode protected () extends DataFlowNode {
    def this(parent: DataFlowNode, transform: FoldTransform) = this()
    
    def assemble(): typingsSlinky.vegaTypings.transformMod.FoldTransform = js.native
    
    var transform: js.Any = js.native
  }
}
