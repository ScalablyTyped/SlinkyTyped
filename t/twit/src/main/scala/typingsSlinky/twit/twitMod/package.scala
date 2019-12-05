package typingsSlinky.twit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object twitMod {
  import typingsSlinky.node.httpMod.IncomingMessage

  type Callback = js.Function3[/* err */ js.Error, /* result */ Response, /* response */ IncomingMessage, Unit]
  type Response = js.Object
}
