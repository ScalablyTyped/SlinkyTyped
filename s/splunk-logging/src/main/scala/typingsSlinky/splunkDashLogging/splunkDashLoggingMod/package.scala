package typingsSlinky.splunkDashLogging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object splunkDashLoggingMod {
  type Callback = js.Function3[/* error */ js.UndefOr[js.Error], /* req */ js.Any, /* res */ js.Any, Unit]
  type EventFormatter = js.Function2[/* message */ js.Any, /* severity */ String, js.Any]
}
