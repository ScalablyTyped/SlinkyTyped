package typingsSlinky.sharp.mod

import typingsSlinky.sharp.sharpStrings.contain
import typingsSlinky.sharp.sharpStrings.cover
import typingsSlinky.sharp.sharpStrings.fill
import typingsSlinky.sharp.sharpStrings.inside
import typingsSlinky.sharp.sharpStrings.outside
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FitEnum extends StObject {
  
  var contain: typingsSlinky.sharp.sharpStrings.contain = js.native
  
  var cover: typingsSlinky.sharp.sharpStrings.cover = js.native
  
  var fill: typingsSlinky.sharp.sharpStrings.fill = js.native
  
  var inside: typingsSlinky.sharp.sharpStrings.inside = js.native
  
  var outside: typingsSlinky.sharp.sharpStrings.outside = js.native
}
object FitEnum {
  
  @scala.inline
  def apply(contain: contain, cover: cover, fill: fill, inside: inside, outside: outside): FitEnum = {
    val __obj = js.Dynamic.literal(contain = contain.asInstanceOf[js.Any], cover = cover.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], inside = inside.asInstanceOf[js.Any], outside = outside.asInstanceOf[js.Any])
    __obj.asInstanceOf[FitEnum]
  }
  
  @scala.inline
  implicit class FitEnumMutableBuilder[Self <: FitEnum] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContain(value: contain): Self = StObject.set(x, "contain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCover(value: cover): Self = StObject.set(x, "cover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFill(value: fill): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInside(value: inside): Self = StObject.set(x, "inside", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutside(value: outside): Self = StObject.set(x, "outside", value.asInstanceOf[js.Any])
  }
}
