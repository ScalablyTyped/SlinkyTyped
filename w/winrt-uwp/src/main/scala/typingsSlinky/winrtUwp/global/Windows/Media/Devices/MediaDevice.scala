package typingsSlinky.winrtUwp.global.Windows.Media.Devices

import typingsSlinky.winrtUwp.Windows.Foundation.EventHandler
import typingsSlinky.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsSlinky.winrtUwp.Windows.WinRTEvent
import typingsSlinky.winrtUwp.winrtUwpStrings.defaultaudiocapturedevicechanged
import typingsSlinky.winrtUwp.winrtUwpStrings.defaultaudiorenderdevicechanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides methods used to select devices for capturing and rendering audio, and for capturing video. */
@JSGlobal("Windows.Media.Devices.MediaDevice")
@js.native
abstract class MediaDevice ()
  extends typingsSlinky.winrtUwp.Windows.Media.Devices.MediaDevice
/* static members */
@JSGlobal("Windows.Media.Devices.MediaDevice")
@js.native
object MediaDevice extends js.Object {
  
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_defaultaudiocapturedevicechanged(
    `type`: defaultaudiocapturedevicechanged,
    listener: TypedEventHandler[
      _, 
      typingsSlinky.winrtUwp.Windows.Media.Devices.DefaultAudioCaptureDeviceChangedEventArgs
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_defaultaudiorenderdevicechanged(
    `type`: defaultaudiorenderdevicechanged,
    listener: TypedEventHandler[
      _, 
      typingsSlinky.winrtUwp.Windows.Media.Devices.DefaultAudioRenderDeviceChangedEventArgs
    ]
  ): Unit = js.native
  
  /**
    * Returns the identifier string of a device for capturing audio.
    * @return The identifier string of the audio capture device.
    */
  def getAudioCaptureSelector(): String = js.native
  
  /**
    * Returns the identifier string of a device for rendering audio.
    * @return The identifier string of the audio rendering device.
    */
  def getAudioRenderSelector(): String = js.native
  
  /**
    * Returns the identifier string of the default device for capturing audio in the specified role.
    * @param role The specified audio device role (console, media, or communications).
    * @return The identifier string of the default device.
    */
  def getDefaultAudioCaptureId(role: typingsSlinky.winrtUwp.Windows.Media.Devices.AudioDeviceRole): String = js.native
  
  /**
    * Returns the identifier string of the default device for rendering audio in the specified role.
    * @param role The specified audio device role (console, media, or communications).
    * @return The identifier string of the default device.
    */
  def getDefaultAudioRenderId(role: typingsSlinky.winrtUwp.Windows.Media.Devices.AudioDeviceRole): String = js.native
  
  /**
    * Returns the identifier string of a device for capturing video.
    * @return The identifier string of the video capture device.
    */
  def getVideoCaptureSelector(): String = js.native
  
  /** Raised when the default audio capture device is changed. */
  def ondefaultaudiocapturedevicechanged(
    ev: typingsSlinky.winrtUwp.Windows.Media.Devices.DefaultAudioCaptureDeviceChangedEventArgs with WinRTEvent[_]
  ): Unit = js.native
  /** Raised when the default audio capture device is changed. */
  @JSName("ondefaultaudiocapturedevicechanged")
  var ondefaultaudiocapturedevicechanged_Original: TypedEventHandler[
    _, 
    typingsSlinky.winrtUwp.Windows.Media.Devices.DefaultAudioCaptureDeviceChangedEventArgs
  ] = js.native
  
  /** Raised when the default audio render device is changed. */
  def ondefaultaudiorenderdevicechanged(
    ev: typingsSlinky.winrtUwp.Windows.Media.Devices.DefaultAudioRenderDeviceChangedEventArgs with WinRTEvent[_]
  ): Unit = js.native
  /** Raised when the default audio render device is changed. */
  @JSName("ondefaultaudiorenderdevicechanged")
  var ondefaultaudiorenderdevicechanged_Original: TypedEventHandler[
    _, 
    typingsSlinky.winrtUwp.Windows.Media.Devices.DefaultAudioRenderDeviceChangedEventArgs
  ] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_defaultaudiocapturedevicechanged(
    `type`: defaultaudiocapturedevicechanged,
    listener: TypedEventHandler[
      _, 
      typingsSlinky.winrtUwp.Windows.Media.Devices.DefaultAudioCaptureDeviceChangedEventArgs
    ]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_defaultaudiorenderdevicechanged(
    `type`: defaultaudiorenderdevicechanged,
    listener: TypedEventHandler[
      _, 
      typingsSlinky.winrtUwp.Windows.Media.Devices.DefaultAudioRenderDeviceChangedEventArgs
    ]
  ): Unit = js.native
}
