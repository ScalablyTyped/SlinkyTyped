package typingsSlinky.vegaLite

import typingsSlinky.vegaLite.dataflowMod.DataFlowNode
import typingsSlinky.vegaLite.transformMod.ImputeTransform
import typingsSlinky.vegaLite.unitMod.UnitModel
import typingsSlinky.vegaTypings.transformMod.FormulaTransform
import typingsSlinky.vegaTypings.transformMod.WindowTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imputeMod {
  
  @JSImport("vega-lite/build/src/compile/data/impute", "ImputeNode")
  @js.native
  class ImputeNode protected () extends DataFlowNode {
    def this(parent: DataFlowNode, transform: ImputeTransform) = this()
    
    def assemble(): js.Array[
        FormulaTransform | typingsSlinky.vegaTypings.transformMod.ImputeTransform | WindowTransform
      ] = js.native
    
    var processSequence: js.Any = js.native
    
    val transform: js.Any = js.native
  }
  /* static members */
  object ImputeNode {
    
    @JSImport("vega-lite/build/src/compile/data/impute", "ImputeNode.makeFromEncoding")
    @js.native
    def makeFromEncoding(parent: DataFlowNode, model: UnitModel): ImputeNode = js.native
    
    @JSImport("vega-lite/build/src/compile/data/impute", "ImputeNode.makeFromTransform")
    @js.native
    def makeFromTransform(parent: DataFlowNode, imputeTransform: ImputeTransform): ImputeNode = js.native
  }
}
