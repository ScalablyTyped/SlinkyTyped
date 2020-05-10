package typingsSlinky.victory.mod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VictoryPortalProps extends js.Object {
  /**
    * The children of this component define the content of the label.
    * This makes using the component similar to normal HTML spans or labels. strings, numbers, and functions of data / value are supported.
    */
  var children: js.UndefOr[ReactElement] = js.native
  /**
    * The groupComponent prop takes a component instance which will be used to create a group element for VictoryPortal to render its child component into. This prop defaults to a <g> tag.
    */
  var groupComponent: js.UndefOr[ReactElement] = js.native
}

object VictoryPortalProps {
  @scala.inline
  def apply(): VictoryPortalProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VictoryPortalProps]
  }
  @scala.inline
  implicit class VictoryPortalPropsOps[Self <: VictoryPortalProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupComponent(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupComponent")(js.undefined)
        ret
    }
  }
  
}

