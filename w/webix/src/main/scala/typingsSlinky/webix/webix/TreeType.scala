package typingsSlinky.webix.webix

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeType extends js.Object {
  def checkbox(obj: js.Any, common: js.Any): String = js.native
  def folder(obj: js.Any, common: js.Any): String = js.native
  def icon(obj: js.Any, common: js.Any): String = js.native
  def space(obj: js.Any, common: js.Any): String = js.native
}

object TreeType {
  @scala.inline
  def apply(
    checkbox: (js.Any, js.Any) => String,
    folder: (js.Any, js.Any) => String,
    icon: (js.Any, js.Any) => String,
    space: (js.Any, js.Any) => String
  ): TreeType = {
    val __obj = js.Dynamic.literal(checkbox = js.Any.fromFunction2(checkbox), folder = js.Any.fromFunction2(folder), icon = js.Any.fromFunction2(icon), space = js.Any.fromFunction2(space))
    __obj.asInstanceOf[TreeType]
  }
  @scala.inline
  implicit class TreeTypeOps[Self <: TreeType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckbox(value: (js.Any, js.Any) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkbox")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFolder(value: (js.Any, js.Any) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("folder")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withIcon(value: (js.Any, js.Any) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSpace(value: (js.Any, js.Any) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("space")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

