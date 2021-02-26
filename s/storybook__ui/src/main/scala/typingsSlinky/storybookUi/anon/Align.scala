package typingsSlinky.storybookUi.anon

import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.storybookUi.storybookUiStrings.bottom
import typingsSlinky.storybookUi.storybookUiStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Align extends StObject {
  
  var align: bottom | right = js.native
  
  var hidden: Boolean = js.native
  
  var position: CSSProperties = js.native
}
object Align {
  
  @scala.inline
  def apply(align: bottom | right, hidden: Boolean, position: CSSProperties): Align = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Align]
  }
  
  @scala.inline
  implicit class AlignMutableBuilder[Self <: Align] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign(value: bottom | right): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: CSSProperties): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
