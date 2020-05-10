package typingsSlinky.winrt.Windows.Media.PlayTo

import typingsSlinky.winrt.Windows.Foundation.Collections.IPropertySet
import typingsSlinky.winrt.Windows.Foundation.IAsyncAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPlayToReceiver extends js.Object {
  var friendlyName: String = js.native
  var oncurrenttimechangerequested: js.Any = js.native
  var onmutechangerequested: js.Any = js.native
  var onpauserequested: js.Any = js.native
  var onplaybackratechangerequested: js.Any = js.native
  var onplayrequested: js.Any = js.native
  var onsourcechangerequested: js.Any = js.native
  var onstoprequested: js.Any = js.native
  var ontimeupdaterequested: js.Any = js.native
  var onvolumechangerequested: js.Any = js.native
  var properties: IPropertySet = js.native
  var supportsAudio: Boolean = js.native
  var supportsImage: Boolean = js.native
  var supportsVideo: Boolean = js.native
  def notifyDurationChange(duration: Double): Unit = js.native
  def notifyEnded(): Unit = js.native
  def notifyError(): Unit = js.native
  def notifyLoadedMetadata(): Unit = js.native
  def notifyPaused(): Unit = js.native
  def notifyPlaying(): Unit = js.native
  def notifyRateChange(rate: Double): Unit = js.native
  def notifySeeked(): Unit = js.native
  def notifySeeking(): Unit = js.native
  def notifyStopped(): Unit = js.native
  def notifyTimeUpdate(currentTime: Double): Unit = js.native
  def notifyVolumeChange(volume: Double, mute: Boolean): Unit = js.native
  def startAsync(): IAsyncAction = js.native
  def stopAsync(): IAsyncAction = js.native
}

object IPlayToReceiver {
  @scala.inline
  def apply(
    friendlyName: String,
    notifyDurationChange: Double => Unit,
    notifyEnded: () => Unit,
    notifyError: () => Unit,
    notifyLoadedMetadata: () => Unit,
    notifyPaused: () => Unit,
    notifyPlaying: () => Unit,
    notifyRateChange: Double => Unit,
    notifySeeked: () => Unit,
    notifySeeking: () => Unit,
    notifyStopped: () => Unit,
    notifyTimeUpdate: Double => Unit,
    notifyVolumeChange: (Double, Boolean) => Unit,
    oncurrenttimechangerequested: js.Any,
    onmutechangerequested: js.Any,
    onpauserequested: js.Any,
    onplaybackratechangerequested: js.Any,
    onplayrequested: js.Any,
    onsourcechangerequested: js.Any,
    onstoprequested: js.Any,
    ontimeupdaterequested: js.Any,
    onvolumechangerequested: js.Any,
    properties: IPropertySet,
    startAsync: () => IAsyncAction,
    stopAsync: () => IAsyncAction,
    supportsAudio: Boolean,
    supportsImage: Boolean,
    supportsVideo: Boolean
  ): IPlayToReceiver = {
    val __obj = js.Dynamic.literal(friendlyName = friendlyName.asInstanceOf[js.Any], notifyDurationChange = js.Any.fromFunction1(notifyDurationChange), notifyEnded = js.Any.fromFunction0(notifyEnded), notifyError = js.Any.fromFunction0(notifyError), notifyLoadedMetadata = js.Any.fromFunction0(notifyLoadedMetadata), notifyPaused = js.Any.fromFunction0(notifyPaused), notifyPlaying = js.Any.fromFunction0(notifyPlaying), notifyRateChange = js.Any.fromFunction1(notifyRateChange), notifySeeked = js.Any.fromFunction0(notifySeeked), notifySeeking = js.Any.fromFunction0(notifySeeking), notifyStopped = js.Any.fromFunction0(notifyStopped), notifyTimeUpdate = js.Any.fromFunction1(notifyTimeUpdate), notifyVolumeChange = js.Any.fromFunction2(notifyVolumeChange), oncurrenttimechangerequested = oncurrenttimechangerequested.asInstanceOf[js.Any], onmutechangerequested = onmutechangerequested.asInstanceOf[js.Any], onpauserequested = onpauserequested.asInstanceOf[js.Any], onplaybackratechangerequested = onplaybackratechangerequested.asInstanceOf[js.Any], onplayrequested = onplayrequested.asInstanceOf[js.Any], onsourcechangerequested = onsourcechangerequested.asInstanceOf[js.Any], onstoprequested = onstoprequested.asInstanceOf[js.Any], ontimeupdaterequested = ontimeupdaterequested.asInstanceOf[js.Any], onvolumechangerequested = onvolumechangerequested.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], startAsync = js.Any.fromFunction0(startAsync), stopAsync = js.Any.fromFunction0(stopAsync), supportsAudio = supportsAudio.asInstanceOf[js.Any], supportsImage = supportsImage.asInstanceOf[js.Any], supportsVideo = supportsVideo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPlayToReceiver]
  }
  @scala.inline
  implicit class IPlayToReceiverOps[Self <: IPlayToReceiver] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFriendlyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("friendlyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotifyDurationChange(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyDurationChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNotifyEnded(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyEnded")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNotifyError(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyError")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNotifyLoadedMetadata(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyLoadedMetadata")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNotifyPaused(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyPaused")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNotifyPlaying(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyPlaying")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNotifyRateChange(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyRateChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNotifySeeked(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifySeeked")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNotifySeeking(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifySeeking")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNotifyStopped(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyStopped")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNotifyTimeUpdate(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyTimeUpdate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNotifyVolumeChange(value: (Double, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyVolumeChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOncurrenttimechangerequested(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oncurrenttimechangerequested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnmutechangerequested(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmutechangerequested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnpauserequested(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onpauserequested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnplaybackratechangerequested(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onplaybackratechangerequested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnplayrequested(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onplayrequested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnsourcechangerequested(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onsourcechangerequested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnstoprequested(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onstoprequested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOntimeupdaterequested(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ontimeupdaterequested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnvolumechangerequested(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onvolumechangerequested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperties(value: IPropertySet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartAsync(value: () => IAsyncAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStopAsync(value: () => IAsyncAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSupportsAudio(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsAudio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportsImage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportsVideo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsVideo")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

