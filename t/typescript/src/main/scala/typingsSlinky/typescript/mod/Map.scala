package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** ES6 Map interface. */
@js.native
trait Map[T] extends ReadonlyMap[T] {
  def clear(): Unit = js.native
  def delete(key: java.lang.String): Boolean = js.native
  def set(key: java.lang.String, value: T): this.type = js.native
}

object Map {
  @scala.inline
  def apply[T](
    clear: () => Unit,
    delete: java.lang.String => Boolean,
    entries: () => Iterator[js.Tuple2[java.lang.String, T]],
    forEach: js.Function2[T, /* key */ java.lang.String, Unit] => Unit,
    get: java.lang.String => js.UndefOr[T],
    has: java.lang.String => Boolean,
    keys: () => Iterator[java.lang.String],
    set: (java.lang.String, T) => Map[T],
    size: Double,
    values: () => Iterator[T]
  ): Map[T] = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), delete = js.Any.fromFunction1(delete), entries = js.Any.fromFunction0(entries), forEach = js.Any.fromFunction1(forEach), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), keys = js.Any.fromFunction0(keys), set = js.Any.fromFunction2(set), size = size.asInstanceOf[js.Any], values = js.Any.fromFunction0(values))
    __obj.asInstanceOf[Map[T]]
  }
  @scala.inline
  implicit class MapOps[Self[t] <: Map[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withClear(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDelete(value: java.lang.String => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet(value: (java.lang.String, T) => Map[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

