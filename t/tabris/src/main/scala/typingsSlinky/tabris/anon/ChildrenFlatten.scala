package typingsSlinky.tabris.anon

import typingsSlinky.tabris.mod.Flatten
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChildrenFlatten extends js.Object {
  var children: js.UndefOr[Flatten[String | Image]] = js.native
}

object ChildrenFlatten {
  @scala.inline
  def apply(): ChildrenFlatten = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChildrenFlatten]
  }
  @scala.inline
  implicit class ChildrenFlattenOps[Self <: ChildrenFlatten] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: Flatten[String | Image]): Self = {
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

