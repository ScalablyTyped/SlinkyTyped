package typingsSlinky.wordpressBlocks.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@wordpress/blocks.@wordpress/blocks.Category> */
@js.native
trait PartialCategory extends StObject {
  
  var icon: js.UndefOr[
    ReactElement | typingsSlinky.wordpressComponents.dashiconMod.Dashicon.Icon | Null
  ] = js.native
  
  var slug: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
}
object PartialCategory {
  
  @scala.inline
  def apply(): PartialCategory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCategory]
  }
  
  @scala.inline
  implicit class PartialCategoryMutableBuilder[Self <: PartialCategory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIcon(value: ReactElement | typingsSlinky.wordpressComponents.dashiconMod.Dashicon.Icon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconNull: Self = StObject.set(x, "icon", null)
    
    @scala.inline
    def setIconReactElement(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlugUndefined: Self = StObject.set(x, "slug", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
