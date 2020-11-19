package typingsSlinky.typescriptServices.TypeScript.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormalTypeParameterInfo extends js.Object {
  
  var docComment: String = js.native
  
  var limChar: Double = js.native
  
  var minChar: Double = js.native
  
  var name: String = js.native
}
object FormalTypeParameterInfo {
  
  @scala.inline
  def apply(docComment: String, limChar: Double, minChar: Double, name: String): FormalTypeParameterInfo = {
    val __obj = js.Dynamic.literal(docComment = docComment.asInstanceOf[js.Any], limChar = limChar.asInstanceOf[js.Any], minChar = minChar.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormalTypeParameterInfo]
  }
  
  @scala.inline
  implicit class FormalTypeParameterInfoOps[Self <: FormalTypeParameterInfo] (val x: Self) extends AnyVal {
    
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
    def setDocComment(value: String): Self = this.set("docComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimChar(value: Double): Self = this.set("limChar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinChar(value: Double): Self = this.set("minChar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
