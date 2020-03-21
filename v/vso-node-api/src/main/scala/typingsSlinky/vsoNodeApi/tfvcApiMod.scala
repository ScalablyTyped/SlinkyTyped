package typingsSlinky.vsoNodeApi

import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.vsoNodeApi.clientApiBasesMod.ClientApiBase
import typingsSlinky.vsoNodeApi.tfvcInterfacesMod.AssociatedWorkItem
import typingsSlinky.vsoNodeApi.tfvcInterfacesMod.TfvcBranch
import typingsSlinky.vsoNodeApi.tfvcInterfacesMod.TfvcBranchRef
import typingsSlinky.vsoNodeApi.tfvcInterfacesMod.TfvcChange
import typingsSlinky.vsoNodeApi.tfvcInterfacesMod.TfvcChangeset
import typingsSlinky.vsoNodeApi.tfvcInterfacesMod.TfvcChangesetRef
import typingsSlinky.vsoNodeApi.tfvcInterfacesMod.TfvcChangesetSearchCriteria
import typingsSlinky.vsoNodeApi.tfvcInterfacesMod.TfvcChangesetsRequestData
import typingsSlinky.vsoNodeApi.tfvcInterfacesMod.TfvcItem
import typingsSlinky.vsoNodeApi.tfvcInterfacesMod.TfvcItemRequestData
import typingsSlinky.vsoNodeApi.tfvcInterfacesMod.TfvcLabel
import typingsSlinky.vsoNodeApi.tfvcInterfacesMod.TfvcLabelRef
import typingsSlinky.vsoNodeApi.tfvcInterfacesMod.TfvcLabelRequestData
import typingsSlinky.vsoNodeApi.tfvcInterfacesMod.TfvcShelveset
import typingsSlinky.vsoNodeApi.tfvcInterfacesMod.TfvcShelvesetRef
import typingsSlinky.vsoNodeApi.tfvcInterfacesMod.TfvcShelvesetRequestData
import typingsSlinky.vsoNodeApi.tfvcInterfacesMod.TfvcVersionDescriptor
import typingsSlinky.vsoNodeApi.tfvcInterfacesMod.VersionControlRecursionType
import typingsSlinky.vsoNodeApi.vsoBaseInterfacesMod.IRequestHandler
import typingsSlinky.vsoNodeApi.vsoBaseInterfacesMod.IRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vso-node-api/TfvcApi", JSImport.Namespace)
@js.native
object tfvcApiMod extends js.Object {
  @js.native
  trait ITfvcApi extends ClientApiBase {
    def createChangeset(changeset: TfvcChangeset): js.Promise[TfvcChangesetRef] = js.native
    def createChangeset(changeset: TfvcChangeset, project: String): js.Promise[TfvcChangesetRef] = js.native
    def getBatchedChangesets(changesetsRequestData: TfvcChangesetsRequestData): js.Promise[js.Array[TfvcChangesetRef]] = js.native
    def getBranch(path: String): js.Promise[TfvcBranch] = js.native
    def getBranch(path: String, project: String): js.Promise[TfvcBranch] = js.native
    def getBranch(path: String, project: String, includeParent: Boolean): js.Promise[TfvcBranch] = js.native
    def getBranch(path: String, project: String, includeParent: Boolean, includeChildren: Boolean): js.Promise[TfvcBranch] = js.native
    def getBranchRefs(scopePath: String): js.Promise[js.Array[TfvcBranchRef]] = js.native
    def getBranchRefs(scopePath: String, project: String): js.Promise[js.Array[TfvcBranchRef]] = js.native
    def getBranchRefs(scopePath: String, project: String, includeDeleted: Boolean): js.Promise[js.Array[TfvcBranchRef]] = js.native
    def getBranchRefs(scopePath: String, project: String, includeDeleted: Boolean, includeLinks: Boolean): js.Promise[js.Array[TfvcBranchRef]] = js.native
    def getBranches(): js.Promise[js.Array[TfvcBranch]] = js.native
    def getBranches(project: String): js.Promise[js.Array[TfvcBranch]] = js.native
    def getBranches(project: String, includeParent: Boolean): js.Promise[js.Array[TfvcBranch]] = js.native
    def getBranches(project: String, includeParent: Boolean, includeChildren: Boolean): js.Promise[js.Array[TfvcBranch]] = js.native
    def getBranches(project: String, includeParent: Boolean, includeChildren: Boolean, includeDeleted: Boolean): js.Promise[js.Array[TfvcBranch]] = js.native
    def getBranches(
      project: String,
      includeParent: Boolean,
      includeChildren: Boolean,
      includeDeleted: Boolean,
      includeLinks: Boolean
    ): js.Promise[js.Array[TfvcBranch]] = js.native
    def getChangeset(
      id: Double,
      project: js.UndefOr[String],
      maxChangeCount: js.UndefOr[Double],
      includeDetails: js.UndefOr[Boolean],
      includeWorkItems: js.UndefOr[Boolean],
      maxCommentLength: js.UndefOr[Double],
      includeSourceRename: js.UndefOr[Boolean],
      skip: js.UndefOr[Double],
      top: js.UndefOr[Double],
      orderby: js.UndefOr[String],
      searchCriteria: js.UndefOr[TfvcChangesetSearchCriteria]
    ): js.Promise[TfvcChangeset] = js.native
    def getChangesetChanges(): js.Promise[js.Array[TfvcChange]] = js.native
    def getChangesetChanges(id: Double): js.Promise[js.Array[TfvcChange]] = js.native
    def getChangesetChanges(id: Double, skip: Double): js.Promise[js.Array[TfvcChange]] = js.native
    def getChangesetChanges(id: Double, skip: Double, top: Double): js.Promise[js.Array[TfvcChange]] = js.native
    def getChangesetWorkItems(): js.Promise[js.Array[AssociatedWorkItem]] = js.native
    def getChangesetWorkItems(id: Double): js.Promise[js.Array[AssociatedWorkItem]] = js.native
    def getChangesets(
      project: js.UndefOr[String],
      maxCommentLength: js.UndefOr[Double],
      skip: js.UndefOr[Double],
      top: js.UndefOr[Double],
      orderby: js.UndefOr[String],
      searchCriteria: js.UndefOr[TfvcChangesetSearchCriteria]
    ): js.Promise[js.Array[TfvcChangesetRef]] = js.native
    def getItem(
      path: String,
      project: js.UndefOr[String],
      fileName: js.UndefOr[String],
      download: js.UndefOr[Boolean],
      scopePath: js.UndefOr[String],
      recursionLevel: js.UndefOr[VersionControlRecursionType],
      versionDescriptor: js.UndefOr[TfvcVersionDescriptor]
    ): js.Promise[TfvcItem] = js.native
    def getItemContent(
      path: String,
      project: js.UndefOr[String],
      fileName: js.UndefOr[String],
      download: js.UndefOr[Boolean],
      scopePath: js.UndefOr[String],
      recursionLevel: js.UndefOr[VersionControlRecursionType],
      versionDescriptor: js.UndefOr[TfvcVersionDescriptor]
    ): js.Promise[ReadableStream] = js.native
    def getItemText(
      path: String,
      project: js.UndefOr[String],
      fileName: js.UndefOr[String],
      download: js.UndefOr[Boolean],
      scopePath: js.UndefOr[String],
      recursionLevel: js.UndefOr[VersionControlRecursionType],
      versionDescriptor: js.UndefOr[TfvcVersionDescriptor]
    ): js.Promise[ReadableStream] = js.native
    def getItemZip(
      path: String,
      project: js.UndefOr[String],
      fileName: js.UndefOr[String],
      download: js.UndefOr[Boolean],
      scopePath: js.UndefOr[String],
      recursionLevel: js.UndefOr[VersionControlRecursionType],
      versionDescriptor: js.UndefOr[TfvcVersionDescriptor]
    ): js.Promise[ReadableStream] = js.native
    def getItems(): js.Promise[js.Array[TfvcItem]] = js.native
    def getItems(project: String): js.Promise[js.Array[TfvcItem]] = js.native
    def getItems(project: String, scopePath: String): js.Promise[js.Array[TfvcItem]] = js.native
    def getItems(project: String, scopePath: String, recursionLevel: VersionControlRecursionType): js.Promise[js.Array[TfvcItem]] = js.native
    def getItems(
      project: String,
      scopePath: String,
      recursionLevel: VersionControlRecursionType,
      includeLinks: Boolean
    ): js.Promise[js.Array[TfvcItem]] = js.native
    def getItems(
      project: String,
      scopePath: String,
      recursionLevel: VersionControlRecursionType,
      includeLinks: Boolean,
      versionDescriptor: TfvcVersionDescriptor
    ): js.Promise[js.Array[TfvcItem]] = js.native
    def getItemsBatch(itemRequestData: TfvcItemRequestData): js.Promise[js.Array[js.Array[TfvcItem]]] = js.native
    def getItemsBatch(itemRequestData: TfvcItemRequestData, project: String): js.Promise[js.Array[js.Array[TfvcItem]]] = js.native
    def getItemsBatchZip(itemRequestData: TfvcItemRequestData): js.Promise[ReadableStream] = js.native
    def getItemsBatchZip(itemRequestData: TfvcItemRequestData, project: String): js.Promise[ReadableStream] = js.native
    def getLabel(labelId: String, requestData: TfvcLabelRequestData): js.Promise[TfvcLabel] = js.native
    def getLabel(labelId: String, requestData: TfvcLabelRequestData, project: String): js.Promise[TfvcLabel] = js.native
    def getLabelItems(labelId: String): js.Promise[js.Array[TfvcItem]] = js.native
    def getLabelItems(labelId: String, top: Double): js.Promise[js.Array[TfvcItem]] = js.native
    def getLabelItems(labelId: String, top: Double, skip: Double): js.Promise[js.Array[TfvcItem]] = js.native
    def getLabels(requestData: TfvcLabelRequestData): js.Promise[js.Array[TfvcLabelRef]] = js.native
    def getLabels(requestData: TfvcLabelRequestData, project: String): js.Promise[js.Array[TfvcLabelRef]] = js.native
    def getLabels(requestData: TfvcLabelRequestData, project: String, top: Double): js.Promise[js.Array[TfvcLabelRef]] = js.native
    def getLabels(requestData: TfvcLabelRequestData, project: String, top: Double, skip: Double): js.Promise[js.Array[TfvcLabelRef]] = js.native
    def getShelveset(shelvesetId: String): js.Promise[TfvcShelveset] = js.native
    def getShelveset(shelvesetId: String, requestData: TfvcShelvesetRequestData): js.Promise[TfvcShelveset] = js.native
    def getShelvesetChanges(shelvesetId: String): js.Promise[js.Array[TfvcChange]] = js.native
    def getShelvesetChanges(shelvesetId: String, top: Double): js.Promise[js.Array[TfvcChange]] = js.native
    def getShelvesetChanges(shelvesetId: String, top: Double, skip: Double): js.Promise[js.Array[TfvcChange]] = js.native
    def getShelvesetWorkItems(shelvesetId: String): js.Promise[js.Array[AssociatedWorkItem]] = js.native
    def getShelvesets(): js.Promise[js.Array[TfvcShelvesetRef]] = js.native
    def getShelvesets(requestData: TfvcShelvesetRequestData): js.Promise[js.Array[TfvcShelvesetRef]] = js.native
    def getShelvesets(requestData: TfvcShelvesetRequestData, top: Double): js.Promise[js.Array[TfvcShelvesetRef]] = js.native
    def getShelvesets(requestData: TfvcShelvesetRequestData, top: Double, skip: Double): js.Promise[js.Array[TfvcShelvesetRef]] = js.native
  }
  
  @js.native
  class TfvcApi protected () extends ITfvcApi {
    def this(baseUrl: String, handlers: js.Array[IRequestHandler]) = this()
    def this(baseUrl: String, handlers: js.Array[IRequestHandler], options: IRequestOptions) = this()
  }
  
}

