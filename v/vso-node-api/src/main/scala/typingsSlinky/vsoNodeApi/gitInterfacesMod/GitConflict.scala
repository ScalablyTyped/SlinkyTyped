package typingsSlinky.vsoNodeApi.gitInterfacesMod

import typingsSlinky.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitConflict extends js.Object {
  var _links: js.Any = js.native
  var conflictId: Double = js.native
  var conflictPath: String = js.native
  var conflictType: GitConflictType = js.native
  var mergeBaseCommit: GitCommitRef = js.native
  var mergeOrigin: GitMergeOriginRef = js.native
  var mergeSourceCommit: GitCommitRef = js.native
  var mergeTargetCommit: GitCommitRef = js.native
  var resolutionError: GitResolutionError = js.native
  var resolutionStatus: GitResolutionStatus = js.native
  var resolvedBy: IdentityRef = js.native
  var resolvedDate: js.Date = js.native
  var url: String = js.native
}

object GitConflict {
  @scala.inline
  def apply(
    _links: js.Any,
    conflictId: Double,
    conflictPath: String,
    conflictType: GitConflictType,
    mergeBaseCommit: GitCommitRef,
    mergeOrigin: GitMergeOriginRef,
    mergeSourceCommit: GitCommitRef,
    mergeTargetCommit: GitCommitRef,
    resolutionError: GitResolutionError,
    resolutionStatus: GitResolutionStatus,
    resolvedBy: IdentityRef,
    resolvedDate: js.Date,
    url: String
  ): GitConflict = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], conflictId = conflictId.asInstanceOf[js.Any], conflictPath = conflictPath.asInstanceOf[js.Any], conflictType = conflictType.asInstanceOf[js.Any], mergeBaseCommit = mergeBaseCommit.asInstanceOf[js.Any], mergeOrigin = mergeOrigin.asInstanceOf[js.Any], mergeSourceCommit = mergeSourceCommit.asInstanceOf[js.Any], mergeTargetCommit = mergeTargetCommit.asInstanceOf[js.Any], resolutionError = resolutionError.asInstanceOf[js.Any], resolutionStatus = resolutionStatus.asInstanceOf[js.Any], resolvedBy = resolvedBy.asInstanceOf[js.Any], resolvedDate = resolvedDate.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitConflict]
  }
  @scala.inline
  implicit class GitConflictOps[Self <: GitConflict] (val x: Self) extends AnyVal {
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
    def withConflictId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conflictId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConflictPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conflictPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConflictType(value: GitConflictType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conflictType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMergeBaseCommit(value: GitCommitRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeBaseCommit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMergeOrigin(value: GitMergeOriginRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeOrigin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMergeSourceCommit(value: GitCommitRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeSourceCommit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMergeTargetCommit(value: GitCommitRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeTargetCommit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolutionError(value: GitResolutionError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolutionError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolutionStatus(value: GitResolutionStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolutionStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolvedBy(value: IdentityRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolvedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolvedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolvedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

