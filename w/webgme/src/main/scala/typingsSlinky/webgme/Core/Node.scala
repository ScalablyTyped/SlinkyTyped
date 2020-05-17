package typingsSlinky.webgme.Core

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Storage
import typingsSlinky.webgme.Global_.GmeLogger
import typingsSlinky.webgme.GmeCommon.Aspect
import typingsSlinky.webgme.GmeCommon.AttrMeta
import typingsSlinky.webgme.GmeCommon.CrosscutsInfo
import typingsSlinky.webgme.GmeCommon.Dictionary
import typingsSlinky.webgme.GmeCommon.MemberId
import typingsSlinky.webgme.GmeCommon.Metadata
import typingsSlinky.webgme.GmeCommon.Name
import typingsSlinky.webgme.GmeCommon.NodeId
import typingsSlinky.webgme.GmeCommon.OutAttr
import typingsSlinky.webgme.GmeCommon.Path
import typingsSlinky.webgme.GmeCommon.Pointer
import typingsSlinky.webgme.GmeCommon.Registry
import typingsSlinky.webgme.GmeCommon.RelId
import typingsSlinky.webgme.GmeCommon.ResultCallback
import typingsSlinky.webgme.GmeCommon.SetId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Node extends js.Object {
  var _id: String = js.native
  def canSetAsMixin(mixinPath: Path): Boolean = js.native
  def getAspectMeta(): Metadata = js.native
  def getAttribute(name: Name): OutAttr = js.native
  def getAttributeMeta(name: Name): AttrMeta = js.native
  def getAttributeNames(): js.Array[Name] = js.native
  def getBaseId(): NodeId = js.native
  def getBaseTypeId(): Node | Null = js.native
  def getChildrenIds(): js.Array[NodeId] = js.native
  def getCollectionPaths(name: Name): js.Array[Path] = js.native
  def getConstraint(name: Name): Constraint = js.native
  def getConstraintNames(): js.Array[Name] = js.native
  def getCrosscutsInfo(): CrosscutsInfo = js.native
  def getEditableAttribute(name: Name): OutAttr = js.native
  def getEditableMemberAttribute(setId: SetId, memberId: MemberId, name: Name): OutAttr = js.native
  def getEditableMemberRegistry(setId: SetId, memberId: MemberId, name: Name): Registry = js.native
  def getEditableRegistry(name: Name): Registry = js.native
  def getFullyQualifiedName(): Name = js.native
  def getGuid(): GUID = js.native
  def getId(): NodeId = js.native
  def getInheritorIds(): js.Array[NodeId] = js.native
  def getInstancePaths(): js.Array[Path] = js.native
  def getJsonMeta(): js.Array[Metadata] = js.native
  def getLibraryGuid(): GUID = js.native
  def getMemberAttribute(setId: SetId, memberId: MemberId): OutAttr = js.native
  def getMemberAttributeNames(setId: SetId, memberId: MemberId): js.Array[Name] = js.native
  /** Set */
  def getMemberIds(setId: SetId): js.Array[Path] = js.native
  def getMemberRegistry(setId: SetId, memberId: MemberId, name: Name): Registry = js.native
  def getMemberRegistryNames(setId: SetId, memberId: MemberId): js.Array[Name] = js.native
  def getMetaTypeId(): Node | Null = js.native
  /** MixIns */
  def getMixinPaths(): js.Array[Path] = js.native
  def getNamespace(): Name = js.native
  def getNode(id: NodeId, logger: GmeLogger, state: js.Any, storeNode: ResultCallback[Storage]): Node = js.native
  def getOwnAttribute(name: Name): OutAttr = js.native
  def getOwnAttributeNames(): js.Array[Name] = js.native
  def getOwnConstraintNames(): js.Array[Name] = js.native
  def getOwnEditableAttribute(name: Name): OutAttr = js.native
  def getOwnEditableRegistry(name: Name): Registry = js.native
  def getOwnPointer(name: Name): Pointer = js.native
  def getOwnPointerId(name: Name): SetId = js.native
  def getOwnPointerNames(): js.Array[Name] = js.native
  def getOwnRegistry(name: Name): Registry = js.native
  def getOwnRegistryNames(): js.Array[Name] = js.native
  def getOwnValidAspectNames(): js.Array[Name] = js.native
  def getOwnValidAttributeNames(): js.Array[Name] = js.native
  def getParentId(): NodeId = js.native
  def getPointer(name: Name): Pointer = js.native
  def getPointerId(name: Name): SetId = js.native
  def getPointerNames(): js.Array[Name] = js.native
  def getRegistry(name: Name): Registry = js.native
  def getRegistryNames(): js.Array[Name] = js.native
  def getRelid(): RelId = js.native
  def getSetNames(): js.Array[Name] = js.native
  def getValidAspectNames(): js.Array[Name] = js.native
  def getValidAttributeNames(): js.Array[Name] = js.native
  def getValidChildrenIds(): js.Array[NodeId] = js.native
  /** META */
  def getValidChildrenTypes(): js.Array[NodeId] = js.native
  def getValidChildrenTypesDetailed(aspect: Aspect, noFilter: Boolean): Dictionary[_] = js.native
  def getValidPointerNames(): js.Array[Name] = js.native
  def getValidSetMemberTypesDetailed(setName: Name): StringDictionary[js.Any] = js.native
  def getValidSetNames(): js.Array[Name] = js.native
  def getValildAttributeNames(): js.Array[Name] = js.native
  def isAbstract(): Boolean = js.native
  def isConnection(): Boolean = js.native
  def isLibraryElement(): Boolean = js.native
  def isLibraryRoot(): Boolean = js.native
  def isMetaNode(): Boolean = js.native
  def isReadOnly(): Boolean = js.native
  def isTypeOf(typePath: Path): Boolean = js.native
  def isValidAttributeValueOf(name: Name, value: js.Any): Boolean = js.native
  def isValidChildOf(parentPath: Path): Boolean = js.native
  def isValidNewBase(basePath: Path): Boolean = js.native
  def isValidNewParent(parentPath: Path): Boolean = js.native
  def isValidTargetOf(sourcePath: Path, name: Name): Boolean = js.native
}

object Node {
  @scala.inline
  def apply(
    _id: String,
    canSetAsMixin: Path => Boolean,
    getAspectMeta: () => Metadata,
    getAttribute: Name => OutAttr,
    getAttributeMeta: Name => AttrMeta,
    getAttributeNames: () => js.Array[Name],
    getBaseId: () => NodeId,
    getBaseTypeId: () => Node | Null,
    getChildrenIds: () => js.Array[NodeId],
    getCollectionPaths: Name => js.Array[Path],
    getConstraint: Name => Constraint,
    getConstraintNames: () => js.Array[Name],
    getCrosscutsInfo: () => CrosscutsInfo,
    getEditableAttribute: Name => OutAttr,
    getEditableMemberAttribute: (SetId, MemberId, Name) => OutAttr,
    getEditableMemberRegistry: (SetId, MemberId, Name) => Registry,
    getEditableRegistry: Name => Registry,
    getFullyQualifiedName: () => Name,
    getGuid: () => GUID,
    getId: () => NodeId,
    getInheritorIds: () => js.Array[NodeId],
    getInstancePaths: () => js.Array[Path],
    getJsonMeta: () => js.Array[Metadata],
    getLibraryGuid: () => GUID,
    getMemberAttribute: (SetId, MemberId) => OutAttr,
    getMemberAttributeNames: (SetId, MemberId) => js.Array[Name],
    getMemberIds: SetId => js.Array[Path],
    getMemberRegistry: (SetId, MemberId, Name) => Registry,
    getMemberRegistryNames: (SetId, MemberId) => js.Array[Name],
    getMetaTypeId: () => Node | Null,
    getMixinPaths: () => js.Array[Path],
    getNamespace: () => Name,
    getNode: (NodeId, GmeLogger, js.Any, ResultCallback[Storage]) => Node,
    getOwnAttribute: Name => OutAttr,
    getOwnAttributeNames: () => js.Array[Name],
    getOwnConstraintNames: () => js.Array[Name],
    getOwnEditableAttribute: Name => OutAttr,
    getOwnEditableRegistry: Name => Registry,
    getOwnPointer: Name => Pointer,
    getOwnPointerId: Name => SetId,
    getOwnPointerNames: () => js.Array[Name],
    getOwnRegistry: Name => Registry,
    getOwnRegistryNames: () => js.Array[Name],
    getOwnValidAspectNames: () => js.Array[Name],
    getOwnValidAttributeNames: () => js.Array[Name],
    getParentId: () => NodeId,
    getPointer: Name => Pointer,
    getPointerId: Name => SetId,
    getPointerNames: () => js.Array[Name],
    getRegistry: Name => Registry,
    getRegistryNames: () => js.Array[Name],
    getRelid: () => RelId,
    getSetNames: () => js.Array[Name],
    getValidAspectNames: () => js.Array[Name],
    getValidAttributeNames: () => js.Array[Name],
    getValidChildrenIds: () => js.Array[NodeId],
    getValidChildrenTypes: () => js.Array[NodeId],
    getValidChildrenTypesDetailed: (Aspect, Boolean) => Dictionary[_],
    getValidPointerNames: () => js.Array[Name],
    getValidSetMemberTypesDetailed: Name => StringDictionary[js.Any],
    getValidSetNames: () => js.Array[Name],
    getValildAttributeNames: () => js.Array[Name],
    isAbstract: () => Boolean,
    isConnection: () => Boolean,
    isLibraryElement: () => Boolean,
    isLibraryRoot: () => Boolean,
    isMetaNode: () => Boolean,
    isReadOnly: () => Boolean,
    isTypeOf: Path => Boolean,
    isValidAttributeValueOf: (Name, js.Any) => Boolean,
    isValidChildOf: Path => Boolean,
    isValidNewBase: Path => Boolean,
    isValidNewParent: Path => Boolean,
    isValidTargetOf: (Path, Name) => Boolean
  ): Node = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], canSetAsMixin = js.Any.fromFunction1(canSetAsMixin), getAspectMeta = js.Any.fromFunction0(getAspectMeta), getAttribute = js.Any.fromFunction1(getAttribute), getAttributeMeta = js.Any.fromFunction1(getAttributeMeta), getAttributeNames = js.Any.fromFunction0(getAttributeNames), getBaseId = js.Any.fromFunction0(getBaseId), getBaseTypeId = js.Any.fromFunction0(getBaseTypeId), getChildrenIds = js.Any.fromFunction0(getChildrenIds), getCollectionPaths = js.Any.fromFunction1(getCollectionPaths), getConstraint = js.Any.fromFunction1(getConstraint), getConstraintNames = js.Any.fromFunction0(getConstraintNames), getCrosscutsInfo = js.Any.fromFunction0(getCrosscutsInfo), getEditableAttribute = js.Any.fromFunction1(getEditableAttribute), getEditableMemberAttribute = js.Any.fromFunction3(getEditableMemberAttribute), getEditableMemberRegistry = js.Any.fromFunction3(getEditableMemberRegistry), getEditableRegistry = js.Any.fromFunction1(getEditableRegistry), getFullyQualifiedName = js.Any.fromFunction0(getFullyQualifiedName), getGuid = js.Any.fromFunction0(getGuid), getId = js.Any.fromFunction0(getId), getInheritorIds = js.Any.fromFunction0(getInheritorIds), getInstancePaths = js.Any.fromFunction0(getInstancePaths), getJsonMeta = js.Any.fromFunction0(getJsonMeta), getLibraryGuid = js.Any.fromFunction0(getLibraryGuid), getMemberAttribute = js.Any.fromFunction2(getMemberAttribute), getMemberAttributeNames = js.Any.fromFunction2(getMemberAttributeNames), getMemberIds = js.Any.fromFunction1(getMemberIds), getMemberRegistry = js.Any.fromFunction3(getMemberRegistry), getMemberRegistryNames = js.Any.fromFunction2(getMemberRegistryNames), getMetaTypeId = js.Any.fromFunction0(getMetaTypeId), getMixinPaths = js.Any.fromFunction0(getMixinPaths), getNamespace = js.Any.fromFunction0(getNamespace), getNode = js.Any.fromFunction4(getNode), getOwnAttribute = js.Any.fromFunction1(getOwnAttribute), getOwnAttributeNames = js.Any.fromFunction0(getOwnAttributeNames), getOwnConstraintNames = js.Any.fromFunction0(getOwnConstraintNames), getOwnEditableAttribute = js.Any.fromFunction1(getOwnEditableAttribute), getOwnEditableRegistry = js.Any.fromFunction1(getOwnEditableRegistry), getOwnPointer = js.Any.fromFunction1(getOwnPointer), getOwnPointerId = js.Any.fromFunction1(getOwnPointerId), getOwnPointerNames = js.Any.fromFunction0(getOwnPointerNames), getOwnRegistry = js.Any.fromFunction1(getOwnRegistry), getOwnRegistryNames = js.Any.fromFunction0(getOwnRegistryNames), getOwnValidAspectNames = js.Any.fromFunction0(getOwnValidAspectNames), getOwnValidAttributeNames = js.Any.fromFunction0(getOwnValidAttributeNames), getParentId = js.Any.fromFunction0(getParentId), getPointer = js.Any.fromFunction1(getPointer), getPointerId = js.Any.fromFunction1(getPointerId), getPointerNames = js.Any.fromFunction0(getPointerNames), getRegistry = js.Any.fromFunction1(getRegistry), getRegistryNames = js.Any.fromFunction0(getRegistryNames), getRelid = js.Any.fromFunction0(getRelid), getSetNames = js.Any.fromFunction0(getSetNames), getValidAspectNames = js.Any.fromFunction0(getValidAspectNames), getValidAttributeNames = js.Any.fromFunction0(getValidAttributeNames), getValidChildrenIds = js.Any.fromFunction0(getValidChildrenIds), getValidChildrenTypes = js.Any.fromFunction0(getValidChildrenTypes), getValidChildrenTypesDetailed = js.Any.fromFunction2(getValidChildrenTypesDetailed), getValidPointerNames = js.Any.fromFunction0(getValidPointerNames), getValidSetMemberTypesDetailed = js.Any.fromFunction1(getValidSetMemberTypesDetailed), getValidSetNames = js.Any.fromFunction0(getValidSetNames), getValildAttributeNames = js.Any.fromFunction0(getValildAttributeNames), isAbstract = js.Any.fromFunction0(isAbstract), isConnection = js.Any.fromFunction0(isConnection), isLibraryElement = js.Any.fromFunction0(isLibraryElement), isLibraryRoot = js.Any.fromFunction0(isLibraryRoot), isMetaNode = js.Any.fromFunction0(isMetaNode), isReadOnly = js.Any.fromFunction0(isReadOnly), isTypeOf = js.Any.fromFunction1(isTypeOf), isValidAttributeValueOf = js.Any.fromFunction2(isValidAttributeValueOf), isValidChildOf = js.Any.fromFunction1(isValidChildOf), isValidNewBase = js.Any.fromFunction1(isValidNewBase), isValidNewParent = js.Any.fromFunction1(isValidNewParent), isValidTargetOf = js.Any.fromFunction2(isValidTargetOf))
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  implicit class NodeOps[Self <: Node] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanSetAsMixin(value: Path => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canSetAsMixin")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetAspectMeta(value: () => Metadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAspectMeta")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetAttribute(value: Name => OutAttr): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAttribute")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetAttributeMeta(value: Name => AttrMeta): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAttributeMeta")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetAttributeNames(value: () => js.Array[Name]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAttributeNames")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetBaseId(value: () => NodeId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBaseId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetBaseTypeId(value: () => Node | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBaseTypeId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetChildrenIds(value: () => js.Array[NodeId]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getChildrenIds")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCollectionPaths(value: Name => js.Array[Path]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCollectionPaths")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetConstraint(value: Name => Constraint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getConstraint")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetConstraintNames(value: () => js.Array[Name]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getConstraintNames")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCrosscutsInfo(value: () => CrosscutsInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCrosscutsInfo")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetEditableAttribute(value: Name => OutAttr): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEditableAttribute")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetEditableMemberAttribute(value: (SetId, MemberId, Name) => OutAttr): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEditableMemberAttribute")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetEditableMemberRegistry(value: (SetId, MemberId, Name) => Registry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEditableMemberRegistry")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetEditableRegistry(value: Name => Registry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEditableRegistry")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetFullyQualifiedName(value: () => Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFullyQualifiedName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetGuid(value: () => GUID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGuid")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetId(value: () => NodeId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetInheritorIds(value: () => js.Array[NodeId]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInheritorIds")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetInstancePaths(value: () => js.Array[Path]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInstancePaths")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetJsonMeta(value: () => js.Array[Metadata]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getJsonMeta")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLibraryGuid(value: () => GUID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLibraryGuid")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMemberAttribute(value: (SetId, MemberId) => OutAttr): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMemberAttribute")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetMemberAttributeNames(value: (SetId, MemberId) => js.Array[Name]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMemberAttributeNames")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetMemberIds(value: SetId => js.Array[Path]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMemberIds")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetMemberRegistry(value: (SetId, MemberId, Name) => Registry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMemberRegistry")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetMemberRegistryNames(value: (SetId, MemberId) => js.Array[Name]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMemberRegistryNames")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetMetaTypeId(value: () => Node | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMetaTypeId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMixinPaths(value: () => js.Array[Path]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMixinPaths")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetNamespace(value: () => Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNamespace")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetNode(value: (NodeId, GmeLogger, js.Any, ResultCallback[Storage]) => Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNode")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withGetOwnAttribute(value: Name => OutAttr): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOwnAttribute")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetOwnAttributeNames(value: () => js.Array[Name]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOwnAttributeNames")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetOwnConstraintNames(value: () => js.Array[Name]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOwnConstraintNames")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetOwnEditableAttribute(value: Name => OutAttr): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOwnEditableAttribute")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetOwnEditableRegistry(value: Name => Registry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOwnEditableRegistry")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetOwnPointer(value: Name => Pointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOwnPointer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetOwnPointerId(value: Name => SetId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOwnPointerId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetOwnPointerNames(value: () => js.Array[Name]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOwnPointerNames")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetOwnRegistry(value: Name => Registry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOwnRegistry")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetOwnRegistryNames(value: () => js.Array[Name]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOwnRegistryNames")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetOwnValidAspectNames(value: () => js.Array[Name]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOwnValidAspectNames")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetOwnValidAttributeNames(value: () => js.Array[Name]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOwnValidAttributeNames")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetParentId(value: () => NodeId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParentId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPointer(value: Name => Pointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPointer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetPointerId(value: Name => SetId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPointerId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetPointerNames(value: () => js.Array[Name]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPointerNames")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRegistry(value: Name => Registry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRegistry")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetRegistryNames(value: () => js.Array[Name]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRegistryNames")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRelid(value: () => RelId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRelid")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSetNames(value: () => js.Array[Name]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSetNames")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetValidAspectNames(value: () => js.Array[Name]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValidAspectNames")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetValidAttributeNames(value: () => js.Array[Name]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValidAttributeNames")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetValidChildrenIds(value: () => js.Array[NodeId]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValidChildrenIds")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetValidChildrenTypes(value: () => js.Array[NodeId]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValidChildrenTypes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetValidChildrenTypesDetailed(value: (Aspect, Boolean) => Dictionary[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValidChildrenTypesDetailed")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetValidPointerNames(value: () => js.Array[Name]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValidPointerNames")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetValidSetMemberTypesDetailed(value: Name => StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValidSetMemberTypesDetailed")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetValidSetNames(value: () => js.Array[Name]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValidSetNames")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetValildAttributeNames(value: () => js.Array[Name]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValildAttributeNames")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsAbstract(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAbstract")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsConnection(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isConnection")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsLibraryElement(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLibraryElement")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsLibraryRoot(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLibraryRoot")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsMetaNode(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMetaNode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsReadOnly(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isReadOnly")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsTypeOf(value: Path => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTypeOf")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsValidAttributeValueOf(value: (Name, js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValidAttributeValueOf")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withIsValidChildOf(value: Path => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValidChildOf")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsValidNewBase(value: Path => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValidNewBase")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsValidNewParent(value: Path => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValidNewParent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsValidTargetOf(value: (Path, Name) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValidTargetOf")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

