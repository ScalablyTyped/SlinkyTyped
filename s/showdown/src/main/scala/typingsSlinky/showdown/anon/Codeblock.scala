package typingsSlinky.showdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Codeblock extends js.Object {
  
  var codeblock: js.UndefOr[String] = js.native
  
  var text: js.UndefOr[String] = js.native
}
object Codeblock {
  
  @scala.inline
  def apply(): Codeblock = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Codeblock]
  }
  
  @scala.inline
  implicit class CodeblockOps[Self <: Codeblock] (val x: Self) extends AnyVal {
    
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
    def setCodeblock(value: String): Self = this.set("codeblock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodeblock: Self = this.set("codeblock", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
