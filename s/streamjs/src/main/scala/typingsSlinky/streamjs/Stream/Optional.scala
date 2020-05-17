package typingsSlinky.streamjs.Stream

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Optional[T] extends js.Object {
  def filter(predicate: js.Function1[/* elem */ T, Boolean]): Optional[T] = js.native
  def flatMap[U](mapper: js.Function1[/* elem */ T, Optional[U]]): Optional[U] = js.native
  def get(): T = js.native
  def ifPresent(consumer: js.Function1[/* elem */ T, Unit]): Unit = js.native
  def isPresent(): Boolean = js.native
  def map[U](mapper: js.Function1[/* elem */ T, U]): Optional[U] = js.native
  def orElse(other: T): T = js.native
  def orElseGet(supplier: Supplier[T]): T = js.native
  def orElseThrow(error: js.Any): T = js.native
}

object Optional {
  @scala.inline
  def apply[T](
    filter: js.Function1[/* elem */ T, Boolean] => Optional[T],
    flatMap: js.Function1[/* elem */ T, Optional[js.Any]] => Optional[js.Any],
    get: () => T,
    ifPresent: js.Function1[/* elem */ T, Unit] => Unit,
    isPresent: () => Boolean,
    map: js.Function1[/* elem */ T, js.Any] => Optional[js.Any],
    orElse: T => T,
    orElseGet: Supplier[T] => T,
    orElseThrow: js.Any => T
  ): Optional[T] = {
    val __obj = js.Dynamic.literal(filter = js.Any.fromFunction1(filter), flatMap = js.Any.fromFunction1(flatMap), get = js.Any.fromFunction0(get), ifPresent = js.Any.fromFunction1(ifPresent), isPresent = js.Any.fromFunction0(isPresent), map = js.Any.fromFunction1(map), orElse = js.Any.fromFunction1(orElse), orElseGet = js.Any.fromFunction1(orElseGet), orElseThrow = js.Any.fromFunction1(orElseThrow))
    __obj.asInstanceOf[Optional[T]]
  }
  @scala.inline
  implicit class OptionalOps[Self[t] <: Optional[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withFilter(value: js.Function1[/* elem */ T, Boolean] => Optional[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFlatMap(value: js.Function1[/* elem */ T, Optional[js.Any]] => Optional[js.Any]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flatMap")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: () => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIfPresent(value: js.Function1[/* elem */ T, Unit] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifPresent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsPresent(value: () => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPresent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMap(value: js.Function1[/* elem */ T, js.Any] => Optional[js.Any]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOrElse(value: T => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orElse")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOrElseGet(value: Supplier[T] => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orElseGet")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOrElseThrow(value: js.Any => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orElseThrow")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

