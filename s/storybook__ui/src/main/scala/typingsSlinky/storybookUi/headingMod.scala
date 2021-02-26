package typingsSlinky.storybookUi

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.ReactComponentClass
import typingsSlinky.emotionStyledBase.mod.StyledComponent
import typingsSlinky.react.mod.ComponentProps
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.storybookTheming.typesMod.Theme
import typingsSlinky.storybookUi.anon.PickDetailedHTMLPropsHTML
import typingsSlinky.storybookUi.menuMod.MenuList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headingMod {
  
  @JSImport("@storybook/ui/dist/components/sidebar/Heading", "Heading")
  @js.native
  val Heading: ReactComponentClass[
    HeadingProps with (ComponentProps[
      StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], 
        PickDetailedHTMLPropsHTML, 
        Theme
      ]
    ])
  ] = js.native
  
  @js.native
  trait HeadingProps extends StObject {
    
    var menu: MenuList = js.native
    
    var menuHighlighted: js.UndefOr[Boolean] = js.native
  }
  object HeadingProps {
    
    @scala.inline
    def apply(menu: MenuList): HeadingProps = {
      val __obj = js.Dynamic.literal(menu = menu.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeadingProps]
    }
    
    @scala.inline
    implicit class HeadingPropsMutableBuilder[Self <: HeadingProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMenu(value: MenuList): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuHighlighted(value: Boolean): Self = StObject.set(x, "menuHighlighted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuHighlightedUndefined: Self = StObject.set(x, "menuHighlighted", js.undefined)
    }
  }
}
