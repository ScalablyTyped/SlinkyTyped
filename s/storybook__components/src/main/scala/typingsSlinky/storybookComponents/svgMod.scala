package typingsSlinky.storybookComponents

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGSVGElement
import typingsSlinky.emotionStyledBase.mod.StyledComponent
import typingsSlinky.react.mod.SVGProps
import typingsSlinky.storybookTheming.typesMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object svgMod extends Shortcut {
  
  @JSImport("@storybook/components/dist/icon/svg", JSImport.Default)
  @js.native
  val default: StyledComponent[SVGProps[SVGSVGElement], SvgProps, Theme] = js.native
  
  @js.native
  trait SvgProps extends StObject {
    
    var `inline`: js.UndefOr[Boolean] = js.native
  }
  object SvgProps {
    
    @scala.inline
    def apply(): SvgProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SvgProps]
    }
    
    @scala.inline
    implicit class SvgPropsMutableBuilder[Self <: SvgProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
    }
  }
  
  type _To = StyledComponent[SVGProps[SVGSVGElement], SvgProps, Theme]
  
  /* This means you don't have to write `default`, but can instead just say `svgMod.foo` */
  override def _to: StyledComponent[SVGProps[SVGSVGElement], SvgProps, Theme] = default
}
