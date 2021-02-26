package typingsSlinky.storybookComponents

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.storybookComponents.anon.Href
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tooltipMessageMod {
  
  @JSImport("@storybook/components/dist/tooltip/TooltipMessage", "TooltipMessage")
  @js.native
  val TooltipMessage: ReactComponentClass[TooltipMessageProps] = js.native
  
  @js.native
  trait TooltipMessageProps extends StObject {
    
    var desc: js.UndefOr[ReactElement] = js.native
    
    var links: js.UndefOr[js.Array[Href]] = js.native
    
    var title: js.UndefOr[ReactElement] = js.native
  }
  object TooltipMessageProps {
    
    @scala.inline
    def apply(): TooltipMessageProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipMessageProps]
    }
    
    @scala.inline
    implicit class TooltipMessagePropsMutableBuilder[Self <: TooltipMessageProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDesc(value: ReactElement): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescReactElement(value: ReactElement): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescUndefined: Self = StObject.set(x, "desc", js.undefined)
      
      @scala.inline
      def setLinks(value: js.Array[Href]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
      
      @scala.inline
      def setLinksVarargs(value: Href*): Self = StObject.set(x, "links", js.Array(value :_*))
      
      @scala.inline
      def setTitle(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleReactElement(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
