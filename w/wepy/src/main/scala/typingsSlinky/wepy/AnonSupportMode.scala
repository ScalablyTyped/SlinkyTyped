package typingsSlinky.wepy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSupportMode extends js.Object {
  var supportMode: js.Array[String] = js.native
}

object AnonSupportMode {
  @scala.inline
  def apply(supportMode: js.Array[String]): AnonSupportMode = {
    val __obj = js.Dynamic.literal(supportMode = supportMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSupportMode]
  }
  @scala.inline
  implicit class AnonSupportModeOps[Self <: AnonSupportMode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSupportMode(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportMode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

