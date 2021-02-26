package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object languagesSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/LanguagesSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[LanguagesSmallProps] = js.native
  
  @js.native
  trait LanguagesSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object LanguagesSmallProps {
    
    @scala.inline
    def apply(): LanguagesSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LanguagesSmallProps]
    }
    
    @scala.inline
    implicit class LanguagesSmallPropsMutableBuilder[Self <: LanguagesSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[LanguagesSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `languagesSmallMod.foo` */
  override def _to: ReactComponentClass[LanguagesSmallProps] = default
}
