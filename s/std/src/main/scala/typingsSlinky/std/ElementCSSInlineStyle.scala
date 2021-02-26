package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElementCSSInlineStyle extends StObject {
  
  val style: org.scalajs.dom.raw.CSSStyleDeclaration = js.native
}
object ElementCSSInlineStyle {
  
  @scala.inline
  def apply(style: org.scalajs.dom.raw.CSSStyleDeclaration): ElementCSSInlineStyle = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementCSSInlineStyle]
  }
  
  @scala.inline
  implicit class ElementCSSInlineStyleMutableBuilder[Self <: ElementCSSInlineStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStyle(value: org.scalajs.dom.raw.CSSStyleDeclaration): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
