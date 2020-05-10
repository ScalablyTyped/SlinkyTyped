package typingsSlinky.tensorflowTfjsNode.callbacksMod

import typingsSlinky.tensorflowTfjsNode.tensorflowTfjsNodeStrings.batch
import typingsSlinky.tensorflowTfjsNode.tensorflowTfjsNodeStrings.epoch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TensorBoardCallbackArgs extends js.Object {
  /**
    * The frequency at which loss and metric values are written to logs.
    *
    * Currently supported options are:
    *
    * - 'batch': Write logs at the end of every batch of training, in addition
    *   to the end of every epoch of training.
    * - 'epoch': Write logs at the end of every epoch of training.
    *
    * Note that writing logs too often slows down the training.
    *
    * Default: 'epoch'.
    */
  var updateFreq: js.UndefOr[batch | epoch] = js.native
}

object TensorBoardCallbackArgs {
  @scala.inline
  def apply(): TensorBoardCallbackArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TensorBoardCallbackArgs]
  }
  @scala.inline
  implicit class TensorBoardCallbackArgsOps[Self <: TensorBoardCallbackArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUpdateFreq(value: batch | epoch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateFreq")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateFreq: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateFreq")(js.undefined)
        ret
    }
  }
  
}

