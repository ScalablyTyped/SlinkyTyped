package typingsSlinky.typestyle

import typingsSlinky.typestyle.typesMod.KeyFrames
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonKeyframes extends js.Object {
  @JSName("$debugName")
  var $debugName: js.UndefOr[String] = js.native
  var keyframes: KeyFrames = js.native
}

object AnonKeyframes {
  @scala.inline
  def apply(keyframes: KeyFrames): AnonKeyframes = {
    val __obj = js.Dynamic.literal(keyframes = keyframes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKeyframes]
  }
  @scala.inline
  implicit class AnonKeyframesOps[Self <: AnonKeyframes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeyframes(value: KeyFrames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyframes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$debugName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$debugName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$debugName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$debugName")(js.undefined)
        ret
    }
  }
  
}

