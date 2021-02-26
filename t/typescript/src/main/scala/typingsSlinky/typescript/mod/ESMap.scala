package typingsSlinky.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** ES6 Map interface. */
@js.native
trait ESMap[K, V]
  extends ReadonlyESMap[K, V]
     with Collection[K] {
  
  def set(key: K, value: V): this.type = js.native
}
object ESMap {
  
  @scala.inline
  def apply[K, V](
    clear: () => Unit,
    delete: K => Boolean,
    entries: () => Iterator[js.Tuple2[K, V]],
    forEach: js.Function2[V, K, Unit] => Unit,
    get: K => js.UndefOr[V],
    has: K => Boolean,
    keys: () => Iterator[K],
    set: (K, V) => ESMap[K, V],
    size: Double,
    values: () => Iterator[V]
  ): ESMap[K, V] = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), delete = js.Any.fromFunction1(delete), entries = js.Any.fromFunction0(entries), forEach = js.Any.fromFunction1(forEach), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), keys = js.Any.fromFunction0(keys), set = js.Any.fromFunction2(set), size = size.asInstanceOf[js.Any], values = js.Any.fromFunction0(values))
    __obj.asInstanceOf[ESMap[K, V]]
  }
  
  @scala.inline
  implicit class ESMapMutableBuilder[Self <: ESMap[_, _], K, V] (val x: Self with (ESMap[K, V])) extends AnyVal {
    
    @scala.inline
    def setSet(value: (K, V) => ESMap[K, V]): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
  }
}
