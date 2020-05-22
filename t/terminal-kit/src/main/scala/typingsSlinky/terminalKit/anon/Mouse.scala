package typingsSlinky.terminalKit.anon

import typingsSlinky.terminalKit.terminalKitStrings.button
import typingsSlinky.terminalKit.terminalKitStrings.drag
import typingsSlinky.terminalKit.terminalKitStrings.motion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mouse extends js.Object {
  var mouse: js.UndefOr[button | drag | motion] = js.undefined
  var safe: js.UndefOr[Boolean] = js.undefined
}

object Mouse {
  @scala.inline
  def apply(mouse: button | drag | motion = null, safe: js.UndefOr[Boolean] = js.undefined): Mouse = {
    val __obj = js.Dynamic.literal()
    if (mouse != null) __obj.updateDynamic("mouse")(mouse.asInstanceOf[js.Any])
    if (!js.isUndefined(safe)) __obj.updateDynamic("safe")(safe.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mouse]
  }
}

