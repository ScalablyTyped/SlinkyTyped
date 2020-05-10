package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConstrainVideoFacingModeParameters extends js.Object {
  var exact: js.UndefOr[VideoFacingModeEnum | js.Array[VideoFacingModeEnum]] = js.native
  var ideal: js.UndefOr[VideoFacingModeEnum | js.Array[VideoFacingModeEnum]] = js.native
}

object ConstrainVideoFacingModeParameters {
  @scala.inline
  def apply(): ConstrainVideoFacingModeParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConstrainVideoFacingModeParameters]
  }
  @scala.inline
  implicit class ConstrainVideoFacingModeParametersOps[Self <: ConstrainVideoFacingModeParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExact(value: VideoFacingModeEnum | js.Array[VideoFacingModeEnum]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exact")(js.undefined)
        ret
    }
    @scala.inline
    def withIdeal(value: VideoFacingModeEnum | js.Array[VideoFacingModeEnum]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ideal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdeal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ideal")(js.undefined)
        ret
    }
  }
  
}

