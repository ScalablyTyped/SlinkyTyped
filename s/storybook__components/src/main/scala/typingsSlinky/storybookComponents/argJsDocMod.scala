package typingsSlinky.storybookComponents

import org.scalajs.dom.raw.HTMLTableElement
import slinky.core.ReactComponentClass
import typingsSlinky.emotionStyledBase.mod.StyledComponent
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.TableHTMLAttributes
import typingsSlinky.storybookComponents.anon.PickDetailedHTMLPropsTabl
import typingsSlinky.storybookComponents.typesMod.JsDocTags
import typingsSlinky.storybookTheming.typesMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object argJsDocMod {
  
  @JSImport("@storybook/components/dist/blocks/ArgsTable/ArgJsDoc", "ArgJsDoc")
  @js.native
  val ArgJsDoc: ReactComponentClass[ArgJsDocArgs] = js.native
  
  @JSImport("@storybook/components/dist/blocks/ArgsTable/ArgJsDoc", "Table")
  @js.native
  val Table: StyledComponent[
    DetailedHTMLProps[TableHTMLAttributes[HTMLTableElement], HTMLTableElement], 
    PickDetailedHTMLPropsTabl, 
    Theme
  ] = js.native
  
  @js.native
  trait ArgJsDocArgs extends StObject {
    
    var tags: JsDocTags = js.native
  }
  object ArgJsDocArgs {
    
    @scala.inline
    def apply(tags: JsDocTags): ArgJsDocArgs = {
      val __obj = js.Dynamic.literal(tags = tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArgJsDocArgs]
    }
    
    @scala.inline
    implicit class ArgJsDocArgsMutableBuilder[Self <: ArgJsDocArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTags(value: JsDocTags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    }
  }
}
