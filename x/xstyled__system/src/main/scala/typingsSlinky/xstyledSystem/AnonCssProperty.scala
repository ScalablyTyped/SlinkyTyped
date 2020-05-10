package typingsSlinky.xstyledSystem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCssProperty extends js.Object {
  var cssProperty: String | js.Array[String] = js.native
  var key: js.UndefOr[js.Any] = js.native
  var prop: String | js.Array[String] = js.native
  var themeGet: js.UndefOr[js.Any] = js.native
  var transform: js.UndefOr[js.Any] = js.native
}

object AnonCssProperty {
  @scala.inline
  def apply(cssProperty: String | js.Array[String], prop: String | js.Array[String]): AnonCssProperty = {
    val __obj = js.Dynamic.literal(cssProperty = cssProperty.asInstanceOf[js.Any], prop = prop.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCssProperty]
  }
  @scala.inline
  implicit class AnonCssPropertyOps[Self <: AnonCssProperty] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCssProperty(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProp(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withThemeGet(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("themeGet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThemeGet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("themeGet")(js.undefined)
        ret
    }
    @scala.inline
    def withTransform(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.undefined)
        ret
    }
  }
  
}

