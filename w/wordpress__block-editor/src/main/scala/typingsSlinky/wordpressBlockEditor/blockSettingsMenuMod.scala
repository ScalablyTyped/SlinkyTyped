package typingsSlinky.wordpressBlockEditor

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.react.mod.ComponentType
import typingsSlinky.wordpressBlockEditor.blockSettingsMenuMod.BlockSettingsMenu.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object blockSettingsMenuMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/block-editor/components/block-settings-menu", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object BlockSettingsMenu {
    
    @js.native
    trait Props extends StObject {
      
      var children: js.UndefOr[scala.Nothing] = js.native
      
      var clientIds: js.Array[String] = js.native
    }
    object Props {
      
      @scala.inline
      def apply(clientIds: js.Array[String]): Props = {
        val __obj = js.Dynamic.literal(clientIds = clientIds.asInstanceOf[js.Any])
        __obj.asInstanceOf[Props]
      }
      
      @scala.inline
      implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setClientIds(value: js.Array[String]): Self = StObject.set(x, "clientIds", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClientIdsVarargs(value: String*): Self = StObject.set(x, "clientIds", js.Array(value :_*))
      }
    }
  }
}
