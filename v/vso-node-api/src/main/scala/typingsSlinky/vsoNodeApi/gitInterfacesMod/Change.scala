package typingsSlinky.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Change[T] extends js.Object {
  /**
    * The type of change that was made to the item.
    */
  var changeType: VersionControlChangeType = js.native
  /**
    * Current version.
    */
  var item: T = js.native
  /**
    * Content of the item after the change.
    */
  var newContent: ItemContent = js.native
  /**
    * Path of the item on the server.
    */
  var sourceServerItem: String = js.native
  /**
    * URL to retrieve the item.
    */
  var url: String = js.native
}

object Change {
  @scala.inline
  def apply[T](
    changeType: VersionControlChangeType,
    item: T,
    newContent: ItemContent,
    sourceServerItem: String,
    url: String
  ): Change[T] = {
    val __obj = js.Dynamic.literal(changeType = changeType.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], newContent = newContent.asInstanceOf[js.Any], sourceServerItem = sourceServerItem.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Change[T]]
  }
  @scala.inline
  implicit class ChangeOps[Self[t] <: Change[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withChangeType(value: VersionControlChangeType): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewContent(value: ItemContent): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceServerItem(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceServerItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

