package typingsSlinky.traverson.mod.Traverson

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Traversal extends js.Object {
  def continue(): Builder = js.native
}

object Traversal {
  @scala.inline
  def apply(continue: () => Builder): Traversal = {
    val __obj = js.Dynamic.literal(continue = js.Any.fromFunction0(continue))
    __obj.asInstanceOf[Traversal]
  }
  @scala.inline
  implicit class TraversalOps[Self <: Traversal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContinue(value: () => Builder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continue")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

