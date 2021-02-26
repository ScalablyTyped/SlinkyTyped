package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object settingsMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Settings", JSImport.Default)
  @js.native
  val default: ReactComponentClass[SettingsProps] = js.native
  
  @js.native
  trait SettingsProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object SettingsProps {
    
    @scala.inline
    def apply(): SettingsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SettingsProps]
    }
    
    @scala.inline
    implicit class SettingsPropsMutableBuilder[Self <: SettingsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[SettingsProps]
  
  /* This means you don't have to write `default`, but can instead just say `settingsMod.foo` */
  override def _to: ReactComponentClass[SettingsProps] = default
}
