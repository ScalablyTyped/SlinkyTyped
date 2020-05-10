package typingsSlinky.sharepoint.Srch

import typingsSlinky.sharepoint.SP.Guid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RefinementInfo extends js.Object {
  var Culture: String = js.native
  var DisplayName: String = js.native
  var Entropy: Double = js.native
  var HitCount: Double = js.native
  var Max: Double = js.native
  var Mean: Double = js.native
  var Min: Double = js.native
  var Modifier: String = js.native
  var NonZeroCount: Double = js.native
  var PartitionId: Guid = js.native
  var Ratio: Double = js.native
  var RefinementCount: Double = js.native
  var RefinementName: String = js.native
  var RefinementToken: String = js.native
  var RefinementValue: String = js.native
  var RefinerName: String = js.native
  var RenderTemplateId: String = js.native
  var Score: Double = js.native
  var Sum: Double = js.native
  var Type: String = js.native
  var UniqueCount: Double = js.native
  var UrlZone: Double = js.native
}

object RefinementInfo {
  @scala.inline
  def apply(
    Culture: String,
    DisplayName: String,
    Entropy: Double,
    HitCount: Double,
    Max: Double,
    Mean: Double,
    Min: Double,
    Modifier: String,
    NonZeroCount: Double,
    PartitionId: Guid,
    Ratio: Double,
    RefinementCount: Double,
    RefinementName: String,
    RefinementToken: String,
    RefinementValue: String,
    RefinerName: String,
    RenderTemplateId: String,
    Score: Double,
    Sum: Double,
    Type: String,
    UniqueCount: Double,
    UrlZone: Double
  ): RefinementInfo = {
    val __obj = js.Dynamic.literal(Culture = Culture.asInstanceOf[js.Any], DisplayName = DisplayName.asInstanceOf[js.Any], Entropy = Entropy.asInstanceOf[js.Any], HitCount = HitCount.asInstanceOf[js.Any], Max = Max.asInstanceOf[js.Any], Mean = Mean.asInstanceOf[js.Any], Min = Min.asInstanceOf[js.Any], Modifier = Modifier.asInstanceOf[js.Any], NonZeroCount = NonZeroCount.asInstanceOf[js.Any], PartitionId = PartitionId.asInstanceOf[js.Any], Ratio = Ratio.asInstanceOf[js.Any], RefinementCount = RefinementCount.asInstanceOf[js.Any], RefinementName = RefinementName.asInstanceOf[js.Any], RefinementToken = RefinementToken.asInstanceOf[js.Any], RefinementValue = RefinementValue.asInstanceOf[js.Any], RefinerName = RefinerName.asInstanceOf[js.Any], RenderTemplateId = RenderTemplateId.asInstanceOf[js.Any], Score = Score.asInstanceOf[js.Any], Sum = Sum.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], UniqueCount = UniqueCount.asInstanceOf[js.Any], UrlZone = UrlZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefinementInfo]
  }
  @scala.inline
  implicit class RefinementInfoOps[Self <: RefinementInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCulture(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Culture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntropy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Entropy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHitCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HitCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMean(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Mean")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Modifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNonZeroCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NonZeroCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPartitionId(value: Guid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PartitionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ratio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefinementCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RefinementCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefinementName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RefinementName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefinementToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RefinementToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefinementValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RefinementValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefinerName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RefinerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderTemplateId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RenderTemplateId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScore(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Score")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUniqueCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UniqueCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrlZone(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UrlZone")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

