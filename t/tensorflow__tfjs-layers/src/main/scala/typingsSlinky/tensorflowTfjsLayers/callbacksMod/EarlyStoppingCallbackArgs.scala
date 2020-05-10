package typingsSlinky.tensorflowTfjsLayers.callbacksMod

import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.auto
import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.max
import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.min
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EarlyStoppingCallbackArgs extends js.Object {
  /**
    * Baseline value of the monitored quantity.
    *
    * If specified, training will be stopped if the model doesn't show
    * improvement over the baseline.
    */
  var baseline: js.UndefOr[Double] = js.native
  /**
    * Minimum change in the monitored quantity to qualify as improvement,
    * i.e., an absolute change of less than `minDelta` will count as no
    * improvement.
    *
    * Defaults to 0.
    */
  var minDelta: js.UndefOr[Double] = js.native
  /**
    * Mode: one of 'min', 'max', and 'auto'.
    * - In 'min' mode, training will be stopped when the quantity monitored has
    *   stopped decreasing.
    * - In 'max' mode, training will be stopped when the quantity monitored has
    *   stopped increasing.
    * - In 'auto' mode, the direction is inferred automatically from the name of
    *   the monitored quantity.
    *
    * Defaults to 'auto'.
    */
  var mode: js.UndefOr[auto | min | max] = js.native
  /**
    * Quantity to be monitored.
    *
    * Defaults to 'val_loss'.
    */
  var monitor: js.UndefOr[String] = js.native
  /**
    * Number of epochs with no improvement after which training will be stopped.
    *
    * Defaults to 0.
    */
  var patience: js.UndefOr[Double] = js.native
  /**
    * Whether to restore model weights from the epoch with the best value
    * of the monitored quantity. If `False`, the model weights obtained at the
    * at the last step of training are used.
    *
    * **`True` is not supported yet.**
    */
  var restoreBestWeights: js.UndefOr[Boolean] = js.native
  /** Verbosity mode. */
  var verbose: js.UndefOr[Double] = js.native
}

object EarlyStoppingCallbackArgs {
  @scala.inline
  def apply(): EarlyStoppingCallbackArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EarlyStoppingCallbackArgs]
  }
  @scala.inline
  implicit class EarlyStoppingCallbackArgsOps[Self <: EarlyStoppingCallbackArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseline(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseline")(js.undefined)
        ret
    }
    @scala.inline
    def withMinDelta(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDelta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinDelta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDelta")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: auto | min | max): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withMonitor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monitor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonitor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monitor")(js.undefined)
        ret
    }
    @scala.inline
    def withPatience(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patience")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPatience: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patience")(js.undefined)
        ret
    }
    @scala.inline
    def withRestoreBestWeights(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restoreBestWeights")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestoreBestWeights: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restoreBestWeights")(js.undefined)
        ret
    }
    @scala.inline
    def withVerbose(value: Double): Self = {
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

