package typingsSlinky.tensorflowTfjsConverter.compiledApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITensor extends js.Object {
  /** Tensor boolVal */
  var boolVal: js.UndefOr[js.Array[Boolean] | Null] = js.native
  /** Tensor doubleVal */
  var doubleVal: js.UndefOr[js.Array[Double] | Null] = js.native
  /** Tensor dtype */
  var dtype: js.UndefOr[DataType | Null] = js.native
  /** Tensor floatVal */
  var floatVal: js.UndefOr[js.Array[Double] | Null] = js.native
  /** Tensor int64Val */
  var int64Val: js.UndefOr[(js.Array[Double | String]) | Null] = js.native
  /** Tensor intVal */
  var intVal: js.UndefOr[js.Array[Double] | Null] = js.native
  /** Tensor scomplexVal */
  var scomplexVal: js.UndefOr[js.Array[Double] | Null] = js.native
  /** Tensor stringVal */
  var stringVal: js.UndefOr[js.Array[js.typedarray.Uint8Array] | Null] = js.native
  /** Tensor tensorContent */
  var tensorContent: js.UndefOr[js.typedarray.Uint8Array | Null] = js.native
  /** Tensor tensorShape */
  var tensorShape: js.UndefOr[ITensorShape | Null] = js.native
  /** Tensor uint32Val */
  var uint32Val: js.UndefOr[js.Array[Double] | Null] = js.native
  /** Tensor uint64Val */
  var uint64Val: js.UndefOr[(js.Array[Double | String]) | Null] = js.native
  /** Tensor versionNumber */
  var versionNumber: js.UndefOr[Double | Null] = js.native
}

object ITensor {
  @scala.inline
  def apply(): ITensor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITensor]
  }
  @scala.inline
  implicit class ITensorOps[Self <: ITensor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoolVal(value: js.Array[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boolVal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoolVal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boolVal")(js.undefined)
        ret
    }
    @scala.inline
    def withBoolValNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boolVal")(null)
        ret
    }
    @scala.inline
    def withDoubleVal(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleVal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoubleVal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleVal")(js.undefined)
        ret
    }
    @scala.inline
    def withDoubleValNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleVal")(null)
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
    def withFloatVal(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatVal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloatVal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatVal")(js.undefined)
        ret
    }
    @scala.inline
    def withFloatValNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatVal")(null)
        ret
    }
    @scala.inline
    def withInt64Val(value: js.Array[Double | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("int64Val")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInt64Val: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("int64Val")(js.undefined)
        ret
    }
    @scala.inline
    def withInt64ValNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("int64Val")(null)
        ret
    }
    @scala.inline
    def withIntVal(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intVal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntVal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intVal")(js.undefined)
        ret
    }
    @scala.inline
    def withIntValNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intVal")(null)
        ret
    }
    @scala.inline
    def withScomplexVal(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scomplexVal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScomplexVal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scomplexVal")(js.undefined)
        ret
    }
    @scala.inline
    def withScomplexValNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scomplexVal")(null)
        ret
    }
    @scala.inline
    def withStringVal(value: js.Array[js.typedarray.Uint8Array]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringVal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStringVal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringVal")(js.undefined)
        ret
    }
    @scala.inline
    def withStringValNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringVal")(null)
        ret
    }
    @scala.inline
    def withTensorContent(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tensorContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTensorContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tensorContent")(js.undefined)
        ret
    }
    @scala.inline
    def withTensorContentNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tensorContent")(null)
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
    @scala.inline
    def withUint32Val(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uint32Val")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUint32Val: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uint32Val")(js.undefined)
        ret
    }
    @scala.inline
    def withUint32ValNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uint32Val")(null)
        ret
    }
    @scala.inline
    def withUint64Val(value: js.Array[Double | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uint64Val")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUint64Val: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uint64Val")(js.undefined)
        ret
    }
    @scala.inline
    def withUint64ValNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uint64Val")(null)
        ret
    }
    @scala.inline
    def withVersionNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersionNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withVersionNumberNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionNumber")(null)
        ret
    }
  }
  
}

