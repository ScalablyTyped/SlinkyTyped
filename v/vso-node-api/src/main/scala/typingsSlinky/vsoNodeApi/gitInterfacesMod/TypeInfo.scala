package typingsSlinky.vsoNodeApi.gitInterfacesMod

import typingsSlinky.vsoNodeApi.AnonEnumValuesAnonActive
import typingsSlinky.vsoNodeApi.AnonEnumValuesAnonAddAdd
import typingsSlinky.vsoNodeApi.AnonEnumValuesAnonAllOrNone
import typingsSlinky.vsoNodeApi.AnonEnumValuesAnonAndroidStudio
import typingsSlinky.vsoNodeApi.AnonEnumValuesAnonAsyncOperationNotFound
import typingsSlinky.vsoNodeApi.AnonEnumValuesAnonAttachment
import typingsSlinky.vsoNodeApi.AnonEnumValuesAnonAutoMerged
import typingsSlinky.vsoNodeApi.AnonEnumValuesAnonBad
import typingsSlinky.vsoNodeApi.AnonEnumValuesAnonBadRequest
import typingsSlinky.vsoNodeApi.AnonEnumValuesAnonBase64Encoded
import typingsSlinky.vsoNodeApi.AnonEnumValuesAnonBranch
import typingsSlinky.vsoNodeApi.AnonEnumValuesAnonCaseSensitive
import typingsSlinky.vsoNodeApi.AnonEnumValuesAnonChange
import typingsSlinky.vsoNodeApi.AnonEnumValuesAnonCodeChange
import typingsSlinky.vsoNodeApi.AnonEnumValuesAnonCommit
import typingsSlinky.vsoNodeApi.AnonEnumValuesAnonConflicts
import typingsSlinky.vsoNodeApi.AnonEnumValuesAnonContains
import typingsSlinky.vsoNodeApi.AnonEnumValuesAnonCreateBranchPermissionRequired
import typingsSlinky.vsoNodeApi.AnonEnumValuesAnonEncoding
import typingsSlinky.vsoNodeApi.AnonEnumValuesAnonFirstParent
import typingsSlinky.vsoNodeApi.AnonEnumValuesAnonFolder
import typingsSlinky.vsoNodeApi.AnonEnumValuesAnonForcePush
import typingsSlinky.vsoNodeApi.AnonEnumValuesAnonFull
import typingsSlinky.vsoNodeApi.AnonEnumValuesAnonInProgress_
import typingsSlinky.vsoNodeApi.AnonEnumValuesAnonInvalidPath
import typingsSlinky.vsoNodeApi.AnonEnumValuesAnonKeepBothFiles
import typingsSlinky.vsoNodeApi.AnonEnumValuesAnonKeepSourceDeleteTarget
import typingsSlinky.vsoNodeApi.AnonEnumValuesAnonNotApplicable
import typingsSlinky.vsoNodeApi.AnonEnumValuesAnonNotSet
import typingsSlinky.vsoNodeApi.AnonEnumValuesAnonPartiallyResolved
import typingsSlinky.vsoNodeApi.AnonEnumValuesAnonPickSourceAction
import typingsSlinky.vsoNodeApi.AnonEnumValuesAnonPrevious
import typingsSlinky.vsoNodeApi.AnonEnumValuesAnonPreviousChange
import typingsSlinky.vsoNodeApi.AnonEnumValuesAnonRename
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vso-node-api/interfaces/GitInterfaces", "TypeInfo")
@js.native
object TypeInfo extends js.Object {
  var Attachment: js.Any = js.native
  var Change: js.Any = js.native
  var ChangeList: js.Any = js.native
  var Comment: js.Any = js.native
  var CommentThread: js.Any = js.native
  var CommentThreadStatus: AnonEnumValuesAnonActive = js.native
  var CommentType: AnonEnumValuesAnonCodeChange = js.native
  var GitAnnotatedTag: js.Any = js.native
  var GitAsyncOperationStatus: AnonEnumValuesAnonInProgress_ = js.native
  var GitAsyncRefOperation: js.Any = js.native
  var GitAsyncRefOperationDetail: js.Any = js.native
  var GitAsyncRefOperationFailureStatus: AnonEnumValuesAnonAsyncOperationNotFound = js.native
  var GitAsyncRefOperationParameters: js.Any = js.native
  var GitAsyncRefOperationSource: js.Any = js.native
  var GitBaseVersionDescriptor: js.Any = js.native
  var GitBranchStats: js.Any = js.native
  var GitChange: js.Any = js.native
  var GitCherryPick: js.Any = js.native
  var GitCommit: js.Any = js.native
  var GitCommitChanges: js.Any = js.native
  var GitCommitDiffs: js.Any = js.native
  var GitCommitRef: js.Any = js.native
  var GitCommitToCreate: js.Any = js.native
  var GitConflict: js.Any = js.native
  var GitConflictAddAdd: js.Any = js.native
  var GitConflictAddRename: js.Any = js.native
  var GitConflictDeleteEdit: js.Any = js.native
  var GitConflictDeleteRename: js.Any = js.native
  var GitConflictDirectoryFile: js.Any = js.native
  var GitConflictEditDelete: js.Any = js.native
  var GitConflictEditEdit: js.Any = js.native
  var GitConflictFileDirectory: js.Any = js.native
  var GitConflictRename1to2: js.Any = js.native
  var GitConflictRename2to1: js.Any = js.native
  var GitConflictRenameAdd: js.Any = js.native
  var GitConflictRenameDelete: js.Any = js.native
  var GitConflictRenameRename: js.Any = js.native
  var GitConflictType: AnonEnumValuesAnonAddAdd = js.native
  var GitConflictUpdateResult: js.Any = js.native
  var GitConflictUpdateStatus: AnonEnumValuesAnonBadRequest = js.native
  var GitDeletedRepository: js.Any = js.native
  var GitForkRef: js.Any = js.native
  var GitForkSyncRequest: js.Any = js.native
  var GitHistoryMode: AnonEnumValuesAnonFirstParent = js.native
  var GitImportFailedEvent: js.Any = js.native
  var GitImportRequest: js.Any = js.native
  var GitImportSucceededEvent: js.Any = js.native
  var GitItem: js.Any = js.native
  var GitItemDescriptor: js.Any = js.native
  var GitItemRequestData: js.Any = js.native
  var GitLastChangeTreeItems: js.Any = js.native
  var GitObject: js.Any = js.native
  var GitObjectType: AnonEnumValuesAnonBad = js.native
  var GitPathAction: js.Any = js.native
  var GitPathActions: AnonEnumValuesAnonRename = js.native
  var GitPathToItemsCollection: js.Any = js.native
  var GitPullRequest: js.Any = js.native
  var GitPullRequestChange: js.Any = js.native
  var GitPullRequestCommentThread: js.Any = js.native
  var GitPullRequestIteration: js.Any = js.native
  var GitPullRequestIterationChanges: js.Any = js.native
  var GitPullRequestQuery: js.Any = js.native
  var GitPullRequestQueryInput: js.Any = js.native
  var GitPullRequestQueryType: AnonEnumValuesAnonCommit = js.native
  var GitPullRequestReviewFileType: AnonEnumValuesAnonAttachment = js.native
  var GitPullRequestSearchCriteria: js.Any = js.native
  var GitPullRequestStatus: js.Any = js.native
  var GitPush: js.Any = js.native
  var GitPushEventData: js.Any = js.native
  var GitPushRef: js.Any = js.native
  var GitPushSearchCriteria: js.Any = js.native
  var GitQueryBranchStatsCriteria: js.Any = js.native
  var GitQueryCommitsCriteria: js.Any = js.native
  var GitQueryRefsCriteria: js.Any = js.native
  var GitRef: js.Any = js.native
  var GitRefFavorite: js.Any = js.native
  var GitRefSearchType: AnonEnumValuesAnonContains = js.native
  var GitRefUpdateMode: AnonEnumValuesAnonAllOrNone = js.native
  var GitRefUpdateResult: js.Any = js.native
  var GitRefUpdateStatus: AnonEnumValuesAnonCreateBranchPermissionRequired = js.native
  var GitRepository: js.Any = js.native
  var GitRepositoryCreateOptions: js.Any = js.native
  var GitRepositoryRef: js.Any = js.native
  var GitResolutionError: AnonEnumValuesAnonInvalidPath = js.native
  var GitResolutionMergeContent: js.Any = js.native
  var GitResolutionMergeType: AnonEnumValuesAnonAutoMerged = js.native
  var GitResolutionPathConflict: js.Any = js.native
  var GitResolutionPathConflictAction: AnonEnumValuesAnonKeepSourceDeleteTarget = js.native
  var GitResolutionPickOneAction: js.Any = js.native
  var GitResolutionRename1to2: js.Any = js.native
  var GitResolutionRename1to2Action: AnonEnumValuesAnonKeepBothFiles = js.native
  var GitResolutionStatus: AnonEnumValuesAnonPartiallyResolved = js.native
  var GitResolutionWhichAction: AnonEnumValuesAnonPickSourceAction = js.native
  var GitRevert: js.Any = js.native
  var GitStatus: js.Any = js.native
  var GitStatusState: AnonEnumValuesAnonNotApplicable = js.native
  var GitTargetVersionDescriptor: js.Any = js.native
  var GitTreeDiff: js.Any = js.native
  var GitTreeDiffEntry: js.Any = js.native
  var GitTreeDiffResponse: js.Any = js.native
  var GitTreeEntryRef: js.Any = js.native
  var GitTreeRef: js.Any = js.native
  var GitUserDate: js.Any = js.native
  var GitVersionDescriptor: js.Any = js.native
  var GitVersionOptions: AnonEnumValuesAnonPreviousChange = js.native
  var GitVersionType: AnonEnumValuesAnonBranch = js.native
  var HistoryEntry: js.Any = js.native
  var IncludedGitCommit: js.Any = js.native
  var ItemContent: js.Any = js.native
  var ItemContentType: AnonEnumValuesAnonBase64Encoded = js.native
  var ItemDetailsOptions: js.Any = js.native
  var IterationReason: AnonEnumValuesAnonForcePush = js.native
  var PullRequestAsyncStatus: AnonEnumValuesAnonConflicts = js.native
  var PullRequestMergeFailureType: AnonEnumValuesAnonCaseSensitive = js.native
  var PullRequestStatus: AnonEnumValuesAnonNotSet = js.native
  var RefFavoriteType: AnonEnumValuesAnonFolder = js.native
  var SupportedIde: js.Any = js.native
  var SupportedIdeType: AnonEnumValuesAnonAndroidStudio = js.native
  var TfvcBranch: js.Any = js.native
  var TfvcBranchRef: js.Any = js.native
  var TfvcChange: js.Any = js.native
  var TfvcChangeset: js.Any = js.native
  var TfvcChangesetRef: js.Any = js.native
  var TfvcCheckinEventData: js.Any = js.native
  var TfvcHistoryEntry: js.Any = js.native
  var TfvcItem: js.Any = js.native
  var TfvcItemDescriptor: js.Any = js.native
  var TfvcItemRequestData: js.Any = js.native
  var TfvcLabel: js.Any = js.native
  var TfvcLabelRef: js.Any = js.native
  var TfvcShelveset: js.Any = js.native
  var TfvcShelvesetRef: js.Any = js.native
  var TfvcVersionDescriptor: js.Any = js.native
  var TfvcVersionOption: AnonEnumValuesAnonPrevious = js.native
  var TfvcVersionType: AnonEnumValuesAnonChange = js.native
  var UpdateRefsRequest: js.Any = js.native
  var VersionControlChangeType: AnonEnumValuesAnonEncoding = js.native
  var VersionControlProjectInfo: js.Any = js.native
  var VersionControlRecursionType: AnonEnumValuesAnonFull = js.native
}

