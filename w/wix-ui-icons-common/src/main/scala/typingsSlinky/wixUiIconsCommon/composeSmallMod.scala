package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object composeSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ComposeSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ComposeSmallProps] = js.native
  
  @js.native
  trait ComposeSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object ComposeSmallProps {
    
    @scala.inline
    def apply(): ComposeSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComposeSmallProps]
    }
    
    @scala.inline
    implicit class ComposeSmallPropsMutableBuilder[Self <: ComposeSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[ComposeSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `composeSmallMod.foo` */
  override def _to: ReactComponentClass[ComposeSmallProps] = default
}
