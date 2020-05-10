package typingsSlinky.webrtc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaTrackSettings extends js.Object {
  //width: number;
  //height: number;
  //aspectRatio: number;
  //frameRate: number;
  //facingMode: string;
  //volume: number;
  //sampleRate: number;
  //sampleSize: number;
  //echoCancellation: boolean;
  var latency: js.UndefOr[Double] = js.native
}

object MediaTrackSettings {
  @scala.inline
  def apply(): MediaTrackSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaTrackSettings]
  }
  @scala.inline
  implicit class MediaTrackSettingsOps[Self <: MediaTrackSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLatency(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latency")(js.undefined)
        ret
    }
  }
  
}

