package typingsSlinky.webix.webix

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContextHelper extends js.Object {
  def attachTo(view: js.Any): Unit = js.native
  def getContext(): js.Any = js.native
  def setContext(context: js.Any): Unit = js.native
}

object ContextHelper {
  @scala.inline
  def apply(attachTo: js.Any => Unit, getContext: () => js.Any, setContext: js.Any => Unit): ContextHelper = {
    val __obj = js.Dynamic.literal(attachTo = js.Any.fromFunction1(attachTo), getContext = js.Any.fromFunction0(getContext), setContext = js.Any.fromFunction1(setContext))
    __obj.asInstanceOf[ContextHelper]
  }
  @scala.inline
  implicit class ContextHelperOps[Self <: ContextHelper] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttachTo(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetContext(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContext")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetContext(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setContext")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

