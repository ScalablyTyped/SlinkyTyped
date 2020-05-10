package typingsSlinky.wordpressData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<std.Storage, 'getItem' | 'setItem'> & std.Partial<std.Storage> */
@js.native
trait PickStoragegetItemsetItem extends js.Object {
  var clear: js.UndefOr[js.Function0[Unit]] = js.native
  var getItem: js.UndefOr[js.Function1[/* key */ String, String | Null]] = js.native
  var key: js.UndefOr[js.Function1[/* index */ Double, String | Null]] = js.native
  var length: js.UndefOr[Double] = js.native
  var removeItem: js.UndefOr[js.Function1[/* key */ String, Unit]] = js.native
  var setItem: js.UndefOr[js.Function2[/* key */ String, /* value */ String, Unit]] = js.native
}

object PickStoragegetItemsetItem {
  @scala.inline
  def apply(): PickStoragegetItemsetItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickStoragegetItemsetItem]
  }
  @scala.inline
  implicit class PickStoragegetItemsetItemOps[Self <: PickStoragegetItemsetItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutClear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.undefined)
        ret
    }
    @scala.inline
    def withGetItem(value: /* key */ String => String | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItem")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: /* index */ Double => String | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveItem(value: /* key */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRemoveItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeItem")(js.undefined)
        ret
    }
    @scala.inline
    def withSetItem(value: (/* key */ String, /* value */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setItem")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setItem")(js.undefined)
        ret
    }
  }
  
}

