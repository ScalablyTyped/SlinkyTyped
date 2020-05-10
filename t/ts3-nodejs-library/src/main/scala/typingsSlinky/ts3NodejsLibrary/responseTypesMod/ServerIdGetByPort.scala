package typingsSlinky.ts3NodejsLibrary.responseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerIdGetByPort extends js.Object {
  var server_id: Double = js.native
}

object ServerIdGetByPort {
  @scala.inline
  def apply(server_id: Double): ServerIdGetByPort = {
    val __obj = js.Dynamic.literal(server_id = server_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerIdGetByPort]
  }
  @scala.inline
  implicit class ServerIdGetByPortOps[Self <: ServerIdGetByPort] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withServer_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("server_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

