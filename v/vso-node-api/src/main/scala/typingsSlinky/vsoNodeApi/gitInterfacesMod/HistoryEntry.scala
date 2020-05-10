package typingsSlinky.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HistoryEntry[T] extends js.Object {
  /**
    * The Change list (changeset/commit/shelveset) for this point in history
    */
  var changeList: ChangeList[T] = js.native
  /**
    * The change made to the item from this change list (only relevant for File history, not folders)
    */
  var itemChangeType: VersionControlChangeType = js.native
  /**
    * The path of the item at this point in history (only relevant for File history, not folders)
    */
  var serverItem: String = js.native
}

object HistoryEntry {
  @scala.inline
  def apply[T](changeList: ChangeList[T], itemChangeType: VersionControlChangeType, serverItem: String): HistoryEntry[T] = {
    val __obj = js.Dynamic.literal(changeList = changeList.asInstanceOf[js.Any], itemChangeType = itemChangeType.asInstanceOf[js.Any], serverItem = serverItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoryEntry[T]]
  }
  @scala.inline
  implicit class HistoryEntryOps[Self[t] <: HistoryEntry[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withChangeList(value: ChangeList[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemChangeType(value: VersionControlChangeType): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemChangeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerItem(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverItem")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

