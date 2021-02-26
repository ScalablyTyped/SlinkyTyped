package typingsSlinky.storybookUi.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnClick extends StObject {
  
  var id: String = js.native
  
  var left: ReactElement = js.native
  
  def onClick(): js.Promise[Unit] = js.native
  
  var title: String = js.native
}
object OnClick {
  
  @scala.inline
  def apply(id: String, left: ReactElement, onClick: () => js.Promise[Unit], title: String): OnClick = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], onClick = js.Any.fromFunction0(onClick), title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnClick]
  }
  
  @scala.inline
  implicit class OnClickMutableBuilder[Self <: OnClick] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: ReactElement): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClick(value: () => js.Promise[Unit]): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
