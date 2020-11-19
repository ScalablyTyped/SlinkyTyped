package typingsSlinky.yesql.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Text[TParams /* <: js.Object */] extends js.Object {
  
  var text: String = js.native
  
  var values: js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: TParams[keyof TParams] */ js.Any
  ] = js.native
}
object Text {
  
  @scala.inline
  def apply[TParams /* <: js.Object */](
    text: String,
    values: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: TParams[keyof TParams] */ js.Any
    ]
  ): Text[TParams] = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Text[TParams]]
  }
  
  @scala.inline
  implicit class TextOps[Self <: Text[_], TParams /* <: js.Object */] (val x: Self with Text[TParams]) extends AnyVal {
    
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
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: TParams[keyof TParams] */ js.Any)*
    ): Self = this.set("values", js.Array(value :_*))
    
    @scala.inline
    def setValues(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: TParams[keyof TParams] */ js.Any
        ]
    ): Self = this.set("values", value.asInstanceOf[js.Any])
  }
}
