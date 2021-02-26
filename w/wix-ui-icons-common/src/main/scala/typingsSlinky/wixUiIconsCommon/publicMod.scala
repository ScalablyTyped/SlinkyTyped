package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object publicMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Public", JSImport.Default)
  @js.native
  val default: ReactComponentClass[PublicProps] = js.native
  
  @js.native
  trait PublicProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object PublicProps {
    
    @scala.inline
    def apply(): PublicProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PublicProps]
    }
    
    @scala.inline
    implicit class PublicPropsMutableBuilder[Self <: PublicProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[PublicProps]
  
  /* This means you don't have to write `default`, but can instead just say `publicMod.foo` */
  override def _to: ReactComponentClass[PublicProps] = default
}
