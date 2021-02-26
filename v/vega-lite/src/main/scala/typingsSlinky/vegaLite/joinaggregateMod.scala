package typingsSlinky.vegaLite

import typingsSlinky.vegaLite.dataflowMod.DataFlowNode
import typingsSlinky.vegaLite.transformMod.JoinAggregateTransform
import typingsSlinky.vegaLite.vegaSchemaMod.VgJoinAggregateTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object joinaggregateMod {
  
  @JSImport("vega-lite/build/src/compile/data/joinaggregate", "JoinAggregateTransformNode")
  @js.native
  class JoinAggregateTransformNode protected () extends DataFlowNode {
    def this(parent: DataFlowNode, transform: JoinAggregateTransform) = this()
    
    def addDimensions(fields: js.Array[String]): Unit = js.native
    
    def assemble(): VgJoinAggregateTransform = js.native
    
    var getDefaultName: js.Any = js.native
    
    val transform: js.Any = js.native
  }
}
