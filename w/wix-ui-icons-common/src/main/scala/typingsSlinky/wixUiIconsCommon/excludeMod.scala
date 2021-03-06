package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object excludeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Exclude", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ExcludeProps] = js.native
  
  @js.native
  trait ExcludeProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object ExcludeProps {
    
    @scala.inline
    def apply(): ExcludeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExcludeProps]
    }
    
    @scala.inline
    implicit class ExcludePropsMutableBuilder[Self <: ExcludeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[ExcludeProps]
  
  /* This means you don't have to write `default`, but can instead just say `excludeMod.foo` */
  override def _to: ReactComponentClass[ExcludeProps] = default
}
