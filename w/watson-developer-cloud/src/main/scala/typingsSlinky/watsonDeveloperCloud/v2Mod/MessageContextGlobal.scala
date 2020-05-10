package typingsSlinky.watsonDeveloperCloud.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Information that is shared by all skills used by the Assistant. */
@js.native
trait MessageContextGlobal extends js.Object {
  /** Built-in system properties that apply to all skills used by the assistant. */
  var system: js.UndefOr[MessageContextGlobalSystem] = js.native
}

object MessageContextGlobal {
  @scala.inline
  def apply(): MessageContextGlobal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageContextGlobal]
  }
  @scala.inline
  implicit class MessageContextGlobalOps[Self <: MessageContextGlobal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSystem(value: MessageContextGlobalSystem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("system")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSystem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("system")(js.undefined)
        ret
    }
  }
  
}

