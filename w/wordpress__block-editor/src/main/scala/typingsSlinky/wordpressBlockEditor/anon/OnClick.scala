package typingsSlinky.wordpressBlockEditor.anon

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.MouseEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnClick extends StObject {
  
  var onClick: MouseEventHandler[HTMLButtonElement] = js.native
  
  var title: ReactElement = js.native
}
object OnClick {
  
  @scala.inline
  def apply(onClick: SyntheticMouseEvent[HTMLButtonElement] => Unit): OnClick = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1(onClick))
    __obj.asInstanceOf[OnClick]
  }
  
  @scala.inline
  implicit class OnClickMutableBuilder[Self <: OnClick] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnClick(value: SyntheticMouseEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTitle(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
