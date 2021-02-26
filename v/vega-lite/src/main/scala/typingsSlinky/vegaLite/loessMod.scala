package typingsSlinky.vegaLite

import typingsSlinky.vegaLite.dataflowMod.DataFlowNode
import typingsSlinky.vegaLite.transformMod.LoessTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loessMod {
  
  @JSImport("vega-lite/build/src/compile/data/loess", "LoessTransformNode")
  @js.native
  class LoessTransformNode protected () extends DataFlowNode {
    def this(parent: DataFlowNode, transform: LoessTransform) = this()
    
    def assemble(): typingsSlinky.vegaTypings.transformMod.LoessTransform = js.native
    
    var transform: js.Any = js.native
  }
}
