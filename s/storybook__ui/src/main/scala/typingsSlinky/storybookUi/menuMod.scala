package typingsSlinky.storybookUi

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.emotionStyledBase.mod.StyledComponent
import typingsSlinky.react.mod.ButtonHTMLAttributes
import typingsSlinky.react.mod.ComponentProps
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.storybookComponents.buttonButtonMod.ButtonProps
import typingsSlinky.storybookTheming.typesMod.Theme
import typingsSlinky.storybookUi.anon.Highlighted
import typingsSlinky.storybookUi.anon.IsHighlighted
import typingsSlinky.storybookUi.anon.Menu
import typingsSlinky.storybookUi.anon.PickPropsWithChildrenClas
import typingsSlinky.storybookUi.storybookUiStrings.button
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuMod {
  
  @JSImport("@storybook/ui/dist/components/sidebar/Menu", "MenuButton")
  @js.native
  val MenuButton: StyledComponent[PickPropsWithChildrenClas, MenuButtonProps, Theme] = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/Menu", "MenuItemIcon")
  @js.native
  def MenuItemIcon(hasIconImgSrc: ListItemIconProps): ReactElement = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/Menu", "SidebarMenu")
  @js.native
  val SidebarMenu: ReactComponentClass[IsHighlighted] = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/Menu", "SidebarMenuList")
  @js.native
  val SidebarMenuList: ReactComponentClass[Menu] = js.native
  
  @js.native
  trait ListItemIconProps extends StObject {
    
    var icon: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentProps<react.react.FunctionComponent<@storybook/components.@storybook/components/dist/icon/icon.IconsProps>>['icon'] */ js.Any
      ] = js.native
    
    var imgSrc: js.UndefOr[String] = js.native
  }
  object ListItemIconProps {
    
    @scala.inline
    def apply(): ListItemIconProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListItemIconProps]
    }
    
    @scala.inline
    implicit class ListItemIconPropsMutableBuilder[Self <: ListItemIconProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIcon(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentProps<react.react.FunctionComponent<@storybook/components.@storybook/components/dist/icon/icon.IconsProps>>['icon'] */ js.Any
      ): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setImgSrc(value: String): Self = StObject.set(x, "imgSrc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImgSrcUndefined: Self = StObject.set(x, "imgSrc", js.undefined)
    }
  }
  
  type MenuButtonProps = (ComponentProps[
    ReactComponentClass[
      ComponentProps[
        StyledComponent[
          DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
          ButtonProps, 
          Theme
        ]
      ]
    ]
  ]) with ComponentProps[button] with Highlighted
  
  type MenuList = /* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentProps<react.react.FunctionComponent<@storybook/components.@storybook/components/dist/tooltip/TooltipLinkList.TooltipLinkListProps>>['links'] */ js.Any
}
