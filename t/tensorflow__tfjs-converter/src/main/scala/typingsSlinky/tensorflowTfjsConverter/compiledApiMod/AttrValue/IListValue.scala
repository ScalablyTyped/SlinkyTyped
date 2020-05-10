package typingsSlinky.tensorflowTfjsConverter.compiledApiMod.AttrValue

import typingsSlinky.tensorflowTfjsConverter.compiledApiMod.DataType
import typingsSlinky.tensorflowTfjsConverter.compiledApiMod.INameAttrList
import typingsSlinky.tensorflowTfjsConverter.compiledApiMod.ITensor
import typingsSlinky.tensorflowTfjsConverter.compiledApiMod.ITensorShape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a ListValue. */
@js.native
trait IListValue extends js.Object {
  /** ListValue b */
  var b: js.UndefOr[js.Array[Boolean] | Null] = js.native
  /** ListValue f */
  var f: js.UndefOr[js.Array[Double] | Null] = js.native
  /** ListValue func */
  var func: js.UndefOr[js.Array[INameAttrList] | Null] = js.native
  /** ListValue i */
  var i: js.UndefOr[(js.Array[Double | String]) | Null] = js.native
  /** ListValue s */
  var s: js.UndefOr[js.Array[String] | Null] = js.native
  /** ListValue shape */
  var shape: js.UndefOr[js.Array[ITensorShape] | Null] = js.native
  /** ListValue tensor */
  var tensor: js.UndefOr[js.Array[ITensor] | Null] = js.native
  /** ListValue type */
  var `type`: js.UndefOr[js.Array[DataType] | Null] = js.native
}

object IListValue {
  @scala.inline
  def apply(): IListValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListValue]
  }
  @scala.inline
  implicit class IListValueOps[Self <: IListValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withB(value: js.Array[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("b")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutB: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("b")(js.undefined)
        ret
    }
    @scala.inline
    def withBNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("b")(null)
        ret
    }
    @scala.inline
    def withF(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("f")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutF: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("f")(js.undefined)
        ret
    }
    @scala.inline
    def withFNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("f")(null)
        ret
    }
    @scala.inline
    def withFunc(value: js.Array[INameAttrList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("func")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFunc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("func")(js.undefined)
        ret
    }
    @scala.inline
    def withFuncNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("func")(null)
        ret
    }
    @scala.inline
    def withI(value: js.Array[Double | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("i")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutI: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("i")(js.undefined)
        ret
    }
    @scala.inline
    def withINull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("i")(null)
        ret
    }
    @scala.inline
    def withS(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s")(js.undefined)
        ret
    }
    @scala.inline
    def withSNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s")(null)
        ret
    }
    @scala.inline
    def withShape(value: js.Array[ITensorShape]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shape")(js.undefined)
        ret
    }
    @scala.inline
    def withShapeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shape")(null)
        ret
    }
    @scala.inline
    def withTensor(value: js.Array[ITensor]): Self = {
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
    def withTensorNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tensor")(null)
        ret
    }
    @scala.inline
    def withType(value: js.Array[DataType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(null)
        ret
    }
  }
  
}

