package typingsSlinky.serverless.mod

import typingsSlinky.serverless.validateMod.ApiGatewayEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Other events than ApiGatewayEvent are available
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.serverless.validateMod.ApiGatewayEvent
  - js.Object
*/
trait Event extends js.Object

object Event {
  @scala.inline
  implicit def apply(value: ApiGatewayEvent): Event = value.asInstanceOf[Event]
  @scala.inline
  implicit def apply(value: js.Object): Event = value.asInstanceOf[Event]
}

