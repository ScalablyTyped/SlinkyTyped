package typingsSlinky.webgme.Gme.Concepts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComposeChain extends js.Object {
  var objId: String = js.native
  var subCompId: js.UndefOr[String] = js.native
}

object ComposeChain {
  @scala.inline
  def apply(objId: String): ComposeChain = {
    val __obj = js.Dynamic.literal(objId = objId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComposeChain]
  }
  @scala.inline
  implicit class ComposeChainOps[Self <: ComposeChain] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withObjId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubCompId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subCompId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubCompId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subCompId")(js.undefined)
        ret
    }
  }
  
}

