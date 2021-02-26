package typingsSlinky.semanticUiShape.anon

import typingsSlinky.semanticUiShape.semanticUiShapeStrings.initial
import typingsSlinky.semanticUiShape.semanticUiShapeStrings.next
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-shape.SemanticUI.ShapeSettings._Impl, 'width'> */
@js.native
trait PickImplwidth extends StObject {
  
  var width: next | initial | Double = js.native
}
object PickImplwidth {
  
  @scala.inline
  def apply(width: next | initial | Double): PickImplwidth = {
    val __obj = js.Dynamic.literal(width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplwidth]
  }
  
  @scala.inline
  implicit class PickImplwidthMutableBuilder[Self <: PickImplwidth] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWidth(value: next | initial | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
