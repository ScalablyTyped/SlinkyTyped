package typingsSlinky.sharepoint

import typingsSlinky.sharepoint.anon.Dictname
import typingsSlinky.sharepoint.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SPClientPeoplePickerMRU extends js.Object {
  def GetItems(strKey: String): Dictname = js.native
  def ResetCache(): Unit = js.native
  def SetItem[T /* <: Key */](strSearchTerm: String, objEntity: T): Unit = js.native
}

object SPClientPeoplePickerMRU {
  @scala.inline
  def apply(GetItems: String => Dictname, ResetCache: () => Unit, SetItem: (String, js.Any) => Unit): SPClientPeoplePickerMRU = {
    val __obj = js.Dynamic.literal(GetItems = js.Any.fromFunction1(GetItems), ResetCache = js.Any.fromFunction0(ResetCache), SetItem = js.Any.fromFunction2(SetItem))
    __obj.asInstanceOf[SPClientPeoplePickerMRU]
  }
  @scala.inline
  implicit class SPClientPeoplePickerMRUOps[Self <: SPClientPeoplePickerMRU] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetItems(value: String => Dictname): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetItems")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withResetCache(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResetCache")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetItem(value: (String, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetItem")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

