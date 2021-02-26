package typingsSlinky.winrtUwp.global.Windows.Media.Capture

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides functionality for capturing photos, audio, and videos from a capture device, such as a webcam. */
@JSGlobal("Windows.Media.Capture.MediaCapture")
@js.native
/** Creates a new instance of the MediaCapture object. */
class MediaCapture ()
  extends typingsSlinky.winrtUwp.Windows.Media.Capture.MediaCapture
object MediaCapture {
  
  /**
    * Retrieves the list of all video profiles supported by the specified video capture device.
    * @param videoDeviceId The identifier of the video device for which supported video profiles are queried. For information on getting the video device ID, see DeviceInformation::FindAllAsync .
    * @return The list of video profiles supported by the specified video capture device.
    */
  /* static member */
  @JSGlobal("Windows.Media.Capture.MediaCapture.findAllVideoProfiles")
  @js.native
  def findAllVideoProfiles(videoDeviceId: String): IVectorView[typingsSlinky.winrtUwp.Windows.Media.Capture.MediaCaptureVideoProfile] = js.native
  
  /**
    * Retrieves the list of video profiles supported by the specified video capture device that can be used while another profile is used on a different capture device.
    * @param videoDeviceId The identifier of the video device for which supported video profiles are queried. For information on getting the video device ID, see DeviceInformation::FindAllAsync .
    * @return The list of video profiles supported by the specified video capture device that support concurrency.
    */
  /* static member */
  @JSGlobal("Windows.Media.Capture.MediaCapture.findConcurrentProfiles")
  @js.native
  def findConcurrentProfiles(videoDeviceId: String): IVectorView[typingsSlinky.winrtUwp.Windows.Media.Capture.MediaCaptureVideoProfile] = js.native
  
  /**
    * Retrieves the list of all video profiles supported by the specified video capture device that match the specified KnownVideoProfile value.
    * @param videoDeviceId The identifier of the video device for which supported video profiles are queried. For information on getting the video device ID, see DeviceInformation::FindAllAsync .
    * @param name A value specifying one of the profile names known by the system.
    * @return The list of video profiles supported by the specified video capture device that match the specified known profile name.
    */
  /* static member */
  @JSGlobal("Windows.Media.Capture.MediaCapture.findKnownVideoProfiles")
  @js.native
  def findKnownVideoProfiles(videoDeviceId: String, name: typingsSlinky.winrtUwp.Windows.Media.Capture.KnownVideoProfile): IVectorView[typingsSlinky.winrtUwp.Windows.Media.Capture.MediaCaptureVideoProfile] = js.native
  
  /**
    * Gets a boolean value indicating whether video profiles are supported by the specified video capture device.
    * @param videoDeviceId The identifier of the video device for which supported video profile support is queried. For information on getting the video device ID, see DeviceInformation::FindAllAsync .
    * @return True if video profiles are supported; otherwise, false.
    */
  /* static member */
  @JSGlobal("Windows.Media.Capture.MediaCapture.isVideoProfileSupported")
  @js.native
  def isVideoProfileSupported(videoDeviceId: String): Boolean = js.native
}
