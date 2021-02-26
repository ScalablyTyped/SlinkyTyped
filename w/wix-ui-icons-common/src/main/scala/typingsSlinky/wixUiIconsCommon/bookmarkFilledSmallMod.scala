package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bookmarkFilledSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/BookmarkFilledSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[BookmarkFilledSmallProps] = js.native
  
  @js.native
  trait BookmarkFilledSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object BookmarkFilledSmallProps {
    
    @scala.inline
    def apply(): BookmarkFilledSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BookmarkFilledSmallProps]
    }
    
    @scala.inline
    implicit class BookmarkFilledSmallPropsMutableBuilder[Self <: BookmarkFilledSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[BookmarkFilledSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `bookmarkFilledSmallMod.foo` */
  override def _to: ReactComponentClass[BookmarkFilledSmallProps] = default
}
