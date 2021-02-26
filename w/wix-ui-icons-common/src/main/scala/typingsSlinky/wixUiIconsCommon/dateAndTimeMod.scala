package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateAndTimeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/DateAndTime", JSImport.Default)
  @js.native
  val default: ReactComponentClass[DateAndTimeProps] = js.native
  
  @js.native
  trait DateAndTimeProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object DateAndTimeProps {
    
    @scala.inline
    def apply(): DateAndTimeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DateAndTimeProps]
    }
    
    @scala.inline
    implicit class DateAndTimePropsMutableBuilder[Self <: DateAndTimeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[DateAndTimeProps]
  
  /* This means you don't have to write `default`, but can instead just say `dateAndTimeMod.foo` */
  override def _to: ReactComponentClass[DateAndTimeProps] = default
}
