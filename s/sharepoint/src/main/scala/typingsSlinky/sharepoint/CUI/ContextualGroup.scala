package typingsSlinky.sharepoint.CUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContextualGroup extends js.Object {
  def dispose(): scala.Unit = js.native
  def get_color(): Double = js.native
  def get_command(): String = js.native
  def get_count(): Double = js.native
  def get_id(): String = js.native
  def get_title(): String = js.native
}

object ContextualGroup {
  @scala.inline
  def apply(
    dispose: () => scala.Unit,
    get_color: () => Double,
    get_command: () => String,
    get_count: () => Double,
    get_id: () => String,
    get_title: () => String
  ): ContextualGroup = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), get_color = js.Any.fromFunction0(get_color), get_command = js.Any.fromFunction0(get_command), get_count = js.Any.fromFunction0(get_count), get_id = js.Any.fromFunction0(get_id), get_title = js.Any.fromFunction0(get_title))
    __obj.asInstanceOf[ContextualGroup]
  }
  @scala.inline
  implicit class ContextualGroupOps[Self <: ContextualGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDispose(value: () => scala.Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_color(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_color")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_command(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_command")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_count(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_count")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_id(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_id")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_title(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_title")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

