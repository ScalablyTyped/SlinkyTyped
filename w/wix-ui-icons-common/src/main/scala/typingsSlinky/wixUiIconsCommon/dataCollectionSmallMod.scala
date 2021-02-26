package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataCollectionSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/DataCollectionSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[DataCollectionSmallProps] = js.native
  
  @js.native
  trait DataCollectionSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object DataCollectionSmallProps {
    
    @scala.inline
    def apply(): DataCollectionSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataCollectionSmallProps]
    }
    
    @scala.inline
    implicit class DataCollectionSmallPropsMutableBuilder[Self <: DataCollectionSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[DataCollectionSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `dataCollectionSmallMod.foo` */
  override def _to: ReactComponentClass[DataCollectionSmallProps] = default
}
