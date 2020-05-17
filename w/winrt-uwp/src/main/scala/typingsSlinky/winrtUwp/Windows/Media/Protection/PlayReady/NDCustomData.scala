package typingsSlinky.winrtUwp.Windows.Media.Protection.PlayReady

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the custom data for one of the following PlayReady-ND messages: Registration Challenge, Registration Response, License Fetch Challenge, or License Fetch Response. */
@js.native
trait NDCustomData extends js.Object {
  /** Gets the custom data. */
  var customData: Double = js.native
  /** Gets the 16-byte type identifier for the custom data. */
  var customDataTypeID: Double = js.native
}

object NDCustomData {
  @scala.inline
  def apply(customData: Double, customDataTypeID: Double): NDCustomData = {
    val __obj = js.Dynamic.literal(customData = customData.asInstanceOf[js.Any], customDataTypeID = customDataTypeID.asInstanceOf[js.Any])
    __obj.asInstanceOf[NDCustomData]
  }
  @scala.inline
  implicit class NDCustomDataOps[Self <: NDCustomData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomData(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomDataTypeID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customDataTypeID")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

