package typingsSlinky.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Filter Options
@js.native
trait FilterOptions[T /* <: FindConstant */] extends js.Object {
  var filter: FilterFunction[T] | FilterObject | String = js.native
}

object FilterOptions {
  @scala.inline
  def apply[T](filter: FilterFunction[T] | FilterObject | String): FilterOptions[T] = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterOptions[T]]
  }
  @scala.inline
  implicit class FilterOptionsOps[Self[t] <: FilterOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withFilterFunction1(
      value: /* import warning: importer.ImportType#apply Failed type conversion: screeps.FindTypes[T] */ /* object */ js.Any => Boolean
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFilter(value: FilterFunction[T] | FilterObject | String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

