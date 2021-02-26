package typingsSlinky.vegaLite

import typingsSlinky.vegaLite.dataflowMod.DataFlowNode
import typingsSlinky.vegaLite.transformMod.WindowTransform
import typingsSlinky.vegaLite.vegaSchemaMod.VgJoinAggregateTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object windowMod {
  
  @JSImport("vega-lite/build/src/compile/data/window", "WindowTransformNode")
  @js.native
  class WindowTransformNode protected () extends DataFlowNode {
    def this(parent: DataFlowNode, transform: WindowTransform) = this()
    
    def addDimensions(fields: js.Array[String]): Unit = js.native
    
    def assemble(): typingsSlinky.vegaTypings.transformMod.WindowTransform | VgJoinAggregateTransform = js.native
    
    var getDefaultName: js.Any = js.native
    
    val transform: js.Any = js.native
  }
}
