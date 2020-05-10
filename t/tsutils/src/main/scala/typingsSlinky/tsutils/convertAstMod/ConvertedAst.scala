package typingsSlinky.tsutils.convertAstMod

import typingsSlinky.typescript.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConvertedAst extends js.Object {
  var flat: js.Array[Node] = js.native
  var wrapped: WrappedAst = js.native
}

object ConvertedAst {
  @scala.inline
  def apply(flat: js.Array[Node], wrapped: WrappedAst): ConvertedAst = {
    val __obj = js.Dynamic.literal(flat = flat.asInstanceOf[js.Any], wrapped = wrapped.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConvertedAst]
  }
  @scala.inline
  implicit class ConvertedAstOps[Self <: ConvertedAst] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlat(value: js.Array[Node]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWrapped(value: WrappedAst): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapped")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

