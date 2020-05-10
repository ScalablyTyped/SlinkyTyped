package typingsSlinky.tensorflowTfjsConverter.compiledApiMod

import typingsSlinky.tensorflowTfjsConverter.compiledApiMod.TensorShape.IDim
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITensorShape extends js.Object {
  /** TensorShape dim */
  var dim: js.UndefOr[js.Array[IDim] | Null] = js.native
  /** TensorShape unknownRank */
  var unknownRank: js.UndefOr[Boolean | Null] = js.native
}

object ITensorShape {
  @scala.inline
  def apply(): ITensorShape = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITensorShape]
  }
  @scala.inline
  implicit class ITensorShapeOps[Self <: ITensorShape] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDim(value: js.Array[IDim]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDim: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dim")(js.undefined)
        ret
    }
    @scala.inline
    def withDimNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dim")(null)
        ret
    }
    @scala.inline
    def withUnknownRank(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknownRank")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnknownRank: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknownRank")(js.undefined)
        ret
    }
    @scala.inline
    def withUnknownRankNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknownRank")(null)
        ret
    }
  }
  
}

