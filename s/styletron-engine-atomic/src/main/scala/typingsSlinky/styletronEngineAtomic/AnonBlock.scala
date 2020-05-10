package typingsSlinky.styletronEngineAtomic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBlock extends js.Object {
  var block: String = js.native
  var pseudo: String = js.native
}

object AnonBlock {
  @scala.inline
  def apply(block: String, pseudo: String): AnonBlock = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], pseudo = pseudo.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBlock]
  }
  @scala.inline
  implicit class AnonBlockOps[Self <: AnonBlock] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlock(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("block")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPseudo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pseudo")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

