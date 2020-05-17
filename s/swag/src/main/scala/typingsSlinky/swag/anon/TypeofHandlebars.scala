package typingsSlinky.swag.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofHandlebars extends js.Object {
  val AST: js.Any = js.native
  val Utils: js.Any = js.native
  val VM: js.Any = js.native
}

object TypeofHandlebars {
  @scala.inline
  def apply(AST: js.Any, Utils: js.Any, VM: js.Any): TypeofHandlebars = {
    val __obj = js.Dynamic.literal(AST = AST.asInstanceOf[js.Any], Utils = Utils.asInstanceOf[js.Any], VM = VM.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofHandlebars]
  }
  @scala.inline
  implicit class TypeofHandlebarsOps[Self <: TypeofHandlebars] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAST(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AST")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUtils(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Utils")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVM(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VM")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

