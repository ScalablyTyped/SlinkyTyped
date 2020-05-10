package typingsSlinky.xrm.Xrm.Device

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for Xrm.Device.getCurrentPosition response
  */
@js.native
trait GetCurrentPositionResponse extends js.Object {
  /**
    * Contains a set of geographic coordinates along with associated accuracy as well as a set of other optional attributes such as altitude and speed.
    */
  var coords: js.Any = js.native
  /**
    * Represents the time when the object was acquired and is represented as DOMTimeStamp.
    */
  var timestamp: Double = js.native
}

object GetCurrentPositionResponse {
  @scala.inline
  def apply(coords: js.Any, timestamp: Double): GetCurrentPositionResponse = {
    val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCurrentPositionResponse]
  }
  @scala.inline
  implicit class GetCurrentPositionResponseOps[Self <: GetCurrentPositionResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoords(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

