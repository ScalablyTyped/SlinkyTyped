package typingsSlinky.winrt.global.Windows.Media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PlayTo {
  
  @JSGlobal("Windows.Media.PlayTo.CurrentTimeChangeRequestedEventArgs")
  @js.native
  class CurrentTimeChangeRequestedEventArgs ()
    extends typingsSlinky.winrt.Windows.Media.PlayTo.CurrentTimeChangeRequestedEventArgs
  
  @JSGlobal("Windows.Media.PlayTo.MuteChangeRequestedEventArgs")
  @js.native
  class MuteChangeRequestedEventArgs ()
    extends typingsSlinky.winrt.Windows.Media.PlayTo.MuteChangeRequestedEventArgs
  
  @JSGlobal("Windows.Media.PlayTo.PlayToConnection")
  @js.native
  class PlayToConnection ()
    extends typingsSlinky.winrt.Windows.Media.PlayTo.PlayToConnection
  
  @JSGlobal("Windows.Media.PlayTo.PlayToConnectionError")
  @js.native
  object PlayToConnectionError extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.Media.PlayTo.PlayToConnectionError with Double] = js.native
    
    /* 2 */ val deviceError: typingsSlinky.winrt.Windows.Media.PlayTo.PlayToConnectionError.deviceError with Double = js.native
    
    /* 3 */ val deviceLocked: typingsSlinky.winrt.Windows.Media.PlayTo.PlayToConnectionError.deviceLocked with Double = js.native
    
    /* 1 */ val deviceNotResponding: typingsSlinky.winrt.Windows.Media.PlayTo.PlayToConnectionError.deviceNotResponding with Double = js.native
    
    /* 0 */ val none: typingsSlinky.winrt.Windows.Media.PlayTo.PlayToConnectionError.none with Double = js.native
  }
  
  @JSGlobal("Windows.Media.PlayTo.PlayToConnectionErrorEventArgs")
  @js.native
  class PlayToConnectionErrorEventArgs ()
    extends typingsSlinky.winrt.Windows.Media.PlayTo.PlayToConnectionErrorEventArgs
  
  @JSGlobal("Windows.Media.PlayTo.PlayToConnectionState")
  @js.native
  object PlayToConnectionState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.Media.PlayTo.PlayToConnectionState with Double] = js.native
    
    /* 1 */ val connected: typingsSlinky.winrt.Windows.Media.PlayTo.PlayToConnectionState.connected with Double = js.native
    
    /* 0 */ val disconnected: typingsSlinky.winrt.Windows.Media.PlayTo.PlayToConnectionState.disconnected with Double = js.native
    
    /* 2 */ val rendering: typingsSlinky.winrt.Windows.Media.PlayTo.PlayToConnectionState.rendering with Double = js.native
  }
  
  @JSGlobal("Windows.Media.PlayTo.PlayToConnectionStateChangedEventArgs")
  @js.native
  class PlayToConnectionStateChangedEventArgs ()
    extends typingsSlinky.winrt.Windows.Media.PlayTo.PlayToConnectionStateChangedEventArgs
  
  @JSGlobal("Windows.Media.PlayTo.PlayToConnectionTransferredEventArgs")
  @js.native
  class PlayToConnectionTransferredEventArgs ()
    extends typingsSlinky.winrt.Windows.Media.PlayTo.PlayToConnectionTransferredEventArgs
  
  @JSGlobal("Windows.Media.PlayTo.PlayToManager")
  @js.native
  class PlayToManager ()
    extends typingsSlinky.winrt.Windows.Media.PlayTo.PlayToManager
  /* static members */
  object PlayToManager {
    
    @JSGlobal("Windows.Media.PlayTo.PlayToManager.getForCurrentView")
    @js.native
    def getForCurrentView(): typingsSlinky.winrt.Windows.Media.PlayTo.PlayToManager = js.native
    
    @JSGlobal("Windows.Media.PlayTo.PlayToManager.showPlayToUI")
    @js.native
    def showPlayToUI(): Unit = js.native
  }
  
  @JSGlobal("Windows.Media.PlayTo.PlayToReceiver")
  @js.native
  class PlayToReceiver ()
    extends typingsSlinky.winrt.Windows.Media.PlayTo.PlayToReceiver
  
  @JSGlobal("Windows.Media.PlayTo.PlayToSource")
  @js.native
  class PlayToSource ()
    extends typingsSlinky.winrt.Windows.Media.PlayTo.PlayToSource
  
  @JSGlobal("Windows.Media.PlayTo.PlayToSourceDeferral")
  @js.native
  class PlayToSourceDeferral ()
    extends typingsSlinky.winrt.Windows.Media.PlayTo.PlayToSourceDeferral
  
  @JSGlobal("Windows.Media.PlayTo.PlayToSourceRequest")
  @js.native
  class PlayToSourceRequest ()
    extends typingsSlinky.winrt.Windows.Media.PlayTo.PlayToSourceRequest
  
  @JSGlobal("Windows.Media.PlayTo.PlayToSourceRequestedEventArgs")
  @js.native
  class PlayToSourceRequestedEventArgs ()
    extends typingsSlinky.winrt.Windows.Media.PlayTo.PlayToSourceRequestedEventArgs
  
  @JSGlobal("Windows.Media.PlayTo.PlayToSourceSelectedEventArgs")
  @js.native
  class PlayToSourceSelectedEventArgs ()
    extends typingsSlinky.winrt.Windows.Media.PlayTo.PlayToSourceSelectedEventArgs
  
  @JSGlobal("Windows.Media.PlayTo.PlaybackRateChangeRequestedEventArgs")
  @js.native
  class PlaybackRateChangeRequestedEventArgs ()
    extends typingsSlinky.winrt.Windows.Media.PlayTo.PlaybackRateChangeRequestedEventArgs
  
  @JSGlobal("Windows.Media.PlayTo.SourceChangeRequestedEventArgs")
  @js.native
  class SourceChangeRequestedEventArgs ()
    extends typingsSlinky.winrt.Windows.Media.PlayTo.SourceChangeRequestedEventArgs
  
  @JSGlobal("Windows.Media.PlayTo.VolumeChangeRequestedEventArgs")
  @js.native
  class VolumeChangeRequestedEventArgs ()
    extends typingsSlinky.winrt.Windows.Media.PlayTo.VolumeChangeRequestedEventArgs
}
