package typingsSlinky.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnderscoreEscapedMap[T] extends ReadonlyUnderscoreEscapedMap[T] {
  def clear(): Unit
  def delete(key: __String): Boolean
  def set(key: __String, value: T): this.type
}

object UnderscoreEscapedMap {
  @scala.inline
  def apply[T](
    clear: () => Unit,
    delete: __String => Boolean,
    entries: () => Iterator[js.Tuple2[__String, T]],
    forEach: js.Function2[T, /* key */ __String, Unit] => Unit,
    get: __String => js.UndefOr[T],
    has: __String => Boolean,
    keys: () => Iterator[__String],
    set: (__String, T) => UnderscoreEscapedMap[T],
    size: Double,
    values: () => Iterator[T]
  ): UnderscoreEscapedMap[T] = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), delete = js.Any.fromFunction1(delete), entries = js.Any.fromFunction0(entries), forEach = js.Any.fromFunction1(forEach), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), keys = js.Any.fromFunction0(keys), set = js.Any.fromFunction2(set), size = size.asInstanceOf[js.Any], values = js.Any.fromFunction0(values))
  
    __obj.asInstanceOf[UnderscoreEscapedMap[T]]
  }
}

