package typingsSlinky.vue2Editor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VueEditorWatch extends js.Object {
  def disabled(status: Boolean): Unit = js.native
  def value(`val`: js.Any): Unit = js.native
}

object VueEditorWatch {
  @scala.inline
  def apply(disabled: Boolean => Unit, value: js.Any => Unit): VueEditorWatch = {
    val __obj = js.Dynamic.literal(disabled = js.Any.fromFunction1(disabled), value = js.Any.fromFunction1(value))
    __obj.asInstanceOf[VueEditorWatch]
  }
  @scala.inline
  implicit class VueEditorWatchOps[Self <: VueEditorWatch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisabled(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withValue(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

