package typingsSlinky.vegaLite

import typingsSlinky.vegaLite.dataMod.AncestorParse
import typingsSlinky.vegaLite.dataMod.DataComponent
import typingsSlinky.vegaLite.dataflowMod.DataFlowNode
import typingsSlinky.vegaLite.modelMod.Model
import typingsSlinky.vegaLite.sourceMod.SourceNode
import typingsSlinky.vegaLite.srcDataMod.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataParseMod {
  
  @JSImport("vega-lite/build/src/compile/data/parse", "findSource")
  @js.native
  def findSource(data: Data, sources: js.Array[SourceNode]): SourceNode = js.native
  
  @JSImport("vega-lite/build/src/compile/data/parse", "parseData")
  @js.native
  def parseData(model: Model): DataComponent = js.native
  
  @JSImport("vega-lite/build/src/compile/data/parse", "parseTransformArray")
  @js.native
  def parseTransformArray(head: DataFlowNode, model: Model, ancestorParse: AncestorParse): DataFlowNode = js.native
}
