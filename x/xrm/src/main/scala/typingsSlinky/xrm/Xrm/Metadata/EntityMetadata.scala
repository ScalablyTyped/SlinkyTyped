package typingsSlinky.xrm.Xrm.Metadata

import typingsSlinky.xrm.Xrm.Collection.StringIndexableItemCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Types returned by a call to getEntityMetadata
  */
@js.native
trait EntityMetadata extends js.Object {
  var ActivityTypeMask: Double = js.native
  /**
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
    */
  var Attributes: StringIndexableItemCollection[AttributeMetadata] = js.native
  var AutoRouteToOwnerQueue: Boolean = js.native
  var CanBeInManyToMany: Boolean = js.native
  var CanBePrimaryEntityInRelationship: Boolean = js.native
  var CanBeRelatedEntityInRelationship: Boolean = js.native
  var CanCreateAttributes: Boolean = js.native
  var CanCreateCharts: Boolean = js.native
  var CanCreateForms: Boolean = js.native
  var CanCreateViews: Boolean = js.native
  var CanEnableSyncToExternalSearchIndex: Boolean = js.native
  var CanModifyAdditionalSettings: Boolean = js.native
  var CanTriggerWorkflow: Boolean = js.native
  var Description: Label = js.native
  var DisplayCollectionName: Label = js.native
  var DisplayName: Label = js.native
  var EntityColor: String = js.native
  var EntitySetName: String = js.native
  var IconLargeName: String = js.native
  var IconMediumName: String = js.native
  var IconSmallName: String = js.native
  var IsActivity: Boolean = js.native
  var IsActivityParty: Boolean = js.native
  var IsAuditEnabled: Boolean = js.native
  var IsAvailableOffline: Boolean = js.native
  var IsBPFEntity: Boolean = js.native
  var IsChildEntity: Boolean = js.native
  var IsConnectionsEnabled: Boolean = js.native
  var IsCustomEntity: Boolean = js.native
  var IsCustomizable: Boolean = js.native
  var IsDocumentManagementEnabled: Boolean = js.native
  var IsDuplicateDetectionEnabled: Boolean = js.native
  var IsEnabledForCharts: Boolean = js.native
  var IsImportable: Boolean = js.native
  var IsIntersect: Boolean = js.native
  var IsMailMergeEnabled: Boolean = js.native
  var IsManaged: Boolean = js.native
  var IsMappable: Boolean = js.native
  var IsOneNotIntegrationEnabled: Boolean = js.native
  var IsOptimisitcConcurrencyEnabled: Boolean = js.native
  var IsQuickCreateEnabled: Boolean = js.native
  var IsReadingPaneEnabled: Boolean = js.native
  var IsRenameable: Boolean = js.native
  var IsStateModelAware: Boolean = js.native
  var IsValidForAdvancedFind: Boolean = js.native
  var IsValidForQueue: Boolean = js.native
  var IsVisibleInMobileClient: Boolean = js.native
  var LogicalCollectionName: String = js.native
  var LogicalName: String = js.native
  var ObjectTypeCode: Double = js.native
  var OwnershipTypeCode: Double = js.native
  var PrimaryIdAttribute: String = js.native
  var PrimaryImageAttribute: String = js.native
  var PrimaryNameAttribute: String = js.native
  var RecurrenceBaseEntityLogicalName: String = js.native
}

object EntityMetadata {
  @scala.inline
  def apply(
    ActivityTypeMask: Double,
    Attributes: StringIndexableItemCollection[AttributeMetadata],
    AutoRouteToOwnerQueue: Boolean,
    CanBeInManyToMany: Boolean,
    CanBePrimaryEntityInRelationship: Boolean,
    CanBeRelatedEntityInRelationship: Boolean,
    CanCreateAttributes: Boolean,
    CanCreateCharts: Boolean,
    CanCreateForms: Boolean,
    CanCreateViews: Boolean,
    CanEnableSyncToExternalSearchIndex: Boolean,
    CanModifyAdditionalSettings: Boolean,
    CanTriggerWorkflow: Boolean,
    Description: Label,
    DisplayCollectionName: Label,
    DisplayName: Label,
    EntityColor: String,
    EntitySetName: String,
    IconLargeName: String,
    IconMediumName: String,
    IconSmallName: String,
    IsActivity: Boolean,
    IsActivityParty: Boolean,
    IsAuditEnabled: Boolean,
    IsAvailableOffline: Boolean,
    IsBPFEntity: Boolean,
    IsChildEntity: Boolean,
    IsConnectionsEnabled: Boolean,
    IsCustomEntity: Boolean,
    IsCustomizable: Boolean,
    IsDocumentManagementEnabled: Boolean,
    IsDuplicateDetectionEnabled: Boolean,
    IsEnabledForCharts: Boolean,
    IsImportable: Boolean,
    IsIntersect: Boolean,
    IsMailMergeEnabled: Boolean,
    IsManaged: Boolean,
    IsMappable: Boolean,
    IsOneNotIntegrationEnabled: Boolean,
    IsOptimisitcConcurrencyEnabled: Boolean,
    IsQuickCreateEnabled: Boolean,
    IsReadingPaneEnabled: Boolean,
    IsRenameable: Boolean,
    IsStateModelAware: Boolean,
    IsValidForAdvancedFind: Boolean,
    IsValidForQueue: Boolean,
    IsVisibleInMobileClient: Boolean,
    LogicalCollectionName: String,
    LogicalName: String,
    ObjectTypeCode: Double,
    OwnershipTypeCode: Double,
    PrimaryIdAttribute: String,
    PrimaryImageAttribute: String,
    PrimaryNameAttribute: String,
    RecurrenceBaseEntityLogicalName: String
  ): EntityMetadata = {
    val __obj = js.Dynamic.literal(ActivityTypeMask = ActivityTypeMask.asInstanceOf[js.Any], Attributes = Attributes.asInstanceOf[js.Any], AutoRouteToOwnerQueue = AutoRouteToOwnerQueue.asInstanceOf[js.Any], CanBeInManyToMany = CanBeInManyToMany.asInstanceOf[js.Any], CanBePrimaryEntityInRelationship = CanBePrimaryEntityInRelationship.asInstanceOf[js.Any], CanBeRelatedEntityInRelationship = CanBeRelatedEntityInRelationship.asInstanceOf[js.Any], CanCreateAttributes = CanCreateAttributes.asInstanceOf[js.Any], CanCreateCharts = CanCreateCharts.asInstanceOf[js.Any], CanCreateForms = CanCreateForms.asInstanceOf[js.Any], CanCreateViews = CanCreateViews.asInstanceOf[js.Any], CanEnableSyncToExternalSearchIndex = CanEnableSyncToExternalSearchIndex.asInstanceOf[js.Any], CanModifyAdditionalSettings = CanModifyAdditionalSettings.asInstanceOf[js.Any], CanTriggerWorkflow = CanTriggerWorkflow.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], DisplayCollectionName = DisplayCollectionName.asInstanceOf[js.Any], DisplayName = DisplayName.asInstanceOf[js.Any], EntityColor = EntityColor.asInstanceOf[js.Any], EntitySetName = EntitySetName.asInstanceOf[js.Any], IconLargeName = IconLargeName.asInstanceOf[js.Any], IconMediumName = IconMediumName.asInstanceOf[js.Any], IconSmallName = IconSmallName.asInstanceOf[js.Any], IsActivity = IsActivity.asInstanceOf[js.Any], IsActivityParty = IsActivityParty.asInstanceOf[js.Any], IsAuditEnabled = IsAuditEnabled.asInstanceOf[js.Any], IsAvailableOffline = IsAvailableOffline.asInstanceOf[js.Any], IsBPFEntity = IsBPFEntity.asInstanceOf[js.Any], IsChildEntity = IsChildEntity.asInstanceOf[js.Any], IsConnectionsEnabled = IsConnectionsEnabled.asInstanceOf[js.Any], IsCustomEntity = IsCustomEntity.asInstanceOf[js.Any], IsCustomizable = IsCustomizable.asInstanceOf[js.Any], IsDocumentManagementEnabled = IsDocumentManagementEnabled.asInstanceOf[js.Any], IsDuplicateDetectionEnabled = IsDuplicateDetectionEnabled.asInstanceOf[js.Any], IsEnabledForCharts = IsEnabledForCharts.asInstanceOf[js.Any], IsImportable = IsImportable.asInstanceOf[js.Any], IsIntersect = IsIntersect.asInstanceOf[js.Any], IsMailMergeEnabled = IsMailMergeEnabled.asInstanceOf[js.Any], IsManaged = IsManaged.asInstanceOf[js.Any], IsMappable = IsMappable.asInstanceOf[js.Any], IsOneNotIntegrationEnabled = IsOneNotIntegrationEnabled.asInstanceOf[js.Any], IsOptimisitcConcurrencyEnabled = IsOptimisitcConcurrencyEnabled.asInstanceOf[js.Any], IsQuickCreateEnabled = IsQuickCreateEnabled.asInstanceOf[js.Any], IsReadingPaneEnabled = IsReadingPaneEnabled.asInstanceOf[js.Any], IsRenameable = IsRenameable.asInstanceOf[js.Any], IsStateModelAware = IsStateModelAware.asInstanceOf[js.Any], IsValidForAdvancedFind = IsValidForAdvancedFind.asInstanceOf[js.Any], IsValidForQueue = IsValidForQueue.asInstanceOf[js.Any], IsVisibleInMobileClient = IsVisibleInMobileClient.asInstanceOf[js.Any], LogicalCollectionName = LogicalCollectionName.asInstanceOf[js.Any], LogicalName = LogicalName.asInstanceOf[js.Any], ObjectTypeCode = ObjectTypeCode.asInstanceOf[js.Any], OwnershipTypeCode = OwnershipTypeCode.asInstanceOf[js.Any], PrimaryIdAttribute = PrimaryIdAttribute.asInstanceOf[js.Any], PrimaryImageAttribute = PrimaryImageAttribute.asInstanceOf[js.Any], PrimaryNameAttribute = PrimaryNameAttribute.asInstanceOf[js.Any], RecurrenceBaseEntityLogicalName = RecurrenceBaseEntityLogicalName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityMetadata]
  }
  @scala.inline
  implicit class EntityMetadataOps[Self <: EntityMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivityTypeMask(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActivityTypeMask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttributes(value: StringIndexableItemCollection[AttributeMetadata]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoRouteToOwnerQueue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoRouteToOwnerQueue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanBeInManyToMany(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CanBeInManyToMany")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanBePrimaryEntityInRelationship(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CanBePrimaryEntityInRelationship")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanBeRelatedEntityInRelationship(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CanBeRelatedEntityInRelationship")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanCreateAttributes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CanCreateAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanCreateCharts(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CanCreateCharts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanCreateForms(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CanCreateForms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanCreateViews(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CanCreateViews")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanEnableSyncToExternalSearchIndex(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CanEnableSyncToExternalSearchIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanModifyAdditionalSettings(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CanModifyAdditionalSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanTriggerWorkflow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CanTriggerWorkflow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: Label): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayCollectionName(value: Label): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayCollectionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayName(value: Label): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntityColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EntityColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntitySetName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EntitySetName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIconLargeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IconLargeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIconMediumName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IconMediumName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIconSmallName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IconSmallName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsActivity(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsActivity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsActivityParty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsActivityParty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsAuditEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsAuditEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsAvailableOffline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsAvailableOffline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsBPFEntity(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsBPFEntity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsChildEntity(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsChildEntity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsConnectionsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsConnectionsEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsCustomEntity(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsCustomEntity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsCustomizable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsCustomizable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsDocumentManagementEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsDocumentManagementEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsDuplicateDetectionEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsDuplicateDetectionEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsEnabledForCharts(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsEnabledForCharts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsImportable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsImportable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsIntersect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsIntersect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsMailMergeEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsMailMergeEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsManaged(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsManaged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsMappable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsMappable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsOneNotIntegrationEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsOneNotIntegrationEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsOptimisitcConcurrencyEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsOptimisitcConcurrencyEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsQuickCreateEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsQuickCreateEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsReadingPaneEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsReadingPaneEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsRenameable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsRenameable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsStateModelAware(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsStateModelAware")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsValidForAdvancedFind(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsValidForAdvancedFind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsValidForQueue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsValidForQueue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsVisibleInMobileClient(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsVisibleInMobileClient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogicalCollectionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogicalCollectionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogicalName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogicalName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectTypeCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectTypeCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwnershipTypeCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnershipTypeCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrimaryIdAttribute(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrimaryIdAttribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrimaryImageAttribute(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrimaryImageAttribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrimaryNameAttribute(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrimaryNameAttribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecurrenceBaseEntityLogicalName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecurrenceBaseEntityLogicalName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

