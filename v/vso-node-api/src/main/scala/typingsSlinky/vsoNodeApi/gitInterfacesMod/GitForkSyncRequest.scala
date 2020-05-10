package typingsSlinky.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitForkSyncRequest extends js.Object {
  /**
    * Collection of related links
    */
  var _links: js.Any = js.native
  var detailedStatus: GitForkOperationStatusDetail = js.native
  /**
    * Unique identifier for the operation.
    */
  var operationId: Double = js.native
  /**
    * Fully-qualified identifier for the source repository.
    */
  var source: GlobalGitRepositoryKey = js.native
  /**
    * If supplied, the set of ref mappings to use when performing a "sync" or create. If missing, all refs will be synchronized.
    */
  var sourceToTargetRefs: js.Array[SourceToTargetRef] = js.native
  var status: GitAsyncOperationStatus = js.native
}

object GitForkSyncRequest {
  @scala.inline
  def apply(
    _links: js.Any,
    detailedStatus: GitForkOperationStatusDetail,
    operationId: Double,
    source: GlobalGitRepositoryKey,
    sourceToTargetRefs: js.Array[SourceToTargetRef],
    status: GitAsyncOperationStatus
  ): GitForkSyncRequest = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], detailedStatus = detailedStatus.asInstanceOf[js.Any], operationId = operationId.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourceToTargetRefs = sourceToTargetRefs.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitForkSyncRequest]
  }
  @scala.inline
  implicit class GitForkSyncRequestOps[Self <: GitForkSyncRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_links(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_links")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDetailedStatus(value: GitForkOperationStatusDetail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailedStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperationId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: GlobalGitRepositoryKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceToTargetRefs(value: js.Array[SourceToTargetRef]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceToTargetRefs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: GitAsyncOperationStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

