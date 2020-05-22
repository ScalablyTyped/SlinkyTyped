package typingsSlinky.wiredep.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Block extends js.Object {
  /**
    *  match the beginning-to-end of a bower block in this type of file
    */
  var block: js.RegExp
  var detect: TypeOfBowerFile
  var replace: AnotherTypeOfBowerFile
}

object Block {
  @scala.inline
  def apply(block: js.RegExp, detect: TypeOfBowerFile, replace: AnotherTypeOfBowerFile): Block = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], detect = detect.asInstanceOf[js.Any], replace = replace.asInstanceOf[js.Any])
    __obj.asInstanceOf[Block]
  }
}

