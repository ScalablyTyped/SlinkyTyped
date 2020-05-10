package typingsSlinky.ts3NodejsLibrary.responseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerGroupsByClientId extends js.Object {
  var cldbid: Double = js.native
  var name: String = js.native
  var sgid: Double = js.native
}

object ServerGroupsByClientId {
  @scala.inline
  def apply(cldbid: Double, name: String, sgid: Double): ServerGroupsByClientId = {
    val __obj = js.Dynamic.literal(cldbid = cldbid.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sgid = sgid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerGroupsByClientId]
  }
  @scala.inline
  implicit class ServerGroupsByClientIdOps[Self <: ServerGroupsByClientId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCldbid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cldbid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSgid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sgid")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

