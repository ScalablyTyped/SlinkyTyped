package typingsSlinky.vegaLite

import typingsSlinky.vegaLite.anon.PartialVgData
import typingsSlinky.vegaLite.dataflowMod.DataFlowNode
import typingsSlinky.vegaLite.srcDataMod.Data
import typingsSlinky.vegaLite.vegaSchemaMod.VgData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceMod {
  
  @JSImport("vega-lite/build/src/compile/data/source", "SourceNode")
  @js.native
  class SourceNode protected () extends DataFlowNode {
    def this(data: Data) = this()
    
    var _data: js.Any = js.native
    
    var _generator: js.Any = js.native
    
    var _name: js.Any = js.native
    
    def assemble(): VgData = js.native
    
    def data: PartialVgData = js.native
    
    def dataName: String = js.native
    def dataName_=(name: String): Unit = js.native
    
    def hasName(): Boolean = js.native
    
    def isGenerator: Boolean = js.native
  }
}
