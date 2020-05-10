package typingsSlinky.vscode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonViewId extends js.Object {
  var viewId: String = js.native
}

object AnonViewId {
  @scala.inline
  def apply(viewId: String): AnonViewId = {
    val __obj = js.Dynamic.literal(viewId = viewId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonViewId]
  }
  @scala.inline
  implicit class AnonViewIdOps[Self <: AnonViewId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withViewId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

