package typingsSlinky.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopRecordAudioOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("success")
  var success_StopRecordAudioOptions: js.UndefOr[js.Function1[/* res */ TempFileResponse, Unit]] = js.native
}

object StopRecordAudioOptions {
  @scala.inline
  def apply(): StopRecordAudioOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopRecordAudioOptions]
  }
  @scala.inline
  implicit class StopRecordAudioOptionsOps[Self <: StopRecordAudioOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSuccess(value: /* res */ TempFileResponse => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.undefined)
        ret
    }
  }
  
}

