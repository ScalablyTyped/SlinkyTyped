package typingsSlinky.zipkinContextCls.mod

import typingsSlinky.zipkin.mod.Context
import typingsSlinky.zipkin.mod.TraceId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CLSContext
  extends Context[js.Any] {
  def letContext[V](ctx: TraceId, callback: js.Function0[V]): V = js.native
  def setContext(ctx: TraceId): Unit = js.native
}

object CLSContext {
  @scala.inline
  def apply(
    getContext: () => js.Any,
    letContext: (TraceId, js.Function0[js.Any]) => js.Any,
    scoped: js.Function0[js.Any] => js.Any,
    setContext: TraceId => Unit
  ): CLSContext = {
    val __obj = js.Dynamic.literal(getContext = js.Any.fromFunction0(getContext), letContext = js.Any.fromFunction2(letContext), scoped = js.Any.fromFunction1(scoped), setContext = js.Any.fromFunction1(setContext))
    __obj.asInstanceOf[CLSContext]
  }
  @scala.inline
  implicit class CLSContextOps[Self <: CLSContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLetContext(value: (TraceId, js.Function0[js.Any]) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("letContext")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetContext(value: TraceId => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setContext")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

