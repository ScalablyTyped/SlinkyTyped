package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lockUnlockedMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/LockUnlocked", JSImport.Default)
  @js.native
  val default: ReactComponentClass[LockUnlockedProps] = js.native
  
  @js.native
  trait LockUnlockedProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object LockUnlockedProps {
    
    @scala.inline
    def apply(): LockUnlockedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LockUnlockedProps]
    }
    
    @scala.inline
    implicit class LockUnlockedPropsMutableBuilder[Self <: LockUnlockedProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[LockUnlockedProps]
  
  /* This means you don't have to write `default`, but can instead just say `lockUnlockedMod.foo` */
  override def _to: ReactComponentClass[LockUnlockedProps] = default
}
