package typingsSlinky.vastClient.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VastTrackingEvents
  extends /* key */ StringDictionary[js.Array[String]] {
  var complete: js.Array[String] = js.native
  var firstQuartile: js.Array[String] = js.native
  var midpoint: js.Array[String] = js.native
  var thirdQuartile: js.Array[String] = js.native
}

object VastTrackingEvents {
  @scala.inline
  def apply(
    complete: js.Array[String],
    firstQuartile: js.Array[String],
    midpoint: js.Array[String],
    thirdQuartile: js.Array[String]
  ): VastTrackingEvents = {
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], firstQuartile = firstQuartile.asInstanceOf[js.Any], midpoint = midpoint.asInstanceOf[js.Any], thirdQuartile = thirdQuartile.asInstanceOf[js.Any])
    __obj.asInstanceOf[VastTrackingEvents]
  }
  @scala.inline
  implicit class VastTrackingEventsOps[Self <: VastTrackingEvents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComplete(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstQuartile(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstQuartile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMidpoint(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("midpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThirdQuartile(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thirdQuartile")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

