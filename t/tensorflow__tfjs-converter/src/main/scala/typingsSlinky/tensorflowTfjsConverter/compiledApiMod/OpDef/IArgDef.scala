package typingsSlinky.tensorflowTfjsConverter.compiledApiMod.OpDef

import typingsSlinky.tensorflowTfjsConverter.compiledApiMod.DataType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an ArgDef. */
@js.native
trait IArgDef extends js.Object {
  /** ArgDef description */
  var description: js.UndefOr[String | Null] = js.native
  /** ArgDef isRef */
  var isRef: js.UndefOr[Boolean | Null] = js.native
  /** ArgDef name */
  var name: js.UndefOr[String | Null] = js.native
  /** ArgDef numberAttr */
  var numberAttr: js.UndefOr[String | Null] = js.native
  /** ArgDef type */
  var `type`: js.UndefOr[DataType | Null] = js.native
  /** ArgDef typeAttr */
  var typeAttr: js.UndefOr[String | Null] = js.native
  /** ArgDef typeListAttr */
  var typeListAttr: js.UndefOr[String | Null] = js.native
}

object IArgDef {
  @scala.inline
  def apply(): IArgDef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IArgDef]
  }
  @scala.inline
  implicit class IArgDefOps[Self <: IArgDef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withDescriptionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(null)
        ret
    }
    @scala.inline
    def withIsRef(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRef")(js.undefined)
        ret
    }
    @scala.inline
    def withIsRefNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRef")(null)
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
    def withNumberAttr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberAttr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberAttr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberAttr")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberAttrNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberAttr")(null)
        ret
    }
    @scala.inline
    def withType(value: DataType): Self = {
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
    @scala.inline
    def withTypeAttr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeAttr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeAttr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeAttr")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeAttrNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeAttr")(null)
        ret
    }
    @scala.inline
    def withTypeListAttr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeListAttr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeListAttr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeListAttr")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeListAttrNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeListAttr")(null)
        ret
    }
  }
  
}

