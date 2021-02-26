package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object archiveSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ArchiveSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ArchiveSmallProps] = js.native
  
  @js.native
  trait ArchiveSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object ArchiveSmallProps {
    
    @scala.inline
    def apply(): ArchiveSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArchiveSmallProps]
    }
    
    @scala.inline
    implicit class ArchiveSmallPropsMutableBuilder[Self <: ArchiveSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[ArchiveSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `archiveSmallMod.foo` */
  override def _to: ReactComponentClass[ArchiveSmallProps] = default
}
