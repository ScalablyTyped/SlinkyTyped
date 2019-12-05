package typingsSlinky.yandexDashMoneyDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object yandexDashMoneyDashSdkMod {
  import typingsSlinky.node.httpMod.IncomingMessage

  type ResponseCallback[TBody] = js.Function3[/* err */ js.Any, /* body */ TBody, /* response */ IncomingMessage, js.Any]
}
