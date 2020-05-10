package typingsSlinky.wegameApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonShareMessageToFriendScene extends js.Object {
  /**
    * 需要传递的代表场景的数字，需要在 0 - 50 之间
    */
  var shareMessageToFriendScene: Double = js.native
}

object AnonShareMessageToFriendScene {
  @scala.inline
  def apply(shareMessageToFriendScene: Double): AnonShareMessageToFriendScene = {
    val __obj = js.Dynamic.literal(shareMessageToFriendScene = shareMessageToFriendScene.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonShareMessageToFriendScene]
  }
  @scala.inline
  implicit class AnonShareMessageToFriendSceneOps[Self <: AnonShareMessageToFriendScene] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShareMessageToFriendScene(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shareMessageToFriendScene")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

