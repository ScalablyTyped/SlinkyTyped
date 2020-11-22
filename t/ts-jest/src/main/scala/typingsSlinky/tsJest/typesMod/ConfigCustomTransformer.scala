package typingsSlinky.tsJest.typesMod

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigCustomTransformer extends js.Object {
  
  var after: js.UndefOr[js.Array[String | (AstTransformer[Record[String, _]])]] = js.native
  
  var afterDeclarations: js.UndefOr[js.Array[String | (AstTransformer[Record[String, _]])]] = js.native
  
  var before: js.UndefOr[js.Array[String | (AstTransformer[Record[String, _]])]] = js.native
}
object ConfigCustomTransformer {
  
  @scala.inline
  def apply(): ConfigCustomTransformer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigCustomTransformer]
  }
  
  @scala.inline
  implicit class ConfigCustomTransformerOps[Self <: ConfigCustomTransformer] (val x: Self) extends AnyVal {
    
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
    def setAfterVarargs(value: (String | (AstTransformer[Record[String, js.Any]]))*): Self = this.set("after", js.Array(value :_*))
    
    @scala.inline
    def setAfter(value: js.Array[String | (AstTransformer[Record[String, _]])]): Self = this.set("after", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfter: Self = this.set("after", js.undefined)
    
    @scala.inline
    def setAfterDeclarationsVarargs(value: (String | (AstTransformer[Record[String, js.Any]]))*): Self = this.set("afterDeclarations", js.Array(value :_*))
    
    @scala.inline
    def setAfterDeclarations(value: js.Array[String | (AstTransformer[Record[String, _]])]): Self = this.set("afterDeclarations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfterDeclarations: Self = this.set("afterDeclarations", js.undefined)
    
    @scala.inline
    def setBeforeVarargs(value: (String | (AstTransformer[Record[String, js.Any]]))*): Self = this.set("before", js.Array(value :_*))
    
    @scala.inline
    def setBefore(value: js.Array[String | (AstTransformer[Record[String, _]])]): Self = this.set("before", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBefore: Self = this.set("before", js.undefined)
  }
}
