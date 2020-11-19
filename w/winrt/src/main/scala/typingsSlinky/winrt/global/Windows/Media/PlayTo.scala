package typingsSlinky.winrt.global.Windows.Media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Media.PlayTo")
@js.native
object PlayTo extends js.Object {
  
  @js.native
  class CurrentTimeChangeRequestedEventArgs ()
    extends typingsSlinky.winrt.Windows.Media.PlayTo.CurrentTimeChangeRequestedEventArgs
  
  @js.native
  class MuteChangeRequestedEventArgs ()
    extends typingsSlinky.winrt.Windows.Media.PlayTo.MuteChangeRequestedEventArgs
  
  @js.native
  class PlayToConnection ()
    extends typingsSlinky.winrt.Windows.Media.PlayTo.PlayToConnection
  
  @js.native
  object PlayToConnectionError extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.Media.PlayTo.PlayToConnectionError with Double] = js.native
    
    /* 2 */ val deviceError: typingsSlinky.winrt.Windows.Media.PlayTo.PlayToConnectionError.deviceError with Double = js.native
    
    /* 3 */ val deviceLocked: typingsSlinky.winrt.Windows.Media.PlayTo.PlayToConnectionError.deviceLocked with Double = js.native
    
    /* 1 */ val deviceNotResponding: typingsSlinky.winrt.Windows.Media.PlayTo.PlayToConnectionError.deviceNotResponding with Double = js.native
    
    /* 0 */ val none: typingsSlinky.winrt.Windows.Media.PlayTo.PlayToConnectionError.none with Double = js.native
  }
  
  @js.native
  class PlayToConnectionErrorEventArgs ()
    extends typingsSlinky.winrt.Windows.Media.PlayTo.PlayToConnectionErrorEventArgs
  
  @js.native
  object PlayToConnectionState extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.Media.PlayTo.PlayToConnectionState with Double] = js.native
    
    /* 1 */ val connected: typingsSlinky.winrt.Windows.Media.PlayTo.PlayToConnectionState.connected with Double = js.native
    
    /* 0 */ val disconnected: typingsSlinky.winrt.Windows.Media.PlayTo.PlayToConnectionState.disconnected with Double = js.native
    
    /* 2 */ val rendering: typingsSlinky.winrt.Windows.Media.PlayTo.PlayToConnectionState.rendering with Double = js.native
  }
  
  @js.native
  class PlayToConnectionStateChangedEventArgs ()
    extends typingsSlinky.winrt.Windows.Media.PlayTo.PlayToConnectionStateChangedEventArgs
  
  @js.native
  class PlayToConnectionTransferredEventArgs ()
    extends typingsSlinky.winrt.Windows.Media.PlayTo.PlayToConnectionTransferredEventArgs
  
  @js.native
  class PlayToManager ()
    extends typingsSlinky.winrt.Windows.Media.PlayTo.PlayToManager
  /* static members */
  @js.native
  object PlayToManager extends js.Object {
    
    def getForCurrentView(): typingsSlinky.winrt.Windows.Media.PlayTo.PlayToManager = js.native
    
    def showPlayToUI(): Unit = js.native
  }
  
  @js.native
  class PlayToReceiver ()
    extends typingsSlinky.winrt.Windows.Media.PlayTo.PlayToReceiver
  
  @js.native
  class PlayToSource ()
    extends typingsSlinky.winrt.Windows.Media.PlayTo.PlayToSource
  
  @js.native
  class PlayToSourceDeferral ()
    extends typingsSlinky.winrt.Windows.Media.PlayTo.PlayToSourceDeferral
  
  @js.native
  class PlayToSourceRequest ()
    extends typingsSlinky.winrt.Windows.Media.PlayTo.PlayToSourceRequest
  
  @js.native
  class PlayToSourceRequestedEventArgs ()
    extends typingsSlinky.winrt.Windows.Media.PlayTo.PlayToSourceRequestedEventArgs
  
  @js.native
  class PlayToSourceSelectedEventArgs ()
    extends typingsSlinky.winrt.Windows.Media.PlayTo.PlayToSourceSelectedEventArgs
  
  @js.native
  class PlaybackRateChangeRequestedEventArgs ()
    extends typingsSlinky.winrt.Windows.Media.PlayTo.PlaybackRateChangeRequestedEventArgs
  
  @js.native
  class SourceChangeRequestedEventArgs ()
    extends typingsSlinky.winrt.Windows.Media.PlayTo.SourceChangeRequestedEventArgs
  
  @js.native
  class VolumeChangeRequestedEventArgs ()
    extends typingsSlinky.winrt.Windows.Media.PlayTo.VolumeChangeRequestedEventArgs
}
