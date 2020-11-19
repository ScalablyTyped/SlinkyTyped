package typingsSlinky.sharepoint.global

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SPClientPeoplePickerProcessedUser")
@js.native
class SPClientPeoplePickerProcessedUser ()
  extends typingsSlinky.sharepoint.SPClientPeoplePickerProcessedUser
/* static members */
@JSGlobal("SPClientPeoplePickerProcessedUser")
@js.native
object SPClientPeoplePickerProcessedUser extends js.Object {
  
  def BuildUserPresenceHtml(elmId: String, strSip: String): String = js.native
  def BuildUserPresenceHtml(elmId: String, strSip: String, bResolved: Boolean): String = js.native
  
  def DeleteProcessedUser(elmToRemove: HTMLElement): Unit = js.native
  
  def GetUserContainerElement(elmChild: HTMLElement): HTMLElement = js.native
  
  def HandleDeleteProcessedUserKey(e: Event): Unit = js.native
  
  def HandleProcessedUserClick(ndClicked: HTMLElement): Unit = js.native
  
  def HandleResolveProcessedUserKey(e: Event): Unit = js.native
}
