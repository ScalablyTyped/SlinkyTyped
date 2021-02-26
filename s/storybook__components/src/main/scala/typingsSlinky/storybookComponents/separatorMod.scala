package typingsSlinky.storybookComponents

import org.scalajs.dom.raw.HTMLSpanElement
import typingsSlinky.emotionStyledBase.mod.StyledComponent
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.storybookTheming.typesMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object separatorMod {
  
  @JSImport("@storybook/components/dist/bar/separator", "Separator")
  @js.native
  val Separator: StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLSpanElement], HTMLSpanElement], 
    SeparatorProps, 
    Theme
  ] = js.native
  
  @JSImport("@storybook/components/dist/bar/separator", "interleaveSeparators")
  @js.native
  def interleaveSeparators(list: js.Array[_]): js.Any = js.native
  
  @js.native
  trait SeparatorProps extends StObject {
    
    var force: js.UndefOr[Boolean] = js.native
  }
  object SeparatorProps {
    
    @scala.inline
    def apply(): SeparatorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeparatorProps]
    }
    
    @scala.inline
    implicit class SeparatorPropsMutableBuilder[Self <: SeparatorProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    }
  }
}
