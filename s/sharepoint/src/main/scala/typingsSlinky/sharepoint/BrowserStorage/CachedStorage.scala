package typingsSlinky.sharepoint.BrowserStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Available only in SharePoint Online*/
@js.native
trait CachedStorage extends js.Object {
  var length: Double = js.native
  def clead(): Unit = js.native
  def getItem(key: String): String = js.native
  def removeItem(key: String): Unit = js.native
  def setItem(key: String, value: String): Unit = js.native
}

object CachedStorage {
  @scala.inline
  def apply(
    clead: () => Unit,
    getItem: String => String,
    length: Double,
    removeItem: String => Unit,
    setItem: (String, String) => Unit
  ): CachedStorage = {
    val __obj = js.Dynamic.literal(clead = js.Any.fromFunction0(clead), getItem = js.Any.fromFunction1(getItem), length = length.asInstanceOf[js.Any], removeItem = js.Any.fromFunction1(removeItem), setItem = js.Any.fromFunction2(setItem))
    __obj.asInstanceOf[CachedStorage]
  }
  @scala.inline
  implicit class CachedStorageOps[Self <: CachedStorage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClead(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clead")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetItem(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveItem(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetItem(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setItem")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

