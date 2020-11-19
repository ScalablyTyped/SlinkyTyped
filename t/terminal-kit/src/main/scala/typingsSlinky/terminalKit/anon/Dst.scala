package typingsSlinky.terminalKit.anon

import typingsSlinky.terminalKit.screenBufferMod.ScreenBuffer
import typingsSlinky.terminalKit.terminalMod.Terminal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dst extends js.Object {
  
  var dst: Terminal | ScreenBuffer = js.native
}
object Dst {
  
  @scala.inline
  def apply(dst: Terminal | ScreenBuffer): Dst = {
    val __obj = js.Dynamic.literal(dst = dst.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dst]
  }
  
  @scala.inline
  implicit class DstOps[Self <: Dst] (val x: Self) extends AnyVal {
    
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
    def setDst(value: Terminal | ScreenBuffer): Self = this.set("dst", value.asInstanceOf[js.Any])
  }
}
