package typingsSlinky.terminalKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Continue extends StObject {
  
  var continue: js.UndefOr[Boolean] = js.native
  
  var offset: js.UndefOr[Double] = js.native
  
  var width: Null | Double = js.native
  
  var x: Double = js.native
}
object Continue {
  
  @scala.inline
  def apply(x: Double): Continue = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any])
    __obj.asInstanceOf[Continue]
  }
  
  @scala.inline
  implicit class ContinueMutableBuilder[Self <: Continue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContinue(value: Boolean): Self = StObject.set(x, "continue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinueUndefined: Self = StObject.set(x, "continue", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthNull: Self = StObject.set(x, "width", null)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
  }
}
