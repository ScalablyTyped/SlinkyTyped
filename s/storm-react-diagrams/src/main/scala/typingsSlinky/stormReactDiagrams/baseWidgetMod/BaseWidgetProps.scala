package typingsSlinky.stormReactDiagrams.baseWidgetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseWidgetProps extends js.Object {
  /**
    * Override the base class name
    */
  var baseClass: js.UndefOr[String] = js.native
  /**
    * append additional classes
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Additional props to add
    */
  var extraProps: js.UndefOr[js.Any] = js.native
}

object BaseWidgetProps {
  @scala.inline
  def apply(): BaseWidgetProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseWidgetProps]
  }
  @scala.inline
  implicit class BaseWidgetPropsOps[Self <: BaseWidgetProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseClass")(js.undefined)
        ret
    }
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
    def withExtraProps(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtraProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraProps")(js.undefined)
        ret
    }
  }
  
}

