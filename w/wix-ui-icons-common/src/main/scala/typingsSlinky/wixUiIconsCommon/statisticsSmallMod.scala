package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statisticsSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/StatisticsSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[StatisticsSmallProps] = js.native
  
  @js.native
  trait StatisticsSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object StatisticsSmallProps {
    
    @scala.inline
    def apply(): StatisticsSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatisticsSmallProps]
    }
    
    @scala.inline
    implicit class StatisticsSmallPropsMutableBuilder[Self <: StatisticsSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[StatisticsSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `statisticsSmallMod.foo` */
  override def _to: ReactComponentClass[StatisticsSmallProps] = default
}
