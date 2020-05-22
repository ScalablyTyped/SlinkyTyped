package typingsSlinky.vegaTypings.anon

import typingsSlinky.vegaTypings.streamMod.WindowEventType
import typingsSlinky.vegaTypings.vegaTypingsStrings.window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Type extends js.Object {
  var source: window
  var `type`: WindowEventType
}

object Type {
  @scala.inline
  def apply(source: window, `type`: WindowEventType): Type = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
}

