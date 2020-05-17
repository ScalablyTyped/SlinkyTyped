package typingsSlinky.wiredep.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Block extends js.Object {
  /**
    *  match the beginning-to-end of a bower block in this type of file
    */
  var block: js.RegExp = js.native
  var detect: TypeOfBowerFile = js.native
  var replace: AnotherTypeOfBowerFile = js.native
}

object Block {
  @scala.inline
  def apply(block: js.RegExp, detect: TypeOfBowerFile, replace: AnotherTypeOfBowerFile): Block = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], detect = detect.asInstanceOf[js.Any], replace = replace.asInstanceOf[js.Any])
    __obj.asInstanceOf[Block]
  }
  @scala.inline
  implicit class BlockOps[Self <: Block] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlock(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("block")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDetect(value: TypeOfBowerFile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplace(value: AnotherTypeOfBowerFile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replace")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

