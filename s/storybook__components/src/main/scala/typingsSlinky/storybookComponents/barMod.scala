package typingsSlinky.storybookComponents

import slinky.core.ReactComponentClass
import typingsSlinky.emotionStyledBase.mod.StyledComponent
import typingsSlinky.std.Pick
import typingsSlinky.storybookTheming.typesMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object barMod {
  
  @JSImport("@storybook/components/dist/bar/bar", "Bar")
  @js.native
  val Bar: StyledComponent[js.Any, Pick[js.Any, String | Double | js.Symbol], Theme] = js.native
  
  @JSImport("@storybook/components/dist/bar/bar", "FlexBar")
  @js.native
  val FlexBar: ReactComponentClass[FlexBarProps] = js.native
  
  @js.native
  trait FlexBarProps extends StObject {
    
    var backgroundColor: js.UndefOr[String] = js.native
    
    var border: js.UndefOr[Boolean] = js.native
    
    var children: js.UndefOr[js.Any] = js.native
  }
  object FlexBarProps {
    
    @scala.inline
    def apply(): FlexBarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlexBarProps]
    }
    
    @scala.inline
    implicit class FlexBarPropsMutableBuilder[Self <: FlexBarProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setBorder(value: Boolean): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      @scala.inline
      def setChildren(value: js.Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  @js.native
  trait SideProps extends StObject {
    
    var left: js.UndefOr[Boolean] = js.native
    
    var right: js.UndefOr[Boolean] = js.native
  }
  object SideProps {
    
    @scala.inline
    def apply(): SideProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SideProps]
    }
    
    @scala.inline
    implicit class SidePropsMutableBuilder[Self <: SideProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLeft(value: Boolean): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setRight(value: Boolean): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    }
  }
}
