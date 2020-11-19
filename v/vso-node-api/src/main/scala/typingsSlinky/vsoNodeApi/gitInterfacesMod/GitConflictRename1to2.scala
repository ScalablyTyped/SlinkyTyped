package typingsSlinky.vsoNodeApi.gitInterfacesMod

import typingsSlinky.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitConflictRename1to2 extends GitConflict {
  
  var baseBlob: GitBlobRef = js.native
  
  var resolution: GitResolutionRename1to2 = js.native
  
  var sourceBlob: GitBlobRef = js.native
  
  var sourceNewPath: String = js.native
  
  var targetBlob: GitBlobRef = js.native
  
  var targetNewPath: String = js.native
}
object GitConflictRename1to2 {
  
  @scala.inline
  def apply(
    _links: js.Any,
    baseBlob: GitBlobRef,
    conflictId: Double,
    conflictPath: String,
    conflictType: GitConflictType,
    mergeBaseCommit: GitCommitRef,
    mergeOrigin: GitMergeOriginRef,
    mergeSourceCommit: GitCommitRef,
    mergeTargetCommit: GitCommitRef,
    resolution: GitResolutionRename1to2,
    resolutionError: GitResolutionError,
    resolutionStatus: GitResolutionStatus,
    resolvedBy: IdentityRef,
    resolvedDate: js.Date,
    sourceBlob: GitBlobRef,
    sourceNewPath: String,
    targetBlob: GitBlobRef,
    targetNewPath: String,
    url: String
  ): GitConflictRename1to2 = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], baseBlob = baseBlob.asInstanceOf[js.Any], conflictId = conflictId.asInstanceOf[js.Any], conflictPath = conflictPath.asInstanceOf[js.Any], conflictType = conflictType.asInstanceOf[js.Any], mergeBaseCommit = mergeBaseCommit.asInstanceOf[js.Any], mergeOrigin = mergeOrigin.asInstanceOf[js.Any], mergeSourceCommit = mergeSourceCommit.asInstanceOf[js.Any], mergeTargetCommit = mergeTargetCommit.asInstanceOf[js.Any], resolution = resolution.asInstanceOf[js.Any], resolutionError = resolutionError.asInstanceOf[js.Any], resolutionStatus = resolutionStatus.asInstanceOf[js.Any], resolvedBy = resolvedBy.asInstanceOf[js.Any], resolvedDate = resolvedDate.asInstanceOf[js.Any], sourceBlob = sourceBlob.asInstanceOf[js.Any], sourceNewPath = sourceNewPath.asInstanceOf[js.Any], targetBlob = targetBlob.asInstanceOf[js.Any], targetNewPath = targetNewPath.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitConflictRename1to2]
  }
  
  @scala.inline
  implicit class GitConflictRename1to2Ops[Self <: GitConflictRename1to2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBaseBlob(value: GitBlobRef): Self = this.set("baseBlob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolution(value: GitResolutionRename1to2): Self = this.set("resolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceBlob(value: GitBlobRef): Self = this.set("sourceBlob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceNewPath(value: String): Self = this.set("sourceNewPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetBlob(value: GitBlobRef): Self = this.set("targetBlob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetNewPath(value: String): Self = this.set("targetNewPath", value.asInstanceOf[js.Any])
  }
}
