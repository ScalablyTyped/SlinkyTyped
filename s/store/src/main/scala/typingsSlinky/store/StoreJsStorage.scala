package typingsSlinky.store

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StoreJsStorage extends js.Object {
  var name: String = js.native
  def clearAll(): Unit = js.native
  def each(callback: js.Function2[/* val */ String, /* key */ String, _]): Unit = js.native
  def read(key: String): String | Null = js.native
  def remove(key: String): Unit = js.native
  def write(key: String, data: String): Unit = js.native
}

object StoreJsStorage {
  @scala.inline
  def apply(
    clearAll: () => Unit,
    each: js.Function2[/* val */ String, /* key */ String, _] => Unit,
    name: String,
    read: String => String | Null,
    remove: String => Unit,
    write: (String, String) => Unit
  ): StoreJsStorage = {
    val __obj = js.Dynamic.literal(clearAll = js.Any.fromFunction0(clearAll), each = js.Any.fromFunction1(each), name = name.asInstanceOf[js.Any], read = js.Any.fromFunction1(read), remove = js.Any.fromFunction1(remove), write = js.Any.fromFunction2(write))
    __obj.asInstanceOf[StoreJsStorage]
  }
  @scala.inline
  implicit class StoreJsStorageOps[Self <: StoreJsStorage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClearAll(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearAll")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEach(value: js.Function2[/* val */ String, /* key */ String, _] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("each")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRead(value: String => String | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemove(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWrite(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("write")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

