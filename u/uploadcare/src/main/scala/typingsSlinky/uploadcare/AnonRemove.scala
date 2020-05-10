package typingsSlinky.uploadcare

import typingsSlinky.uploadcare.mod.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRemove extends js.Object {
  def remove(uuid: String, callback: js.Function2[/* err */ js.Error, /* res */ File, Unit]): Unit = js.native
  def store(uuid: String, callback: js.Function2[/* err */ js.Error, /* res */ File, Unit]): Unit = js.native
}

object AnonRemove {
  @scala.inline
  def apply(
    remove: (String, js.Function2[/* err */ js.Error, /* res */ File, Unit]) => Unit,
    store: (String, js.Function2[/* err */ js.Error, /* res */ File, Unit]) => Unit
  ): AnonRemove = {
    val __obj = js.Dynamic.literal(remove = js.Any.fromFunction2(remove), store = js.Any.fromFunction2(store))
    __obj.asInstanceOf[AnonRemove]
  }
  @scala.inline
  implicit class AnonRemoveOps[Self <: AnonRemove] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRemove(value: (String, js.Function2[/* err */ js.Error, /* res */ File, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withStore(value: (String, js.Function2[/* err */ js.Error, /* res */ File, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

