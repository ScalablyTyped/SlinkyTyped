package typingsSlinky.tabris

import typingsSlinky.tabris.mod.Action
import typingsSlinky.tabris.mod.JSXChildren
import typingsSlinky.tabris.mod.Page
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon4 extends js.Object {
  var children: js.UndefOr[JSXChildren[Page | Action]] = js.native
}

object Anon4 {
  @scala.inline
  def apply(): Anon4 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Anon4]
  }
  @scala.inline
  implicit class Anon4Ops[Self <: Anon4] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: JSXChildren[Page | Action]): Self = {
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

