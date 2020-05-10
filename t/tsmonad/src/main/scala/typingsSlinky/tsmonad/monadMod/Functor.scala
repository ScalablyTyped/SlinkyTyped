package typingsSlinky.tsmonad.monadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Functor[T] extends js.Object {
  def fmap[U](f: js.Function1[/* t */ T, U]): Functor[U] = js.native
  def lift[U](f: js.Function1[/* t */ T, U]): Functor[U] = js.native
  def map[U](f: js.Function1[/* t */ T, U]): Functor[U] = js.native
}

object Functor {
  @scala.inline
  def apply[T](
    fmap: js.Function1[/* t */ T, js.Any] => Functor[js.Any],
    lift: js.Function1[/* t */ T, js.Any] => Functor[js.Any],
    map: js.Function1[/* t */ T, js.Any] => Functor[js.Any]
  ): Functor[T] = {
    val __obj = js.Dynamic.literal(fmap = js.Any.fromFunction1(fmap), lift = js.Any.fromFunction1(lift), map = js.Any.fromFunction1(map))
    __obj.asInstanceOf[Functor[T]]
  }
  @scala.inline
  implicit class FunctorOps[Self[t] <: Functor[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withFmap(value: js.Function1[/* t */ T, js.Any] => Functor[js.Any]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fmap")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLift(value: js.Function1[/* t */ T, js.Any] => Functor[js.Any]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lift")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMap(value: js.Function1[/* t */ T, js.Any] => Functor[js.Any]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

