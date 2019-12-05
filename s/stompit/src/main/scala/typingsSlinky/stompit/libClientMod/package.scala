package typingsSlinky.stompit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libClientMod {
  type MessageCallback = js.Function2[/* err */ js.Error | Null, /* message */ Message, Unit]
}
