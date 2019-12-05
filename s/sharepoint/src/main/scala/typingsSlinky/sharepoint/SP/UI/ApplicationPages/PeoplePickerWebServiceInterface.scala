package typingsSlinky.sharepoint.SP.UI.ApplicationPages

import typingsSlinky.sharepoint.SP.ClientRuntimeContext
import typingsSlinky.sharepoint.SP.StringResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.UI.ApplicationPages.PeoplePickerWebServiceInterface")
@js.native
class PeoplePickerWebServiceInterface () extends js.Object

/* static members */
@JSGlobal("SP.UI.ApplicationPages.PeoplePickerWebServiceInterface")
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

