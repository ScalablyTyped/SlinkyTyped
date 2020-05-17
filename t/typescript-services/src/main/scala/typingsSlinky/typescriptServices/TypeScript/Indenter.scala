package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Indenter extends js.Object {
  var indentAmt: Double = js.native
  def decreaseIndent(): Unit = js.native
  def getIndent(): String = js.native
  def increaseIndent(): Unit = js.native
}

object Indenter {
  @scala.inline
  def apply(decreaseIndent: () => Unit, getIndent: () => String, increaseIndent: () => Unit, indentAmt: Double): Indenter = {
    val __obj = js.Dynamic.literal(decreaseIndent = js.Any.fromFunction0(decreaseIndent), getIndent = js.Any.fromFunction0(getIndent), increaseIndent = js.Any.fromFunction0(increaseIndent), indentAmt = indentAmt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Indenter]
  }
  @scala.inline
  implicit class IndenterOps[Self <: Indenter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDecreaseIndent(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decreaseIndent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetIndent(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIndent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIncreaseIndent(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("increaseIndent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIndentAmt(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentAmt")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

