package typingsSlinky.tcomb.mod

import typingsSlinky.tcomb.anon.From
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SwapCommand extends Command {
  
  @JSName("$swap")
  var $swap: From = js.native
}
object SwapCommand {
  
  @scala.inline
  def apply($swap: From): SwapCommand = {
    val __obj = js.Dynamic.literal($swap = $swap.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwapCommand]
  }
  
  @scala.inline
  implicit class SwapCommandMutableBuilder[Self <: SwapCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$swap(value: From): Self = StObject.set(x, "$swap", value.asInstanceOf[js.Any])
  }
}
