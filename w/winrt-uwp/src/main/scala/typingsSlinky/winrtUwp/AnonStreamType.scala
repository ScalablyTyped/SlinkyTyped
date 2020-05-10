package typingsSlinky.winrtUwp

import typingsSlinky.winrtUwp.Windows.Media.Protection.PlayReady.NDMediaStreamType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonStreamType extends js.Object {
  /** The stream identifier for the media stream. */ var returnValue: Double = js.native
  /** The type of the media stream. This type can be either Audio or Video. */ var streamType: NDMediaStreamType = js.native
}

object AnonStreamType {
  @scala.inline
  def apply(returnValue: Double, streamType: NDMediaStreamType): AnonStreamType = {
    val __obj = js.Dynamic.literal(returnValue = returnValue.asInstanceOf[js.Any], streamType = streamType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStreamType]
  }
  @scala.inline
  implicit class AnonStreamTypeOps[Self <: AnonStreamType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReturnValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStreamType(value: NDMediaStreamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

