package typingsSlinky.vsoNodeApi.workItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArtifactUriQuery extends js.Object {
  /**
    * List of artifact URIs to use for querying work items.
    */
  var artifactUris: js.Array[String] = js.native
}

object ArtifactUriQuery {
  @scala.inline
  def apply(artifactUris: js.Array[String]): ArtifactUriQuery = {
    val __obj = js.Dynamic.literal(artifactUris = artifactUris.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactUriQuery]
  }
  @scala.inline
  implicit class ArtifactUriQueryOps[Self <: ArtifactUriQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArtifactUris(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifactUris")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

