package typingsSlinky.wordpressData.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Storage extends js.Object {
  var storage: js.UndefOr[PickStoragegetItemsetItem] = js.native
  var storageKey: js.UndefOr[String] = js.native
}

object Storage {
  @scala.inline
  def apply(): Storage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Storage]
  }
  @scala.inline
  implicit class StorageOps[Self <: Storage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStorage(value: PickStoragegetItemsetItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storage")(js.undefined)
        ret
    }
    @scala.inline
    def withStorageKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorageKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageKey")(js.undefined)
        ret
    }
  }
  
}

