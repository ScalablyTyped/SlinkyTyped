package typingsSlinky.summernote.mod.global.Summernote

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModuleOptions extends StObject {
  
  var options: js.UndefOr[js.Any] = js.native
}
object ModuleOptions {
  
  @scala.inline
  def apply(): ModuleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModuleOptions]
  }
  
  @scala.inline
  implicit class ModuleOptionsMutableBuilder[Self <: ModuleOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
