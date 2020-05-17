package typingsSlinky.slickgrid.Slick.Data.Aggregators

import typingsSlinky.slickgrid.Slick.GroupTotals
import typingsSlinky.slickgrid.Slick.SlickData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Aggregator[T /* <: SlickData */] extends js.Object {
  var field: String = js.native
  def accumulate(item: T): Unit = js.native
  def init(): Unit = js.native
  def storeResult(groupTotals: GroupTotals[T]): Unit = js.native
}

object Aggregator {
  @scala.inline
  def apply[T](accumulate: T => Unit, field: String, init: () => Unit, storeResult: GroupTotals[T] => Unit): Aggregator[T] = {
    val __obj = js.Dynamic.literal(accumulate = js.Any.fromFunction1(accumulate), field = field.asInstanceOf[js.Any], init = js.Any.fromFunction0(init), storeResult = js.Any.fromFunction1(storeResult))
    __obj.asInstanceOf[Aggregator[T]]
  }
  @scala.inline
  implicit class AggregatorOps[Self[t] <: Aggregator[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAccumulate(value: T => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accumulate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withField(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInit(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStoreResult(value: GroupTotals[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storeResult")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

