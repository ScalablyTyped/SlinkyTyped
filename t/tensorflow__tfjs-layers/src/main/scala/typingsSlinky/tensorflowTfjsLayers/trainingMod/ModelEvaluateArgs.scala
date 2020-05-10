package typingsSlinky.tensorflowTfjsLayers.trainingMod

import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import typingsSlinky.tensorflowTfjsLayers.baseCallbacksMod.ModelLoggingVerbosity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelEvaluateArgs extends js.Object {
  /**
    * Batch size (Integer). If unspecified, it will default to 32.
    */
  var batchSize: js.UndefOr[Double] = js.native
  /**
    * Tensor of weights to weight the contribution of different samples to the
    * loss and metrics.
    */
  var sampleWeight: js.UndefOr[Tensor[Rank]] = js.native
  /**
    * integer: total number of steps (batches of samples)
    * before declaring the evaluation round finished. Ignored with the default
    * value of `undefined`.
    */
  var steps: js.UndefOr[Double] = js.native
  /**
    * Verbosity mode.
    */
  var verbose: js.UndefOr[ModelLoggingVerbosity] = js.native
}

object ModelEvaluateArgs {
  @scala.inline
  def apply(): ModelEvaluateArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelEvaluateArgs]
  }
  @scala.inline
  implicit class ModelEvaluateArgsOps[Self <: ModelEvaluateArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBatchSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatchSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchSize")(js.undefined)
        ret
    }
    @scala.inline
    def withSampleWeight(value: Tensor[Rank]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampleWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSampleWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampleWeight")(js.undefined)
        ret
    }
    @scala.inline
    def withSteps(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("steps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSteps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("steps")(js.undefined)
        ret
    }
    @scala.inline
    def withVerbose(value: ModelLoggingVerbosity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerbose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(js.undefined)
        ret
    }
  }
  
}

