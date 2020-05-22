package typingsSlinky.terminalKit.anon

import typingsSlinky.terminalKit.rectMod.Rect
import typingsSlinky.terminalKit.terminalKitStrings.x
import typingsSlinky.terminalKit.terminalKitStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DstRect extends js.Object {
  var dstRect: Rect
  var offsetX: Double
  var offsetY: Double
  var srcRect: Rect
  var wrapOnly: js.UndefOr[x | y] = js.undefined
}

object DstRect {
  @scala.inline
  def apply(dstRect: Rect, offsetX: Double, offsetY: Double, srcRect: Rect, wrapOnly: x | y = null): DstRect = {
    val __obj = js.Dynamic.literal(dstRect = dstRect.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], srcRect = srcRect.asInstanceOf[js.Any])
    if (wrapOnly != null) __obj.updateDynamic("wrapOnly")(wrapOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[DstRect]
  }
}

