package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnderscoreEscapedMap[T] extends ESMap[String, T]
object UnderscoreEscapedMap {
  
  @scala.inline
  def apply[T](
    clear: () => Unit,
    delete: String => Boolean,
    entries: () => Iterator[js.Tuple2[String, T]],
    forEach: js.Function2[T, String, Unit] => Unit,
    get: String => js.UndefOr[T],
    has: String => Boolean,
    keys: () => Iterator[String],
    set: (String, T) => UnderscoreEscapedMap[T],
    size: Double,
    values: () => Iterator[T]
  ): UnderscoreEscapedMap[T] = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), delete = js.Any.fromFunction1(delete), entries = js.Any.fromFunction0(entries), forEach = js.Any.fromFunction1(forEach), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), keys = js.Any.fromFunction0(keys), set = js.Any.fromFunction2(set), size = size.asInstanceOf[js.Any], values = js.Any.fromFunction0(values))
    __obj.asInstanceOf[UnderscoreEscapedMap[T]]
  }
}
