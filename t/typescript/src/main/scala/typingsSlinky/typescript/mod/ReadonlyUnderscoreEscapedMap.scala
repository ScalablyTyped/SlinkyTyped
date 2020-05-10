package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadonlyUnderscoreEscapedMap[T] extends js.Object {
  val size: Double = js.native
  def entries(): Iterator[js.Tuple2[String, T]] = js.native
  def forEach(action: js.Function2[/* value */ T, /* key */ String, Unit]): Unit = js.native
  def get(key: String): js.UndefOr[T] = js.native
  def has(key: String): Boolean = js.native
  def keys(): Iterator[String] = js.native
  def values(): Iterator[T] = js.native
}

object ReadonlyUnderscoreEscapedMap {
  @scala.inline
  def apply[T](
    entries: () => Iterator[js.Tuple2[String, T]],
    forEach: js.Function2[/* value */ T, /* key */ String, Unit] => Unit,
    get: String => js.UndefOr[T],
    has: String => Boolean,
    keys: () => Iterator[String],
    size: Double,
    values: () => Iterator[T]
  ): ReadonlyUnderscoreEscapedMap[T] = {
    val __obj = js.Dynamic.literal(entries = js.Any.fromFunction0(entries), forEach = js.Any.fromFunction1(forEach), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), keys = js.Any.fromFunction0(keys), size = size.asInstanceOf[js.Any], values = js.Any.fromFunction0(values))
    __obj.asInstanceOf[ReadonlyUnderscoreEscapedMap[T]]
  }
  @scala.inline
  implicit class ReadonlyUnderscoreEscapedMapOps[Self[t] <: ReadonlyUnderscoreEscapedMap[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withEntries(value: () => Iterator[js.Tuple2[String, T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entries")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withForEach(value: js.Function2[/* value */ T, /* key */ String, Unit] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forEach")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: String => js.UndefOr[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHas(value: String => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withKeys(value: () => Iterator[String]): Self[T] = {
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

