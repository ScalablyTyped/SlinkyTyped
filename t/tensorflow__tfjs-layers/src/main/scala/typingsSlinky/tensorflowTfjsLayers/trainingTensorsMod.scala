package typingsSlinky.tensorflowTfjsLayers

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor1D
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsLayers.baseCallbacksMod.BaseCallback
import typingsSlinky.tensorflowTfjsLayers.baseCallbacksMod.CustomCallbackArgs
import typingsSlinky.tensorflowTfjsLayers.baseCallbacksMod.History
import typingsSlinky.tensorflowTfjsLayers.baseCallbacksMod.ModelLoggingVerbosity
import typingsSlinky.tensorflowTfjsLayers.baseCallbacksMod.YieldEveryOptions
import typingsSlinky.tensorflowTfjsLayers.trainingUtilsMod.ClassWeight
import typingsSlinky.tensorflowTfjsLayers.trainingUtilsMod.ClassWeightMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object trainingTensorsMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/engine/training_tensors", "checkBatchSize")
  @js.native
  def checkBatchSize(batchSize: Double): Unit = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/engine/training_tensors", "disposeNewTensors")
  @js.native
  def disposeNewTensors(tensors: js.Array[Tensor[Rank]], refTensors: js.Array[Tensor[Rank]]): Unit = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/engine/training_tensors", "disposeNewTensors")
  @js.native
  def disposeNewTensors(tensors: js.Array[Tensor[Rank]], refTensors: StringDictionary[Tensor[Rank]]): Unit = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/engine/training_tensors", "disposeNewTensors")
  @js.native
  def disposeNewTensors(tensors: js.Array[Tensor[Rank]], refTensors: Tensor[Rank]): Unit = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/engine/training_tensors", "disposeNewTensors")
  @js.native
  def disposeNewTensors(tensors: StringDictionary[Tensor[Rank]], refTensors: js.Array[Tensor[Rank]]): Unit = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/engine/training_tensors", "disposeNewTensors")
  @js.native
  def disposeNewTensors(tensors: StringDictionary[Tensor[Rank]], refTensors: StringDictionary[Tensor[Rank]]): Unit = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/engine/training_tensors", "disposeNewTensors")
  @js.native
  def disposeNewTensors(tensors: StringDictionary[Tensor[Rank]], refTensors: Tensor[Rank]): Unit = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/engine/training_tensors", "disposeNewTensors")
  @js.native
  def disposeNewTensors(tensors: Tensor[Rank], refTensors: js.Array[Tensor[Rank]]): Unit = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/engine/training_tensors", "disposeNewTensors")
  @js.native
  def disposeNewTensors(tensors: Tensor[Rank], refTensors: StringDictionary[Tensor[Rank]]): Unit = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/engine/training_tensors", "disposeNewTensors")
  @js.native
  def disposeNewTensors(tensors: Tensor[Rank], refTensors: Tensor[Rank]): Unit = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/engine/training_tensors", "ensureTensorsRank2OrHigher")
  @js.native
  def ensureTensorsRank2OrHigher(tensors: js.Array[Tensor[Rank]]): js.Array[Tensor[Rank]] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/engine/training_tensors", "ensureTensorsRank2OrHigher")
  @js.native
  def ensureTensorsRank2OrHigher(tensors: Tensor[Rank]): js.Array[Tensor[Rank]] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/engine/training_tensors", "fitTensors")
  @js.native
  def fitTensors(model: js.Any, x: js.Array[Tensor[Rank]], y: js.Array[Tensor[Rank]]): js.Promise[History] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/engine/training_tensors", "fitTensors")
  @js.native
  def fitTensors(model: js.Any, x: js.Array[Tensor[Rank]], y: js.Array[Tensor[Rank]], args: ModelFitArgs): js.Promise[History] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/engine/training_tensors", "fitTensors")
  @js.native
  def fitTensors(model: js.Any, x: js.Array[Tensor[Rank]], y: StringDictionary[Tensor[Rank]]): js.Promise[History] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/engine/training_tensors", "fitTensors")
  @js.native
  def fitTensors(model: js.Any, x: js.Array[Tensor[Rank]], y: StringDictionary[Tensor[Rank]], args: ModelFitArgs): js.Promise[History] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/engine/training_tensors", "fitTensors")
  @js.native
  def fitTensors(model: js.Any, x: js.Array[Tensor[Rank]], y: Tensor[Rank]): js.Promise[History] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/engine/training_tensors", "fitTensors")
  @js.native
  def fitTensors(model: js.Any, x: js.Array[Tensor[Rank]], y: Tensor[Rank], args: ModelFitArgs): js.Promise[History] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/engine/training_tensors", "fitTensors")
  @js.native
  def fitTensors(model: js.Any, x: StringDictionary[Tensor[Rank]], y: js.Array[Tensor[Rank]]): js.Promise[History] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/engine/training_tensors", "fitTensors")
  @js.native
  def fitTensors(model: js.Any, x: StringDictionary[Tensor[Rank]], y: js.Array[Tensor[Rank]], args: ModelFitArgs): js.Promise[History] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/engine/training_tensors", "fitTensors")
  @js.native
  def fitTensors(model: js.Any, x: StringDictionary[Tensor[Rank]], y: StringDictionary[Tensor[Rank]]): js.Promise[History] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/engine/training_tensors", "fitTensors")
  @js.native
  def fitTensors(
    model: js.Any,
    x: StringDictionary[Tensor[Rank]],
    y: StringDictionary[Tensor[Rank]],
    args: ModelFitArgs
  ): js.Promise[History] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/engine/training_tensors", "fitTensors")
  @js.native
  def fitTensors(model: js.Any, x: StringDictionary[Tensor[Rank]], y: Tensor[Rank]): js.Promise[History] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/engine/training_tensors", "fitTensors")
  @js.native
  def fitTensors(model: js.Any, x: StringDictionary[Tensor[Rank]], y: Tensor[Rank], args: ModelFitArgs): js.Promise[History] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/engine/training_tensors", "fitTensors")
  @js.native
  def fitTensors(model: js.Any, x: Tensor[Rank], y: js.Array[Tensor[Rank]]): js.Promise[History] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/engine/training_tensors", "fitTensors")
  @js.native
  def fitTensors(model: js.Any, x: Tensor[Rank], y: js.Array[Tensor[Rank]], args: ModelFitArgs): js.Promise[History] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/engine/training_tensors", "fitTensors")
  @js.native
  def fitTensors(model: js.Any, x: Tensor[Rank], y: StringDictionary[Tensor[Rank]]): js.Promise[History] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/engine/training_tensors", "fitTensors")
  @js.native
  def fitTensors(model: js.Any, x: Tensor[Rank], y: StringDictionary[Tensor[Rank]], args: ModelFitArgs): js.Promise[History] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/engine/training_tensors", "fitTensors")
  @js.native
  def fitTensors(model: js.Any, x: Tensor[Rank], y: Tensor[Rank]): js.Promise[History] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/engine/training_tensors", "fitTensors")
  @js.native
  def fitTensors(model: js.Any, x: Tensor[Rank], y: Tensor[Rank], args: ModelFitArgs): js.Promise[History] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/engine/training_tensors", "makeBatches")
  @js.native
  def makeBatches(size: Double, batchSize: Double): js.Array[js.Tuple2[Double, Double]] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/engine/training_tensors", "sliceArrays")
  @js.native
  def sliceArrays(arrays: js.Array[Tensor[Rank]], start: Double, stop: Double): Tensor[Rank] | js.Array[Tensor[Rank]] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/engine/training_tensors", "sliceArrays")
  @js.native
  def sliceArrays(arrays: Tensor[Rank], start: Double, stop: Double): Tensor[Rank] | js.Array[Tensor[Rank]] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/engine/training_tensors", "sliceArraysByIndices")
  @js.native
  def sliceArraysByIndices(arrays: js.Array[Tensor[Rank]], indices: Tensor1D): Tensor[Rank] | js.Array[Tensor[Rank]] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/engine/training_tensors", "sliceArraysByIndices")
  @js.native
  def sliceArraysByIndices(arrays: Tensor[Rank], indices: Tensor1D): Tensor[Rank] | js.Array[Tensor[Rank]] = js.native
  
  @js.native
  trait ModelFitArgs extends StObject {
    
    /**
      * Number of samples per gradient update. If unspecified, it
      * will default to 32.
      */
    var batchSize: js.UndefOr[Double] = js.native
    
    /**
      * List of callbacks to be called during training.
      * Can have one or more of the following callbacks:
      *   - `onTrainBegin(logs)`: called when training starts.
      *   - `onTrainEnd(logs)`: called when training ends.
      *   - `onEpochBegin(epoch, logs)`: called at the start of every epoch.
      *   - `onEpochEnd(epoch, logs)`: called at the end of every epoch.
      *   - `onBatchBegin(batch, logs)`: called at the start of every batch.
      *   - `onBatchEnd(batch, logs)`: called at the end of every batch.
      *   - `onYield(epoch, batch, logs)`: called every `yieldEvery` milliseconds
      *      with the current epoch, batch and logs. The logs are the same
      *      as in `onBatchEnd()`. Note that `onYield` can skip batches or
      *      epochs. See also docs for `yieldEvery` below.
      */
    var callbacks: js.UndefOr[(js.Array[BaseCallback | CustomCallbackArgs]) | CustomCallbackArgs] = js.native
    
    /**
      * Optional object mapping class indices (integers) to
      * a weight (float) to apply to the model's loss for the samples from this
      * class during training. This can be useful to tell the model to "pay more
      * attention" to samples from an under-represented class.
      *
      * If the model has multiple outputs, a class weight can be specified for
      * each of the outputs by setting this field an array of weight object
      * or a object that maps model output names (e.g., `model.outputNames[0]`)
      * to weight objects.
      */
    var classWeight: js.UndefOr[ClassWeight | js.Array[ClassWeight] | ClassWeightMap] = js.native
    
    /**
      * Integer number of times to iterate over the training data arrays.
      */
    var epochs: js.UndefOr[Double] = js.native
    
    /**
      * Epoch at which to start training (useful for resuming a previous training
      * run). When this is used, `epochs` is the index of the "final epoch".
      * The model is not trained for a number of iterations given by `epochs`,
      * but merely until the epoch of index `epochs` is reached.
      */
    var initialEpoch: js.UndefOr[Double] = js.native
    
    /**
      * Optional array of the same length as x, containing
      * weights to apply to the model's loss for each sample. In the case of
      * temporal data, you can pass a 2D array with shape (samples,
      * sequenceLength), to apply a different weight to every timestep of every
      * sample. In this case you should make sure to specify
      * sampleWeightMode="temporal" in compile().
      */
    var sampleWeight: js.UndefOr[Tensor[Rank]] = js.native
    
    /**
      * Whether to shuffle the training data before each epoch. Has
      * no effect when `stepsPerEpoch` is not `null`.
      */
    var shuffle: js.UndefOr[Boolean] = js.native
    
    /**
      * Total number of steps (batches of samples) before
      * declaring one epoch finished and starting the next epoch. When training
      * with Input Tensors such as TensorFlow data tensors, the default `null` is
      * equal to the number of unique samples in your dataset divided by the
      * batch size, or 1 if that cannot be determined.
      */
    var stepsPerEpoch: js.UndefOr[Double] = js.native
    
    /**
      * Data on which to evaluate the loss and any model
      * metrics at the end of each epoch. The model will not be trained on this
      * data. This could be a tuple [xVal, yVal] or a tuple [xVal, yVal,
      * valSampleWeights]. The model will not be trained on this data.
      * `validationData` will override `validationSplit`.
      */
    var validationData: js.UndefOr[
        (js.Tuple2[Tensor[Rank] | js.Array[Tensor[Rank]], Tensor[Rank] | js.Array[Tensor[Rank]]]) | (js.Tuple3[
          Tensor[Rank] | js.Array[Tensor[Rank]], 
          Tensor[Rank] | js.Array[Tensor[Rank]], 
          Tensor[Rank] | js.Array[Tensor[Rank]]
        ])
      ] = js.native
    
    /**
      * Float between 0 and 1: fraction of the training data
      * to be used as validation data. The model will set apart this fraction of
      * the training data, will not train on it, and will evaluate the loss and
      * any model metrics on this data at the end of each epoch.
      * The validation data is selected from the last samples in the `x` and `y`
      * data provided, before shuffling.
      */
    var validationSplit: js.UndefOr[Double] = js.native
    
    /**
      * Only relevant if `stepsPerEpoch` is specified. Total number of steps
      * (batches of samples) to validate before stopping.
      */
    var validationSteps: js.UndefOr[Double] = js.native
    
    /**
      * Verbosity level.
      *
      * Expected to be 0, 1, or 2. Default: 1.
      *
      * 0 - No printed message during fit() call.
      * 1 - In Node.js (tfjs-node), prints the progress bar, together with
      *     real-time updates of loss and metric values and training speed.
      *     In the browser: no action. This is the default.
      * 2 - Not implemented yet.
      */
    var verbose: js.UndefOr[ModelLoggingVerbosity] = js.native
    
    /**
      * Configures the frequency of yielding the main thread to other tasks.
      *
      * In the browser environment, yielding the main thread can improve the
      * responsiveness of the page during training. In the Node.js environment,
      * it can ensure tasks queued in the event loop can be handled in a timely
      * manner.
      *
      * The value can be one of the following:
      *   - `'auto'`: The yielding happens at a certain frame rate (currently set
      *               at 125ms). This is the default.
      *   - `'batch'`: yield every batch.
      *   - `'epoch'`: yield every epoch.
      *   - any `number`: yield every `number` milliseconds.
      *   - `'never'`: never yield. (yielding can still happen through `await
      *      nextFrame()` calls in custom callbacks.)
      */
    var yieldEvery: js.UndefOr[YieldEveryOptions] = js.native
  }
  object ModelFitArgs {
    
    @scala.inline
    def apply(): ModelFitArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModelFitArgs]
    }
    
    @scala.inline
    implicit class ModelFitArgsMutableBuilder[Self <: ModelFitArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
      
      @scala.inline
      def setCallbacks(value: (js.Array[BaseCallback | CustomCallbackArgs]) | CustomCallbackArgs): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbacksUndefined: Self = StObject.set(x, "callbacks", js.undefined)
      
      @scala.inline
      def setCallbacksVarargs(value: (BaseCallback | CustomCallbackArgs)*): Self = StObject.set(x, "callbacks", js.Array(value :_*))
      
      @scala.inline
      def setClassWeight(value: ClassWeight | js.Array[ClassWeight] | ClassWeightMap): Self = StObject.set(x, "classWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassWeightUndefined: Self = StObject.set(x, "classWeight", js.undefined)
      
      @scala.inline
      def setClassWeightVarargs(value: ClassWeight*): Self = StObject.set(x, "classWeight", js.Array(value :_*))
      
      @scala.inline
      def setEpochs(value: Double): Self = StObject.set(x, "epochs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEpochsUndefined: Self = StObject.set(x, "epochs", js.undefined)
      
      @scala.inline
      def setInitialEpoch(value: Double): Self = StObject.set(x, "initialEpoch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialEpochUndefined: Self = StObject.set(x, "initialEpoch", js.undefined)
      
      @scala.inline
      def setSampleWeight(value: Tensor[Rank]): Self = StObject.set(x, "sampleWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSampleWeightUndefined: Self = StObject.set(x, "sampleWeight", js.undefined)
      
      @scala.inline
      def setShuffle(value: Boolean): Self = StObject.set(x, "shuffle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShuffleUndefined: Self = StObject.set(x, "shuffle", js.undefined)
      
      @scala.inline
      def setStepsPerEpoch(value: Double): Self = StObject.set(x, "stepsPerEpoch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepsPerEpochUndefined: Self = StObject.set(x, "stepsPerEpoch", js.undefined)
      
      @scala.inline
      def setValidationData(
        value: (js.Tuple2[Tensor[Rank] | js.Array[Tensor[Rank]], Tensor[Rank] | js.Array[Tensor[Rank]]]) | (js.Tuple3[
              Tensor[Rank] | js.Array[Tensor[Rank]], 
              Tensor[Rank] | js.Array[Tensor[Rank]], 
              Tensor[Rank] | js.Array[Tensor[Rank]]
            ])
      ): Self = StObject.set(x, "validationData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidationDataUndefined: Self = StObject.set(x, "validationData", js.undefined)
      
      @scala.inline
      def setValidationSplit(value: Double): Self = StObject.set(x, "validationSplit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidationSplitUndefined: Self = StObject.set(x, "validationSplit", js.undefined)
      
      @scala.inline
      def setValidationSteps(value: Double): Self = StObject.set(x, "validationSteps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidationStepsUndefined: Self = StObject.set(x, "validationSteps", js.undefined)
      
      @scala.inline
      def setVerbose(value: ModelLoggingVerbosity): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
      
      @scala.inline
      def setYieldEvery(value: YieldEveryOptions): Self = StObject.set(x, "yieldEvery", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYieldEveryUndefined: Self = StObject.set(x, "yieldEvery", js.undefined)
    }
  }
}
