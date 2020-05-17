package typingsSlinky.webix.webix

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeClick extends js.Object {
  def webix_tree_checkbox(obj: js.Any, common: StringDictionary[js.Any]): String = js.native
  def webix_tree_close(obj: js.Any, common: StringDictionary[js.Any]): String = js.native
  def webix_tree_open(obj: js.Any, common: StringDictionary[js.Any]): String = js.native
}

object TreeClick {
  @scala.inline
  def apply(
    webix_tree_checkbox: (js.Any, StringDictionary[js.Any]) => String,
    webix_tree_close: (js.Any, StringDictionary[js.Any]) => String,
    webix_tree_open: (js.Any, StringDictionary[js.Any]) => String
  ): TreeClick = {
    val __obj = js.Dynamic.literal(webix_tree_checkbox = js.Any.fromFunction2(webix_tree_checkbox), webix_tree_close = js.Any.fromFunction2(webix_tree_close), webix_tree_open = js.Any.fromFunction2(webix_tree_open))
    __obj.asInstanceOf[TreeClick]
  }
  @scala.inline
  implicit class TreeClickOps[Self <: TreeClick] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWebix_tree_checkbox(value: (js.Any, StringDictionary[js.Any]) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webix_tree_checkbox")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withWebix_tree_close(value: (js.Any, StringDictionary[js.Any]) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webix_tree_close")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withWebix_tree_open(value: (js.Any, StringDictionary[js.Any]) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webix_tree_open")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

