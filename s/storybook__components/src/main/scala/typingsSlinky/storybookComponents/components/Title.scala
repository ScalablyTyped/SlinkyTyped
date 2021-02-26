package typingsSlinky.storybookComponents.components

import org.scalajs.dom.raw.HTMLHeadingElement
import typingsSlinky.emotionStyledBase.anon.`0`
import typingsSlinky.emotionStyledBase.emotionStyledBaseStrings.theme
import typingsSlinky.emotionStyledBase.helperMod.Omit
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.storybookTheming.typesMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Title {
  
  @JSImport("@storybook/components", "Title")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Title.type): SharedBuilder_DetailedHTMLPropsOmit0_1375793306[HTMLHeadingElement] = new SharedBuilder_DetailedHTMLPropsOmit0_1375793306[HTMLHeadingElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(
    p: (DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement]) with (Omit[js.Object, theme]) with `0`[Theme]
  ): SharedBuilder_DetailedHTMLPropsOmit0_1375793306[HTMLHeadingElement] = new SharedBuilder_DetailedHTMLPropsOmit0_1375793306[HTMLHeadingElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
