package typingsSlinky.tensorflowTfjsCore.modelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelPredictConfig extends js.Object {
  /**
    * Optional. Batch size (Integer). If unspecified, it will default to 32.
    */
  var batchSize: js.UndefOr[Double] = js.native
  /**
    * Optional. Verbosity mode. Defaults to false.
    */
  var verbose: js.UndefOr[Boolean] = js.native
}

object ModelPredictConfig {
  @scala.inline
  def apply(): ModelPredictConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelPredictConfig]
  }
  @scala.inline
  implicit class ModelPredictConfigOps[Self <: ModelPredictConfig] (val x: Self) extends AnyVal {
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
    def withVerbose(value: Boolean): Self = {
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

