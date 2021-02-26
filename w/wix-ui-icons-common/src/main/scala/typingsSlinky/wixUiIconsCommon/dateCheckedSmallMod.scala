package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateCheckedSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/DateCheckedSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[DateCheckedSmallProps] = js.native
  
  @js.native
  trait DateCheckedSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object DateCheckedSmallProps {
    
    @scala.inline
    def apply(): DateCheckedSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DateCheckedSmallProps]
    }
    
    @scala.inline
    implicit class DateCheckedSmallPropsMutableBuilder[Self <: DateCheckedSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[DateCheckedSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `dateCheckedSmallMod.foo` */
  override def _to: ReactComponentClass[DateCheckedSmallProps] = default
}
