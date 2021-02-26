package typingsSlinky.wordpressBlockEditor

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.wordpressBlockEditor.anon.OmitPropsname
import typingsSlinky.wordpressBlockEditor.blockFormatControlsMod.BlockFormatControls.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object blockFormatControlsMod {
  
  object default {
    
    @JSImport("@wordpress/block-editor/components/block-format-controls", JSImport.Default)
    @js.native
    def apply(props: Props): ReactElement = js.native
    @JSImport("@wordpress/block-editor/components/block-format-controls", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@wordpress/block-editor/components/block-format-controls", "default.Slot")
    @js.native
    def Slot: ReactComponentClass[OmitPropsname] = js.native
    @scala.inline
    def Slot_=(x: ReactComponentClass[OmitPropsname]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Slot")(x.asInstanceOf[js.Any])
  }
  
  object BlockFormatControls {
    
    @js.native
    trait Props extends StObject {
      
      var children: ReactElement = js.native
    }
    object Props {
      
      @scala.inline
      def apply(): Props = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Props]
      }
      
      @scala.inline
      implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      }
    }
  }
}
