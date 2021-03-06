package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataCollectionMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/DataCollection", JSImport.Default)
  @js.native
  val default: ReactComponentClass[DataCollectionProps] = js.native
  
  @js.native
  trait DataCollectionProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object DataCollectionProps {
    
    @scala.inline
    def apply(): DataCollectionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataCollectionProps]
    }
    
    @scala.inline
    implicit class DataCollectionPropsMutableBuilder[Self <: DataCollectionProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[DataCollectionProps]
  
  /* This means you don't have to write `default`, but can instead just say `dataCollectionMod.foo` */
  override def _to: ReactComponentClass[DataCollectionProps] = default
}
