package typingsSlinky.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildBadge extends js.Object {
  /**
    * The ID of the build represented by this badge.
    */
  var buildId: Double = js.native
  /**
    * A link to the SVG resource.
    */
  var imageUrl: String = js.native
}

object BuildBadge {
  @scala.inline
  def apply(buildId: Double, imageUrl: String): BuildBadge = {
    val __obj = js.Dynamic.literal(buildId = buildId.asInstanceOf[js.Any], imageUrl = imageUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildBadge]
  }
  @scala.inline
  implicit class BuildBadgeOps[Self <: BuildBadge] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuildId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageUrl")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

