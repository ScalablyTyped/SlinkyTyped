package typingsSlinky.senchaTouch.Ext.device.capture

import typingsSlinky.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISimulator extends IBase {
  /** [Method] Start the audio recorder application and return information about captured audio clip file s
  		* @param config Object The configuration object to be passed:
  		*/
  var captureAudio: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Start the video recorder application and return information about captured video clip file s
  		* @param config Object The configuration object to be passed:
  		*/
  var captureVideo: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
}

object ISimulator {
  @scala.inline
  def apply(): ISimulator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISimulator]
  }
  @scala.inline
  implicit class ISimulatorOps[Self <: ISimulator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaptureAudio(value: /* config */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captureAudio")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCaptureAudio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captureAudio")(js.undefined)
        ret
    }
    @scala.inline
    def withCaptureVideo(value: /* config */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captureVideo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCaptureVideo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captureVideo")(js.undefined)
        ret
    }
  }
  
}

