package typingsSlinky.storybookComponents

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import slinky.core.ReactComponentClass
import slinky.core.SyntheticEvent
import typingsSlinky.storybookComponents.listItemMod.ListItemProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tooltipLinkListMod {
  
  @JSImport("@storybook/components/dist/tooltip/TooltipLinkList", "TooltipLinkList")
  @js.native
  val TooltipLinkList: ReactComponentClass[TooltipLinkListProps] = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof @storybook/components.@storybook/components/dist/tooltip/ListItem.ListItemProps, 'onClick'> ]: @storybook/components.@storybook/components/dist/tooltip/ListItem.ListItemProps[P]} */ @js.native
  trait Link extends StObject {
    
    var id: String = js.native
    
    var isGatsby: js.UndefOr[Boolean] = js.native
    
    var onClick: js.UndefOr[
        js.Function2[/* event */ SyntheticEvent[Event, Element], /* item */ ListItemProps, Unit]
      ] = js.native
  }
  object Link {
    
    @scala.inline
    def apply(id: String): Link = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Link]
    }
    
    @scala.inline
    implicit class LinkMutableBuilder[Self <: Link] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsGatsby(value: Boolean): Self = StObject.set(x, "isGatsby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsGatsbyUndefined: Self = StObject.set(x, "isGatsby", js.undefined)
      
      @scala.inline
      def setOnClick(value: (/* event */ SyntheticEvent[Event, Element], /* item */ ListItemProps) => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    }
  }
  
  @js.native
  trait TooltipLinkListProps extends StObject {
    
    var LinkWrapper: js.UndefOr[ReactComponentClass[js.Object]] = js.native
    
    var links: js.Array[Link] = js.native
  }
  object TooltipLinkListProps {
    
    @scala.inline
    def apply(links: js.Array[Link]): TooltipLinkListProps = {
      val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipLinkListProps]
    }
    
    @scala.inline
    implicit class TooltipLinkListPropsMutableBuilder[Self <: TooltipLinkListProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLinkWrapper(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "LinkWrapper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkWrapperUndefined: Self = StObject.set(x, "LinkWrapper", js.undefined)
      
      @scala.inline
      def setLinks(value: js.Array[Link]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinksVarargs(value: Link*): Self = StObject.set(x, "links", js.Array(value :_*))
    }
  }
}
