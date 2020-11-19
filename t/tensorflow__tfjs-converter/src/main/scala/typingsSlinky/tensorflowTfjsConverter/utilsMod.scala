package typingsSlinky.tensorflowTfjsConverter

import typingsSlinky.tensorflowTfjsConverter.executionContextMod.ExecutionContext
import typingsSlinky.tensorflowTfjsConverter.operationsTypesMod.Node
import typingsSlinky.tensorflowTfjsConverter.operationsTypesMod.ValueType
import typingsSlinky.tensorflowTfjsConverter.typesMod.NamedTensorsMap
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-converter/dist/operations/executors/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  
  def getNodeNameAndIndex(inputName: String): js.Tuple2[String, Double] = js.native
  def getNodeNameAndIndex(inputName: String, context: ExecutionContext): js.Tuple2[String, Double] = js.native
  
  def getParamValue(paramName: String, node: Node, tensorMap: NamedTensorsMap, context: ExecutionContext): ValueType = js.native
  
  def getTensor(name: String, tensorsMap: NamedTensorsMap, context: ExecutionContext): Tensor[Rank] = js.native
  
  def getTensorsForCurrentContenxt(name: String, tensorsMap: NamedTensorsMap, context: ExecutionContext): js.Array[Tensor[Rank]] = js.native
  
  def parseNodeName(name: String): js.Tuple2[String, Double] = js.native
  
  def split(arr: js.Array[Double], size: Double): js.Array[js.Array[Double]] = js.native
}
