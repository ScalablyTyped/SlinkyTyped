package typingsSlinky.servicenowLondon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XMLNodeIterator extends js.Object {
  def hasNext(): Boolean = js.native
  def next(): XMLNode = js.native
}

object XMLNodeIterator {
  @scala.inline
  def apply(hasNext: () => Boolean, next: () => XMLNode): XMLNodeIterator = {
    val __obj = js.Dynamic.literal(hasNext = js.Any.fromFunction0(hasNext), next = js.Any.fromFunction0(next))
    __obj.asInstanceOf[XMLNodeIterator]
  }
  @scala.inline
  implicit class XMLNodeIteratorOps[Self <: XMLNodeIterator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHasNext(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasNext")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNext(value: () => XMLNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

