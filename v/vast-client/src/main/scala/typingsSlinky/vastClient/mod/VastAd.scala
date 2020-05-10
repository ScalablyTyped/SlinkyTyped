package typingsSlinky.vastClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VastAd extends js.Object {
  var advertiser: String | Null = js.native
  var creatives: js.Array[VastCreative] = js.native
  var description: String | Null = js.native
  var errorURLTemplates: js.Array[String] = js.native
  var extensions: js.Array[VastAdExtension] = js.native
  var id: String | Null = js.native
  var impressionURLTemplates: js.Array[String] = js.native
  var pricing: String | Null = js.native
  var sequence: String | Null = js.native
  var survey: String | Null = js.native
  var system: VastSystem | String | Null = js.native
  var title: String | Null = js.native
}

object VastAd {
  @scala.inline
  def apply(
    creatives: js.Array[VastCreative],
    errorURLTemplates: js.Array[String],
    extensions: js.Array[VastAdExtension],
    impressionURLTemplates: js.Array[String]
  ): VastAd = {
    val __obj = js.Dynamic.literal(creatives = creatives.asInstanceOf[js.Any], errorURLTemplates = errorURLTemplates.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any], impressionURLTemplates = impressionURLTemplates.asInstanceOf[js.Any])
    __obj.asInstanceOf[VastAd]
  }
  @scala.inline
  implicit class VastAdOps[Self <: VastAd] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreatives(value: js.Array[VastCreative]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creatives")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorURLTemplates(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorURLTemplates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtensions(value: js.Array[VastAdExtension]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImpressionURLTemplates(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("impressionURLTemplates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdvertiser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertiser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdvertiserNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertiser")(null)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescriptionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(null)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(null)
        ret
    }
    @scala.inline
    def withPricing(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pricing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPricingNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pricing")(null)
        ret
    }
    @scala.inline
    def withSequence(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSequenceNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequence")(null)
        ret
    }
    @scala.inline
    def withSurvey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("survey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSurveyNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("survey")(null)
        ret
    }
    @scala.inline
    def withSystem(value: VastSystem | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("system")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSystemNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("system")(null)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(null)
        ret
    }
  }
  
}

