package typingsSlinky.tsmonad.writerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WriterPatterns[S, T, U] extends js.Object {
  def writer(story: js.Array[S], value: T): U = js.native
}

object WriterPatterns {
  @scala.inline
  def apply[S, T, U](writer: (js.Array[S], T) => U): WriterPatterns[S, T, U] = {
    val __obj = js.Dynamic.literal(writer = js.Any.fromFunction2(writer))
    __obj.asInstanceOf[WriterPatterns[S, T, U]]
  }
  @scala.inline
  implicit class WriterPatternsOps[Self[s, t, u] <: WriterPatterns[s, t, u], S, T, U] (val x: Self[S, T, U]) extends AnyVal {
    @scala.inline
    def duplicate: Self[S, T, U] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[S, T, U]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[S, T, U]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[S, T, U]) with Other]
    @scala.inline
    def withWriter(value: (js.Array[S], T) => U): Self[S, T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writer")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

