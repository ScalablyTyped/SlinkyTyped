package typingsSlinky.winrtUwp.Windows.Foundation.Collections

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a key-value pair. This is typically used as a constraint type when you need to encapsulate two type parameters into one to satisfy the constraints of another generic interface. */
@js.native
trait IKeyValuePair[K, V] extends js.Object {
  /** Gets the key of the key-value pair. */
  var key: K = js.native
  /** Gets the value of the key-value pair. */
  var value: V = js.native
}

object IKeyValuePair {
  @scala.inline
  def apply[K, V](key: K, value: V): IKeyValuePair[K, V] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKeyValuePair[K, V]]
  }
  @scala.inline
  implicit class IKeyValuePairOps[Self[k, v] <: IKeyValuePair[k, v], K, V] (val x: Self[K, V]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K, V] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K, V]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[K, V]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[K, V]) with Other]
    @scala.inline
    def withKey(value: K): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: V): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

