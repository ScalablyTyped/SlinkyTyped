package typingsSlinky.winrtUwp.global.Windows.Media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Supports the streaming of audio, video, and images to remote devices. */
object PlayTo {
  
  /** Provides information about the CurrentTimeChangeRequested event. */
  @JSGlobal("Windows.Media.PlayTo.CurrentTimeChangeRequestedEventArgs")
  @js.native
  abstract class CurrentTimeChangeRequestedEventArgs ()
    extends typingsSlinky.winrtUwp.Windows.Media.PlayTo.CurrentTimeChangeRequestedEventArgs
  
  /** Provides information about the MuteChangeRequested event. */
  @JSGlobal("Windows.Media.PlayTo.MuteChangeRequestedEventArgs")
  @js.native
  abstract class MuteChangeRequestedEventArgs ()
    extends typingsSlinky.winrtUwp.Windows.Media.PlayTo.MuteChangeRequestedEventArgs
  
  /** Provides information about a Play To connection. */
  @JSGlobal("Windows.Media.PlayTo.PlayToConnection")
  @js.native
  abstract class PlayToConnection ()
    extends typingsSlinky.winrtUwp.Windows.Media.PlayTo.PlayToConnection
  
  /** Describes an error on a Play To connection. */
  @JSGlobal("Windows.Media.PlayTo.PlayToConnectionError")
  @js.native
  object PlayToConnectionError extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrtUwp.Windows.Media.PlayTo.PlayToConnectionError with Double] = js.native
    
    /* 2 */ val deviceError: typingsSlinky.winrtUwp.Windows.Media.PlayTo.PlayToConnectionError.deviceError with Double = js.native
    
    /* 3 */ val deviceLocked: typingsSlinky.winrtUwp.Windows.Media.PlayTo.PlayToConnectionError.deviceLocked with Double = js.native
    
    /* 1 */ val deviceNotResponding: typingsSlinky.winrtUwp.Windows.Media.PlayTo.PlayToConnectionError.deviceNotResponding with Double = js.native
    
    /* 0 */ val none: typingsSlinky.winrtUwp.Windows.Media.PlayTo.PlayToConnectionError.none with Double = js.native
    
    /* 4 */ val protectedPlaybackFailed: typingsSlinky.winrtUwp.Windows.Media.PlayTo.PlayToConnectionError.protectedPlaybackFailed with Double = js.native
  }
  
  /** Provides information about the Error event. */
  @JSGlobal("Windows.Media.PlayTo.PlayToConnectionErrorEventArgs")
  @js.native
  abstract class PlayToConnectionErrorEventArgs ()
    extends typingsSlinky.winrtUwp.Windows.Media.PlayTo.PlayToConnectionErrorEventArgs
  
  /** Describes the status of a Play To connection. */
  @JSGlobal("Windows.Media.PlayTo.PlayToConnectionState")
  @js.native
  object PlayToConnectionState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrtUwp.Windows.Media.PlayTo.PlayToConnectionState with Double] = js.native
    
    /* 1 */ val connected: typingsSlinky.winrtUwp.Windows.Media.PlayTo.PlayToConnectionState.connected with Double = js.native
    
    /* 0 */ val disconnected: typingsSlinky.winrtUwp.Windows.Media.PlayTo.PlayToConnectionState.disconnected with Double = js.native
    
    /* 2 */ val rendering: typingsSlinky.winrtUwp.Windows.Media.PlayTo.PlayToConnectionState.rendering with Double = js.native
  }
  
  /** Provides information about the StateChanged event. */
  @JSGlobal("Windows.Media.PlayTo.PlayToConnectionStateChangedEventArgs")
  @js.native
  abstract class PlayToConnectionStateChangedEventArgs ()
    extends typingsSlinky.winrtUwp.Windows.Media.PlayTo.PlayToConnectionStateChangedEventArgs
  
  /** Provides information about the Transferred event. */
  @JSGlobal("Windows.Media.PlayTo.PlayToConnectionTransferredEventArgs")
  @js.native
  abstract class PlayToConnectionTransferredEventArgs ()
    extends typingsSlinky.winrtUwp.Windows.Media.PlayTo.PlayToConnectionTransferredEventArgs
  
  /** Provides access to Play To capabilities. */
  @JSGlobal("Windows.Media.PlayTo.PlayToManager")
  @js.native
  abstract class PlayToManager ()
    extends typingsSlinky.winrtUwp.Windows.Media.PlayTo.PlayToManager
  object PlayToManager {
    
    /**
      * Gets the Play To manager for the current view.
      * @return The Play To manager for the current view.
      */
    /* static member */
    @JSGlobal("Windows.Media.PlayTo.PlayToManager.getForCurrentView")
    @js.native
    def getForCurrentView(): typingsSlinky.winrtUwp.Windows.Media.PlayTo.PlayToManager = js.native
    
    /** Displays the Play To UI. */
    /* static member */
    @JSGlobal("Windows.Media.PlayTo.PlayToManager.showPlayToUI")
    @js.native
    def showPlayToUI(): Unit = js.native
  }
  
  /** Represents a Play To target. */
  @JSGlobal("Windows.Media.PlayTo.PlayToReceiver")
  @js.native
  /** Creates a new instance of a Play To receiver. */
  class PlayToReceiver ()
    extends typingsSlinky.winrtUwp.Windows.Media.PlayTo.PlayToReceiver
  
  /** Represents a media element to connect to a Play To target. */
  @JSGlobal("Windows.Media.PlayTo.PlayToSource")
  @js.native
  abstract class PlayToSource ()
    extends typingsSlinky.winrtUwp.Windows.Media.PlayTo.PlayToSource
  
  /** Represents a deferred operation when you're supplying a source media element for Play To. */
  @JSGlobal("Windows.Media.PlayTo.PlayToSourceDeferral")
  @js.native
  abstract class PlayToSourceDeferral ()
    extends typingsSlinky.winrtUwp.Windows.Media.PlayTo.PlayToSourceDeferral
  
  /** Represents a request to connect a media element with a Play To target. */
  @JSGlobal("Windows.Media.PlayTo.PlayToSourceRequest")
  @js.native
  abstract class PlayToSourceRequest ()
    extends typingsSlinky.winrtUwp.Windows.Media.PlayTo.PlayToSourceRequest
  
  /** Provides information about the SourceRequested event. */
  @JSGlobal("Windows.Media.PlayTo.PlayToSourceRequestedEventArgs")
  @js.native
  abstract class PlayToSourceRequestedEventArgs ()
    extends typingsSlinky.winrtUwp.Windows.Media.PlayTo.PlayToSourceRequestedEventArgs
  
  /** Provides information about the SourceSelected event. */
  @JSGlobal("Windows.Media.PlayTo.PlayToSourceSelectedEventArgs")
  @js.native
  abstract class PlayToSourceSelectedEventArgs ()
    extends typingsSlinky.winrtUwp.Windows.Media.PlayTo.PlayToSourceSelectedEventArgs
  
  /** Provides information about the PlaybackRateChangeRequested event. */
  @JSGlobal("Windows.Media.PlayTo.PlaybackRateChangeRequestedEventArgs")
  @js.native
  abstract class PlaybackRateChangeRequestedEventArgs ()
    extends typingsSlinky.winrtUwp.Windows.Media.PlayTo.PlaybackRateChangeRequestedEventArgs
  
  /** Provides information about the SourceChangeRequested event. */
  @JSGlobal("Windows.Media.PlayTo.SourceChangeRequestedEventArgs")
  @js.native
  abstract class SourceChangeRequestedEventArgs ()
    extends typingsSlinky.winrtUwp.Windows.Media.PlayTo.SourceChangeRequestedEventArgs
  
  /** Provides information about the VolumeChangeRequested event. */
  @JSGlobal("Windows.Media.PlayTo.VolumeChangeRequestedEventArgs")
  @js.native
  abstract class VolumeChangeRequestedEventArgs ()
    extends typingsSlinky.winrtUwp.Windows.Media.PlayTo.VolumeChangeRequestedEventArgs
}
