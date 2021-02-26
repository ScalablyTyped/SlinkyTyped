package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mergeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Merge", JSImport.Default)
  @js.native
  val default: ReactComponentClass[MergeProps] = js.native
  
  @js.native
  trait MergeProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object MergeProps {
    
    @scala.inline
    def apply(): MergeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MergeProps]
    }
    
    @scala.inline
    implicit class MergePropsMutableBuilder[Self <: MergeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[MergeProps]
  
  /* This means you don't have to write `default`, but can instead just say `mergeMod.foo` */
  override def _to: ReactComponentClass[MergeProps] = default
}
