package typingsSlinky.typescript.anon

import typingsSlinky.typescript.mod.Diagnostic
import typingsSlinky.typescript.mod.TypeAcquisition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var errors: js.Array[Diagnostic] = js.native
  
  var options: TypeAcquisition = js.native
}
object Options {
  
  @scala.inline
  def apply(errors: js.Array[Diagnostic], options: TypeAcquisition): Options = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setErrorsVarargs(value: Diagnostic*): Self = this.set("errors", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: js.Array[Diagnostic]): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: TypeAcquisition): Self = this.set("options", value.asInstanceOf[js.Any])
  }
}
