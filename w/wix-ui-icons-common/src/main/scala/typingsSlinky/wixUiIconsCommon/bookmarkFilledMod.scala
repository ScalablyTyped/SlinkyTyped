package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bookmarkFilledMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/BookmarkFilled", JSImport.Default)
  @js.native
  val default: ReactComponentClass[BookmarkFilledProps] = js.native
  
  @js.native
  trait BookmarkFilledProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object BookmarkFilledProps {
    
    @scala.inline
    def apply(): BookmarkFilledProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BookmarkFilledProps]
    }
    
    @scala.inline
    implicit class BookmarkFilledPropsMutableBuilder[Self <: BookmarkFilledProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[BookmarkFilledProps]
  
  /* This means you don't have to write `default`, but can instead just say `bookmarkFilledMod.foo` */
  override def _to: ReactComponentClass[BookmarkFilledProps] = default
}
