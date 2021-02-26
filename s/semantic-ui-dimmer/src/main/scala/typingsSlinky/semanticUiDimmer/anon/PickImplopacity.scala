package typingsSlinky.semanticUiDimmer.anon

import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dimmer.SemanticUI.DimmerSettings._Impl, 'opacity'> */
@js.native
trait PickImplopacity extends StObject {
  
  var opacity: auto | Double = js.native
}
object PickImplopacity {
  
  @scala.inline
  def apply(opacity: auto | Double): PickImplopacity = {
    val __obj = js.Dynamic.literal(opacity = opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplopacity]
  }
  
  @scala.inline
  implicit class PickImplopacityMutableBuilder[Self <: PickImplopacity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOpacity(value: auto | Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
  }
}
