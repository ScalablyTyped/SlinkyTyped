package typingsSlinky.titanium.Titanium.Android

import typingsSlinky.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuItemEventMap extends ProxyEventMap {
  var click: MenuItemClickEvent = js.native
  var collapse: MenuItemCollapseEvent = js.native
  var expand: MenuItemExpandEvent = js.native
}

object MenuItemEventMap {
  @scala.inline
  def apply(click: MenuItemClickEvent, collapse: MenuItemCollapseEvent, expand: MenuItemExpandEvent): MenuItemEventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], collapse = collapse.asInstanceOf[js.Any], expand = expand.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuItemEventMap]
  }
  @scala.inline
  implicit class MenuItemEventMapOps[Self <: MenuItemEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClick(value: MenuItemClickEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCollapse(value: MenuItemCollapseEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpand(value: MenuItemExpandEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expand")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

