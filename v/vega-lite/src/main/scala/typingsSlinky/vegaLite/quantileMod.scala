package typingsSlinky.vegaLite

import typingsSlinky.vegaLite.dataflowMod.DataFlowNode
import typingsSlinky.vegaLite.transformMod.QuantileTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object quantileMod {
  
  @JSImport("vega-lite/build/src/compile/data/quantile", "QuantileTransformNode")
  @js.native
  class QuantileTransformNode protected () extends DataFlowNode {
    def this(parent: DataFlowNode, transform: QuantileTransform) = this()
    
    def assemble(): typingsSlinky.vegaTypings.transformMod.QuantileTransform = js.native
    
    var transform: js.Any = js.native
  }
}
