package typingsSlinky.vegaLite

import typingsSlinky.vegaLite.dataflowMod.DataFlowNode
import typingsSlinky.vegaLite.srcDataMod.SequenceParams
import typingsSlinky.vegaTypings.transformMod.SequenceTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sequenceMod {
  
  @JSImport("vega-lite/build/src/compile/data/sequence", "SequenceNode")
  @js.native
  class SequenceNode protected () extends DataFlowNode {
    def this(parent: DataFlowNode, params: SequenceParams) = this()
    
    def assemble(): SequenceTransform = js.native
    
    var params: js.Any = js.native
  }
}
