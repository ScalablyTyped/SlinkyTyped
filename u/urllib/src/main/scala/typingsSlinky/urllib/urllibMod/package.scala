package typingsSlinky.urllib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object urllibMod {
  import typingsSlinky.node.httpMod.IncomingMessage

  type Callback[T] = js.Function3[/* err */ js.Error, /* data */ T, /* res */ IncomingMessage, Unit]
}
