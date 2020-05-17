package typingsSlinky.unityWebapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnityIndicatorProperties extends js.Object {
  var count: Double = js.native
  var iconURI: String = js.native
  var onIndicatorActivated: js.Function = js.native
  var time: js.Date = js.native
}

object UnityIndicatorProperties {
  @scala.inline
  def apply(count: Double, iconURI: String, onIndicatorActivated: js.Function, time: js.Date): UnityIndicatorProperties = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], iconURI = iconURI.asInstanceOf[js.Any], onIndicatorActivated = onIndicatorActivated.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnityIndicatorProperties]
  }
  @scala.inline
  implicit class UnityIndicatorPropertiesOps[Self <: UnityIndicatorProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIconURI(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconURI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnIndicatorActivated(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIndicatorActivated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

