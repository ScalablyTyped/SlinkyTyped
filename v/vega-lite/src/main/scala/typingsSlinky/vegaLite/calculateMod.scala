package typingsSlinky.vegaLite

import typingsSlinky.vegaLite.binMod.BinParams
import typingsSlinky.vegaLite.channelMod.SingleDefChannel
import typingsSlinky.vegaLite.channeldefMod.FieldRefOption
import typingsSlinky.vegaLite.channeldefMod.TypedFieldDef
import typingsSlinky.vegaLite.dataflowMod.DataFlowNode
import typingsSlinky.vegaLite.modelMod.ModelWithField
import typingsSlinky.vegaLite.transformMod.CalculateTransform
import typingsSlinky.vegaLite.vegaLiteStrings.binned
import typingsSlinky.vegaTypings.transformMod.FormulaTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object calculateMod {
  
  @JSImport("vega-lite/build/src/compile/data/calculate", "CalculateNode")
  @js.native
  class CalculateNode protected () extends DataFlowNode {
    def this(parent: DataFlowNode, transform: CalculateTransform) = this()
    
    var _dependentFields: js.Any = js.native
    
    def assemble(): FormulaTransform = js.native
    
    val transform: js.Any = js.native
  }
  /* static members */
  object CalculateNode {
    
    @JSImport("vega-lite/build/src/compile/data/calculate", "CalculateNode.parseAllForSortIndex")
    @js.native
    def parseAllForSortIndex(parent: DataFlowNode, model: ModelWithField): DataFlowNode = js.native
  }
  
  @JSImport("vega-lite/build/src/compile/data/calculate", "sortArrayIndexField")
  @js.native
  def sortArrayIndexField_binned(fieldDef: TypedFieldDef[String, _, Boolean | BinParams | binned | Null], channel: SingleDefChannel): String = js.native
  @JSImport("vega-lite/build/src/compile/data/calculate", "sortArrayIndexField")
  @js.native
  def sortArrayIndexField_binned(
    fieldDef: TypedFieldDef[String, _, Boolean | BinParams | binned | Null],
    channel: SingleDefChannel,
    opt: FieldRefOption
  ): String = js.native
}
