package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReleaseDefinitionEnvironmentSummary extends js.Object {
  var id: Double = js.native
  var lastReleases: js.Array[ReleaseShallowReference] = js.native
  var name: String = js.native
}

object ReleaseDefinitionEnvironmentSummary {
  @scala.inline
  def apply(id: Double, lastReleases: js.Array[ReleaseShallowReference], name: String): ReleaseDefinitionEnvironmentSummary = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], lastReleases = lastReleases.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseDefinitionEnvironmentSummary]
  }
  @scala.inline
  implicit class ReleaseDefinitionEnvironmentSummaryOps[Self <: ReleaseDefinitionEnvironmentSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastReleases(value: js.Array[ReleaseShallowReference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastReleases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

