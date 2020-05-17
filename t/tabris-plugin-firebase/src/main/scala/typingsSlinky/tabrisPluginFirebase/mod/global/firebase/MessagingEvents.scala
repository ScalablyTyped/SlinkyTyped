package typingsSlinky.tabrisPluginFirebase.mod.global.firebase

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.tabris.mod.PropertyChangedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessagingEvents extends js.Object {
  var instanceIdChanged: js.UndefOr[js.Function1[/* event */ PropertyChangedEvent[Messaging, String], Unit]] = js.native
  var message: js.UndefOr[js.Function1[/* event */ MessageEvent, Unit]] = js.native
  var tokenChanged: js.UndefOr[js.Function1[/* event */ PropertyChangedEvent[Messaging, String], Unit]] = js.native
}

@JSGlobal("firebase.MessagingEvents")
@js.native
object MessagingEvents extends TopLevel[MessagingEvents]

