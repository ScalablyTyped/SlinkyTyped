package typingsSlinky.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AscendingDescending extends StObject {
  
  var ascending: scala.Double = js.native
  
  var descending: scala.Double = js.native
}
object AscendingDescending {
  
  @scala.inline
  def apply(ascending: scala.Double, descending: scala.Double): AscendingDescending = {
    val __obj = js.Dynamic.literal(ascending = ascending.asInstanceOf[js.Any], descending = descending.asInstanceOf[js.Any])
    __obj.asInstanceOf[AscendingDescending]
  }
  
  @scala.inline
  implicit class AscendingDescendingMutableBuilder[Self <: AscendingDescending] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAscending(value: scala.Double): Self = StObject.set(x, "ascending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescending(value: scala.Double): Self = StObject.set(x, "descending", value.asInstanceOf[js.Any])
  }
}
