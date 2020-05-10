package typingsSlinky.webicon.cssIconSetOptionsMod

import typingsSlinky.webicon.cssClassConfigMod.CssClassConfig
import typingsSlinky.webicon.iconMod.Icon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CssIconSetOptions extends Icon {
  /**
    * An alias of the `className`-property.
    */
  var `class`: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: this['className'] */ js.Any
  ] = js.native
  /**
    * Either a text-pattern or a callback which provides a css-classname.
    *
    * The symbols `?` and `%` in the text-pattern are replaced by the icon-id.
    */
  var className: js.UndefOr[CssClassConfig] = js.native
  /**
    * An alias of the `className`-property.
    */
  var cssClass: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: this['className'] */ js.Any
  ] = js.native
}

object CssIconSetOptions {
  @scala.inline
  def apply(): CssIconSetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CssIconSetOptions]
  }
  @scala.inline
  implicit class CssIconSetOptionsOps[Self <: CssIconSetOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClass(
      value: /* import warning: importer.ImportType#apply Failed type conversion: this['className'] */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("class")(js.undefined)
        ret
    }
    @scala.inline
    def withClassNameFunction2(value: (/* id */ String, /* params */ js.Array[String]) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withClassName(value: CssClassConfig): Self = {
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
    def withCssClass(
      value: /* import warning: importer.ImportType#apply Failed type conversion: this['className'] */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(js.undefined)
        ret
    }
  }
  
}

