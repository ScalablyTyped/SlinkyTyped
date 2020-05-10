package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArtifactMetadata extends js.Object {
  /**
    * Sets alias of artifact.
    */
  var alias: String = js.native
  /**
    * Sets instance reference of artifact. e.g. for build artifact it is build number.
    */
  var instanceReference: BuildVersion = js.native
}

object ArtifactMetadata {
  @scala.inline
  def apply(alias: String, instanceReference: BuildVersion): ArtifactMetadata = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], instanceReference = instanceReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactMetadata]
  }
  @scala.inline
  implicit class ArtifactMetadataOps[Self <: ArtifactMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlias(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstanceReference(value: BuildVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceReference")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

