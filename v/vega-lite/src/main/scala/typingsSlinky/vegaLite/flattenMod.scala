package typingsSlinky.vegaLite

import typingsSlinky.vegaLite.dataflowMod.DataFlowNode
import typingsSlinky.vegaLite.transformMod.FlattenTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flattenMod {
  
  @JSImport("vega-lite/build/src/compile/data/flatten", "FlattenTransformNode")
  @js.native
  class FlattenTransformNode protected () extends DataFlowNode {
    def this(parent: DataFlowNode, transform: FlattenTransform) = this()
    
    def assemble(): typingsSlinky.vegaTypings.transformMod.FlattenTransform = js.native
    
    var transform: js.Any = js.native
  }
}
