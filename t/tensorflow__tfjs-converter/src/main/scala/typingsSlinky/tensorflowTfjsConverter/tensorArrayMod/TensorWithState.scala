package typingsSlinky.tensorflowTfjsConverter.tensorArrayMod

import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TensorWithState extends js.Object {
  var cleared: js.UndefOr[Boolean] = js.native
  var read: js.UndefOr[Boolean] = js.native
  var tensor: js.UndefOr[Tensor[Rank]] = js.native
  var written: js.UndefOr[Boolean] = js.native
}

object TensorWithState {
  @scala.inline
  def apply(): TensorWithState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TensorWithState]
  }
  @scala.inline
  implicit class TensorWithStateOps[Self <: TensorWithState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCleared(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleared")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCleared: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleared")(js.undefined)
        ret
    }
    @scala.inline
    def withRead(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRead: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(js.undefined)
        ret
    }
    @scala.inline
    def withTensor(value: Tensor[Rank]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tensor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTensor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tensor")(js.undefined)
        ret
    }
    @scala.inline
    def withWritten(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("written")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWritten: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("written")(js.undefined)
        ret
    }
  }
  
}

