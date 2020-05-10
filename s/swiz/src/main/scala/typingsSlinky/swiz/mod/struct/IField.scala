package typingsSlinky.swiz.mod.struct

import typingsSlinky.swiz.mod.IChain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IField extends js.Object {
  var attribute: Boolean = js.native
  var coerceTo: js.Any = js.native
  var desc: js.UndefOr[String] = js.native
  var enumerated: Boolean = js.native
  var filterFrom: js.Array[String] = js.native
  var ignorePublic: Boolean = js.native
  var name: String = js.native
  var options: IFieldOptions = js.native
  var plural: String = js.native
  var singular: String = js.native
  var src: String = js.native
  var `val`: js.UndefOr[IChain] = js.native
}

object IField {
  @scala.inline
  def apply(
    attribute: Boolean,
    coerceTo: js.Any,
    enumerated: Boolean,
    filterFrom: js.Array[String],
    ignorePublic: Boolean,
    name: String,
    options: IFieldOptions,
    plural: String,
    singular: String,
    src: String
  ): IField = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], coerceTo = coerceTo.asInstanceOf[js.Any], enumerated = enumerated.asInstanceOf[js.Any], filterFrom = filterFrom.asInstanceOf[js.Any], ignorePublic = ignorePublic.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], plural = plural.asInstanceOf[js.Any], singular = singular.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[IField]
  }
  @scala.inline
  implicit class IFieldOps[Self <: IField] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttribute(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCoerceTo(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coerceTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnumerated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enumerated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilterFrom(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterFrom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIgnorePublic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignorePublic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: IFieldOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlural(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plural")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSingular(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singular")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDesc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desc")(js.undefined)
        ret
    }
    @scala.inline
    def withVal(value: IChain): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("val")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("val")(js.undefined)
        ret
    }
  }
  
}

