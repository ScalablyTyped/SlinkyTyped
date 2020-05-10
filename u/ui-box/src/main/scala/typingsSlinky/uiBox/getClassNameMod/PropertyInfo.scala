package typingsSlinky.uiBox.getClassNameMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropertyInfo extends js.Object {
  var className: js.UndefOr[String] = js.native
  var complexValue: js.UndefOr[Boolean] = js.native
  var cssName: js.UndefOr[String] = js.native
  var defaultUnit: js.UndefOr[String] = js.native
  var isPrefixed: js.UndefOr[Boolean] = js.native
  var jsName: js.UndefOr[String] = js.native
  var safeValue: js.UndefOr[Boolean] = js.native
}

object PropertyInfo {
  @scala.inline
  def apply(): PropertyInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropertyInfo]
  }
  @scala.inline
  implicit class PropertyInfoOps[Self <: PropertyInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withComplexValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complexValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComplexValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complexValue")(js.undefined)
        ret
    }
    @scala.inline
    def withCssName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssName")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultUnit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultUnit")(js.undefined)
        ret
    }
    @scala.inline
    def withIsPrefixed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPrefixed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsPrefixed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPrefixed")(js.undefined)
        ret
    }
    @scala.inline
    def withJsName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJsName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsName")(js.undefined)
        ret
    }
    @scala.inline
    def withSafeValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safeValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSafeValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safeValue")(js.undefined)
        ret
    }
  }
  
}

