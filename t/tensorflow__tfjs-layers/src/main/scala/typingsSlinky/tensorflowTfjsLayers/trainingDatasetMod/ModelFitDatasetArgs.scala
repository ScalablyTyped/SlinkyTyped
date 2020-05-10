package typingsSlinky.tensorflowTfjsLayers.trainingDatasetMod

import typingsSlinky.tensorflowTfjsLayers.baseCallbacksMod.BaseCallback
import typingsSlinky.tensorflowTfjsLayers.baseCallbacksMod.CustomCallbackArgs
import typingsSlinky.tensorflowTfjsLayers.baseCallbacksMod.ModelLoggingVerbosity
import typingsSlinky.tensorflowTfjsLayers.baseCallbacksMod.YieldEveryOptions
import typingsSlinky.tensorflowTfjsLayers.datasetStubMod.Dataset
import typingsSlinky.tensorflowTfjsLayers.distTypesMod.TensorOrArrayOrMap
import typingsSlinky.tensorflowTfjsLayers.trainingUtilsMod.ClassWeight
import typingsSlinky.tensorflowTfjsLayers.trainingUtilsMod.ClassWeightMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelFitDatasetArgs[T] extends js.Object {
  /**
    * (Optional) Total number of steps (batches of samples) before
    * declaring one epoch finished and starting the next epoch. It should
    * typically be equal to the number of samples of your dataset divided by
    * the batch size, so that `fitDataset`() call can utilize the entire dataset.
    * If it is not provided, use `done` return value in `iterator.next()` as
    * signal to finish an epoch.
    */
  var batchesPerEpoch: js.UndefOr[Double] = js.native
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
    * The number of times to iterate over the training dataset.
    *
    * An integer.
    */
  var epochs: Double = js.native
  /**
    * Epoch at which to start training (useful for resuming a previous training
    * run).
    */
  var initialEpoch: js.UndefOr[Double] = js.native
  /**
    * Optional batch size for validation.
    *
    * Used only if `validationData` is an array of `tf.Tensor` objects, i.e., not
    * a dataset object.
    *
    * If not specified, its value defaults to 32.
    */
  var validationBatchSize: js.UndefOr[Double] = js.native
  /**
    * (Optional) Only relevant if `validationData` is specified and is a dataset
    * object.
    *
    * Total number of batches of samples to draw from `validationData` for
    * validation purpose before stopping at the end of every epoch. If not
    * specified, `evaluateDataset` will use `iterator.next().done` as signal to
    * stop validation.
    */
  var validationBatches: js.UndefOr[Double] = js.native
  /**
    * Data on which to evaluate the loss and any model
    * metrics at the end of each epoch. The model will not be trained on this
    * data. This could be any of the following:
    *
    *   - An array `[xVal, yVal]`, where the two values may be `tf.Tensor`,
    *     an array of Tensors, or a map of string to Tensor.
    *   - Similarly, an array ` [xVal, yVal, valSampleWeights]`
    *     (not implemented yet).
    *   - a `Dataset` object with elements of the form `{xs: xVal, ys: yVal}`,
    *     where `xs` and `ys` are the feature and label tensors, respectively.
    *
    * If `validationData` is an Array of Tensor objects, each `tf.Tensor` will be
    * sliced into batches during validation, using the parameter
    * `validationBatchSize` (which defaults to 32). The entirety of the
    * `tf.Tensor` objects will be used in the validation.
    *
    * If `validationData` is a dataset object, and the `validationBatches`
    * parameter is specified, the validation will use `validationBatches` batches
    * drawn from the dataset object. If `validationBatches` parameter is not
    * specified, the validation will stop when the dataset is exhausted.
    *
    * The model will not be trained on this data.
    */
  var validationData: js.UndefOr[
    (js.Tuple2[TensorOrArrayOrMap, TensorOrArrayOrMap]) | (js.Tuple3[TensorOrArrayOrMap, TensorOrArrayOrMap, TensorOrArrayOrMap]) | Dataset[T]
  ] = js.native
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
    *   - a `number`: Will yield every `number` milliseconds.
    *   - `'never'`: never yield. (But yielding can still happen through `await
    *      nextFrame()` calls in custom callbacks.)
    */
  var yieldEvery: js.UndefOr[YieldEveryOptions] = js.native
}

object ModelFitDatasetArgs {
  @scala.inline
  def apply[T](epochs: Double): ModelFitDatasetArgs[T] = {
    val __obj = js.Dynamic.literal(epochs = epochs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelFitDatasetArgs[T]]
  }
  @scala.inline
  implicit class ModelFitDatasetArgsOps[Self[t] <: ModelFitDatasetArgs[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withEpochs(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("epochs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBatchesPerEpoch(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchesPerEpoch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatchesPerEpoch: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchesPerEpoch")(js.undefined)
        ret
    }
    @scala.inline
    def withCallbacks(value: (js.Array[BaseCallback | CustomCallbackArgs]) | CustomCallbackArgs): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbacks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallbacks: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbacks")(js.undefined)
        ret
    }
    @scala.inline
    def withClassWeight(value: ClassWeight | js.Array[ClassWeight] | ClassWeightMap): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassWeight: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classWeight")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialEpoch(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialEpoch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialEpoch: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialEpoch")(js.undefined)
        ret
    }
    @scala.inline
    def withValidationBatchSize(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationBatchSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidationBatchSize: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationBatchSize")(js.undefined)
        ret
    }
    @scala.inline
    def withValidationBatches(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationBatches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidationBatches: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationBatches")(js.undefined)
        ret
    }
    @scala.inline
    def withValidationData(
      value: (js.Tuple2[TensorOrArrayOrMap, TensorOrArrayOrMap]) | (js.Tuple3[TensorOrArrayOrMap, TensorOrArrayOrMap, TensorOrArrayOrMap]) | Dataset[T]
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidationData: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationData")(js.undefined)
        ret
    }
    @scala.inline
    def withVerbose(value: ModelLoggingVerbosity): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerbose: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(js.undefined)
        ret
    }
    @scala.inline
    def withYieldEvery(value: YieldEveryOptions): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yieldEvery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYieldEvery: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yieldEvery")(js.undefined)
        ret
    }
  }
  
}

