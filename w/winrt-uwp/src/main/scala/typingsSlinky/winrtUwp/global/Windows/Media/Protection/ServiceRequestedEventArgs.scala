package typingsSlinky.winrtUwp.global.Windows.Media.Protection

import typingsSlinky.winrtUwp.Windows.Media.Playback.MediaPlaybackItem
import typingsSlinky.winrtUwp.Windows.Media.Protection.IMediaProtectionServiceRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains event data for a MediaProtectionManager object when a service is requested. */
@JSGlobal("Windows.Media.Protection.ServiceRequestedEventArgs")
@js.native
abstract class ServiceRequestedEventArgs ()
  extends typingsSlinky.winrtUwp.Windows.Media.Protection.ServiceRequestedEventArgs {
  /** Returns an indication of the completion of the service request. */
  /* CompleteClass */
  override var completion: typingsSlinky.winrtUwp.Windows.Media.Protection.MediaProtectionServiceCompletion = js.native
  /** Gets the MediaPlaybackItem associated with the service request. */
  /* CompleteClass */
  override var mediaPlaybackItem: MediaPlaybackItem = js.native
  /** Contains the service request. */
  /* CompleteClass */
  override var request: IMediaProtectionServiceRequest = js.native
}

