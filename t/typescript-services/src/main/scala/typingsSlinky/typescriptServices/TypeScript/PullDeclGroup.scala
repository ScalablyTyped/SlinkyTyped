package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PullDeclGroup extends js.Object {
  var _decls: js.Any = js.native
  var name: String = js.native
  def addDecl(decl: PullDecl): Unit = js.native
  def getDecls(): js.Array[PullDecl] = js.native
}

object PullDeclGroup {
  @scala.inline
  def apply(_decls: js.Any, addDecl: PullDecl => Unit, getDecls: () => js.Array[PullDecl], name: String): PullDeclGroup = {
    val __obj = js.Dynamic.literal(_decls = _decls.asInstanceOf[js.Any], addDecl = js.Any.fromFunction1(addDecl), getDecls = js.Any.fromFunction0(getDecls), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullDeclGroup]
  }
  @scala.inline
  implicit class PullDeclGroupOps[Self <: PullDeclGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_decls(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_decls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddDecl(value: PullDecl => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addDecl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetDecls(value: () => js.Array[PullDecl]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDecls")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

