package typingsSlinky.tabris

import typingsSlinky.tabris.mod.JSXChildren
import typingsSlinky.tabris.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonChildrenJSXChildren extends js.Object {
  var children: JSXChildren[Widget] = js.native
}

object AnonChildrenJSXChildren {
  @scala.inline
  def apply(): AnonChildrenJSXChildren = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonChildrenJSXChildren]
  }
  @scala.inline
  implicit class AnonChildrenJSXChildrenOps[Self <: AnonChildrenJSXChildren] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: JSXChildren[Widget]): Self = {
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
  }
  
}

