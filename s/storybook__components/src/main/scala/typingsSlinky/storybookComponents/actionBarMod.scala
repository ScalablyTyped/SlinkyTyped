package typingsSlinky.storybookComponents

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.emotionStyledBase.mod.StyledComponent
import typingsSlinky.react.mod.ButtonHTMLAttributes
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.storybookComponents.anon.Disabled
import typingsSlinky.storybookTheming.typesMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actionBarMod {
  
  @JSImport("@storybook/components/dist/ActionBar/ActionBar", "ActionBar")
  @js.native
  val ActionBar: ReactComponentClass[ActionBarProps] = js.native
  
  @JSImport("@storybook/components/dist/ActionBar/ActionBar", "ActionButton")
  @js.native
  val ActionButton: StyledComponent[
    DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
    Disabled, 
    Theme
  ] = js.native
  
  @js.native
  trait ActionBarProps extends StObject {
    
    var actionItems: js.Array[ActionItem] = js.native
  }
  object ActionBarProps {
    
    @scala.inline
    def apply(actionItems: js.Array[ActionItem]): ActionBarProps = {
      val __obj = js.Dynamic.literal(actionItems = actionItems.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActionBarProps]
    }
    
    @scala.inline
    implicit class ActionBarPropsMutableBuilder[Self <: ActionBarProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActionItems(value: js.Array[ActionItem]): Self = StObject.set(x, "actionItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionItemsVarargs(value: ActionItem*): Self = StObject.set(x, "actionItems", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ActionItem extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    def onClick(e: SyntheticMouseEvent[HTMLButtonElement]): Unit = js.native
    
    var title: String | ReactElement = js.native
  }
  object ActionItem {
    
    @scala.inline
    def apply(onClick: SyntheticMouseEvent[HTMLButtonElement] => Unit, title: String | ReactElement): ActionItem = {
      val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1(onClick), title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActionItem]
    }
    
    @scala.inline
    implicit class ActionItemMutableBuilder[Self <: ActionItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setOnClick(value: SyntheticMouseEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTitle(value: String | ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleReactElement(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
