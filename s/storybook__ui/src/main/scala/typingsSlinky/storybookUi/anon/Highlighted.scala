package typingsSlinky.storybookUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Highlighted extends StObject {
  
  var highlighted: Boolean = js.native
}
object Highlighted {
  
  @scala.inline
  def apply(highlighted: Boolean): Highlighted = {
    val __obj = js.Dynamic.literal(highlighted = highlighted.asInstanceOf[js.Any])
    __obj.asInstanceOf[Highlighted]
  }
  
  @scala.inline
  implicit class HighlightedMutableBuilder[Self <: Highlighted] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHighlighted(value: Boolean): Self = StObject.set(x, "highlighted", value.asInstanceOf[js.Any])
  }
}
