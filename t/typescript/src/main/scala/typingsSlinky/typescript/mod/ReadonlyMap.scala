package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** ES6 Map interface, only read methods included. */
@js.native
trait ReadonlyMap[T] extends js.Object {
  val size: Double = js.native
  def entries(): Iterator[js.Tuple2[java.lang.String, T]] = js.native
  def forEach(action: js.Function2[/* value */ T, /* key */ java.lang.String, Unit]): Unit = js.native
  def get(key: java.lang.String): js.UndefOr[T] = js.native
  def has(key: java.lang.String): Boolean = js.native
  def keys(): Iterator[java.lang.String] = js.native
  def values(): Iterator[T] = js.native
}

object ReadonlyMap {
  @scala.inline
  def apply[T](
    entries: () => Iterator[js.Tuple2[java.lang.String, T]],
    forEach: js.Function2[/* value */ T, /* key */ java.lang.String, Unit] => Unit,
    get: java.lang.String => js.UndefOr[T],
    has: java.lang.String => Boolean,
    keys: () => Iterator[java.lang.String],
    size: Double,
    values: () => Iterator[T]
  ): ReadonlyMap[T] = {
    val __obj = js.Dynamic.literal(entries = js.Any.fromFunction0(entries), forEach = js.Any.fromFunction1(forEach), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), keys = js.Any.fromFunction0(keys), size = size.asInstanceOf[js.Any], values = js.Any.fromFunction0(values))
    __obj.asInstanceOf[ReadonlyMap[T]]
  }
  @scala.inline
  implicit class ReadonlyMapOps[Self[t] <: ReadonlyMap[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withEntries(value: () => Iterator[js.Tuple2[java.lang.String, T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entries")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withForEach(value: js.Function2[/* value */ T, /* key */ java.lang.String, Unit] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forEach")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: java.lang.String => js.UndefOr[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHas(value: java.lang.String => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withKeys(value: () => Iterator[java.lang.String]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSize(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: () => Iterator[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

