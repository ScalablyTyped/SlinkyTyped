package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReleaseStartMetadata extends js.Object {
  /**
    * Sets list of artifact to create a release.
    */
  var artifacts: js.Array[ArtifactMetadata] = js.native
  /**
    * Sets definition Id to create a release.
    */
  var definitionId: Double = js.native
  /**
    * Sets description to create a release.
    */
  var description: String = js.native
  /**
    * Sets 'true' to create release in draft mode, 'false' otherwise.
    */
  var isDraft: Boolean = js.native
  /**
    * Sets list of environments to manual as condition.
    */
  var manualEnvironments: js.Array[String] = js.native
  var properties: js.Any = js.native
  /**
    * Sets reason to create a release.
    */
  var reason: ReleaseReason = js.native
}

object ReleaseStartMetadata {
  @scala.inline
  def apply(
    artifacts: js.Array[ArtifactMetadata],
    definitionId: Double,
    description: String,
    isDraft: Boolean,
    manualEnvironments: js.Array[String],
    properties: js.Any,
    reason: ReleaseReason
  ): ReleaseStartMetadata = {
    val __obj = js.Dynamic.literal(artifacts = artifacts.asInstanceOf[js.Any], definitionId = definitionId.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], isDraft = isDraft.asInstanceOf[js.Any], manualEnvironments = manualEnvironments.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseStartMetadata]
  }
  @scala.inline
  implicit class ReleaseStartMetadataOps[Self <: ReleaseStartMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArtifacts(value: js.Array[ArtifactMetadata]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifacts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefinitionId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definitionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsDraft(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDraft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManualEnvironments(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manualEnvironments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperties(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReason(value: ReleaseReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

