package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object favoriteFilledMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/FavoriteFilled", JSImport.Default)
  @js.native
  val default: ReactComponentClass[FavoriteFilledProps] = js.native
  
  @js.native
  trait FavoriteFilledProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object FavoriteFilledProps {
    
    @scala.inline
    def apply(): FavoriteFilledProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FavoriteFilledProps]
    }
    
    @scala.inline
    implicit class FavoriteFilledPropsMutableBuilder[Self <: FavoriteFilledProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[FavoriteFilledProps]
  
  /* This means you don't have to write `default`, but can instead just say `favoriteFilledMod.foo` */
  override def _to: ReactComponentClass[FavoriteFilledProps] = default
}
