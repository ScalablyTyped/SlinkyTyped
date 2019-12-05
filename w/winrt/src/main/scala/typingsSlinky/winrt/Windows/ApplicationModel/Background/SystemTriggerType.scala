package typingsSlinky.winrt.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SystemTriggerType extends js.Object

@JSGlobal("Windows.ApplicationModel.Background.SystemTriggerType")
@js.native
object SystemTriggerType extends js.Object {
  @js.native
  sealed trait controlChannelReset extends SystemTriggerType
  
  @js.native
  sealed trait internetAvailable extends SystemTriggerType
  
  @js.native
  sealed trait invalid extends SystemTriggerType
  
  @js.native
  sealed trait lockScreenApplicationAdded extends SystemTriggerType
  
  @js.native
  sealed trait lockScreenApplicationRemoved extends SystemTriggerType
  
  @js.native
  sealed trait networkStateChange extends SystemTriggerType
  
  @js.native
  sealed trait onlineIdConnectedStateChange extends SystemTriggerType
  
  @js.native
  sealed trait servicingComplete extends SystemTriggerType
  
  @js.native
  sealed trait sessionConnected extends SystemTriggerType
  
  @js.native
  sealed trait smsReceived extends SystemTriggerType
  
  @js.native
  sealed trait timeZoneChange extends SystemTriggerType
  
  @js.native
  sealed trait userAway extends SystemTriggerType
  
  @js.native
  sealed trait userPresent extends SystemTriggerType
  
  /* 5 */ val controlChannelReset: typingsSlinky.winrt.Windows.ApplicationModel.Background.SystemTriggerType.controlChannelReset with Double = js.native
  /* 6 */ val internetAvailable: typingsSlinky.winrt.Windows.ApplicationModel.Background.SystemTriggerType.internetAvailable with Double = js.native
  /* 0 */ val invalid: typingsSlinky.winrt.Windows.ApplicationModel.Background.SystemTriggerType.invalid with Double = js.native
  /* 9 */ val lockScreenApplicationAdded: typingsSlinky.winrt.Windows.ApplicationModel.Background.SystemTriggerType.lockScreenApplicationAdded with Double = js.native
  /* 10 */ val lockScreenApplicationRemoved: typingsSlinky.winrt.Windows.ApplicationModel.Background.SystemTriggerType.lockScreenApplicationRemoved with Double = js.native
  /* 4 */ val networkStateChange: typingsSlinky.winrt.Windows.ApplicationModel.Background.SystemTriggerType.networkStateChange with Double = js.native
  /* 12 */ val onlineIdConnectedStateChange: typingsSlinky.winrt.Windows.ApplicationModel.Background.SystemTriggerType.onlineIdConnectedStateChange with Double = js.native
  /* 8 */ val servicingComplete: typingsSlinky.winrt.Windows.ApplicationModel.Background.SystemTriggerType.servicingComplete with Double = js.native
  /* 7 */ val sessionConnected: typingsSlinky.winrt.Windows.ApplicationModel.Background.SystemTriggerType.sessionConnected with Double = js.native
  /* 1 */ val smsReceived: typingsSlinky.winrt.Windows.ApplicationModel.Background.SystemTriggerType.smsReceived with Double = js.native
  /* 11 */ val timeZoneChange: typingsSlinky.winrt.Windows.ApplicationModel.Background.SystemTriggerType.timeZoneChange with Double = js.native
  /* 3 */ val userAway: typingsSlinky.winrt.Windows.ApplicationModel.Background.SystemTriggerType.userAway with Double = js.native
  /* 2 */ val userPresent: typingsSlinky.winrt.Windows.ApplicationModel.Background.SystemTriggerType.userPresent with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SystemTriggerType with Double] = js.native
}

