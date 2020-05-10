package typingsSlinky.ts3NodejsLibrary.responseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientGetUidFromClid extends js.Object {
  var clid: Double = js.native
  var cluid: String = js.native
  var nickname: String = js.native
}

object ClientGetUidFromClid {
  @scala.inline
  def apply(clid: Double, cluid: String, nickname: String): ClientGetUidFromClid = {
    val __obj = js.Dynamic.literal(clid = clid.asInstanceOf[js.Any], cluid = cluid.asInstanceOf[js.Any], nickname = nickname.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientGetUidFromClid]
  }
  @scala.inline
  implicit class ClientGetUidFromClidOps[Self <: ClientGetUidFromClid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCluid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cluid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNickname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nickname")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

