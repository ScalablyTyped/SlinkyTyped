package typingsSlinky.sharepoint.SP

import typingsSlinky.sharepoint.SP.Workflow.WorkflowAssociationCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a list on a SharePoint Web site. */
@js.native
trait List[T] extends SecurableObject {
  
  /** Creates a new list item in the list. */
  def addItem(parameters: ListItemCreationInformation): ListItem[T] = js.native
  
  /** Deletes the list. */
  def deleteObject(): Unit = js.native
  
  /** Returns the collection of changes from the change log that have occurred within the list, based on the specified query. */
  def getChanges(query: ChangeQuery): ChangeCollection = js.native
  
  /** Gets item by id. */
  def getItemById(id: Double): ListItem[T] = js.native
  
  /** Returns collection of list items based on the specified CAML query. */
  def getItems(query: CamlQuery): ListItemCollection[T] = js.native
  
  /** Returns array of items describing changes since time specified in the query */
  def getListItemChangesSinceToken(query: ChangeLogItemQuery): js.Array[_] = js.native
  
  /** Returns a collection of lookup fields that use this list as a data source and that have FieldLookup.IsRelationship set to true. */
  def getRelatedFields(): RelatedFieldCollection = js.native
  
  /** This member is reserved for internal use and is not intended to be used directly from your code. */
  def getRelatedFieldsExtendedData(): RelatedFieldExtendedDataCollection = js.native
  
  /** Gets the effective permissions that a specified user has on the list. */
  def getUserEffectivePermissions(userName: String): BasePermissions = js.native
  
  /** Returns the list view with the specified view identifier. */
  def getView(viewGuid: Guid): View = js.native
  
  /** Gets a value that specifies whether the list supports content types. */
  def get_allowContentTypes(): Boolean = js.native
  
  /** Gets the list definition type on which the list is based. For lists based on OOTB list definitions, return value corresponds the SP.ListTemplateType enumeration. */
  def get_baseTemplate(): Double = js.native
  
  /** Gets base type for the list. */
  def get_baseType(): BaseType = js.native
  
  /** Gets a value that specifies the override of the web application's BrowserFileHandling property at the list level. */
  def get_browserFileHandling(): BrowserFileHandling = js.native
  
  /** Gets the content types that are associated with the list. */
  def get_contentTypes(): ContentTypeCollection = js.native
  
  /** Gets a value that specifies whether content types are enabled for the list. */
  def get_contentTypesEnabled(): Boolean = js.native
  
  /** Gets a value that specifies when the list was created. */
  def get_created(): js.Date = js.native
  
  /** Gets the data source associated with the list, or null if the list is not a virtual list. */
  def get_dataSource(): ListDataSource = js.native
  
  /** Gets a value that specifies the default workflow identifier for content approval on the list. */
  def get_defaultContentApprovalWorkflowId(): Guid = js.native
  
  /** Gets a value that specifies the location of the default display form for the list. */
  def get_defaultDisplayFormUrl(): String = js.native
  
  /** Gets a value that specifies the URL of the edit form to use for list items in the list. */
  def get_defaultEditFormUrl(): String = js.native
  
  /** Gets a value that specifies the location of the default new form for the list. */
  def get_defaultNewFormUrl(): String = js.native
  
  /** Gets default view for the list. */
  def get_defaultView(): View = js.native
  
  /** Get URL of the default view for the list. */
  def get_defaultViewUrl(): String = js.native
  
  /** Gets a value that specifies the description of the list. */
  def get_description(): String = js.native
  
  /** Gets a value that specifies the reading order of the list. */
  def get_direction(): String = js.native
  
  /** Gets a value that specifies the server-relative URL of the document template for the list */
  def get_documentTemplateUrl(): String = js.native
  
  /** Gets a value that specifies the minimum permission required to view minor versions and drafts within the list. */
  def get_draftVersionVisibility(): DraftVisibilityType = js.native
  
  /** Gets a value that specifies the effective permissions on the list that are assigned to the current user. */
  def get_effectiveBasePermissions(): BasePermissions = js.native
  
  /** Gets the effective base permissions for the current user, as they should be displayed in UI. This will only differ from EffectiveBasePermissions if ReadOnlyUI is set to true, and in all cases will be a subset of EffectiveBasePermissions. To put it another way, EffectiveBasePermissionsForUI will always be as or more restrictive than EffectiveBasePermissions. */
  def get_effectiveBasePermissionsForUI(): BasePermissions = js.native
  
  /** Gets a value that specifies whether list item attachments are enabled for the list. */
  def get_enableAttachments(): Boolean = js.native
  
  /** Gets a value that specifies whether new list folders can be added to the list. */
  def get_enableFolderCreation(): Boolean = js.native
  
  /** Gets a value that specifies whether minor versions are enabled for the list. */
  def get_enableMinorVersions(): Boolean = js.native
  
  /** Gets a value that specifies whether content approval is enabled for the list. */
  def get_enableModeration(): Boolean = js.native
  
  /** Gets a value that specifies whether historical versions of list items and documents can be created in the list */
  def get_enableVersioning(): Boolean = js.native
  
  /** The entity type name. */
  def get_entityTypeName(): String = js.native
  
  /** Gets collection of event receiver objects associated with the list. */
  def get_eventReceivers(): EventReceiverDefinitionCollection = js.native
  
  /** Gets a value that specifies the collection of all fields in the list. */
  def get_fields(): FieldCollection = js.native
  
  /** Gets a value that indicates whether forced checkout is enabled for the document library. */
  def get_forceCheckout(): Boolean = js.native
  
  /** Gets collections of forms associated with the list. */
  def get_forms(): FormCollection = js.native
  
  /** Returns true if this is external list. */
  def get_hasExternalDataSource(): Boolean = js.native
  
  /** Gets wherever the list is hidden */
  def get_hidden(): Boolean = js.native
  
  /** Gets id of the list */
  def get_id(): Guid = js.native
  
  /** Gets a value that specifies the URI for the icon of the list */
  def get_imageUrl(): String = js.native
  
  /** Settings of document library Information Rights Management (IRM)  */
  def get_informationRightsManagementSettings(): InformationRightsManagementSettings = js.native
  
  /** Gets a value that specifies whether Information Rights Management (IRM) is enabled for the list.  */
  def get_irmEnabled(): Boolean = js.native
  
  /** Gets a value that specifies whether Information Rights Management (IRM) expiration is enabled for the list.  */
  def get_irmExpire(): Boolean = js.native
  
  /** Gets a value that specifies whether Information Rights Management (IRM) rejection is enabled for the list.  */
  def get_irmReject(): Boolean = js.native
  
  /** Indicates whether this list should be treated as a top level navigation object or not.  */
  def get_isApplicationList(): Boolean = js.native
  
  /** Gets a value that specifies whether the list is a gallery. */
  def get_isCatalog(): Boolean = js.native
  
  /** Gets a value that indicates whether the document library is a private list with restricted permissions, such as for Solutions.  */
  def get_isPrivate(): Boolean = js.native
  
  /** Gets a value that indicates whether the list is designated as a default asset location for images or other files which the users upload to their wiki pages. */
  def get_isSiteAssetsLibrary(): Boolean = js.native
  
  /** Gets a value that specifies the number of list items in the list */
  def get_itemCount(): Double = js.native
  
  /** Gets a value that specifies the last time a list item was deleted from the list. */
  def get_lastItemDeletedDate(): js.Date = js.native
  
  /** Gets a value that specifies the last time a list item, field, or property of the list was modified. */
  def get_lastItemModifiedDate(): js.Date = js.native
  
  /** The entity type full name of the list item in the list. */
  def get_listItemEntityTypeFullName(): String = js.native
  
  /** Gets a value that indicates whether the list in a Meeting Workspace site contains data for multiple meeting instances within the site */
  def get_multipleDataList(): Boolean = js.native
  
  /** Gets a value that specifies that the crawler must not crawl the list */
  def get_noCrawl(): Boolean = js.native
  
  /** Gets a value that specifies whether the list appears on the Quick Launch of the site */
  def get_onQuickLaunch(): Boolean = js.native
  
  /** Gets a value that specifies the site that contains the list. */
  def get_parentWeb(): Web = js.native
  
  /** Gets a value that specifies the server-relative URL of the site that contains the list. */
  def get_parentWebUrl(): String = js.native
  
  /** Gets the root folder that contains the files in the list and any related files. */
  def get_rootFolder(): Folder = js.native
  
  /** Gets a value that specifies the list schema of the list. */
  def get_schemaXml(): String = js.native
  
  /** Gets a value that indicates whether folders can be created within the list. */
  def get_serverTemplateCanCreateFolders(): Boolean = js.native
  
  /** Gets a value that specifies the feature identifier of the feature that contains the list schema for the list. */
  def get_templateFeatureId(): Guid = js.native
  
  /** Gets the list title. You can determine list URL from it's root folder URL. */
  def get_title(): String = js.native
  
  /** Gets collection of custom actions associated with the list. */
  def get_userCustomActions(): UserCustomActionCollection = js.native
  
  /** Gets a value that specifies the data validation criteria for a list item. */
  def get_validationFormula(): String = js.native
  
  /** Gets a value that specifies the error message returned when data validation fails for a list item. */
  def get_validationMessage(): String = js.native
  
  /** Returns collection of views added to the list */
  def get_views(): ViewCollection = js.native
  
  /** Gets the collection of workflow association objects that represents all the workflows that are associated with the list. */
  def get_workflowAssociations(): WorkflowAssociationCollection = js.native
  
  /** Sends the list to the site recycle bin. */
  def recycle(): GuidResult = js.native
  
  /** Returns the data for the specified query view. */
  def renderListData(viewXml: String): StringResult = js.native
  
  /** Returns json string which contains all information necessary for rendering the specified list form for the specified itemId. Mode is SP.ControlMode */
  def renderListFormData(itemId: Double, formId: String, mode: ControlMode): StringResult = js.native
  
  /** This member is reserved for internal use and is not intended to be used directly from your code. */
  def reserveListItemId(): IntResult = js.native
  
  /** First tries to find if the view already exists. Overwrite it if yes, add a new view if no. Then extract all the adhoc filter/sort info from the URL and build and update the view's xml Returns the url of the new/overwritten view.
    @param oldName The name of the view the user did the adhoc filter on (is currently on).
    @param newName The desired name the user typed
    @param privateView Boolean true when the user wants make a new view that's personal
    @param uri Url that keeps all the adhoc filter/sort inforatmion */
  def saveAsNewView(oldName: String, newName: String, privateView: Boolean, uri: String): StringResult = js.native
  
  /** Sets a value that specifies whether content types are enabled for the list. */
  def set_contentTypesEnabled(value: Boolean): Unit = js.native
  
  /** Sets a value that specifies the default workflow identifier for content approval on the list. */
  def set_defaultContentApprovalWorkflowId(value: Guid): Unit = js.native
  
  /** Sets a value that specifies the location of the default display form for the list. */
  def set_defaultDisplayFormUrl(value: String): Unit = js.native
  
  /** Sets a value that specifies the URL of the edit form to use for list items in the list. */
  def set_defaultEditFormUrl(value: String): Unit = js.native
  
  /** Sets a value that specifies the location of the default new form for the list. */
  def set_defaultNewFormUrl(value: String): Unit = js.native
  
  /** Sets a value that specifies the description of the list. */
  def set_description(value: String): Unit = js.native
  
  /** Sets a value that specifies the reading order of the list. */
  def set_direction(value: String): Unit = js.native
  
  /** Sets a value that specifies the server-relative URL of the document template for the list */
  def set_documentTemplateUrl(value: String): Unit = js.native
  
  /** Sets a value that specifies the minimum permission required to view minor versions and drafts within the list. */
  def set_draftVersionVisibility(value: DraftVisibilityType): Unit = js.native
  
  /** Sets a value that specifies whether list item attachments are enabled for the list. */
  def set_enableAttachments(value: Boolean): Unit = js.native
  
  /** Sets a value that specifies whether new list folders can be added to the list. */
  def set_enableFolderCreation(value: Boolean): Unit = js.native
  
  /** Sets a value that specifies whether minor versions are enabled for the list. */
  def set_enableMinorVersions(value: Boolean): Unit = js.native
  
  /** Sets a value that specifies whether content approval is enabled for the list */
  def set_enableModeration(value: Boolean): Unit = js.native
  
  /** Sets a value that specifies whether historical versions of list items and documents can be created in the list */
  def set_enableVersioning(value: Boolean): Unit = js.native
  
  /** Sets a value that indicates whether forced checkout is enabled for the document library */
  def set_forceCheckout(value: Boolean): Unit = js.native
  
  /** Sets if the list is hidden from "All site contents" or not. */
  def set_hidden(value: Boolean): Unit = js.native
  
  /** Sets a value that specifies the URI for the icon of the list */
  def set_imageUrl(value: String): Unit = js.native
  
  /** Sets a value that specifies whether Information Rights Management (IRM) is enabled for the list.  */
  def set_irmEnabled(value: Boolean): Unit = js.native
  
  /** Sets a value that specifies whether Information Rights Management (IRM) expiration is enabled for the list.  */
  def set_irmExpire(value: Boolean): Unit = js.native
  
  /** Sets a value that specifies whether Information Rights Management (IRM) rejection is enabled for the list.  */
  def set_irmReject(value: Boolean): Unit = js.native
  
  /** Sets a value that indicates whether this list should be treated as a top level navigation object or not.  */
  def set_isApplicationList(value: Boolean): Unit = js.native
  
  /** Sets a value that specifies the last time the list was modified. */
  def set_lastItemModifiedDate(value: js.Date): Unit = js.native
  
  /** Sets a value that indicates whether the list in a Meeting Workspace site contains data for multiple meeting instances within the site */
  def set_multipleDataList(value: Boolean): Unit = js.native
  
  /** Sets a value that specifies that the crawler must not crawl the list */
  def set_noCrawl(value: Boolean): Unit = js.native
  
  /** Sets a value that specifies whether the list appears on the Quick Launch of the site */
  def set_onQuickLaunch(value: Boolean): Unit = js.native
  
  /** Sets the list title. To change list URL you should change name of the root folder. */
  def set_title(value: String): Unit = js.native
  
  /** Sets a value that specifies the data validation criteria for a list item. */
  def set_validationFormula(value: String): Unit = js.native
  
  /** Sets a value that specifies the error message returned when data validation fails for a list item. */
  def set_validationMessage(value: String): Unit = js.native
  
  /** Updates the database with changes that are made to the list object. */
  def update(): Unit = js.native
}
