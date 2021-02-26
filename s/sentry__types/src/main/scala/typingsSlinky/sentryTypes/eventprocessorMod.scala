package typingsSlinky.sentryTypes

import typingsSlinky.sentryTypes.eventMod.Event
import typingsSlinky.sentryTypes.eventMod.EventHint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventprocessorMod {
  
  type EventProcessor = js.Function2[
    /* event */ Event, 
    /* hint */ js.UndefOr[EventHint], 
    (js.Thenable[Event | Null]) | Event | Null
  ]
}
