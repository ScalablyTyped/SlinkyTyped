package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Artifacts extends js.Object {
  var artifacts: scala.Double = js.native
  var environments: scala.Double = js.native
  var lastRelease: scala.Double = js.native
  var none: scala.Double = js.native
  var tags: scala.Double = js.native
  var triggers: scala.Double = js.native
  var variables: scala.Double = js.native
}

object Artifacts {
  @scala.inline
  def apply(
    artifacts: scala.Double,
    environments: scala.Double,
    lastRelease: scala.Double,
    none: scala.Double,
    tags: scala.Double,
    triggers: scala.Double,
    variables: scala.Double
  ): Artifacts = {
    val __obj = js.Dynamic.literal(artifacts = artifacts.asInstanceOf[js.Any], environments = environments.asInstanceOf[js.Any], lastRelease = lastRelease.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], triggers = triggers.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[Artifacts]
  }
  @scala.inline
  implicit class ArtifactsOps[Self <: Artifacts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArtifacts(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifacts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnvironments(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastRelease(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastRelease")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTriggers(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVariables(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

