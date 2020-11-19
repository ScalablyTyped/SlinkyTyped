package typingsSlinky.semanticUiApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.Api.RegExpSettings._Impl, 'optional'> */
@js.native
trait PickImploptional extends js.Object {
  
  var optional: js.RegExp = js.native
}
object PickImploptional {
  
  @scala.inline
  def apply(optional: js.RegExp): PickImploptional = {
    val __obj = js.Dynamic.literal(optional = optional.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImploptional]
  }
  
  @scala.inline
  implicit class PickImploptionalOps[Self <: PickImploptional] (val x: Self) extends AnyVal {
    
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
    def setOptional(value: js.RegExp): Self = this.set("optional", value.asInstanceOf[js.Any])
  }
}
