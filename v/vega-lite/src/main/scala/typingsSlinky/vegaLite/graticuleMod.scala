package typingsSlinky.vegaLite

import typingsSlinky.vegaLite.dataflowMod.DataFlowNode
import typingsSlinky.vegaLite.srcDataMod.GraticuleParams
import typingsSlinky.vegaLite.vegaLiteBooleans.`true`
import typingsSlinky.vegaTypings.transformMod.GraticuleTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object graticuleMod {
  
  @JSImport("vega-lite/build/src/compile/data/graticule", "GraticuleNode")
  @js.native
  class GraticuleNode protected () extends DataFlowNode {
    def this(parent: DataFlowNode, params: GraticuleParams) = this()
    def this(parent: DataFlowNode, params: `true`) = this()
    
    def assemble(): GraticuleTransform = js.native
    
    var params: js.Any = js.native
  }
}
