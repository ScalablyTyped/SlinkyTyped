package typingsSlinky.xrm

import typingsSlinky.xrm.XrmEnum.StageCategory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGetValue extends js.Object {
  def getValue(): StageCategory = js.native
}

object AnonGetValue {
  @scala.inline
  def apply(getValue: () => StageCategory): AnonGetValue = {
    val __obj = js.Dynamic.literal(getValue = js.Any.fromFunction0(getValue))
    __obj.asInstanceOf[AnonGetValue]
  }
  @scala.inline
  implicit class AnonGetValueOps[Self <: AnonGetValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetValue(value: () => StageCategory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValue")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

