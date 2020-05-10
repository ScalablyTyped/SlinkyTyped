package typingsSlinky.zipkin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context[T] extends js.Object {
  def getContext(): T = js.native
  def letContext[V](ctx: T, callback: js.Function0[V]): V = js.native
  def scoped[V](callback: js.Function0[V]): V = js.native
  def setContext(ctx: T): Unit = js.native
}

object Context {
  @scala.inline
  def apply[T](
    getContext: () => T,
    letContext: (T, js.Function0[js.Any]) => js.Any,
    scoped: js.Function0[js.Any] => js.Any,
    setContext: T => Unit
  ): Context[T] = {
    val __obj = js.Dynamic.literal(getContext = js.Any.fromFunction0(getContext), letContext = js.Any.fromFunction2(letContext), scoped = js.Any.fromFunction1(scoped), setContext = js.Any.fromFunction1(setContext))
    __obj.asInstanceOf[Context[T]]
  }
  @scala.inline
  implicit class ContextOps[Self[t] <: Context[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withGetContext(value: () => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContext")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLetContext(value: (T, js.Function0[js.Any]) => js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("letContext")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withScoped(value: js.Function0[js.Any] => js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scoped")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetContext(value: T => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setContext")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

