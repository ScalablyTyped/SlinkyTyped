package typingsSlinky.sharepoint.SPClientForms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientForm extends js.Object {
  def NotifyControlEvent(eventName: FormManagerEvents, fldName: String, eventArg: js.Any): Unit = js.native
  def RenderClientForm(): Unit = js.native
  def SubmitClientForm(): Boolean = js.native
}

object ClientForm {
  @scala.inline
  def apply(
    NotifyControlEvent: (FormManagerEvents, String, js.Any) => Unit,
    RenderClientForm: () => Unit,
    SubmitClientForm: () => Boolean
  ): ClientForm = {
    val __obj = js.Dynamic.literal(NotifyControlEvent = js.Any.fromFunction3(NotifyControlEvent), RenderClientForm = js.Any.fromFunction0(RenderClientForm), SubmitClientForm = js.Any.fromFunction0(SubmitClientForm))
    __obj.asInstanceOf[ClientForm]
  }
  @scala.inline
  implicit class ClientFormOps[Self <: ClientForm] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNotifyControlEvent(value: (FormManagerEvents, String, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotifyControlEvent")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withRenderClientForm(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RenderClientForm")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSubmitClientForm(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubmitClientForm")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

