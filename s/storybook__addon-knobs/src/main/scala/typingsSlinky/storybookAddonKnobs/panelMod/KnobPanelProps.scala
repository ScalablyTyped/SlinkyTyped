package typingsSlinky.storybookAddonKnobs.panelMod

import typingsSlinky.storybookAddonKnobs.PickAPIonoffemitgetQueryP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnobPanelProps extends js.Object {
  var active: Boolean = js.native
  var api: PickAPIonoffemitgetQueryP = js.native
  var onReset: js.UndefOr[js.Object] = js.native
}

object KnobPanelProps {
  @scala.inline
  def apply(active: Boolean, api: PickAPIonoffemitgetQueryP): KnobPanelProps = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], api = api.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnobPanelProps]
  }
  @scala.inline
  implicit class KnobPanelPropsOps[Self <: KnobPanelProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApi(value: PickAPIonoffemitgetQueryP): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("api")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnReset(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnReset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReset")(js.undefined)
        ret
    }
  }
  
}

