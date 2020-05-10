package typingsSlinky.tstl.mapContainerMod.MapContainer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IteratorBase[Key, T] extends js.Object {
  /**
    * The first, key element.
    */
  val first: Key = js.native
  /**
    * The second, stored element.
    */
  var second: T = js.native
}

object IteratorBase {
  @scala.inline
  def apply[Key, T](first: Key, second: T): IteratorBase[Key, T] = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any])
    __obj.asInstanceOf[IteratorBase[Key, T]]
  }
  @scala.inline
  implicit class IteratorBaseOps[Self[key, t] <: IteratorBase[key, t], Key, T] (val x: Self[Key, T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Key, T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Key, T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Key, T]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Key, T]) with Other]
    @scala.inline
    def withFirst(value: Key): Self[Key, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecond(value: T): Self[Key, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("second")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

