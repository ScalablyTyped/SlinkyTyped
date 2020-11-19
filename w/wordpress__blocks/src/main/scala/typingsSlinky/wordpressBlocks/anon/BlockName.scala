package typingsSlinky.wordpressBlocks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlockName extends js.Object {
  
  var blockName: String = js.native
}
object BlockName {
  
  @scala.inline
  def apply(blockName: String): BlockName = {
    val __obj = js.Dynamic.literal(blockName = blockName.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockName]
  }
  
  @scala.inline
  implicit class BlockNameOps[Self <: BlockName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBlockName(value: String): Self = this.set("blockName", value.asInstanceOf[js.Any])
  }
}
