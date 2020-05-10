package typingsSlinky.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitImportRequestParameters extends js.Object {
  /**
    * Option to delete service endpoint when import is done
    */
  var deleteServiceEndpointAfterImportIsDone: Boolean = js.native
  /**
    * Source for importing git repository
    */
  var gitSource: GitImportGitSource = js.native
  /**
    * Service Endpoint for connection to external endpoint
    */
  var serviceEndpointId: String = js.native
  /**
    * Source for importing tfvc repository
    */
  var tfvcSource: GitImportTfvcSource = js.native
}

object GitImportRequestParameters {
  @scala.inline
  def apply(
    deleteServiceEndpointAfterImportIsDone: Boolean,
    gitSource: GitImportGitSource,
    serviceEndpointId: String,
    tfvcSource: GitImportTfvcSource
  ): GitImportRequestParameters = {
    val __obj = js.Dynamic.literal(deleteServiceEndpointAfterImportIsDone = deleteServiceEndpointAfterImportIsDone.asInstanceOf[js.Any], gitSource = gitSource.asInstanceOf[js.Any], serviceEndpointId = serviceEndpointId.asInstanceOf[js.Any], tfvcSource = tfvcSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitImportRequestParameters]
  }
  @scala.inline
  implicit class GitImportRequestParametersOps[Self <: GitImportRequestParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeleteServiceEndpointAfterImportIsDone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteServiceEndpointAfterImportIsDone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGitSource(value: GitImportGitSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gitSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceEndpointId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceEndpointId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTfvcSource(value: GitImportTfvcSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tfvcSource")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

