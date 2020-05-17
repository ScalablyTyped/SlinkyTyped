package typingsSlinky.tabris.anon

import typingsSlinky.tabris.mod.JSXChildren
import typingsSlinky.tabris.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `2`[ChildType /* <: Widget */] extends js.Object {
  var children: js.UndefOr[JSXChildren[ChildType]] = js.native
}

object `2` {
  @scala.inline
  def apply[ChildType](): `2`[ChildType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`2`[ChildType]]
  }
  @scala.inline
  implicit class `2Ops`[Self[childtype] <: `2`[childtype], ChildType] (val x: Self[ChildType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ChildType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ChildType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[ChildType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[ChildType] with Other]
    @scala.inline
    def withChildren(value: JSXChildren[ChildType]): Self[ChildType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self[ChildType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
  }
  
}

