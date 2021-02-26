package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateAndTimeSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/DateAndTimeSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[DateAndTimeSmallProps] = js.native
  
  @js.native
  trait DateAndTimeSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object DateAndTimeSmallProps {
    
    @scala.inline
    def apply(): DateAndTimeSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DateAndTimeSmallProps]
    }
    
    @scala.inline
    implicit class DateAndTimeSmallPropsMutableBuilder[Self <: DateAndTimeSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[DateAndTimeSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `dateAndTimeSmallMod.foo` */
  override def _to: ReactComponentClass[DateAndTimeSmallProps] = default
}
