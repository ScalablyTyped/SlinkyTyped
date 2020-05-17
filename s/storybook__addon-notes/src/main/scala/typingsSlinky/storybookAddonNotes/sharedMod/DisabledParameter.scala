package typingsSlinky.storybookAddonNotes.sharedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisabledParameter extends Parameters {
  var disable: Boolean = js.native
}

object DisabledParameter {
  @scala.inline
  def apply(disable: Boolean): DisabledParameter = {
    val __obj = js.Dynamic.literal(disable = disable.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisabledParameter]
  }
  @scala.inline
  implicit class DisabledParameterOps[Self <: DisabledParameter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

