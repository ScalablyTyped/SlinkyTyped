package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpeechGrammar extends js.Object {
  
  var src: java.lang.String = js.native
  
  var weight: Double = js.native
}
object SpeechGrammar {
  
  @scala.inline
  def apply(src: java.lang.String, weight: Double): SpeechGrammar = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechGrammar]
  }
  
  @scala.inline
  implicit class SpeechGrammarOps[Self <: SpeechGrammar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSrc(value: java.lang.String): Self = this.set("src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeight(value: Double): Self = this.set("weight", value.asInstanceOf[js.Any])
  }
}
