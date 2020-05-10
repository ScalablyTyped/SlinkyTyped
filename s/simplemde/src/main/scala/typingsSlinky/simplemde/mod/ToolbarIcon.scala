package typingsSlinky.simplemde.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToolbarIcon extends js.Object {
  var action: String | (js.Function1[/* editor */ SimpleMDE, Unit]) = js.native
  var className: String = js.native
  var name: String = js.native
  var title: String = js.native
}

object ToolbarIcon {
  @scala.inline
  def apply(
    action: String | (js.Function1[/* editor */ SimpleMDE, Unit]),
    className: String,
    name: String,
    title: String
  ): ToolbarIcon = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolbarIcon]
  }
  @scala.inline
  implicit class ToolbarIconOps[Self <: ToolbarIcon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionFunction1(value: /* editor */ SimpleMDE => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAction(value: String | (js.Function1[/* editor */ SimpleMDE, Unit])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

