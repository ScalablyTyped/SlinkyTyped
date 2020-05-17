package typingsSlinky.storybookAddonA11y.tabsMod

import typingsSlinky.storybookAddonA11y.anon.Items
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabsProps extends js.Object {
  var tabs: js.Array[Items] = js.native
}

object TabsProps {
  @scala.inline
  def apply(tabs: js.Array[Items]): TabsProps = {
    val __obj = js.Dynamic.literal(tabs = tabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabsProps]
  }
  @scala.inline
  implicit class TabsPropsOps[Self <: TabsProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTabs(value: js.Array[Items]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

