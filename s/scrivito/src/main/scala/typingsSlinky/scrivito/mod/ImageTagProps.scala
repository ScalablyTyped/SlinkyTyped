package typingsSlinky.scrivito.mod

import org.scalajs.dom.raw.HTMLImageElement
import typingsSlinky.react.mod.HTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageTagProps extends HTMLAttributes[HTMLImageElement] {
  
  var alt: js.UndefOr[String] = js.native
  
  var attribute: String = js.native
  
  var content: Binary | Obj | Widget = js.native
}
object ImageTagProps {
  
  @scala.inline
  def apply(attribute: String, content: Binary | Obj | Widget): ImageTagProps = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageTagProps]
  }
  
  @scala.inline
  implicit class ImageTagPropsMutableBuilder[Self <: ImageTagProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
    
    @scala.inline
    def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: Binary | Obj | Widget): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
