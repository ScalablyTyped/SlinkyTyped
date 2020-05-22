package typingsSlinky.sharepoint.global.SP.UI

import typingsSlinky.microsoftAjax.Sys.EventArgs
import typingsSlinky.sharepoint.SP.ClientRuntimeContext
import typingsSlinky.sharepoint.SP.Guid
import typingsSlinky.sharepoint.SP.SerializationContext
import typingsSlinky.sharepoint.SP.StringResult
import typingsSlinky.sharepoint.SP.UI.ApplicationPages.ICalendarController
import typingsSlinky.sharepoint.SP.UI.ApplicationPages.ISelectorComponent
import typingsSlinky.sharepoint.SP.UI.ApplicationPages.SelectorType
import typingsSlinky.sharepoint.SP.UrlZone
import typingsSlinky.sharepoint.SP.Utilities.PrincipalSource
import typingsSlinky.sharepoint.SP.Utilities.PrincipalType
import typingsSlinky.sharepoint.SP.Web
import typingsSlinky.sharepoint.SP.XmlWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.UI.ApplicationPages")
@js.native
object ApplicationPages extends js.Object {
  @js.native
  class BaseSelectorComponent protected ()
    extends typingsSlinky.sharepoint.SP.UI.ApplicationPages.BaseSelectorComponent {
    def this(key: String, `type`: SelectorType) = this()
    /* CompleteClass */
    override def get_callback(): js.Function2[/* sender */ js.Any, /* e */ EventArgs, Unit] = js.native
    /* CompleteClass */
    override def get_componentType(): SelectorType = js.native
    /* CompleteClass */
    override def get_scopeKey(): String = js.native
    /* CompleteClass */
    override def get_selectedEntities(): js.Any = js.native
    /* CompleteClass */
    override def removeEntity(ent: typingsSlinky.sharepoint.SP.UI.ApplicationPages.ResolveEntity): Unit = js.native
    /* CompleteClass */
    override def revertTo(ent: typingsSlinky.sharepoint.SP.UI.ApplicationPages.ResolveEntity): Unit = js.native
    /* CompleteClass */
    override def setEntity(ent: typingsSlinky.sharepoint.SP.UI.ApplicationPages.ResolveEntity): Unit = js.native
    /* CompleteClass */
    override def set_callback(value: js.Function2[/* sender */ js.Any, /* e */ EventArgs, Unit]): Unit = js.native
    /* CompleteClass */
    override def set_selectedEntities(value: js.Any): Unit = js.native
  }
  
  @js.native
  class CalendarInstanceRepository ()
    extends typingsSlinky.sharepoint.SP.UI.ApplicationPages.CalendarInstanceRepository
  
  @js.native
  class CalendarSelector ()
    extends typingsSlinky.sharepoint.SP.UI.ApplicationPages.CalendarSelector {
    /* CompleteClass */
    override def addHandler(
      scopeKey: String,
      people: Boolean,
      resource: Boolean,
      handler: js.Function2[
          /* sender */ js.Any, 
          /* selection */ typingsSlinky.sharepoint.SP.UI.ApplicationPages.SelectorSelectionEventArgs, 
          Unit
        ]
    ): Unit = js.native
    //#endregion
    //#region Events
    /**
      * Raised when the dispose method is called for a component.
      */
    /* CompleteClass */
    override def add_disposing(handler: js.Function): Unit = js.native
    /**
      * Raised when the raisePropertyChanged method of the current Component object is called.
      */
    /* CompleteClass */
    override def add_propertyChanged(handler: js.Function): Unit = js.native
    //#endregion
    //#region Methods
    /**
      * Called by the create method to indicate that the process of setting properties of a component instance has begun.
      */
    /* CompleteClass */
    override def beginUpdate(): Unit = js.native
    /**
      * Raises the disposing event of the current Component and removes the component from the application.
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    /**
      * Called by the create method to indicate that the process of setting properties of a component instance has finished.
      * This method is called by the create method ($create).
      * Sets the isUpdating property of the current Component object to false, calls the initialize method if it has not already been called, and then calls the updated method.
      */
    /* CompleteClass */
    override def endUpdate(): Unit = js.native
    /* CompleteClass */
    override def getSelector(`type`: SelectorType, scopeKey: String): ISelectorComponent = js.native
    //#endregion
    //#region Properties
    /**
      * Gets an EventHandlerList object that contains references to all the event handlers that are mapped to the current component's events.
      * This member supports the client-script infrastructure and is not intended to be used directly from your code.
      * @return
      *      An EventHandlerList object that contains references to all the events and handlers for this component.
      */
    /* CompleteClass */
    override def get_events(): js.Any = js.native
    /**
      * Gets the ID of the current Component object.
      * @return
      *       The id
      */
    /* CompleteClass */
    override def get_id(): String = js.native
    /**
      * Gets a value indicating whether the current Component object is initialized.
      * @return
      *      true if the current Component is initialized; otherwise, false.
      */
    /* CompleteClass */
    override def get_isInitialized(): Boolean = js.native
    /**
      * Gets a value indicating whether the current Component object is updating.
      * @return
      *      true if the current Component object is updating; otherwise, false.
      */
    /* CompleteClass */
    override def get_isUpdating(): Boolean = js.native
    /**
      * Initializes the current Component object.
      * The initialize method sets the isInitialized property of the current Component object to true. This function is called by the create method ($create) and overridden in derived classes to initialize the component.
      */
    /* CompleteClass */
    override def initialize(): Unit = js.native
    /**
      * Raises the propertyChanged event for the specified property.
      * @param propertyName
      *               The name of the property that changed.
      */
    /* CompleteClass */
    override def raisePropertyChanged(propertyName: String): Unit = js.native
    /* CompleteClass */
    override def registerSelector(selector: ISelectorComponent): Unit = js.native
    /* CompleteClass */
    override def removeEntity(scopeKey: String, ent: typingsSlinky.sharepoint.SP.UI.ApplicationPages.ResolveEntity): Unit = js.native
    /**
      * Raised when the dispose method is called for a component.
      */
    /* CompleteClass */
    override def remove_disposing(handler: js.Function): Unit = js.native
    /**
      * Raised when the raisePropertyChanged method of the current Component object is called.
      */
    /* CompleteClass */
    override def remove_propertyChanged(handler: js.Function): Unit = js.native
    /* CompleteClass */
    override def revertTo(scopeKey: String, ent: typingsSlinky.sharepoint.SP.UI.ApplicationPages.ResolveEntity): Unit = js.native
    /**
      * Sets the ID of the current Component object.
      * @param value A string that contains the ID of the component.
      */
    /* CompleteClass */
    override def set_id(value: String): Unit = js.native
    /**
      * Called by the endUpdate method as a placeholder for additional logic in derived classes.
      * Override the updated method in a derived class to add custom post-update logic.
      */
    /* CompleteClass */
    override def updated(): Unit = js.native
  }
  
  @js.native
  class ClientPeoplePickerQueryParameters ()
    extends typingsSlinky.sharepoint.SP.UI.ApplicationPages.ClientPeoplePickerQueryParameters {
    /* CompleteClass */
    override def customFromJson(obj: js.Any): Boolean = js.native
    /* CompleteClass */
    override def customWriteToXml(writer: XmlWriter, serializationContext: SerializationContext): Boolean = js.native
    /* CompleteClass */
    override def fromJson(obj: js.Any): Unit = js.native
    /* CompleteClass */
    override def get_allUrlZones(): Boolean = js.native
    /* CompleteClass */
    override def get_allowEmailAddresses(): Boolean = js.native
    /* CompleteClass */
    override def get_allowMultipleEntities(): Boolean = js.native
    /* CompleteClass */
    override def get_enabledClaimProviders(): String = js.native
    /* CompleteClass */
    override def get_forceClaims(): Boolean = js.native
    /* CompleteClass */
    override def get_maximumEntitySuggestions(): Double = js.native
    /* CompleteClass */
    override def get_principalSource(): PrincipalSource = js.native
    /* CompleteClass */
    override def get_principalType(): PrincipalType = js.native
    /* CompleteClass */
    override def get_queryString(): String = js.native
    /* CompleteClass */
    override def get_required(): Boolean = js.native
    /* CompleteClass */
    override def get_sharePointGroupID(): Double = js.native
    /* CompleteClass */
    override def get_typeId(): String = js.native
    /* CompleteClass */
    override def get_urlZone(): UrlZone = js.native
    /* CompleteClass */
    override def get_urlZoneSpecified(): Boolean = js.native
    /* CompleteClass */
    override def get_web(): Web = js.native
    /* CompleteClass */
    override def get_webApplicationID(): Guid = js.native
    /* CompleteClass */
    override def set_allUrlZones(value: Boolean): Unit = js.native
    /* CompleteClass */
    override def set_allowEmailAddresses(value: Boolean): Unit = js.native
    /* CompleteClass */
    override def set_allowMultipleEntities(value: Boolean): Unit = js.native
    /* CompleteClass */
    override def set_enabledClaimProviders(value: String): Unit = js.native
    /* CompleteClass */
    override def set_forceClaims(value: Boolean): Unit = js.native
    /* CompleteClass */
    override def set_maximumEntitySuggestions(value: Double): Unit = js.native
    /* CompleteClass */
    override def set_principalSource(value: PrincipalSource): Unit = js.native
    /* CompleteClass */
    override def set_principalType(value: PrincipalType): Unit = js.native
    /* CompleteClass */
    override def set_queryString(value: String): Unit = js.native
    /* CompleteClass */
    override def set_required(value: Boolean): Unit = js.native
    /* CompleteClass */
    override def set_sharePointGroupID(value: Double): Unit = js.native
    /* CompleteClass */
    override def set_urlZone(value: UrlZone): Unit = js.native
    /* CompleteClass */
    override def set_urlZoneSpecified(value: Boolean): Unit = js.native
    /* CompleteClass */
    override def set_web(value: Web): Unit = js.native
    /* CompleteClass */
    override def set_webApplicationID(value: Guid): Unit = js.native
    /* CompleteClass */
    override def writeToXml(writer: XmlWriter, serializationContext: SerializationContext): Unit = js.native
  }
  
  @js.native
  class ClientPeoplePickerWebServiceInterface ()
    extends typingsSlinky.sharepoint.SP.UI.ApplicationPages.ClientPeoplePickerWebServiceInterface
  
  @js.native
  class PeoplePickerWebServiceInterface ()
    extends typingsSlinky.sharepoint.SP.UI.ApplicationPages.PeoplePickerWebServiceInterface
  
  @js.native
  class ResolveEntity ()
    extends typingsSlinky.sharepoint.SP.UI.ApplicationPages.ResolveEntity {
    /* CompleteClass */
    override var accountName: String = js.native
    /* CompleteClass */
    override var displayName: String = js.native
    /* CompleteClass */
    override var email: String = js.native
    /* CompleteClass */
    override var entityType: String = js.native
    /* CompleteClass */
    override var id: String = js.native
    /* CompleteClass */
    override var isGroup: Boolean = js.native
    /* CompleteClass */
    override var members: js.Array[typingsSlinky.sharepoint.SP.UI.ApplicationPages.ResolveEntity] = js.native
    /* CompleteClass */
    override var needResolve: Boolean = js.native
    /* CompleteClass */
    override var tYPE_EVENT: String = js.native
    /* CompleteClass */
    override var tYPE_EXCHANGE: String = js.native
    /* CompleteClass */
    override var tYPE_RESOURCE: String = js.native
    /* CompleteClass */
    override var tYPE_USER: String = js.native
    /* CompleteClass */
    override def get_key(): String = js.native
  }
  
  @js.native
  class SelectorSelectionEventArgs protected ()
    extends typingsSlinky.sharepoint.SP.UI.ApplicationPages.SelectorSelectionEventArgs {
    def this(entities: js.Any) = this()
    /**
      * An object of type EventArgs that is used as a convenient way to specify an empty EventArgs instance.
      */
    /* CompleteClass */
    override var Empty: EventArgs = js.native
    /* CompleteClass */
    override def get_entities(): js.Any = js.native
  }
  
  /* static members */
  @js.native
  object CalendarInstanceRepository extends js.Object {
    def firstInstance(): ICalendarController = js.native
    def lookupInstance(instanceId: String): ICalendarController = js.native
    def registerInstance(instanceId: String, contoller: ICalendarController): Unit = js.native
  }
  
  @js.native
  object CalendarScope extends js.Object {
    /* 3 */ val daily: typingsSlinky.sharepoint.SP.UI.ApplicationPages.CalendarScope.daily with Double = js.native
    /* 5 */ val dailyGroup: typingsSlinky.sharepoint.SP.UI.ApplicationPages.CalendarScope.dailyGroup with Double = js.native
    /* 1 */ val monthly: typingsSlinky.sharepoint.SP.UI.ApplicationPages.CalendarScope.monthly with Double = js.native
    /* 0 */ val nothing: typingsSlinky.sharepoint.SP.UI.ApplicationPages.CalendarScope.nothing with Double = js.native
    /* 4 */ val weekly: typingsSlinky.sharepoint.SP.UI.ApplicationPages.CalendarScope.weekly with Double = js.native
    /* 2 */ val weeklyGroup: typingsSlinky.sharepoint.SP.UI.ApplicationPages.CalendarScope.weeklyGroup with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.sharepoint.SP.UI.ApplicationPages.CalendarScope with Double] = js.native
  }
  
  /* static members */
  @js.native
  object CalendarSelector extends js.Object {
    def instance(): typingsSlinky.sharepoint.SP.UI.ApplicationPages.CalendarSelector = js.native
  }
  
  /* static members */
  @js.native
  object ClientPeoplePickerWebServiceInterface extends js.Object {
    def clientPeoplePickerResolveUser(
      context: ClientRuntimeContext,
      queryParams: typingsSlinky.sharepoint.SP.UI.ApplicationPages.ClientPeoplePickerQueryParameters
    ): StringResult = js.native
    def clientPeoplePickerSearchUser(
      context: ClientRuntimeContext,
      queryParams: typingsSlinky.sharepoint.SP.UI.ApplicationPages.ClientPeoplePickerQueryParameters
    ): StringResult = js.native
  }
  
  /* static members */
  @js.native
  object PeoplePickerWebServiceInterface extends js.Object {
    def getSearchResults(
      context: ClientRuntimeContext,
      searchPattern: String,
      providerID: String,
      hierarchyNodeID: String,
      entityTypes: String
    ): StringResult = js.native
    def getSearchResultsByHierarchy(
      context: ClientRuntimeContext,
      providerID: String,
      hierarchyNodeID: String,
      entityTypes: String,
      contextUrl: String
    ): StringResult = js.native
  }
  
  @js.native
  object SelectorType extends js.Object {
    /* 4 */ val event: typingsSlinky.sharepoint.SP.UI.ApplicationPages.SelectorType.event with Double = js.native
    /* 0 */ val none: typingsSlinky.sharepoint.SP.UI.ApplicationPages.SelectorType.none with Double = js.native
    /* 2 */ val people: typingsSlinky.sharepoint.SP.UI.ApplicationPages.SelectorType.people with Double = js.native
    /* 3 */ val people_And_Resource: typingsSlinky.sharepoint.SP.UI.ApplicationPages.SelectorType.people_And_Resource with Double = js.native
    /* 1 */ val resource: typingsSlinky.sharepoint.SP.UI.ApplicationPages.SelectorType.resource with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.sharepoint.SP.UI.ApplicationPages.SelectorType with Double] = js.native
  }
  
}

