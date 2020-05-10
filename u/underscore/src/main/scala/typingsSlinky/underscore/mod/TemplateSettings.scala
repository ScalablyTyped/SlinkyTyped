package typingsSlinky.underscore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * underscore.js template settings, set templateSettings or pass as an argument
  * to 'template()' to override defaults.
  **/
@js.native
trait TemplateSettings extends js.Object {
  /**
    * Default value is '/<%-([\s\S]+?)%>/g'.
    **/
  var escape: js.UndefOr[js.RegExp] = js.native
  /**
    * Default value is '/<%([\s\S]+?)%>/g'.
    **/
  var evaluate: js.UndefOr[js.RegExp] = js.native
  /**
    * Default value is '/<%=([\s\S]+?)%>/g'.
    **/
  var interpolate: js.UndefOr[js.RegExp] = js.native
  /**
    * By default, 'template()' places the values from your data in the local scope via the 'with' statement.
    * However, you can specify a single variable name with this setting.
    **/
  var variable: js.UndefOr[String] = js.native
}

object TemplateSettings {
  @scala.inline
  def apply(): TemplateSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateSettings]
  }
  @scala.inline
  implicit class TemplateSettingsOps[Self <: TemplateSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEscape(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEscape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escape")(js.undefined)
        ret
    }
    @scala.inline
    def withEvaluate(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evaluate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvaluate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evaluate")(js.undefined)
        ret
    }
    @scala.inline
    def withInterpolate(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interpolate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterpolate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interpolate")(js.undefined)
        ret
    }
    @scala.inline
    def withVariable(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variable")(js.undefined)
        ret
    }
  }
  
}

