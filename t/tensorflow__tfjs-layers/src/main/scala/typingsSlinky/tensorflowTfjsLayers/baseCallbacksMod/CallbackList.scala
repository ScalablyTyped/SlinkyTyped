package typingsSlinky.tensorflowTfjsLayers.baseCallbacksMod

import typingsSlinky.tensorflowTfjsLayers.containerMod.Container
import typingsSlinky.tensorflowTfjsLayers.logsMod.UnresolvedLogs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers/dist/base_callbacks", "CallbackList")
@js.native
/**
  * Constructor of CallbackList.
  * @param callbacks Array of `Callback` instances.
  * @param queueLength Queue length for keeping running statistics over
  *   callback execution time.
  */
class CallbackList () extends js.Object {
  def this(callbacks: js.Array[BaseCallback]) = this()
  def this(callbacks: js.UndefOr[scala.Nothing], queueLength: Double) = this()
  def this(callbacks: js.Array[BaseCallback], queueLength: Double) = this()
  
  def append(callback: BaseCallback): Unit = js.native
  
  var callbacks: js.Array[BaseCallback] = js.native
  
  /**
    * Called  right before processing a batch.
    * @param batch Index of batch within the current epoch.
    * @param logs Dictionary of logs.
    */
  def onBatchBegin(batch: Double): js.Promise[Unit] = js.native
  def onBatchBegin(batch: Double, logs: UnresolvedLogs): js.Promise[Unit] = js.native
  
  /**
    * Called at the end of a batch.
    * @param batch Index of batch within the current epoch.
    * @param logs Dictionary of logs.
    */
  def onBatchEnd(batch: Double): js.Promise[Unit] = js.native
  def onBatchEnd(batch: Double, logs: UnresolvedLogs): js.Promise[Unit] = js.native
  
  /**
    * Called at the start of an epoch.
    * @param epoch Index of epoch.
    * @param logs Dictionary of logs.
    */
  def onEpochBegin(epoch: Double): js.Promise[Unit] = js.native
  def onEpochBegin(epoch: Double, logs: UnresolvedLogs): js.Promise[Unit] = js.native
  
  /**
    * Called at the end of an epoch.
    * @param epoch Index of epoch.
    * @param logs Dictionary of logs.
    */
  def onEpochEnd(epoch: Double): js.Promise[Unit] = js.native
  def onEpochEnd(epoch: Double, logs: UnresolvedLogs): js.Promise[Unit] = js.native
  
  /**
    * Called at the beginning of training.
    * @param logs Dictionary of logs.
    */
  def onTrainBegin(): js.Promise[Unit] = js.native
  def onTrainBegin(logs: UnresolvedLogs): js.Promise[Unit] = js.native
  
  /**
    * Called at the end of training.
    * @param logs Dictionary of logs.
    */
  def onTrainEnd(): js.Promise[Unit] = js.native
  def onTrainEnd(logs: UnresolvedLogs): js.Promise[Unit] = js.native
  
  var queueLength: Double = js.native
  
  def setModel(model: Container): Unit = js.native
  
  def setParams(params: Params): Unit = js.native
}
