package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BarProp extends StObject {
  
  val visible: scala.Boolean = js.native
}
object BarProp {
  
  @scala.inline
  def apply(visible: scala.Boolean): BarProp = {
    val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarProp]
  }
  
  @scala.inline
  implicit class BarPropMutableBuilder[Self <: BarProp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVisible(value: scala.Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
