package typingsSlinky.tcomb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplyCommand extends Command {
  
  @JSName("$apply")
  var $apply: js.Function = js.native
}
object ApplyCommand {
  
  @scala.inline
  def apply($apply: js.Function): ApplyCommand = {
    val __obj = js.Dynamic.literal($apply = $apply.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplyCommand]
  }
  
  @scala.inline
  implicit class ApplyCommandMutableBuilder[Self <: ApplyCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$apply(value: js.Function): Self = StObject.set(x, "$apply", value.asInstanceOf[js.Any])
  }
}
