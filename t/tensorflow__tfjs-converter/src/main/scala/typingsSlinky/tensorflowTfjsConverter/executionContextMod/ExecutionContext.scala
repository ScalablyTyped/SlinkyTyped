package typingsSlinky.tensorflowTfjsConverter.executionContextMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.tensorflowTfjsConverter.executorTypesMod.FunctionExecutor
import typingsSlinky.tensorflowTfjsConverter.tensorArrayMod.TensorArray
import typingsSlinky.tensorflowTfjsConverter.typesMod.NamedTensorsMap
import typingsSlinky.tensorflowTfjsConverter.typesMod.TensorArrayMap
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-converter/dist/executor/execution_context", "ExecutionContext")
@js.native
class ExecutionContext protected () extends js.Object {
  def this(weightMap: NamedTensorsMap, tensorArrayMap: TensorArrayMap) = this()
  def this(
    weightMap: NamedTensorsMap,
    tensorArrayMap: TensorArrayMap,
    functionMap: StringDictionary[FunctionExecutor]
  ) = this()
  
  var _currentContextIds: js.Any = js.native
  
  def addTensorArray(tensorArray: TensorArray): Unit = js.native
  
  var contextIdforContexts: js.Any = js.native
  
  var contexts: js.Any = js.native
  
  /**
    * Set the current context
    * @param contexts: ExecutionContextInfo[] the current path of execution
    * frames
    */
  var currentContext: js.Array[ExecutionContextInfo] = js.native
  
  /**
    * Returns the current context in string format.
    */
  val currentContextId: String = js.native
  
  /**
    * Returns the current context and all parent contexts in string format.
    * This allow access to the nodes in the current and parent frames.
    */
  val currentContextIds: js.Array[String] = js.native
  
  /**
    * Enter a new frame, a new context is pushed on the current context list.
    * @param frameId new frame id
    */
  def enterFrame(frameId: String): Unit = js.native
  
  /**
    * Exit the current frame, the last context is removed from the current
    * context list.
    */
  def exitFrame(): Unit = js.native
  
  val functionMap: StringDictionary[FunctionExecutor] = js.native
  
  var generateCurrentContextIds: js.Any = js.native
  
  def getTensorArray(id: Double): TensorArray = js.native
  
  def getWeight(name: String): js.Array[Tensor[Rank]] = js.native
  
  var lastId: js.Any = js.native
  
  var newFrame: js.Any = js.native
  
  /**
    * Enter the next iteration of a loop, the iteration id of last context is
    * increased.
    */
  def nextIteration(): Unit = js.native
  
  var rootContext: js.Any = js.native
  
  val tensorArrayMap: TensorArrayMap = js.native
  
  val weightMap: NamedTensorsMap = js.native
}
