package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object settingsSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/SettingsSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[SettingsSmallProps] = js.native
  
  @js.native
  trait SettingsSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object SettingsSmallProps {
    
    @scala.inline
    def apply(): SettingsSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SettingsSmallProps]
    }
    
    @scala.inline
    implicit class SettingsSmallPropsMutableBuilder[Self <: SettingsSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[SettingsSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `settingsSmallMod.foo` */
  override def _to: ReactComponentClass[SettingsSmallProps] = default
}
