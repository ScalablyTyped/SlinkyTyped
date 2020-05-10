package typingsSlinky.tsmonad.monadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Monad[T] extends js.Object {
  def bind[U](f: js.Function1[/* t */ T, Monad[U]]): Monad[U] = js.native
  def chain[U](f: js.Function1[/* t */ T, Monad[U]]): Monad[U] = js.native
  def of[U](t: U): Monad[U] = js.native
  def unit[U](t: U): Monad[U] = js.native
}

object Monad {
  @scala.inline
  def apply[T](
    bind: js.Function1[/* t */ T, Monad[js.Any]] => Monad[js.Any],
    chain: js.Function1[/* t */ T, Monad[js.Any]] => Monad[js.Any],
    of: js.Any => Monad[js.Any],
    unit: js.Any => Monad[js.Any]
  ): Monad[T] = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction1(bind), chain = js.Any.fromFunction1(chain), of = js.Any.fromFunction1(of), unit = js.Any.fromFunction1(unit))
    __obj.asInstanceOf[Monad[T]]
  }
  @scala.inline
  implicit class MonadOps[Self[t] <: Monad[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withBind(value: js.Function1[/* t */ T, Monad[js.Any]] => Monad[js.Any]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bind")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withChain(value: js.Function1[/* t */ T, Monad[js.Any]] => Monad[js.Any]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chain")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOf(value: js.Any => Monad[js.Any]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("of")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUnit(value: js.Any => Monad[js.Any]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

