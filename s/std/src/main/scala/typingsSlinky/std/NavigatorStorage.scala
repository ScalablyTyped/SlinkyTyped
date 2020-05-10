package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigatorStorage extends js.Object {
  val storage: StorageManager = js.native
}

object NavigatorStorage {
  @scala.inline
  def apply(storage: StorageManager): NavigatorStorage = {
    val __obj = js.Dynamic.literal(storage = storage.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigatorStorage]
  }
  @scala.inline
  implicit class NavigatorStorageOps[Self <: NavigatorStorage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStorage(value: StorageManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storage")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

