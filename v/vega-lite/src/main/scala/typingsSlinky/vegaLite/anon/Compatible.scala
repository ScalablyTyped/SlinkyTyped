package typingsSlinky.vegaLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Compatible extends StObject {
  
  var compatible: Boolean = js.native
  
  var warning: js.UndefOr[String] = js.native
}
object Compatible {
  
  @scala.inline
  def apply(compatible: Boolean): Compatible = {
    val __obj = js.Dynamic.literal(compatible = compatible.asInstanceOf[js.Any])
    __obj.asInstanceOf[Compatible]
  }
  
  @scala.inline
  implicit class CompatibleMutableBuilder[Self <: Compatible] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompatible(value: Boolean): Self = StObject.set(x, "compatible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarning(value: String): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
