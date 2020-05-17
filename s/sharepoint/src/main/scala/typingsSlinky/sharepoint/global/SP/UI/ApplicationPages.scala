package typingsSlinky.sharepoint.global.SP.UI

import typingsSlinky.sharepoint.SP.ClientRuntimeContext
import typingsSlinky.sharepoint.SP.StringResult
import typingsSlinky.sharepoint.SP.UI.ApplicationPages.ICalendarController
import typingsSlinky.sharepoint.SP.UI.ApplicationPages.SelectorType
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
  }
  
  @js.native
  class CalendarInstanceRepository ()
    extends typingsSlinky.sharepoint.SP.UI.ApplicationPages.CalendarInstanceRepository
  
  @js.native
  class CalendarSelector ()
    extends typingsSlinky.sharepoint.SP.UI.ApplicationPages.CalendarSelector
  
  @js.native
  class ClientPeoplePickerQueryParameters ()
    extends typingsSlinky.sharepoint.SP.UI.ApplicationPages.ClientPeoplePickerQueryParameters
  
  @js.native
  class ClientPeoplePickerWebServiceInterface ()
    extends typingsSlinky.sharepoint.SP.UI.ApplicationPages.ClientPeoplePickerWebServiceInterface
  
  @js.native
  class PeoplePickerWebServiceInterface ()
    extends typingsSlinky.sharepoint.SP.UI.ApplicationPages.PeoplePickerWebServiceInterface
  
  @js.native
  class ResolveEntity ()
    extends typingsSlinky.sharepoint.SP.UI.ApplicationPages.ResolveEntity
  
  @js.native
  class SelectorSelectionEventArgs protected ()
    extends typingsSlinky.sharepoint.SP.UI.ApplicationPages.SelectorSelectionEventArgs {
    def this(entities: js.Any) = this()
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

