package typingsSlinky.winrtUwp.global.Windows.Media

import typingsSlinky.winrtUwp.Windows.Devices.Enumeration.DeviceInformation
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsSlinky.winrtUwp.Windows.Media.Casting.CastingPlaybackTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This namespace lets an app to cast or send particular media content to a second device and is meant to be device-protocol agnostic. Today, the APIs work with Miracast, DLNA, and Bluetooth, and support images, audio, and video from HTML Tags, ImageElement and MediaElement. */
@JSGlobal("Windows.Media.Casting")
@js.native
object Casting extends js.Object {
  
  /** Represents the actual connection with a casting device. */
  @js.native
  abstract class CastingConnection ()
    extends typingsSlinky.winrtUwp.Windows.Media.Casting.CastingConnection
  
  /** Represents arguments for the ErrorOccurred event from the CastingConnection */
  @js.native
  abstract class CastingConnectionErrorOccurredEventArgs ()
    extends typingsSlinky.winrtUwp.Windows.Media.Casting.CastingConnectionErrorOccurredEventArgs
  
  /** Indicates the error status when starting or ending a casting connection. */
  @js.native
  object CastingConnectionErrorStatus extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.Media.Casting.CastingConnectionErrorStatus with Double
      ] = js.native
    
    /* 1 */ val deviceDidNotRespond: typingsSlinky.winrtUwp.Windows.Media.Casting.CastingConnectionErrorStatus.deviceDidNotRespond with Double = js.native
    
    /* 2 */ val deviceError: typingsSlinky.winrtUwp.Windows.Media.Casting.CastingConnectionErrorStatus.deviceError with Double = js.native
    
    /* 3 */ val deviceLocked: typingsSlinky.winrtUwp.Windows.Media.Casting.CastingConnectionErrorStatus.deviceLocked with Double = js.native
    
    /* 5 */ val invalidCastingSource: typingsSlinky.winrtUwp.Windows.Media.Casting.CastingConnectionErrorStatus.invalidCastingSource with Double = js.native
    
    /* 4 */ val protectedPlaybackFailed: typingsSlinky.winrtUwp.Windows.Media.Casting.CastingConnectionErrorStatus.protectedPlaybackFailed with Double = js.native
    
    /* 0 */ val succeeded: typingsSlinky.winrtUwp.Windows.Media.Casting.CastingConnectionErrorStatus.succeeded with Double = js.native
    
    /* 6 */ val unknown: typingsSlinky.winrtUwp.Windows.Media.Casting.CastingConnectionErrorStatus.unknown with Double = js.native
  }
  
  /** Indicates the current state of a casting connection. Rendering is used when actively playing content. */
  @js.native
  object CastingConnectionState extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrtUwp.Windows.Media.Casting.CastingConnectionState with Double] = js.native
    
    /* 1 */ val connected: typingsSlinky.winrtUwp.Windows.Media.Casting.CastingConnectionState.connected with Double = js.native
    
    /* 4 */ val connecting: typingsSlinky.winrtUwp.Windows.Media.Casting.CastingConnectionState.connecting with Double = js.native
    
    /* 0 */ val disconnected: typingsSlinky.winrtUwp.Windows.Media.Casting.CastingConnectionState.disconnected with Double = js.native
    
    /* 3 */ val disconnecting: typingsSlinky.winrtUwp.Windows.Media.Casting.CastingConnectionState.disconnecting with Double = js.native
    
    /* 2 */ val rendering: typingsSlinky.winrtUwp.Windows.Media.Casting.CastingConnectionState.rendering with Double = js.native
  }
  
  /** Represents a physical device that is capable of supporting casting connections and rendering media content sent to it. */
  @js.native
  abstract class CastingDevice ()
    extends typingsSlinky.winrtUwp.Windows.Media.Casting.CastingDevice
  /* static members */
  @js.native
  object CastingDevice extends js.Object {
    
    /**
      * Indicates whether the given device (a DeviceInformation object) supports casting.
      * @param device The device you want to know about.
      * @return True if the device supports casting; false otherwise.
      */
    def deviceInfoSupportsCastingAsync(device: DeviceInformation): IPromiseWithIAsyncOperation[Boolean] = js.native
    
    /**
      * Gets a CastingDevice object for a given a device ID (acquired from a query using the Windows.Devices.Enumeration APIs).
      * @param value The device ID.
      * @return The object representing the casting device.
      */
    def fromIdAsync(value: String): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.Media.Casting.CastingDevice] = js.native
    
    /**
      * Gets an AQS filter string to be used with the Windows.Devices.Enumeration APIs for a given CastingPlaybackTypes .
      * @param type The casting playback type.
      * @return The AQS filter string.
      */
    def getDeviceSelector(`type`: CastingPlaybackTypes): String = js.native
    
    /**
      * Gets an AQS filter string to be used with the Windows.Devices.Enumeration APIs for a given CastingSource .
      * @param castingSource The casting source.
      * @return The AQS filter string.
      */
    def getDeviceSelectorFromCastingSourceAsync(castingSource: typingsSlinky.winrtUwp.Windows.Media.Casting.CastingSource): IPromiseWithIAsyncOperation[String] = js.native
  }
  
  /** Represents a device picker that contains a list of casting devices for the user to choose from. */
  @js.native
  /** Creates a CastingDevicePicker object. */
  class CastingDevicePicker ()
    extends typingsSlinky.winrtUwp.Windows.Media.Casting.CastingDevicePicker
  
  /** Represents the filter used to determine which devices to show in a casting device picker UI. The filter parameters are OR-ed together to build the resulting filter. In other words, if SupportsAudio and SupportsVideo are both true, the picker will display Audio-only devices, video-only devices, and audio/video devices. */
  @js.native
  abstract class CastingDevicePickerFilter ()
    extends typingsSlinky.winrtUwp.Windows.Media.Casting.CastingDevicePickerFilter
  
  /** Represents the event arguments for the CastingDeviceSelected event on the CastingDevicePicker object. */
  @js.native
  abstract class CastingDeviceSelectedEventArgs ()
    extends typingsSlinky.winrtUwp.Windows.Media.Casting.CastingDeviceSelectedEventArgs
  
  /** Indicates the capabilities of a particular casting device. */
  @js.native
  object CastingPlaybackTypes extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrtUwp.Windows.Media.Casting.CastingPlaybackTypes with Double] = js.native
    
    /* 1 */ val audio: typingsSlinky.winrtUwp.Windows.Media.Casting.CastingPlaybackTypes.audio with Double = js.native
    
    /* 0 */ val none: typingsSlinky.winrtUwp.Windows.Media.Casting.CastingPlaybackTypes.none with Double = js.native
    
    /* 3 */ val picture: typingsSlinky.winrtUwp.Windows.Media.Casting.CastingPlaybackTypes.picture with Double = js.native
    
    /* 2 */ val video: typingsSlinky.winrtUwp.Windows.Media.Casting.CastingPlaybackTypes.video with Double = js.native
  }
  
  /** Represents the media content that can be sent to another device. */
  @js.native
  abstract class CastingSource ()
    extends typingsSlinky.winrtUwp.Windows.Media.Casting.CastingSource
}
