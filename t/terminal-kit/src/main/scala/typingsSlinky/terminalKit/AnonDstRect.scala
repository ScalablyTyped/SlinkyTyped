package typingsSlinky.terminalKit

import typingsSlinky.terminalKit.rectMod.Rect
import typingsSlinky.terminalKit.terminalKitStrings.x
import typingsSlinky.terminalKit.terminalKitStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDstRect extends js.Object {
  var dstRect: Rect = js.native
  var offsetX: Double = js.native
  var offsetY: Double = js.native
  var srcRect: Rect = js.native
  var wrapOnly: js.UndefOr[x | y] = js.native
}

object AnonDstRect {
  @scala.inline
  def apply(dstRect: Rect, offsetX: Double, offsetY: Double, srcRect: Rect): AnonDstRect = {
    val __obj = js.Dynamic.literal(dstRect = dstRect.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], srcRect = srcRect.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDstRect]
  }
  @scala.inline
  implicit class AnonDstRectOps[Self <: AnonDstRect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDstRect(value: Rect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dstRect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffsetX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffsetY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSrcRect(value: Rect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srcRect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWrapOnly(value: x | y): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapOnly")(js.undefined)
        ret
    }
  }
  
}

