package typingsSlinky.styletronReact.anon

import slinky.core.TagMod
import typingsSlinky.styletronReact.mod.DebugEngine
import typingsSlinky.styletronStandard.mod.StandardEngine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Children extends js.Object {
  def children(styletronEngine: StandardEngine, debugEngine: DebugEngine, hydrating: Boolean): TagMod[Any] = js.native
}

object Children {
  @scala.inline
  def apply(children: (StandardEngine, DebugEngine, Boolean) => TagMod[Any]): Children = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction3(children))
    __obj.asInstanceOf[Children]
  }
  @scala.inline
  implicit class ChildrenOps[Self <: Children] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: (StandardEngine, DebugEngine, Boolean) => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

