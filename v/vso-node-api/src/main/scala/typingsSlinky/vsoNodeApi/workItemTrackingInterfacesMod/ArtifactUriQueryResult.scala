package typingsSlinky.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArtifactUriQueryResult extends js.Object {
  /**
    * A Dictionary that maps a list of work item references to the given list of artifact URI.
    */
  var artifactUrisQueryResult: StringDictionary[js.Array[WorkItemReference]] = js.native
}

object ArtifactUriQueryResult {
  @scala.inline
  def apply(artifactUrisQueryResult: StringDictionary[js.Array[WorkItemReference]]): ArtifactUriQueryResult = {
    val __obj = js.Dynamic.literal(artifactUrisQueryResult = artifactUrisQueryResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactUriQueryResult]
  }
  @scala.inline
  implicit class ArtifactUriQueryResultOps[Self <: ArtifactUriQueryResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArtifactUrisQueryResult(value: StringDictionary[js.Array[WorkItemReference]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifactUrisQueryResult")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

