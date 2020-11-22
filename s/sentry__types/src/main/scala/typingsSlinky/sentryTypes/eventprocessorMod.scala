package typingsSlinky.sentryTypes

import typingsSlinky.sentryTypes.eventMod.Event
import typingsSlinky.sentryTypes.eventMod.EventHint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@sentry/types/dist/eventprocessor", JSImport.Namespace)
@js.native
object eventprocessorMod extends js.Object {
  
  type EventProcessor = js.Function2[
    /* event */ Event, 
    /* hint */ js.UndefOr[EventHint], 
    (js.Thenable[Event | Null]) | Event | Null
  ]
}
