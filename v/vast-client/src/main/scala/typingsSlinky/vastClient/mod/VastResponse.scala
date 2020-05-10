package typingsSlinky.vastClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VastResponse extends js.Object {
  var ads: js.Array[VastAd] = js.native
  var errorURLTemplates: js.Array[String] = js.native
}

object VastResponse {
  @scala.inline
  def apply(ads: js.Array[VastAd], errorURLTemplates: js.Array[String]): VastResponse = {
    val __obj = js.Dynamic.literal(ads = ads.asInstanceOf[js.Any], errorURLTemplates = errorURLTemplates.asInstanceOf[js.Any])
    __obj.asInstanceOf[VastResponse]
  }
  @scala.inline
  implicit class VastResponseOps[Self <: VastResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAds(value: js.Array[VastAd]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorURLTemplates(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorURLTemplates")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

