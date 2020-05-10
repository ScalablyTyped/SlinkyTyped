package typingsSlinky.winjs.WinJS.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an item in a list.
  **/
@js.native
trait IItem[T] extends js.Object {
  //#region Properties
  /**
    * Gets or sets the item's data.
    **/
  var data: T = js.native
  /**
    * Gets the group key for the item. This property is only available for items that belong to a grouped data source.
    **/
  var groupKey: String = js.native
  /**
    * Gets the temporary ID of the item.
    **/
  var handle: String = js.native
  /**
    * Gets the item's index in the IListDataSource.
    **/
  var index: Double = js.native
  /**
    * Gets or sets the key the identifies the item.
    **/
  var key: String = js.native
}

object IItem {
  @scala.inline
  def apply[T](data: T, groupKey: String, handle: String, index: Double, key: String): IItem[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], groupKey = groupKey.asInstanceOf[js.Any], handle = handle.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[IItem[T]]
  }
  @scala.inline
  implicit class IItemOps[Self[t] <: IItem[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withData(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupKey(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHandle(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

