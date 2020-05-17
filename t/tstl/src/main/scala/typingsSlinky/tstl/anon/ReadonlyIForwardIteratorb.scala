package typingsSlinky.tstl.anon

import typingsSlinky.tstl.iforwarditeratorMod.IForwardIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<tstl.tstl/iterator/IForwardIterator.IForwardIterator<boolean, tstl.tstl/iterator/IForwardIterator.IForwardIterator<boolean, any>>> */
@js.native
trait ReadonlyIForwardIteratorb extends js.Object {
  val value: Boolean = js.native
  def equals(obj: IForwardIterator[Boolean, _]): Boolean = js.native
  def next(): IForwardIterator[Boolean, _] = js.native
}

object ReadonlyIForwardIteratorb {
  @scala.inline
  def apply(
    equals: IForwardIterator[Boolean, _] => Boolean,
    next: () => IForwardIterator[Boolean, _],
    value: Boolean
  ): ReadonlyIForwardIteratorb = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), next = js.Any.fromFunction0(next), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyIForwardIteratorb]
  }
  @scala.inline
  implicit class ReadonlyIForwardIteratorbOps[Self <: ReadonlyIForwardIteratorb] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEquals(value: IForwardIterator[Boolean, _] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equals")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNext(value: () => IForwardIterator[Boolean, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

