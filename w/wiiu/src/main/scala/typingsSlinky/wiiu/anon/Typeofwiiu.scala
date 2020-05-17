package typingsSlinky.wiiu.anon

import typingsSlinky.wiiu.wiiu.ImageView
import typingsSlinky.wiiu.wiiu.VideoPlayer
import typingsSlinky.wiiu.wiiu.WiiuGamePad
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofwiiu extends js.Object {
  var gamepad: WiiuGamePad = js.native
  var imageview: ImageView = js.native
  var videoplayer: VideoPlayer = js.native
}

object Typeofwiiu {
  @scala.inline
  def apply(gamepad: WiiuGamePad, imageview: ImageView, videoplayer: VideoPlayer): Typeofwiiu = {
    val __obj = js.Dynamic.literal(gamepad = gamepad.asInstanceOf[js.Any], imageview = imageview.asInstanceOf[js.Any], videoplayer = videoplayer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofwiiu]
  }
  @scala.inline
  implicit class TypeofwiiuOps[Self <: Typeofwiiu] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGamepad(value: WiiuGamePad): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gamepad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImageview(value: ImageView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVideoplayer(value: VideoPlayer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoplayer")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

