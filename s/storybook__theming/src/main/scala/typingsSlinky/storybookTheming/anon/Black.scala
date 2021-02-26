package typingsSlinky.storybookTheming.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Black extends StObject {
  
  var black: Double = js.native
  
  var bold: Double = js.native
  
  var regular: Double = js.native
}
object Black {
  
  @scala.inline
  def apply(black: Double, bold: Double, regular: Double): Black = {
    val __obj = js.Dynamic.literal(black = black.asInstanceOf[js.Any], bold = bold.asInstanceOf[js.Any], regular = regular.asInstanceOf[js.Any])
    __obj.asInstanceOf[Black]
  }
  
  @scala.inline
  implicit class BlackMutableBuilder[Self <: Black] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlack(value: Double): Self = StObject.set(x, "black", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBold(value: Double): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegular(value: Double): Self = StObject.set(x, "regular", value.asInstanceOf[js.Any])
  }
}
