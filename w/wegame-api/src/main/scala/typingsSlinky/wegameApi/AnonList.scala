package typingsSlinky.wegameApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonList extends js.Object {
  /**
    * 可能对游戏感兴趣的未注册好友名单
    */
  var list: js.Array[AnonAvatarUrl] = js.native
}

object AnonList {
  @scala.inline
  def apply(list: js.Array[AnonAvatarUrl]): AnonList = {
    val __obj = js.Dynamic.literal(list = list.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonList]
  }
  @scala.inline
  implicit class AnonListOps[Self <: AnonList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withList(value: js.Array[AnonAvatarUrl]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

