package typingsSlinky.typescriptCompare.mod.Compare.Options

import typingsSlinky.typescriptCompare.typescriptCompareStrings.broaderLeft
import typingsSlinky.typescriptCompare.typescriptCompareStrings.broaderRight
import typingsSlinky.typescriptCompare.typescriptCompareStrings.equal
import typingsSlinky.typescriptCompare.typescriptCompareStrings.mismatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Default
  extends typingsSlinky.typescriptCompare.mod.Compare.Options {
  
  @JSName("broaderLeft")
  var broaderLeft_Default: broaderLeft = js.native
  
  @JSName("broaderRight")
  var broaderRight_Default: broaderRight = js.native
  
  @JSName("equal")
  var equal_Default: equal = js.native
  
  @JSName("mismatch")
  var mismatch_Default: mismatch = js.native
}
object Default {
  
  @scala.inline
  def apply(broaderLeft: broaderLeft, broaderRight: broaderRight, equal: equal, mismatch: mismatch): Default = {
    val __obj = js.Dynamic.literal(broaderLeft = broaderLeft.asInstanceOf[js.Any], broaderRight = broaderRight.asInstanceOf[js.Any], equal = equal.asInstanceOf[js.Any], mismatch = mismatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[Default]
  }
  
  @scala.inline
  implicit class DefaultOps[Self <: Default] (val x: Self) extends AnyVal {
    
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
    def setBroaderLeft(value: broaderLeft): Self = this.set("broaderLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBroaderRight(value: broaderRight): Self = this.set("broaderRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEqual(value: equal): Self = this.set("equal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMismatch(value: mismatch): Self = this.set("mismatch", value.asInstanceOf[js.Any])
  }
}
