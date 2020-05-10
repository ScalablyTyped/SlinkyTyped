package typingsSlinky.winrt.Windows.Media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVideoEffectsStatics extends js.Object {
  var videoStabilization: String = js.native
}

object IVideoEffectsStatics {
  @scala.inline
  def apply(videoStabilization: String): IVideoEffectsStatics = {
    val __obj = js.Dynamic.literal(videoStabilization = videoStabilization.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVideoEffectsStatics]
  }
  @scala.inline
  implicit class IVideoEffectsStaticsOps[Self <: IVideoEffectsStatics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVideoStabilization(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoStabilization")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

