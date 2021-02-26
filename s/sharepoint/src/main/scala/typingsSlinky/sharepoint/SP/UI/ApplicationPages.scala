package typingsSlinky.sharepoint.SP.UI

import typingsSlinky.microsoftAjax.Sys.Component
import typingsSlinky.microsoftAjax.Sys.EventArgs
import typingsSlinky.sharepoint.SP.ClientValueObject
import typingsSlinky.sharepoint.SP.Guid
import typingsSlinky.sharepoint.SP.SerializationContext
import typingsSlinky.sharepoint.SP.UrlZone
import typingsSlinky.sharepoint.SP.Utilities.PrincipalSource
import typingsSlinky.sharepoint.SP.Utilities.PrincipalType
import typingsSlinky.sharepoint.SP.Web
import typingsSlinky.sharepoint.SP.XmlWriter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ApplicationPages {
  
  @js.native
  sealed trait CalendarScope extends StObject
  @JSGlobal("SP.UI.ApplicationPages.CalendarScope")
  @js.native
  object CalendarScope extends StObject {
    
    @js.native
    sealed trait daily extends CalendarScope
    
    @js.native
    sealed trait dailyGroup extends CalendarScope
    
    @js.native
    sealed trait monthly extends CalendarScope
    
    @js.native
    sealed trait nothing extends CalendarScope
    
    @js.native
    sealed trait weekly extends CalendarScope
    
    @js.native
    sealed trait weeklyGroup extends CalendarScope
  }
  
  @js.native
  sealed trait SelectorType extends StObject
  @JSGlobal("SP.UI.ApplicationPages.SelectorType")
  @js.native
  object SelectorType extends StObject {
    
    @js.native
    sealed trait event extends SelectorType
    
    @js.native
    sealed trait none extends SelectorType
    
    @js.native
    sealed trait people extends SelectorType
    
    @js.native
    sealed trait people_And_Resource extends SelectorType
    
    @js.native
    sealed trait resource extends SelectorType
  }
  
  @js.native
  trait BaseSelectorComponent extends ISelectorComponent
  object BaseSelectorComponent {
    
    @scala.inline
    def apply(
      get_callback: () => js.Function2[/* sender */ js.Any, /* e */ EventArgs, Unit],
      get_componentType: () => SelectorType,
      get_scopeKey: () => String,
      get_selectedEntities: () => js.Any,
      removeEntity: ResolveEntity => Unit,
      revertTo: ResolveEntity => Unit,
      setEntity: ResolveEntity => Unit,
      set_callback: js.Function2[/* sender */ js.Any, /* e */ EventArgs, Unit] => Unit,
      set_selectedEntities: js.Any => Unit
    ): BaseSelectorComponent = {
      val __obj = js.Dynamic.literal(get_callback = js.Any.fromFunction0(get_callback), get_componentType = js.Any.fromFunction0(get_componentType), get_scopeKey = js.Any.fromFunction0(get_scopeKey), get_selectedEntities = js.Any.fromFunction0(get_selectedEntities), removeEntity = js.Any.fromFunction1(removeEntity), revertTo = js.Any.fromFunction1(revertTo), setEntity = js.Any.fromFunction1(setEntity), set_callback = js.Any.fromFunction1(set_callback), set_selectedEntities = js.Any.fromFunction1(set_selectedEntities))
      __obj.asInstanceOf[BaseSelectorComponent]
    }
  }
  
  @js.native
  trait CalendarInstanceRepository extends StObject
  
  @js.native
  trait CalendarSelector extends Component {
    
    def addHandler(
      scopeKey: String,
      people: Boolean,
      resource: Boolean,
      handler: js.Function2[/* sender */ js.Any, /* selection */ SelectorSelectionEventArgs, Unit]
    ): Unit = js.native
    
    def getSelector(`type`: SelectorType, scopeKey: String): ISelectorComponent = js.native
    
    def registerSelector(selector: ISelectorComponent): Unit = js.native
    
    def removeEntity(scopeKey: String, ent: ResolveEntity): Unit = js.native
    
    def revertTo(scopeKey: String, ent: ResolveEntity): Unit = js.native
  }
  object CalendarSelector {
    
    @scala.inline
    def apply(
      addHandler: (String, Boolean, Boolean, js.Function2[/* sender */ js.Any, /* selection */ SelectorSelectionEventArgs, Unit]) => Unit,
      add_disposing: js.Function => Unit,
      add_propertyChanged: js.Function => Unit,
      beginUpdate: () => Unit,
      dispose: () => Unit,
      endUpdate: () => Unit,
      getSelector: (SelectorType, String) => ISelectorComponent,
      get_events: () => js.Any,
      get_id: () => String,
      get_isInitialized: () => Boolean,
      get_isUpdating: () => Boolean,
      initialize: () => Unit,
      raisePropertyChanged: String => Unit,
      registerSelector: ISelectorComponent => Unit,
      removeEntity: (String, ResolveEntity) => Unit,
      remove_disposing: js.Function => Unit,
      remove_propertyChanged: js.Function => Unit,
      revertTo: (String, ResolveEntity) => Unit,
      set_id: String => Unit,
      updated: () => Unit
    ): CalendarSelector = {
      val __obj = js.Dynamic.literal(addHandler = js.Any.fromFunction4(addHandler), add_disposing = js.Any.fromFunction1(add_disposing), add_propertyChanged = js.Any.fromFunction1(add_propertyChanged), beginUpdate = js.Any.fromFunction0(beginUpdate), dispose = js.Any.fromFunction0(dispose), endUpdate = js.Any.fromFunction0(endUpdate), getSelector = js.Any.fromFunction2(getSelector), get_events = js.Any.fromFunction0(get_events), get_id = js.Any.fromFunction0(get_id), get_isInitialized = js.Any.fromFunction0(get_isInitialized), get_isUpdating = js.Any.fromFunction0(get_isUpdating), initialize = js.Any.fromFunction0(initialize), raisePropertyChanged = js.Any.fromFunction1(raisePropertyChanged), registerSelector = js.Any.fromFunction1(registerSelector), removeEntity = js.Any.fromFunction2(removeEntity), remove_disposing = js.Any.fromFunction1(remove_disposing), remove_propertyChanged = js.Any.fromFunction1(remove_propertyChanged), revertTo = js.Any.fromFunction2(revertTo), set_id = js.Any.fromFunction1(set_id), updated = js.Any.fromFunction0(updated))
      __obj.asInstanceOf[CalendarSelector]
    }
    
    @scala.inline
    implicit class CalendarSelectorMutableBuilder[Self <: CalendarSelector] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddHandler(
        value: (String, Boolean, Boolean, js.Function2[/* sender */ js.Any, /* selection */ SelectorSelectionEventArgs, Unit]) => Unit
      ): Self = StObject.set(x, "addHandler", js.Any.fromFunction4(value))
      
      @scala.inline
      def setGetSelector(value: (SelectorType, String) => ISelectorComponent): Self = StObject.set(x, "getSelector", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRegisterSelector(value: ISelectorComponent => Unit): Self = StObject.set(x, "registerSelector", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveEntity(value: (String, ResolveEntity) => Unit): Self = StObject.set(x, "removeEntity", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRevertTo(value: (String, ResolveEntity) => Unit): Self = StObject.set(x, "revertTo", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait ClientPeoplePickerQueryParameters extends ClientValueObject {
    
    def get_allUrlZones(): Boolean = js.native
    
    def get_allowEmailAddresses(): Boolean = js.native
    
    def get_allowMultipleEntities(): Boolean = js.native
    
    def get_enabledClaimProviders(): String = js.native
    
    def get_forceClaims(): Boolean = js.native
    
    def get_maximumEntitySuggestions(): Double = js.native
    
    def get_principalSource(): PrincipalSource = js.native
    
    def get_principalType(): PrincipalType = js.native
    
    def get_queryString(): String = js.native
    
    def get_required(): Boolean = js.native
    
    def get_sharePointGroupID(): Double = js.native
    
    def get_urlZone(): UrlZone = js.native
    
    def get_urlZoneSpecified(): Boolean = js.native
    
    def get_web(): Web = js.native
    
    def get_webApplicationID(): Guid = js.native
    
    def set_allUrlZones(value: Boolean): Unit = js.native
    
    def set_allowEmailAddresses(value: Boolean): Unit = js.native
    
    def set_allowMultipleEntities(value: Boolean): Unit = js.native
    
    def set_enabledClaimProviders(value: String): Unit = js.native
    
    def set_forceClaims(value: Boolean): Unit = js.native
    
    def set_maximumEntitySuggestions(value: Double): Unit = js.native
    
    def set_principalSource(value: PrincipalSource): Unit = js.native
    
    def set_principalType(value: PrincipalType): Unit = js.native
    
    def set_queryString(value: String): Unit = js.native
    
    def set_required(value: Boolean): Unit = js.native
    
    def set_sharePointGroupID(value: Double): Unit = js.native
    
    def set_urlZone(value: UrlZone): Unit = js.native
    
    def set_urlZoneSpecified(value: Boolean): Unit = js.native
    
    def set_web(value: Web): Unit = js.native
    
    def set_webApplicationID(value: Guid): Unit = js.native
  }
  object ClientPeoplePickerQueryParameters {
    
    @scala.inline
    def apply(
      customFromJson: js.Any => Boolean,
      customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
      fromJson: js.Any => Unit,
      get_allUrlZones: () => Boolean,
      get_allowEmailAddresses: () => Boolean,
      get_allowMultipleEntities: () => Boolean,
      get_enabledClaimProviders: () => String,
      get_forceClaims: () => Boolean,
      get_maximumEntitySuggestions: () => Double,
      get_principalSource: () => PrincipalSource,
      get_principalType: () => PrincipalType,
      get_queryString: () => String,
      get_required: () => Boolean,
      get_sharePointGroupID: () => Double,
      get_typeId: () => String,
      get_urlZone: () => UrlZone,
      get_urlZoneSpecified: () => Boolean,
      get_web: () => Web,
      get_webApplicationID: () => Guid,
      set_allUrlZones: Boolean => Unit,
      set_allowEmailAddresses: Boolean => Unit,
      set_allowMultipleEntities: Boolean => Unit,
      set_enabledClaimProviders: String => Unit,
      set_forceClaims: Boolean => Unit,
      set_maximumEntitySuggestions: Double => Unit,
      set_principalSource: PrincipalSource => Unit,
      set_principalType: PrincipalType => Unit,
      set_queryString: String => Unit,
      set_required: Boolean => Unit,
      set_sharePointGroupID: Double => Unit,
      set_urlZone: UrlZone => Unit,
      set_urlZoneSpecified: Boolean => Unit,
      set_web: Web => Unit,
      set_webApplicationID: Guid => Unit,
      writeToXml: (XmlWriter, SerializationContext) => Unit
    ): ClientPeoplePickerQueryParameters = {
      val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_allUrlZones = js.Any.fromFunction0(get_allUrlZones), get_allowEmailAddresses = js.Any.fromFunction0(get_allowEmailAddresses), get_allowMultipleEntities = js.Any.fromFunction0(get_allowMultipleEntities), get_enabledClaimProviders = js.Any.fromFunction0(get_enabledClaimProviders), get_forceClaims = js.Any.fromFunction0(get_forceClaims), get_maximumEntitySuggestions = js.Any.fromFunction0(get_maximumEntitySuggestions), get_principalSource = js.Any.fromFunction0(get_principalSource), get_principalType = js.Any.fromFunction0(get_principalType), get_queryString = js.Any.fromFunction0(get_queryString), get_required = js.Any.fromFunction0(get_required), get_sharePointGroupID = js.Any.fromFunction0(get_sharePointGroupID), get_typeId = js.Any.fromFunction0(get_typeId), get_urlZone = js.Any.fromFunction0(get_urlZone), get_urlZoneSpecified = js.Any.fromFunction0(get_urlZoneSpecified), get_web = js.Any.fromFunction0(get_web), get_webApplicationID = js.Any.fromFunction0(get_webApplicationID), set_allUrlZones = js.Any.fromFunction1(set_allUrlZones), set_allowEmailAddresses = js.Any.fromFunction1(set_allowEmailAddresses), set_allowMultipleEntities = js.Any.fromFunction1(set_allowMultipleEntities), set_enabledClaimProviders = js.Any.fromFunction1(set_enabledClaimProviders), set_forceClaims = js.Any.fromFunction1(set_forceClaims), set_maximumEntitySuggestions = js.Any.fromFunction1(set_maximumEntitySuggestions), set_principalSource = js.Any.fromFunction1(set_principalSource), set_principalType = js.Any.fromFunction1(set_principalType), set_queryString = js.Any.fromFunction1(set_queryString), set_required = js.Any.fromFunction1(set_required), set_sharePointGroupID = js.Any.fromFunction1(set_sharePointGroupID), set_urlZone = js.Any.fromFunction1(set_urlZone), set_urlZoneSpecified = js.Any.fromFunction1(set_urlZoneSpecified), set_web = js.Any.fromFunction1(set_web), set_webApplicationID = js.Any.fromFunction1(set_webApplicationID), writeToXml = js.Any.fromFunction2(writeToXml))
      __obj.asInstanceOf[ClientPeoplePickerQueryParameters]
    }
    
    @scala.inline
    implicit class ClientPeoplePickerQueryParametersMutableBuilder[Self <: ClientPeoplePickerQueryParameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGet_allUrlZones(value: () => Boolean): Self = StObject.set(x, "get_allUrlZones", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGet_allowEmailAddresses(value: () => Boolean): Self = StObject.set(x, "get_allowEmailAddresses", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGet_allowMultipleEntities(value: () => Boolean): Self = StObject.set(x, "get_allowMultipleEntities", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGet_enabledClaimProviders(value: () => String): Self = StObject.set(x, "get_enabledClaimProviders", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGet_forceClaims(value: () => Boolean): Self = StObject.set(x, "get_forceClaims", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGet_maximumEntitySuggestions(value: () => Double): Self = StObject.set(x, "get_maximumEntitySuggestions", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGet_principalSource(value: () => PrincipalSource): Self = StObject.set(x, "get_principalSource", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGet_principalType(value: () => PrincipalType): Self = StObject.set(x, "get_principalType", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGet_queryString(value: () => String): Self = StObject.set(x, "get_queryString", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGet_required(value: () => Boolean): Self = StObject.set(x, "get_required", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGet_sharePointGroupID(value: () => Double): Self = StObject.set(x, "get_sharePointGroupID", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGet_urlZone(value: () => UrlZone): Self = StObject.set(x, "get_urlZone", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGet_urlZoneSpecified(value: () => Boolean): Self = StObject.set(x, "get_urlZoneSpecified", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGet_web(value: () => Web): Self = StObject.set(x, "get_web", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGet_webApplicationID(value: () => Guid): Self = StObject.set(x, "get_webApplicationID", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSet_allUrlZones(value: Boolean => Unit): Self = StObject.set(x, "set_allUrlZones", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSet_allowEmailAddresses(value: Boolean => Unit): Self = StObject.set(x, "set_allowEmailAddresses", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSet_allowMultipleEntities(value: Boolean => Unit): Self = StObject.set(x, "set_allowMultipleEntities", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSet_enabledClaimProviders(value: String => Unit): Self = StObject.set(x, "set_enabledClaimProviders", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSet_forceClaims(value: Boolean => Unit): Self = StObject.set(x, "set_forceClaims", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSet_maximumEntitySuggestions(value: Double => Unit): Self = StObject.set(x, "set_maximumEntitySuggestions", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSet_principalSource(value: PrincipalSource => Unit): Self = StObject.set(x, "set_principalSource", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSet_principalType(value: PrincipalType => Unit): Self = StObject.set(x, "set_principalType", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSet_queryString(value: String => Unit): Self = StObject.set(x, "set_queryString", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSet_required(value: Boolean => Unit): Self = StObject.set(x, "set_required", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSet_sharePointGroupID(value: Double => Unit): Self = StObject.set(x, "set_sharePointGroupID", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSet_urlZone(value: UrlZone => Unit): Self = StObject.set(x, "set_urlZone", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSet_urlZoneSpecified(value: Boolean => Unit): Self = StObject.set(x, "set_urlZoneSpecified", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSet_web(value: Web => Unit): Self = StObject.set(x, "set_web", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSet_webApplicationID(value: Guid => Unit): Self = StObject.set(x, "set_webApplicationID", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait ClientPeoplePickerWebServiceInterface extends StObject
  
  @js.native
  trait ICalendarController extends StObject {
    
    def collapseAll(): Unit = js.native
    
    def deleteItem(itemId: String): Unit = js.native
    
    def expandAll(): Unit = js.native
    
    def getActiveScope(): CalendarScope = js.native
    
    def moveToDate(date: String): Unit = js.native
    
    def moveToView(scope: CalendarScope): Unit = js.native
    
    def moveToViewDate(scope: CalendarScope, date: String): Unit = js.native
    
    def moveToViewType(viewType: String): Unit = js.native
    
    def newItemDialog(contentTypeId: String): Unit = js.native
    
    def refreshItems(): Unit = js.native
  }
  object ICalendarController {
    
    @scala.inline
    def apply(
      collapseAll: () => Unit,
      deleteItem: String => Unit,
      expandAll: () => Unit,
      getActiveScope: () => CalendarScope,
      moveToDate: String => Unit,
      moveToView: CalendarScope => Unit,
      moveToViewDate: (CalendarScope, String) => Unit,
      moveToViewType: String => Unit,
      newItemDialog: String => Unit,
      refreshItems: () => Unit
    ): ICalendarController = {
      val __obj = js.Dynamic.literal(collapseAll = js.Any.fromFunction0(collapseAll), deleteItem = js.Any.fromFunction1(deleteItem), expandAll = js.Any.fromFunction0(expandAll), getActiveScope = js.Any.fromFunction0(getActiveScope), moveToDate = js.Any.fromFunction1(moveToDate), moveToView = js.Any.fromFunction1(moveToView), moveToViewDate = js.Any.fromFunction2(moveToViewDate), moveToViewType = js.Any.fromFunction1(moveToViewType), newItemDialog = js.Any.fromFunction1(newItemDialog), refreshItems = js.Any.fromFunction0(refreshItems))
      __obj.asInstanceOf[ICalendarController]
    }
    
    @scala.inline
    implicit class ICalendarControllerMutableBuilder[Self <: ICalendarController] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCollapseAll(value: () => Unit): Self = StObject.set(x, "collapseAll", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDeleteItem(value: String => Unit): Self = StObject.set(x, "deleteItem", js.Any.fromFunction1(value))
      
      @scala.inline
      def setExpandAll(value: () => Unit): Self = StObject.set(x, "expandAll", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetActiveScope(value: () => CalendarScope): Self = StObject.set(x, "getActiveScope", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMoveToDate(value: String => Unit): Self = StObject.set(x, "moveToDate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMoveToView(value: CalendarScope => Unit): Self = StObject.set(x, "moveToView", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMoveToViewDate(value: (CalendarScope, String) => Unit): Self = StObject.set(x, "moveToViewDate", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMoveToViewType(value: String => Unit): Self = StObject.set(x, "moveToViewType", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNewItemDialog(value: String => Unit): Self = StObject.set(x, "newItemDialog", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRefreshItems(value: () => Unit): Self = StObject.set(x, "refreshItems", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait ISelectorComponent extends StObject {
    
    def get_callback(): js.Function2[/* sender */ js.Any, /* e */ EventArgs, Unit] = js.native
    
    def get_componentType(): SelectorType = js.native
    
    def get_scopeKey(): String = js.native
    
    def get_selectedEntities(): js.Any = js.native
    
    def removeEntity(ent: ResolveEntity): Unit = js.native
    
    def revertTo(ent: ResolveEntity): Unit = js.native
    
    def setEntity(ent: ResolveEntity): Unit = js.native
    
    def set_callback(value: js.Function2[/* sender */ js.Any, /* e */ EventArgs, Unit]): Unit = js.native
    
    def set_selectedEntities(value: js.Any): Unit = js.native
  }
  object ISelectorComponent {
    
    @scala.inline
    def apply(
      get_callback: () => js.Function2[/* sender */ js.Any, /* e */ EventArgs, Unit],
      get_componentType: () => SelectorType,
      get_scopeKey: () => String,
      get_selectedEntities: () => js.Any,
      removeEntity: ResolveEntity => Unit,
      revertTo: ResolveEntity => Unit,
      setEntity: ResolveEntity => Unit,
      set_callback: js.Function2[/* sender */ js.Any, /* e */ EventArgs, Unit] => Unit,
      set_selectedEntities: js.Any => Unit
    ): ISelectorComponent = {
      val __obj = js.Dynamic.literal(get_callback = js.Any.fromFunction0(get_callback), get_componentType = js.Any.fromFunction0(get_componentType), get_scopeKey = js.Any.fromFunction0(get_scopeKey), get_selectedEntities = js.Any.fromFunction0(get_selectedEntities), removeEntity = js.Any.fromFunction1(removeEntity), revertTo = js.Any.fromFunction1(revertTo), setEntity = js.Any.fromFunction1(setEntity), set_callback = js.Any.fromFunction1(set_callback), set_selectedEntities = js.Any.fromFunction1(set_selectedEntities))
      __obj.asInstanceOf[ISelectorComponent]
    }
    
    @scala.inline
    implicit class ISelectorComponentMutableBuilder[Self <: ISelectorComponent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGet_callback(value: () => js.Function2[/* sender */ js.Any, /* e */ EventArgs, Unit]): Self = StObject.set(x, "get_callback", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGet_componentType(value: () => SelectorType): Self = StObject.set(x, "get_componentType", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGet_scopeKey(value: () => String): Self = StObject.set(x, "get_scopeKey", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGet_selectedEntities(value: () => js.Any): Self = StObject.set(x, "get_selectedEntities", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRemoveEntity(value: ResolveEntity => Unit): Self = StObject.set(x, "removeEntity", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRevertTo(value: ResolveEntity => Unit): Self = StObject.set(x, "revertTo", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetEntity(value: ResolveEntity => Unit): Self = StObject.set(x, "setEntity", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSet_callback(value: js.Function2[/* sender */ js.Any, /* e */ EventArgs, Unit] => Unit): Self = StObject.set(x, "set_callback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSet_selectedEntities(value: js.Any => Unit): Self = StObject.set(x, "set_selectedEntities", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait PeoplePickerWebServiceInterface extends StObject
  
  @js.native
  trait ResolveEntity extends StObject {
    
    var accountName: String = js.native
    
    var displayName: String = js.native
    
    var email: String = js.native
    
    var entityType: String = js.native
    
    def get_key(): String = js.native
    
    var id: String = js.native
    
    var isGroup: Boolean = js.native
    
    var members: js.Array[ResolveEntity] = js.native
    
    var needResolve: Boolean = js.native
    
    var tYPE_EVENT: String = js.native
    
    var tYPE_EXCHANGE: String = js.native
    
    var tYPE_RESOURCE: String = js.native
    
    var tYPE_USER: String = js.native
  }
  object ResolveEntity {
    
    @scala.inline
    def apply(
      accountName: String,
      displayName: String,
      email: String,
      entityType: String,
      get_key: () => String,
      id: String,
      isGroup: Boolean,
      members: js.Array[ResolveEntity],
      needResolve: Boolean,
      tYPE_EVENT: String,
      tYPE_EXCHANGE: String,
      tYPE_RESOURCE: String,
      tYPE_USER: String
    ): ResolveEntity = {
      val __obj = js.Dynamic.literal(accountName = accountName.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], entityType = entityType.asInstanceOf[js.Any], get_key = js.Any.fromFunction0(get_key), id = id.asInstanceOf[js.Any], isGroup = isGroup.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], needResolve = needResolve.asInstanceOf[js.Any], tYPE_EVENT = tYPE_EVENT.asInstanceOf[js.Any], tYPE_EXCHANGE = tYPE_EXCHANGE.asInstanceOf[js.Any], tYPE_RESOURCE = tYPE_RESOURCE.asInstanceOf[js.Any], tYPE_USER = tYPE_USER.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolveEntity]
    }
    
    @scala.inline
    implicit class ResolveEntityMutableBuilder[Self <: ResolveEntity] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccountName(value: String): Self = StObject.set(x, "accountName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntityType(value: String): Self = StObject.set(x, "entityType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGet_key(value: () => String): Self = StObject.set(x, "get_key", js.Any.fromFunction0(value))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsGroup(value: Boolean): Self = StObject.set(x, "isGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMembers(value: js.Array[ResolveEntity]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMembersVarargs(value: ResolveEntity*): Self = StObject.set(x, "members", js.Array(value :_*))
      
      @scala.inline
      def setNeedResolve(value: Boolean): Self = StObject.set(x, "needResolve", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTYPE_EVENT(value: String): Self = StObject.set(x, "tYPE_EVENT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTYPE_EXCHANGE(value: String): Self = StObject.set(x, "tYPE_EXCHANGE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTYPE_RESOURCE(value: String): Self = StObject.set(x, "tYPE_RESOURCE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTYPE_USER(value: String): Self = StObject.set(x, "tYPE_USER", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SelectorSelectionEventArgs extends EventArgs {
    
    def get_entities(): js.Any = js.native
  }
  object SelectorSelectionEventArgs {
    
    @scala.inline
    def apply(Empty: EventArgs, get_entities: () => js.Any): SelectorSelectionEventArgs = {
      val __obj = js.Dynamic.literal(Empty = Empty.asInstanceOf[js.Any], get_entities = js.Any.fromFunction0(get_entities))
      __obj.asInstanceOf[SelectorSelectionEventArgs]
    }
    
    @scala.inline
    implicit class SelectorSelectionEventArgsMutableBuilder[Self <: SelectorSelectionEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGet_entities(value: () => js.Any): Self = StObject.set(x, "get_entities", js.Any.fromFunction0(value))
    }
  }
}
