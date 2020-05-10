package typingsSlinky.tensorflowTfjsConverter.compiledApiMod

import typingsSlinky.tensorflowTfjsConverter.compiledApiMod.TensorInfo.ICooSparse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITensorInfo extends js.Object {
  /** TensorInfo cooSparse */
  var cooSparse: js.UndefOr[ICooSparse | Null] = js.native
  /** TensorInfo dtype */
  var dtype: js.UndefOr[DataType | Null] = js.native
  /** TensorInfo name */
  var name: js.UndefOr[String | Null] = js.native
  /** TensorInfo tensorShape */
  var tensorShape: js.UndefOr[ITensorShape | Null] = js.native
}

object ITensorInfo {
  @scala.inline
  def apply(): ITensorInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITensorInfo]
  }
  @scala.inline
  implicit class ITensorInfoOps[Self <: ITensorInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCooSparse(value: ICooSparse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cooSparse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCooSparse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cooSparse")(js.undefined)
        ret
    }
    @scala.inline
    def withCooSparseNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cooSparse")(null)
        ret
    }
    @scala.inline
    def withDtype(value: DataType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dtype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDtype: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dtype")(js.undefined)
        ret
    }
    @scala.inline
    def withDtypeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dtype")(null)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(null)
        ret
    }
    @scala.inline
    def withTensorShape(value: ITensorShape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tensorShape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTensorShape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tensorShape")(js.undefined)
        ret
    }
    @scala.inline
    def withTensorShapeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tensorShape")(null)
        ret
    }
  }
  
}

