package typingsSlinky.tensorflowTfjsConverter

import typingsSlinky.tensorflowTfjsConverter.executionContextMod.ExecutionContext
import typingsSlinky.tensorflowTfjsConverter.operationsTypesMod.Node
import typingsSlinky.tensorflowTfjsConverter.resourceManagerMod.ResourceManager
import typingsSlinky.tensorflowTfjsConverter.typesMod.NamedTensorsMap
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operationExecutorMod {
  
  @JSImport("@tensorflow/tfjs-converter/dist/operations/operation_executor", "executeOp")
  @js.native
  def executeOp(node: Node, tensorMap: NamedTensorsMap, context: ExecutionContext): js.Array[Tensor[Rank]] | js.Promise[js.Array[Tensor[Rank]]] = js.native
  @JSImport("@tensorflow/tfjs-converter/dist/operations/operation_executor", "executeOp")
  @js.native
  def executeOp(
    node: Node,
    tensorMap: NamedTensorsMap,
    context: ExecutionContext,
    resourceManager: ResourceManager
  ): js.Array[Tensor[Rank]] | js.Promise[js.Array[Tensor[Rank]]] = js.native
}
