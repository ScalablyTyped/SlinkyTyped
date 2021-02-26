package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lockLockedMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/LockLocked", JSImport.Default)
  @js.native
  val default: ReactComponentClass[LockLockedProps] = js.native
  
  @js.native
  trait LockLockedProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object LockLockedProps {
    
    @scala.inline
    def apply(): LockLockedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LockLockedProps]
    }
    
    @scala.inline
    implicit class LockLockedPropsMutableBuilder[Self <: LockLockedProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[LockLockedProps]
  
  /* This means you don't have to write `default`, but can instead just say `lockLockedMod.foo` */
  override def _to: ReactComponentClass[LockLockedProps] = default
}
