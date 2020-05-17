package typingsSlinky.slackMock.mod

import typingsSlinky.node.urlMod.Url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Events
/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.node.urlMod.Url
*/
trait EventUrl extends js.Object

object EventUrl {
  @scala.inline
  implicit def apply(value: String): EventUrl = value.asInstanceOf[EventUrl]
  @scala.inline
  implicit def apply(value: Url): EventUrl = value.asInstanceOf[EventUrl]
}

