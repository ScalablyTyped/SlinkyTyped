package typingsSlinky.terserWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MinifyResult extends js.Object {
  
  var code: js.Any = js.native
  
  var extractedComments: js.Any = js.native
  
  var map: js.Any = js.native
}
object MinifyResult {
  
  @scala.inline
  def apply(code: js.Any, extractedComments: js.Any, map: js.Any): MinifyResult = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], extractedComments = extractedComments.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinifyResult]
  }
  
  @scala.inline
  implicit class MinifyResultOps[Self <: MinifyResult] (val x: Self) extends AnyVal {
    
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
    def setCode(value: js.Any): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtractedComments(value: js.Any): Self = this.set("extractedComments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMap(value: js.Any): Self = this.set("map", value.asInstanceOf[js.Any])
  }
}
