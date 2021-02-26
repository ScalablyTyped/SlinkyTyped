package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bookmarkSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/BookmarkSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[BookmarkSmallProps] = js.native
  
  @js.native
  trait BookmarkSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object BookmarkSmallProps {
    
    @scala.inline
    def apply(): BookmarkSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BookmarkSmallProps]
    }
    
    @scala.inline
    implicit class BookmarkSmallPropsMutableBuilder[Self <: BookmarkSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[BookmarkSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `bookmarkSmallMod.foo` */
  override def _to: ReactComponentClass[BookmarkSmallProps] = default
}
