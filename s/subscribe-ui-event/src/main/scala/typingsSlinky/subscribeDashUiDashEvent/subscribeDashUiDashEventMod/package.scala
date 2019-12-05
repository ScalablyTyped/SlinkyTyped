package typingsSlinky.subscribeDashUiDashEvent

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object subscribeDashUiDashEventMod {
  import org.scalajs.dom.raw.TouchEvent
  import org.scalajs.dom.raw.UIEvent

  type TouchEventCallback[T /* <: TouchEventType */] = js.Function2[/* event */ TouchEvent, /* payload */ ArgmentedEvent[T], js.Any]
  type UIEventCallback[T /* <: UIEventType */] = js.Function2[/* event */ UIEvent, /* payload */ ArgmentedEvent[T], js.Any]
}
