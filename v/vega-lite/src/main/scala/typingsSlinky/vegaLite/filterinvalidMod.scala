package typingsSlinky.vegaLite

import typingsSlinky.vegaLite.binMod.BinParams
import typingsSlinky.vegaLite.channeldefMod.TypedFieldDef
import typingsSlinky.vegaLite.dataflowMod.DataFlowNode
import typingsSlinky.vegaLite.unitMod.UnitModel
import typingsSlinky.vegaLite.utilMod.Dict
import typingsSlinky.vegaLite.vegaLiteStrings.binned
import typingsSlinky.vegaTypings.transformMod.FilterTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filterinvalidMod {
  
  @JSImport("vega-lite/build/src/compile/data/filterinvalid", "FilterInvalidNode")
  @js.native
  class FilterInvalidNode protected () extends DataFlowNode {
    def this(parent: DataFlowNode, filter: Dict[TypedFieldDef[String, _, Boolean | BinParams | binned | Null]]) = this()
    
    /**
      * Create the VgTransforms for each of the filtered fields.
      */
    def assemble(): FilterTransform = js.native
    
    val filter: Dict[TypedFieldDef[String, _, Boolean | BinParams | binned | Null]] = js.native
  }
  /* static members */
  object FilterInvalidNode {
    
    @JSImport("vega-lite/build/src/compile/data/filterinvalid", "FilterInvalidNode.make")
    @js.native
    def make(parent: DataFlowNode, model: UnitModel): FilterInvalidNode = js.native
  }
}
