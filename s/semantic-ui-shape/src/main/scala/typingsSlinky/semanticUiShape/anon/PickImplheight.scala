package typingsSlinky.semanticUiShape.anon

import typingsSlinky.semanticUiShape.semanticUiShapeStrings.initial
import typingsSlinky.semanticUiShape.semanticUiShapeStrings.next
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-shape.SemanticUI.ShapeSettings._Impl, 'height'> */
@js.native
trait PickImplheight extends StObject {
  
  var height: next | initial | Double = js.native
}
object PickImplheight {
  
  @scala.inline
  def apply(height: next | initial | Double): PickImplheight = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplheight]
  }
  
  @scala.inline
  implicit class PickImplheightMutableBuilder[Self <: PickImplheight] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: next | initial | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
  }
}
