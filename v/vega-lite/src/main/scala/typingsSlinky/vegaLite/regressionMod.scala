package typingsSlinky.vegaLite

import typingsSlinky.vegaLite.dataflowMod.DataFlowNode
import typingsSlinky.vegaLite.transformMod.RegressionTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object regressionMod {
  
  @JSImport("vega-lite/build/src/compile/data/regression", "RegressionTransformNode")
  @js.native
  class RegressionTransformNode protected () extends DataFlowNode {
    def this(parent: DataFlowNode, transform: RegressionTransform) = this()
    
    def assemble(): typingsSlinky.vegaTypings.transformMod.RegressionTransform = js.native
    
    var transform: js.Any = js.native
  }
}
