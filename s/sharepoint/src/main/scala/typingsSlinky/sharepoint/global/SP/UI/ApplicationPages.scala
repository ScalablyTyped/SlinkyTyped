package typingsSlinky.sharepoint.global.SP.UI

import typingsSlinky.sharepoint.SP.ClientRuntimeContext
import typingsSlinky.sharepoint.SP.StringResult
import typingsSlinky.sharepoint.SP.UI.ApplicationPages.ICalendarController
import typingsSlinky.sharepoint.SP.UI.ApplicationPages.SelectorType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ApplicationPages {
  
  @JSGlobal("SP.UI.ApplicationPages.BaseSelectorComponent")
  @js.native
  class BaseSelectorComponent protected ()
    extends typingsSlinky.sharepoint.SP.UI.ApplicationPages.BaseSelectorComponent {
    def this(key: String, `type`: SelectorType) = this()
  }
  
  @JSGlobal("SP.UI.ApplicationPages.CalendarInstanceRepository")
  @js.native
  class CalendarInstanceRepository ()
    extends typingsSlinky.sharepoint.SP.UI.ApplicationPages.CalendarInstanceRepository
  object CalendarInstanceRepository {
    
    /* static member */
    @JSGlobal("SP.UI.ApplicationPages.CalendarInstanceRepository.firstInstance")
    @js.native
    def firstInstance(): ICalendarController = js.native
    
    /* static member */
    @JSGlobal("SP.UI.ApplicationPages.CalendarInstanceRepository.lookupInstance")
    @js.native
    def lookupInstance(instanceId: String): ICalendarController = js.native
    
    /* static member */
    @JSGlobal("SP.UI.ApplicationPages.CalendarInstanceRepository.registerInstance")
    @js.native
    def registerInstance(instanceId: String, contoller: ICalendarController): Unit = js.native
  }
  
  @JSGlobal("SP.UI.ApplicationPages.CalendarScope")
  @js.native
  object CalendarScope extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.sharepoint.SP.UI.ApplicationPages.CalendarScope with Double] = js.native
    
    /* 3 */ val daily: typingsSlinky.sharepoint.SP.UI.ApplicationPages.CalendarScope.daily with Double = js.native
    
    /* 5 */ val dailyGroup: typingsSlinky.sharepoint.SP.UI.ApplicationPages.CalendarScope.dailyGroup with Double = js.native
    
    /* 1 */ val monthly: typingsSlinky.sharepoint.SP.UI.ApplicationPages.CalendarScope.monthly with Double = js.native
    
    /* 0 */ val nothing: typingsSlinky.sharepoint.SP.UI.ApplicationPages.CalendarScope.nothing with Double = js.native
    
    /* 4 */ val weekly: typingsSlinky.sharepoint.SP.UI.ApplicationPages.CalendarScope.weekly with Double = js.native
    
    /* 2 */ val weeklyGroup: typingsSlinky.sharepoint.SP.UI.ApplicationPages.CalendarScope.weeklyGroup with Double = js.native
  }
  
  @JSGlobal("SP.UI.ApplicationPages.CalendarSelector")
  @js.native
  class CalendarSelector ()
    extends typingsSlinky.sharepoint.SP.UI.ApplicationPages.CalendarSelector
  object CalendarSelector {
    
    /* static member */
    @JSGlobal("SP.UI.ApplicationPages.CalendarSelector.instance")
    @js.native
    def instance(): typingsSlinky.sharepoint.SP.UI.ApplicationPages.CalendarSelector = js.native
  }
  
  @JSGlobal("SP.UI.ApplicationPages.ClientPeoplePickerQueryParameters")
  @js.native
  class ClientPeoplePickerQueryParameters ()
    extends typingsSlinky.sharepoint.SP.UI.ApplicationPages.ClientPeoplePickerQueryParameters
  
  @JSGlobal("SP.UI.ApplicationPages.ClientPeoplePickerWebServiceInterface")
  @js.native
  class ClientPeoplePickerWebServiceInterface ()
    extends typingsSlinky.sharepoint.SP.UI.ApplicationPages.ClientPeoplePickerWebServiceInterface
  object ClientPeoplePickerWebServiceInterface {
    
    /* static member */
    @JSGlobal("SP.UI.ApplicationPages.ClientPeoplePickerWebServiceInterface.clientPeoplePickerResolveUser")
    @js.native
    def clientPeoplePickerResolveUser(
      context: ClientRuntimeContext,
      queryParams: typingsSlinky.sharepoint.SP.UI.ApplicationPages.ClientPeoplePickerQueryParameters
    ): StringResult = js.native
    
    /* static member */
    @JSGlobal("SP.UI.ApplicationPages.ClientPeoplePickerWebServiceInterface.clientPeoplePickerSearchUser")
    @js.native
    def clientPeoplePickerSearchUser(
      context: ClientRuntimeContext,
      queryParams: typingsSlinky.sharepoint.SP.UI.ApplicationPages.ClientPeoplePickerQueryParameters
    ): StringResult = js.native
  }
  
  @JSGlobal("SP.UI.ApplicationPages.PeoplePickerWebServiceInterface")
  @js.native
  class PeoplePickerWebServiceInterface ()
    extends typingsSlinky.sharepoint.SP.UI.ApplicationPages.PeoplePickerWebServiceInterface
  object PeoplePickerWebServiceInterface {
    
    /* static member */
    @JSGlobal("SP.UI.ApplicationPages.PeoplePickerWebServiceInterface.getSearchResults")
    @js.native
    def getSearchResults(
      context: ClientRuntimeContext,
      searchPattern: String,
      providerID: String,
      hierarchyNodeID: String,
      entityTypes: String
    ): StringResult = js.native
    
    /* static member */
    @JSGlobal("SP.UI.ApplicationPages.PeoplePickerWebServiceInterface.getSearchResultsByHierarchy")
    @js.native
    def getSearchResultsByHierarchy(
      context: ClientRuntimeContext,
      providerID: String,
      hierarchyNodeID: String,
      entityTypes: String,
      contextUrl: String
    ): StringResult = js.native
  }
  
  @JSGlobal("SP.UI.ApplicationPages.ResolveEntity")
  @js.native
  class ResolveEntity ()
    extends typingsSlinky.sharepoint.SP.UI.ApplicationPages.ResolveEntity
  
  @JSGlobal("SP.UI.ApplicationPages.SelectorSelectionEventArgs")
  @js.native
  class SelectorSelectionEventArgs protected ()
    extends typingsSlinky.sharepoint.SP.UI.ApplicationPages.SelectorSelectionEventArgs {
    def this(entities: js.Any) = this()
  }
  
  @JSGlobal("SP.UI.ApplicationPages.SelectorType")
  @js.native
  object SelectorType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.sharepoint.SP.UI.ApplicationPages.SelectorType with Double] = js.native
    
    /* 4 */ val event: typingsSlinky.sharepoint.SP.UI.ApplicationPages.SelectorType.event with Double = js.native
    
    /* 0 */ val none: typingsSlinky.sharepoint.SP.UI.ApplicationPages.SelectorType.none with Double = js.native
    
    /* 2 */ val people: typingsSlinky.sharepoint.SP.UI.ApplicationPages.SelectorType.people with Double = js.native
    
    /* 3 */ val people_And_Resource: typingsSlinky.sharepoint.SP.UI.ApplicationPages.SelectorType.people_And_Resource with Double = js.native
    
    /* 1 */ val resource: typingsSlinky.sharepoint.SP.UI.ApplicationPages.SelectorType.resource with Double = js.native
  }
}
