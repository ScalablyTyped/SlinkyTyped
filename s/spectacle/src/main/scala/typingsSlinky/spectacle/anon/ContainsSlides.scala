package typingsSlinky.spectacle.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainsSlides extends StObject {
  
  var children: ReactElement = js.native
  
  var containsSlides: js.UndefOr[Boolean] = js.native
}
object ContainsSlides {
  
  @scala.inline
  def apply(): ContainsSlides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainsSlides]
  }
  
  @scala.inline
  implicit class ContainsSlidesMutableBuilder[Self <: ContainsSlides] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setContainsSlides(value: Boolean): Self = StObject.set(x, "containsSlides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainsSlidesUndefined: Self = StObject.set(x, "containsSlides", js.undefined)
  }
}
