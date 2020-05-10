package typingsSlinky.stormReactDiagrams.defaultPortLabelWidgetMod

import typingsSlinky.stormReactDiagrams.baseWidgetMod.BaseWidgetProps
import typingsSlinky.stormReactDiagrams.defaultPortModelMod.DefaultPortModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultPortLabelProps extends BaseWidgetProps {
  var model: DefaultPortModel = js.native
}

object DefaultPortLabelProps {
  @scala.inline
  def apply(model: DefaultPortModel): DefaultPortLabelProps = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultPortLabelProps]
  }
  @scala.inline
  implicit class DefaultPortLabelPropsOps[Self <: DefaultPortLabelProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withModel(value: DefaultPortModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

