package typingsSlinky.storybookUi.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Title extends StObject {
  
  var id: String = js.native
  
  var left: String | ReactElement = js.native
  
  def onClick(): Unit = js.native
  
  var right: ReactElement = js.native
  
  var title: String = js.native
}
object Title {
  
  @scala.inline
  def apply(id: String, left: String | ReactElement, onClick: () => Unit, right: ReactElement, title: String): Title = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], onClick = js.Any.fromFunction0(onClick), right = right.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Title]
  }
  
  @scala.inline
  implicit class TitleMutableBuilder[Self <: Title] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: String | ReactElement): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftReactElement(value: ReactElement): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRight(value: ReactElement): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
