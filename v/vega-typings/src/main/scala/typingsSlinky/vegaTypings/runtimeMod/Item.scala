package typingsSlinky.vegaTypings.runtimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Item[T] extends js.Object {
  /**
    * The underlying data element to which this item corresponds.
    */
  var datum: T = js.native
  /**
    * The mark to which this item belongs.
    */
  var mark: RuntimeMark = js.native
}

object Item {
  @scala.inline
  def apply[T](datum: T, mark: RuntimeMark): Item[T] = {
    val __obj = js.Dynamic.literal(datum = datum.asInstanceOf[js.Any], mark = mark.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item[T]]
  }
  @scala.inline
  implicit class ItemOps[Self[t] <: Item[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withDatum(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMark(value: RuntimeMark): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mark")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

