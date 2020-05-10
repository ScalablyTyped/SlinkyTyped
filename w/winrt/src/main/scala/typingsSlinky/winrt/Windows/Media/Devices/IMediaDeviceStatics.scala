package typingsSlinky.winrt.Windows.Media.Devices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMediaDeviceStatics extends js.Object {
  var ondefaultaudiocapturedevicechanged: js.Any = js.native
  var ondefaultaudiorenderdevicechanged: js.Any = js.native
  def getAudioCaptureSelector(): String = js.native
  def getAudioRenderSelector(): String = js.native
  def getDefaultAudioCaptureId(role: AudioDeviceRole): String = js.native
  def getDefaultAudioRenderId(role: AudioDeviceRole): String = js.native
  def getVideoCaptureSelector(): String = js.native
}

object IMediaDeviceStatics {
  @scala.inline
  def apply(
    getAudioCaptureSelector: () => String,
    getAudioRenderSelector: () => String,
    getDefaultAudioCaptureId: AudioDeviceRole => String,
    getDefaultAudioRenderId: AudioDeviceRole => String,
    getVideoCaptureSelector: () => String,
    ondefaultaudiocapturedevicechanged: js.Any,
    ondefaultaudiorenderdevicechanged: js.Any
  ): IMediaDeviceStatics = {
    val __obj = js.Dynamic.literal(getAudioCaptureSelector = js.Any.fromFunction0(getAudioCaptureSelector), getAudioRenderSelector = js.Any.fromFunction0(getAudioRenderSelector), getDefaultAudioCaptureId = js.Any.fromFunction1(getDefaultAudioCaptureId), getDefaultAudioRenderId = js.Any.fromFunction1(getDefaultAudioRenderId), getVideoCaptureSelector = js.Any.fromFunction0(getVideoCaptureSelector), ondefaultaudiocapturedevicechanged = ondefaultaudiocapturedevicechanged.asInstanceOf[js.Any], ondefaultaudiorenderdevicechanged = ondefaultaudiorenderdevicechanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMediaDeviceStatics]
  }
  @scala.inline
  implicit class IMediaDeviceStaticsOps[Self <: IMediaDeviceStatics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetAudioCaptureSelector(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAudioCaptureSelector")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetAudioRenderSelector(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAudioRenderSelector")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDefaultAudioCaptureId(value: AudioDeviceRole => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDefaultAudioCaptureId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetDefaultAudioRenderId(value: AudioDeviceRole => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDefaultAudioRenderId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetVideoCaptureSelector(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVideoCaptureSelector")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOndefaultaudiocapturedevicechanged(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondefaultaudiocapturedevicechanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOndefaultaudiorenderdevicechanged(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondefaultaudiorenderdevicechanged")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

