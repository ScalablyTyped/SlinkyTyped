package typingsSlinky.vegaTypings.onEventsMod

import typingsSlinky.vegaTypings.selectorMod.EventSelector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vegaTypings.selectorMod.EventSelector
  - typingsSlinky.vegaTypings.onEventsMod.EventListener
*/
trait Events extends js.Object

object Events {
  @scala.inline
  implicit def apply(value: EventListener): Events = value.asInstanceOf[Events]
  @scala.inline
  implicit def apply(value: EventSelector): Events = value.asInstanceOf[Events]
}

