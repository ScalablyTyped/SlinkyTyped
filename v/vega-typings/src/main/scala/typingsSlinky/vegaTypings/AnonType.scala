package typingsSlinky.vegaTypings

import typingsSlinky.vegaTypings.streamMod.WindowEventType
import typingsSlinky.vegaTypings.vegaTypingsStrings.window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonType extends js.Object {
  var source: window
  var `type`: WindowEventType
}

object AnonType {
  @scala.inline
  def apply(source: window, `type`: WindowEventType): AnonType = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonType]
  }
}

