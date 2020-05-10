package typingsSlinky.tensorflowTfjsLayers.trainingDatasetMod

import typingsSlinky.tensorflowTfjsLayers.baseCallbacksMod.ModelLoggingVerbosity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelEvaluateDatasetArgs extends js.Object {
  /**
    * Number of batches to draw from the dataset object before ending the
    * evaluation.
    */
  var batches: js.UndefOr[Double] = js.native
  /**
    * Verbosity mode.
    */
  var verbose: js.UndefOr[ModelLoggingVerbosity] = js.native
}

object ModelEvaluateDatasetArgs {
  @scala.inline
  def apply(): ModelEvaluateDatasetArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelEvaluateDatasetArgs]
  }
  @scala.inline
  implicit class ModelEvaluateDatasetArgsOps[Self <: ModelEvaluateDatasetArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBatches(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatches: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batches")(js.undefined)
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

