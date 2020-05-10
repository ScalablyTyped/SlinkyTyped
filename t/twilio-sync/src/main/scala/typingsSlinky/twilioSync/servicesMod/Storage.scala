package typingsSlinky.twilioSync.servicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Storage extends js.Object {
  def read(`type`: String, id: String): js.Object = js.native
  def remove(`type`: String, sid: String, uniqueName: String): js.Any = js.native
  def store(`type`: String, id: String, value: js.Object): js.Any = js.native
  def update(`type`: String, id: String, uniqueName: String, patch: js.Object): js.Any = js.native
  def updateStorageId(storageId: String): js.Any = js.native
}

object Storage {
  @scala.inline
  def apply(
    read: (String, String) => js.Object,
    remove: (String, String, String) => js.Any,
    store: (String, String, js.Object) => js.Any,
    update: (String, String, String, js.Object) => js.Any,
    updateStorageId: String => js.Any
  ): Storage = {
    val __obj = js.Dynamic.literal(read = js.Any.fromFunction2(read), remove = js.Any.fromFunction3(remove), store = js.Any.fromFunction3(store), update = js.Any.fromFunction4(update), updateStorageId = js.Any.fromFunction1(updateStorageId))
    __obj.asInstanceOf[Storage]
  }
  @scala.inline
  implicit class StorageOps[Self <: Storage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRead(value: (String, String) => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRemove(value: (String, String, String) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withStore(value: (String, String, js.Object) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withUpdate(value: (String, String, String, js.Object) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withUpdateStorageId(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateStorageId")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

