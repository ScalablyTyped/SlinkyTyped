package typingsSlinky.sipJs.anon

import typingsSlinky.sipJs.libSessionDescriptionHandlerMod.SessionDescriptionHandlerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Modifiers extends js.Object {
  var modifiers: js.UndefOr[
    typingsSlinky.sipJs.libSessionDescriptionHandlerMod.SessionDescriptionHandlerModifiers
  ] = js.native
  var sessionDescriptionHandlerOptions: js.UndefOr[SessionDescriptionHandlerOptions] = js.native
}

object Modifiers {
  @scala.inline
  def apply(): Modifiers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Modifiers]
  }
  @scala.inline
  implicit class ModifiersOps[Self <: Modifiers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withModifiers(value: typingsSlinky.sipJs.libSessionDescriptionHandlerMod.SessionDescriptionHandlerModifiers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifiers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModifiers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifiers")(js.undefined)
        ret
    }
    @scala.inline
    def withSessionDescriptionHandlerOptions(value: SessionDescriptionHandlerOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionDescriptionHandlerOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionDescriptionHandlerOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionDescriptionHandlerOptions")(js.undefined)
        ret
    }
  }
  
}

