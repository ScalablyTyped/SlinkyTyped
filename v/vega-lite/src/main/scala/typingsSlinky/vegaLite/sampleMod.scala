package typingsSlinky.vegaLite

import typingsSlinky.vegaLite.dataflowMod.DataFlowNode
import typingsSlinky.vegaLite.transformMod.SampleTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sampleMod {
  
  @JSImport("vega-lite/build/src/compile/data/sample", "SampleTransformNode")
  @js.native
  class SampleTransformNode protected () extends DataFlowNode {
    def this(parent: DataFlowNode, transform: SampleTransform) = this()
    
    def assemble(): typingsSlinky.vegaTypings.transformMod.SampleTransform = js.native
    
    var transform: js.Any = js.native
  }
}
