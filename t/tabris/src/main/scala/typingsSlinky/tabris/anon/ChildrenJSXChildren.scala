package typingsSlinky.tabris.anon

import typingsSlinky.tabris.mod.JSXChildren
import typingsSlinky.tabris.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChildrenJSXChildren extends js.Object {
  var children: JSXChildren[Widget] = js.native
}

object ChildrenJSXChildren {
  @scala.inline
  def apply(): ChildrenJSXChildren = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChildrenJSXChildren]
  }
  @scala.inline
  implicit class ChildrenJSXChildrenOps[Self <: ChildrenJSXChildren] (val x: Self) extends AnyVal {
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

