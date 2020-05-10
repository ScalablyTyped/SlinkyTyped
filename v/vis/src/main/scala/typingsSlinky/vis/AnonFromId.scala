package typingsSlinky.vis

import typingsSlinky.vis.mod.IdType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFromId extends js.Object {
  var fromId: IdType = js.native
  var toId: IdType = js.native
}

object AnonFromId {
  @scala.inline
  def apply(fromId: IdType, toId: IdType): AnonFromId = {
    val __obj = js.Dynamic.literal(fromId = fromId.asInstanceOf[js.Any], toId = toId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFromId]
  }
  @scala.inline
  implicit class AnonFromIdOps[Self <: AnonFromId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFromId(value: IdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToId(value: IdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

