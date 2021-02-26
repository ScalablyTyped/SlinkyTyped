package typingsSlinky.twilsock

import typingsSlinky.twilsock.configurationMod.Configuration
import typingsSlinky.twilsock.packetinterfaceMod.PacketInterface
import typingsSlinky.twilsock.telemetryMod.TelemetryEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object telemetrytrackerMod {
  
  @js.native
  sealed trait EventSendingLimitation extends StObject
  @JSImport("twilsock/lib/services/telemetrytracker", "EventSendingLimitation")
  @js.native
  object EventSendingLimitation extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EventSendingLimitation with Double] = js.native
    
    @js.native
    sealed trait AnyEvents extends EventSendingLimitation
    /* 1 */ val AnyEvents: typingsSlinky.twilsock.telemetrytrackerMod.EventSendingLimitation.AnyEvents with Double = js.native
    
    @js.native
    sealed trait AnyEventsIncludingUnfinished extends EventSendingLimitation
    /* 2 */ val AnyEventsIncludingUnfinished: typingsSlinky.twilsock.telemetrytrackerMod.EventSendingLimitation.AnyEventsIncludingUnfinished with Double = js.native
    
    @js.native
    sealed trait MinEventsPortion extends EventSendingLimitation
    /* 0 */ val MinEventsPortion: typingsSlinky.twilsock.telemetrytrackerMod.EventSendingLimitation.MinEventsPortion with Double = js.native
  }
  
  @JSImport("twilsock/lib/services/telemetrytracker", "TelemetryEventDescription")
  @js.native
  class TelemetryEventDescription protected () extends StObject {
    def this(title: String, details: String, start: js.Date) = this()
    def this(title: String, details: String, start: js.Date, end: js.Date) = this()
    def this(title: String, details: String, start: js.Date, end: js.UndefOr[scala.Nothing], `type`: String) = this()
    def this(title: String, details: String, start: js.Date, end: js.Date, `type`: String) = this()
    def this(
      title: String,
      details: String,
      start: js.Date,
      end: js.UndefOr[scala.Nothing],
      `type`: js.UndefOr[scala.Nothing],
      id: String
    ) = this()
    def this(
      title: String,
      details: String,
      start: js.Date,
      end: js.UndefOr[scala.Nothing],
      `type`: String,
      id: String
    ) = this()
    def this(
      title: String,
      details: String,
      start: js.Date,
      end: js.Date,
      `type`: js.UndefOr[scala.Nothing],
      id: String
    ) = this()
    def this(title: String, details: String, start: js.Date, end: js.Date, `type`: String, id: String) = this()
    
    val details: String = js.native
    
    var end: js.Date = js.native
    
    val id: js.UndefOr[String] = js.native
    
    val start: js.Date = js.native
    
    val title: String = js.native
    
    def toTelemetryEvent(): TelemetryEvent = js.native
    
    val `type`: js.UndefOr[String] = js.native
  }
  
  @js.native
  sealed trait TelemetryPoint extends StObject
  @JSImport("twilsock/lib/services/telemetrytracker", "TelemetryPoint")
  @js.native
  object TelemetryPoint extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[TelemetryPoint with Double] = js.native
    
    @js.native
    sealed trait End extends TelemetryPoint
    /* 1 */ val End: typingsSlinky.twilsock.telemetrytrackerMod.TelemetryPoint.End with Double = js.native
    
    @js.native
    sealed trait Start extends TelemetryPoint
    /* 0 */ val Start: typingsSlinky.twilsock.telemetrytrackerMod.TelemetryPoint.Start with Double = js.native
  }
  
  @JSImport("twilsock/lib/services/telemetrytracker", "TelemetryTracker")
  @js.native
  class TelemetryTracker protected () extends StObject {
    def this(config: Configuration, packetInterface: PacketInterface) = this()
    
    var _canSendTelemetry: js.Any = js.native
    
    def addPartialEvent(incompleteEvent: TelemetryEventDescription, eventKey: String, point: TelemetryPoint): Unit = js.native
    
    def addTelemetryEvent(event: TelemetryEventDescription): Unit = js.native
    
    def canSendTelemetry: Boolean = js.native
    def canSendTelemetry_=(enable: Boolean): Unit = js.native
    
    val config: js.Any = js.native
    
    var getTelemetryPortion: js.Any = js.native
    
    def getTelemetryToSend(sendingLimit: EventSendingLimitation): js.Array[TelemetryEventDescription] = js.native
    
    var hasInitializationFinished: js.Any = js.native
    
    def isTelemetryEnabled: Boolean = js.native
    
    val maxEventsPortionToSend: js.Any = js.native
    
    var merge: js.Any = js.native
    
    val minEventsPortionToSend: js.Any = js.native
    
    val packetInterface: js.Any = js.native
    
    var pendingEvents: js.Any = js.native
    
    var readyEvents: js.Any = js.native
    
    def sendTelemetry(limit: EventSendingLimitation): Unit = js.native
    
    def sendTelemetryIfMinimalPortionCollected(): Unit = js.native
  }
}
