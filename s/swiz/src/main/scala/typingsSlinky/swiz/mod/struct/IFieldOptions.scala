package typingsSlinky.swiz.mod.struct

import typingsSlinky.swiz.mod.IChain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFieldOptions extends js.Object {
  var attribute: js.UndefOr[Boolean] = js.native
  var coerceTo: js.UndefOr[String] = js.native
  var desc: js.UndefOr[String] = js.native
  var enumerated: js.UndefOr[js.Any] = js.native
  var filterFrom: js.UndefOr[js.Array[String]] = js.native
  var ignorePublic: js.UndefOr[Boolean] = js.native
  var plural: js.UndefOr[String] = js.native
  var singular: js.UndefOr[String] = js.native
  var src: js.UndefOr[String] = js.native
  var `val`: js.UndefOr[IChain] = js.native
}

object IFieldOptions {
  @scala.inline
  def apply(): IFieldOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFieldOptions]
  }
  @scala.inline
  implicit class IFieldOptionsOps[Self <: IFieldOptions] (val x: Self) extends AnyVal {
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
    def withoutAttribute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attribute")(js.undefined)
        ret
    }
    @scala.inline
    def withCoerceTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coerceTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoerceTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coerceTo")(js.undefined)
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
    def withEnumerated(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enumerated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnumerated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enumerated")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterFrom(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterFrom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterFrom")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnorePublic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignorePublic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnorePublic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignorePublic")(js.undefined)
        ret
    }
    @scala.inline
    def withPlural(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plural")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlural: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plural")(js.undefined)
        ret
    }
    @scala.inline
    def withSingular(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singular")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSingular: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singular")(js.undefined)
        ret
    }
    @scala.inline
    def withSrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(js.undefined)
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

