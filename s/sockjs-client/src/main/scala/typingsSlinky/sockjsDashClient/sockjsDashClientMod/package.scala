package typingsSlinky.sockjsDashClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sockjsDashClientMod {
  import typingsSlinky.sockjsDashClient.sockjsDashClientNumbers.`0`
  import typingsSlinky.sockjsDashClient.sockjsDashClientNumbers.`1`
  import typingsSlinky.sockjsDashClient.sockjsDashClientNumbers.`2`
  import typingsSlinky.sockjsDashClient.sockjsDashClientNumbers.`3`

  type CLOSED = `3`
  type CLOSING = `2`
  type CONNECTING = `0`
  type OPEN = `1`
  type OpenEvent = BaseEvent
  type SessionGenerator = js.Function0[String]
  type State = CONNECTING | OPEN | CLOSING | CLOSED
}
