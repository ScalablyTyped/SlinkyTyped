package typingsSlinky.winrt.Windows.UI.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CorePhysicalKeyStatus extends js.Object {
  var isExtendedKey: Boolean = js.native
  var isKeyReleased: Boolean = js.native
  var isMenuKeyDown: Boolean = js.native
  var repeatCount: Double = js.native
  var scanCode: Double = js.native
  var wasKeyDown: Boolean = js.native
}

object CorePhysicalKeyStatus {
  @scala.inline
  def apply(
    isExtendedKey: Boolean,
    isKeyReleased: Boolean,
    isMenuKeyDown: Boolean,
    repeatCount: Double,
    scanCode: Double,
    wasKeyDown: Boolean
  ): CorePhysicalKeyStatus = {
    val __obj = js.Dynamic.literal(isExtendedKey = isExtendedKey.asInstanceOf[js.Any], isKeyReleased = isKeyReleased.asInstanceOf[js.Any], isMenuKeyDown = isMenuKeyDown.asInstanceOf[js.Any], repeatCount = repeatCount.asInstanceOf[js.Any], scanCode = scanCode.asInstanceOf[js.Any], wasKeyDown = wasKeyDown.asInstanceOf[js.Any])
    __obj.asInstanceOf[CorePhysicalKeyStatus]
  }
  @scala.inline
  implicit class CorePhysicalKeyStatusOps[Self <: CorePhysicalKeyStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsExtendedKey(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExtendedKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsKeyReleased(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isKeyReleased")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsMenuKeyDown(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMenuKeyDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepeatCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeatCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScanCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scanCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWasKeyDown(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wasKeyDown")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

