package typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SemanticTokensPartialResult extends js.Object {
  
  var data: js.Array[Double] = js.native
}
object SemanticTokensPartialResult {
  
  @scala.inline
  def apply(data: js.Array[Double]): SemanticTokensPartialResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[SemanticTokensPartialResult]
  }
  
  @scala.inline
  implicit class SemanticTokensPartialResultOps[Self <: SemanticTokensPartialResult] (val x: Self) extends AnyVal {
    
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
    def setDataVarargs(value: Double*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[Double]): Self = this.set("data", value.asInstanceOf[js.Any])
  }
}
