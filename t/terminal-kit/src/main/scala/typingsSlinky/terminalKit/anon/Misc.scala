package typingsSlinky.terminalKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Misc extends StObject {
  
  var attr: Double = js.native
  
  var misc: js.Any = js.native
  
  var offset: Double = js.native
  
  var text: String = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
object Misc {
  
  @scala.inline
  def apply(attr: Double, misc: js.Any, offset: Double, text: String, x: Double, y: Double): Misc = {
    val __obj = js.Dynamic.literal(attr = attr.asInstanceOf[js.Any], misc = misc.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Misc]
  }
  
  @scala.inline
  implicit class MiscMutableBuilder[Self <: Misc] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttr(value: Double): Self = StObject.set(x, "attr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMisc(value: js.Any): Self = StObject.set(x, "misc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
