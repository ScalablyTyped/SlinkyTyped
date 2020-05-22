package typingsSlinky.sharepoint.global

import typingsSlinky.sharepoint.anon.Dictname
import typingsSlinky.sharepoint.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SPClientPeoplePickerMRU")
@js.native
class SPClientPeoplePickerMRU ()
  extends typingsSlinky.sharepoint.SPClientPeoplePickerMRU {
  /* CompleteClass */
  override def GetItems(strKey: String): Dictname = js.native
  /* CompleteClass */
  override def ResetCache(): Unit = js.native
  /* CompleteClass */
  override def SetItem[T /* <: Key */](strSearchTerm: String, objEntity: T): Unit = js.native
}

/* static members */
@JSGlobal("SPClientPeoplePickerMRU")
@js.native
object SPClientPeoplePickerMRU extends js.Object {
   // = 1;
  var MaxPPMRUItems: Double = js.native
   // = 200;
  var PPMRUDomLocalStoreKey: String = js.native
  var PPMRUVersion: Double = js.native
   // = "ClientPeoplePickerMRU";
  def GetSPClientPeoplePickerMRU(): typingsSlinky.sharepoint.SPClientPeoplePickerMRU = js.native
}

