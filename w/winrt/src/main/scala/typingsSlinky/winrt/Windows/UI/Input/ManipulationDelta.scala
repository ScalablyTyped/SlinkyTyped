package typingsSlinky.winrt.Windows.UI.Input

import typingsSlinky.winrt.Windows.Foundation.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManipulationDelta extends StObject {
  
  var expansion: Double = js.native
  
  var rotation: Double = js.native
  
  var scale: Double = js.native
  
  var translation: Point = js.native
}
object ManipulationDelta {
  
  @scala.inline
  def apply(expansion: Double, rotation: Double, scale: Double, translation: Point): ManipulationDelta = {
    val __obj = js.Dynamic.literal(expansion = expansion.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], translation = translation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManipulationDelta]
  }
  
  @scala.inline
  implicit class ManipulationDeltaMutableBuilder[Self <: ManipulationDelta] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpansion(value: Double): Self = StObject.set(x, "expansion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslation(value: Point): Self = StObject.set(x, "translation", value.asInstanceOf[js.Any])
  }
}
