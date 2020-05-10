package typingsSlinky.storybookTheming.typesMod

import typingsSlinky.emotionSerialize.mod.Keyframes
import typingsSlinky.emotionUtils.mod.SerializedStyles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Animation extends js.Object {
  var float: Keyframes = js.native
  var glow: Keyframes = js.native
  var hoverable: SerializedStyles = js.native
  var inlineGlow: SerializedStyles = js.native
  var jiggle: Keyframes = js.native
  var rotate360: Keyframes = js.native
}

object Animation {
  @scala.inline
  def apply(
    float: Keyframes,
    glow: Keyframes,
    hoverable: SerializedStyles,
    inlineGlow: SerializedStyles,
    jiggle: Keyframes,
    rotate360: Keyframes
  ): Animation = {
    val __obj = js.Dynamic.literal(float = float.asInstanceOf[js.Any], glow = glow.asInstanceOf[js.Any], hoverable = hoverable.asInstanceOf[js.Any], inlineGlow = inlineGlow.asInstanceOf[js.Any], jiggle = jiggle.asInstanceOf[js.Any], rotate360 = rotate360.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animation]
  }
  @scala.inline
  implicit class AnimationOps[Self <: Animation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFloat(value: Keyframes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("float")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlow(value: Keyframes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHoverable(value: SerializedStyles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInlineGlow(value: SerializedStyles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineGlow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJiggle(value: Keyframes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jiggle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRotate360(value: Keyframes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotate360")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

