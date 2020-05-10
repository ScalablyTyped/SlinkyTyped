package typingsSlinky.vegaUtil.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FastMap_ extends js.Object {
  var empty: Double = js.native
  var size: Double = js.native
  def clean(): Unit = js.native
  def delete(f: String): Unit = js.native
  def get(f: String): js.Any = js.native
  def has(f: String): Boolean = js.native
  def set(f: String, v: js.Any): Unit = js.native
}

object FastMap_ {
  @scala.inline
  def apply(
    clean: () => Unit,
    delete: String => Unit,
    empty: Double,
    get: String => js.Any,
    has: String => Boolean,
    set: (String, js.Any) => Unit,
    size: Double
  ): FastMap_ = {
    val __obj = js.Dynamic.literal(clean = js.Any.fromFunction0(clean), delete = js.Any.fromFunction1(delete), empty = empty.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), set = js.Any.fromFunction2(set), size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[FastMap_]
  }
  @scala.inline
  implicit class FastMap_Ops[Self <: FastMap_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClean(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clean")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDelete(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEmpty(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("empty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGet(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHas(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet(value: (String, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

