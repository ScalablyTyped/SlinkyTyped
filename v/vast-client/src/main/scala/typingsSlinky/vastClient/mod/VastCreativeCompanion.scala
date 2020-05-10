package typingsSlinky.vastClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VastCreativeCompanion extends VastCreative {
  var variations: js.Array[VastCompanionAd] = js.native
}

object VastCreativeCompanion {
  @scala.inline
  def apply(trackingEvents: VastTrackingEvents, `type`: String, variations: js.Array[VastCompanionAd]): VastCreativeCompanion = {
    val __obj = js.Dynamic.literal(trackingEvents = trackingEvents.asInstanceOf[js.Any], variations = variations.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VastCreativeCompanion]
  }
  @scala.inline
  implicit class VastCreativeCompanionOps[Self <: VastCreativeCompanion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVariations(value: js.Array[VastCompanionAd]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variations")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

