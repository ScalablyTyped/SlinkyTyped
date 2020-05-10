package typingsSlinky.tensorflowTfjsLayers.trainingMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.mod.Optimizer
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import typingsSlinky.tensorflowTfjsLayers.distTypesMod.LossOrMetricFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelCompileArgs extends js.Object {
  /**
    * Object function(s) or name(s) of object function(s).
    * If the model has multiple outputs, you can use a different loss
    * on each output by passing a dictionary or an Array of losses.
    * The loss value that will be minimized by the model will then be the sum
    * of all individual losses.
    */
  var loss: String | (js.Array[LossOrMetricFn | String]) | (StringDictionary[LossOrMetricFn | String]) | LossOrMetricFn = js.native
  /**
    * List of metrics to be evaluated by the model during training and testing.
    * Typically you will use `metrics=['accuracy']`.
    * To specify different metrics for different outputs of a multi-output
    * model, you could also pass a dictionary.
    */
  var metrics: js.UndefOr[
    String | LossOrMetricFn | (js.Array[String | LossOrMetricFn]) | (StringDictionary[String | LossOrMetricFn])
  ] = js.native
  /**
    * An instance of `tf.train.Optimizer` or a string name for an Optimizer.
    */
  var optimizer: String | Optimizer = js.native
}

object ModelCompileArgs {
  @scala.inline
  def apply(
    loss: String | (js.Array[LossOrMetricFn | String]) | (StringDictionary[LossOrMetricFn | String]) | LossOrMetricFn,
    optimizer: String | Optimizer
  ): ModelCompileArgs = {
    val __obj = js.Dynamic.literal(loss = loss.asInstanceOf[js.Any], optimizer = optimizer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelCompileArgs]
  }
  @scala.inline
  implicit class ModelCompileArgsOps[Self <: ModelCompileArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLossFunction2(value: (/* yTrue */ Tensor[Rank], /* yPred */ Tensor[Rank]) => Tensor[Rank]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loss")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withLoss(
      value: String | (js.Array[LossOrMetricFn | String]) | (StringDictionary[LossOrMetricFn | String]) | LossOrMetricFn
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptimizer(value: String | Optimizer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimizer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetricsFunction2(value: (/* yTrue */ Tensor[Rank], /* yPred */ Tensor[Rank]) => Tensor[Rank]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metrics")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMetrics(
      value: String | LossOrMetricFn | (js.Array[String | LossOrMetricFn]) | (StringDictionary[String | LossOrMetricFn])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetrics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metrics")(js.undefined)
        ret
    }
  }
  
}

