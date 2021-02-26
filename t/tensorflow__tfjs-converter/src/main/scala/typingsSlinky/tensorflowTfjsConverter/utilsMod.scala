package typingsSlinky.tensorflowTfjsConverter

import typingsSlinky.tensorflowTfjsConverter.executionContextMod.ExecutionContext
import typingsSlinky.tensorflowTfjsConverter.operationsTypesMod.Node
import typingsSlinky.tensorflowTfjsConverter.operationsTypesMod.ValueType
import typingsSlinky.tensorflowTfjsConverter.resourceManagerMod.ResourceManager
import typingsSlinky.tensorflowTfjsConverter.typesMod.NamedTensorsMap
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("@tensorflow/tfjs-converter/dist/operations/executors/utils", "cloneTensor")
  @js.native
  def cloneTensor(tensor: Tensor[Rank]): Tensor[Rank] = js.native
  
  @JSImport("@tensorflow/tfjs-converter/dist/operations/executors/utils", "getNodeNameAndIndex")
  @js.native
  def getNodeNameAndIndex(inputName: String): js.Tuple2[String, Double] = js.native
  @JSImport("@tensorflow/tfjs-converter/dist/operations/executors/utils", "getNodeNameAndIndex")
  @js.native
  def getNodeNameAndIndex(inputName: String, context: ExecutionContext): js.Tuple2[String, Double] = js.native
  
  @JSImport("@tensorflow/tfjs-converter/dist/operations/executors/utils", "getPadding")
  @js.native
  def getPadding(node: Node, tensorMap: NamedTensorsMap, context: ExecutionContext): ValueType = js.native
  
  @JSImport("@tensorflow/tfjs-converter/dist/operations/executors/utils", "getParamValue")
  @js.native
  def getParamValue(paramName: String, node: Node, tensorMap: NamedTensorsMap, context: ExecutionContext): ValueType = js.native
  @JSImport("@tensorflow/tfjs-converter/dist/operations/executors/utils", "getParamValue")
  @js.native
  def getParamValue(
    paramName: String,
    node: Node,
    tensorMap: NamedTensorsMap,
    context: ExecutionContext,
    resourceManager: ResourceManager
  ): ValueType = js.native
  
  @JSImport("@tensorflow/tfjs-converter/dist/operations/executors/utils", "getTensor")
  @js.native
  def getTensor(name: String, tensorsMap: NamedTensorsMap, context: ExecutionContext): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-converter/dist/operations/executors/utils", "getTensor")
  @js.native
  def getTensor(
    name: String,
    tensorsMap: NamedTensorsMap,
    context: ExecutionContext,
    resourceManager: ResourceManager
  ): Tensor[Rank] = js.native
  
  @JSImport("@tensorflow/tfjs-converter/dist/operations/executors/utils", "getTensorsForCurrentContenxt")
  @js.native
  def getTensorsForCurrentContenxt(name: String, tensorsMap: NamedTensorsMap, context: ExecutionContext): js.Array[Tensor[Rank]] = js.native
  
  @JSImport("@tensorflow/tfjs-converter/dist/operations/executors/utils", "parseNodeName")
  @js.native
  def parseNodeName(name: String): js.Tuple2[String, Double] = js.native
  
  @JSImport("@tensorflow/tfjs-converter/dist/operations/executors/utils", "split")
  @js.native
  def split(arr: js.Array[Double], size: Double): js.Array[js.Array[Double]] = js.native
}
