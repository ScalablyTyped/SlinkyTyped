package typingsSlinky.xrm.Xrm

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.xrm.Window
import typingsSlinky.xrm.Xrm.Async.OpenQuickCreateSuccessCallbackObject
import typingsSlinky.xrm.Xrm.Async.PromiseLike
import typingsSlinky.xrm.Xrm.Collection.Dictionary
import typingsSlinky.xrm.Xrm.Metadata.EntityMetadata
import typingsSlinky.xrm.Xrm.Url.CmdBarDisplay
import typingsSlinky.xrm.Xrm.Url.NavBarDisplay
import typingsSlinky.xrm.Xrm.Utility.FormOpenParameters
import typingsSlinky.xrm.Xrm.Utility.OpenParameters
import typingsSlinky.xrm.Xrm.Utility.WindowOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for the Xrm.Utility API
  * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/xrm-utility External Link: Xrm.Utility (Client API reference)}
  */
@js.native
trait Utility extends StObject {
  
  /**
    * Displays an alert dialog, with an "OK" button.
    * @deprecated Deprecated in v9. Use {@link Xrm.Navigation.openAlertDialog} instead.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/get-started/whats-new/customer-engagement/important-changes-coming#some-client-apis-are-deprecated External Link: Deprecated Client APIs}
    * @param message The message.
    * @param onCloseCallback The "OK" callback.
    */
  def alertDialog(message: String, onCloseCallback: js.Function0[Unit]): Unit = js.native
  
  /**
    * Closes a progress dialog box.
    */
  def closeProgressIndicator(): Unit = js.native
  
  /**
    * Displays a confirmation dialog, with "OK" and "Cancel" buttons.
    * @deprecated Deprecated in v9. Use {@link Xrm.Navigation.openConfirmDialog} instead.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/get-started/whats-new/customer-engagement/important-changes-coming#some-client-apis-are-deprecated External Link: Deprecated Client APIs}
    * @param message The message.
    * @param yesCloseCallback The "OK" callback.
    * @param noCloseCallback The "Cancel" callback.
    */
  def confirmDialog(message: String, yesCloseCallback: js.Function0[Unit], noCloseCallback: js.Function0[Unit]): Unit = js.native
  
  /**
    * Returns the valid state transitions for the specified entity type and state code.
    * TODO: No info on the return type is available
    * @param entityName    The logical name of the entity.
    * @param stateCode     The state code to find out the allowed status transition values.
    */
  def getAllowedStatusTransitions(entityName: String, stateCode: Double): PromiseLike[_] = js.native
  
  /**
    * Returns the entity metadata for the specified entity.
    * @param entityName The logical name of the entity.
    * @param attributes The attributes to get metadata for.
    */
  def getEntityMetadata(entityName: String): PromiseLike[EntityMetadata] = js.native
  def getEntityMetadata(entityName: String, attributes: js.Array[String]): PromiseLike[EntityMetadata] = js.native
  
  /**
    * The method provides access to the global context without going through the form context.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/xrm-utility/getglobalcontext External Link: getGlobalContext (Client API reference)}
    */
  def getGlobalContext(): GlobalContext = js.native
  
  /**
    * Returns the localized string for a given key associated with the specified web resource.
    * @param webResourceName The name of the web resource.
    * @param key The key for the localized string.
    * @returns A localized string.
    */
  def getResourceString(webResourceName: String, key: String): String = js.native
  
  /**
    * Invokes an action based on the specified parameters
    * @param name Name of the process action to invoke.
    * @param parameters An object containing input parameters for the action. You define an object using key:value pairs of items, where key is of String type.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/xrm-utility/invokeprocessaction External Link: invokeProcessAction (Client API reference)}
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/customize/actions External Link: Actions overview}
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/create-own-actions External Link: Create your own actions}
    */
  def invokeProcessAction(name: String, parameters: Dictionary[_]): PromiseLike[_] = js.native
  
  /**
    * Query if 'entityType' is an Activity entity.
    * @deprecated Deprecated in v9. Use {@link Xrm.Utility.getEntityMetadata  Xrm.Utility.getEntityMetadata(entityName, ["IsActivity"])} instead.
    * @remarks The isActivityType method is synchronous so it was suitable for ribbon rules.
    * However, the replacement method, getEntityMetadata, is asynchronous, and is not suitable for ribbon rules.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/get-started/whats-new/customer-engagement/important-changes-coming#some-client-apis-are-deprecated External Link: Deprecated Client APIs}
    * @param entityType Type of the entity.
    * @returns true if the entity is an Activity, false if not.
    */
  def isActivityType(entityType: String): Boolean = js.native
  
  /**
    * Opens a lookup control to select one or more items.
    * @param lookupOptions Defines the options for opening the lookup dialog
    */
  def lookupObjects(lookupOptions: LookupOptions): PromiseLike[js.Array[LookupValue]] = js.native
  
  /**
    * Opens an entity form.
    * @deprecated Deprecated in v9. Use {@link Xrm.Navigation.openForm} instead.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/get-started/whats-new/customer-engagement/important-changes-coming#some-client-apis-are-deprecated External Link: Deprecated Client APIs}
    * @param name The entity's logical name.
    * @param id (Optional) The unique identifier for the record.
    * @param parameters (Optional) A dictionary object that passes extra query string parameters to the form.
    * @param windowOptions (Optional) Options for controlling the window.
    */
  def openEntityForm(name: String): Unit = js.native
  def openEntityForm(
    name: String,
    id: js.UndefOr[scala.Nothing],
    parameters: js.UndefOr[scala.Nothing],
    windowOptions: WindowOptions
  ): Unit = js.native
  def openEntityForm(name: String, id: js.UndefOr[scala.Nothing], parameters: FormOpenParameters): Unit = js.native
  def openEntityForm(
    name: String,
    id: js.UndefOr[scala.Nothing],
    parameters: FormOpenParameters,
    windowOptions: WindowOptions
  ): Unit = js.native
  def openEntityForm(name: String, id: String): Unit = js.native
  def openEntityForm(name: String, id: String, parameters: js.UndefOr[scala.Nothing], windowOptions: WindowOptions): Unit = js.native
  def openEntityForm(name: String, id: String, parameters: FormOpenParameters): Unit = js.native
  def openEntityForm(name: String, id: String, parameters: FormOpenParameters, windowOptions: WindowOptions): Unit = js.native
  
  /**
    * Opens quick create.
    * @deprecated Deprecated in v9. Use {@link Xrm.Navigation.openForm} instead with the option {useQuickCreateForm:true}.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/get-started/whats-new/customer-engagement/important-changes-coming#some-client-apis-are-deprecated External Link: Deprecated Client APIs}
    * @param entityLogicalName  The logical name of the entity to create.
    * @param createFromEntity (Optional) Designates a record that will provide default values based on mapped attribute values.
    * @param parameters (Optional) A dictionary object that passes extra query string parameters to the form. Invalid query string parameters will cause an error.
    * @returns Returns an asynchronous promise.
    */
  def openQuickCreate(entityLogicalName: String): PromiseLike[OpenQuickCreateSuccessCallbackObject] = js.native
  def openQuickCreate(entityLogicalName: String, createFromEntity: js.UndefOr[scala.Nothing], parameters: OpenParameters): PromiseLike[OpenQuickCreateSuccessCallbackObject] = js.native
  def openQuickCreate(entityLogicalName: String, createFromEntity: LookupValue): PromiseLike[OpenQuickCreateSuccessCallbackObject] = js.native
  def openQuickCreate(entityLogicalName: String, createFromEntity: LookupValue, parameters: OpenParameters): PromiseLike[OpenQuickCreateSuccessCallbackObject] = js.native
  
  /**
    * Opens an HTML Web Resource in a new browser window.
    * @deprecated Deprecated in v9. Use {@link Xrm.Navigation.openWebResource} instead.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/get-started/whats-new/customer-engagement/important-changes-coming#some-client-apis-are-deprecated External Link: Deprecated Client APIs}
    * @param webResourceName Name of the HTML web resource. Can be used to pass URL parameters.  See Remarks.
    * @param webResourceData (Optional) Data to pass into the Web Resource's data parameter. It is advised to use encodeURIcomponent() to encode the value.
    * @param width (Optional) The width of the new window.
    * @param height (Optional) The height of the new window.
    * @returns A Window reference, containing the opened Web Resource.
    * @remarks This function will not work with Microsoft Dynamics CRM for tablets.<BR>
    * **Valid WebResource URL Parameters**:
    * * typename
    * * type
    * * id
    * * orgname
    * * userlcid
    * * data (identical to this method's webResourceData parameter)
    * * formid
    */
  def openWebResource(webResourceName: String): Window = js.native
  def openWebResource(
    webResourceName: String,
    webResourceData: js.UndefOr[scala.Nothing],
    width: js.UndefOr[scala.Nothing],
    height: Double
  ): Window = js.native
  def openWebResource(webResourceName: String, webResourceData: js.UndefOr[scala.Nothing], width: Double): Window = js.native
  def openWebResource(webResourceName: String, webResourceData: js.UndefOr[scala.Nothing], width: Double, height: Double): Window = js.native
  def openWebResource(webResourceName: String, webResourceData: String): Window = js.native
  def openWebResource(webResourceName: String, webResourceData: String, width: js.UndefOr[scala.Nothing], height: Double): Window = js.native
  def openWebResource(webResourceName: String, webResourceData: String, width: Double): Window = js.native
  def openWebResource(webResourceName: String, webResourceData: String, width: Double, height: Double): Window = js.native
  
  /**
    * Refreshes the parent grid containing the specified record.
    * @param lookupOptions: The lookup value of the parent object to refresh.
    */
  def refreshParentGrid(lookupOptions: LookupValue): Unit = js.native
  
  /**
    * Displays a progress dialog with the specified message.
    * Any subsequent call to this method will update the displayed message in the existing progress dialog with the message specified in the latest method call.
    * @param message The message to be displayed in the progress dialog.
    */
  def showProgressIndicator(message: String): Unit = js.native
}
/**
  * The Xrm.Utility API
  *
  * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/xrm-utility External Link: Xrm.Utility (Client API reference)}
  */
object Utility {
  
  /**
    * Interface for defining parameters on a Xrm.Utility.openEntityForm() request.
    */
  @js.native
  trait FormOpenParameters extends OpenParameters {
    
    /**
      * Controls whether the command bar is displayed.
      * @remarks **Accepted values are**:
      * * "true"    (The command bar is displayed.)
      * * "false"   (The command bar is not displayed.)
      */
    var cmdbar: js.UndefOr[CmdBarDisplay] = js.native
    
    /**
      * The identifier of the form to use, when several are available.
      */
    var formid: js.UndefOr[String] = js.native
    
    /**
      * Controls whether the Navigation bar is displayed on the form.
      * @remarks **Accepted values are**:
      * * "on"      (The navigation bar is displayed.)
      * * "off"     (The navigation bar is not displayed.)
      * * "entity"  (On an entity form, only the navigation options for related entities are available.)
      */
    var navbar: js.UndefOr[NavBarDisplay] = js.native
  }
  object FormOpenParameters {
    
    @scala.inline
    def apply(): FormOpenParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormOpenParameters]
    }
    
    @scala.inline
    implicit class FormOpenParametersMutableBuilder[Self <: FormOpenParameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCmdbar(value: CmdBarDisplay): Self = StObject.set(x, "cmdbar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCmdbarUndefined: Self = StObject.set(x, "cmdbar", js.undefined)
      
      @scala.inline
      def setFormid(value: String): Self = StObject.set(x, "formid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormidUndefined: Self = StObject.set(x, "formid", js.undefined)
      
      @scala.inline
      def setNavbar(value: NavBarDisplay): Self = StObject.set(x, "navbar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavbarUndefined: Self = StObject.set(x, "navbar", js.undefined)
    }
  }
  
  /**
    * Interface use to provide parameters when opening new entiy forms
    */
  type OpenParameters = /**
    * Additional parameters can be provided to the request, by overloading
    * this object with additional key and value pairs. This can only be used
    * to provide default field values for the form, or pass data to custom
    * parameters that have been customized for the form.
    */
  StringDictionary[js.UndefOr[String]]
  
  /**
    * Interface for window options.
    */
  @js.native
  trait WindowOptions extends StObject {
    
    /**
      * Direct the form to open in a new window.
      */
    var openInNewWindow: Boolean = js.native
  }
  object WindowOptions {
    
    @scala.inline
    def apply(openInNewWindow: Boolean): WindowOptions = {
      val __obj = js.Dynamic.literal(openInNewWindow = openInNewWindow.asInstanceOf[js.Any])
      __obj.asInstanceOf[WindowOptions]
    }
    
    @scala.inline
    implicit class WindowOptionsMutableBuilder[Self <: WindowOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOpenInNewWindow(value: Boolean): Self = StObject.set(x, "openInNewWindow", value.asInstanceOf[js.Any])
    }
  }
}
