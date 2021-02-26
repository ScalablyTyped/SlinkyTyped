package typingsSlinky.storybookComponents.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.emotionStyledBase.anon.`0`
import typingsSlinky.emotionStyledBase.emotionStyledBaseStrings.theme
import typingsSlinky.emotionStyledBase.helperMod.Omit
import typingsSlinky.storybookComponents.anon.PickButtonPropscolortrans
import typingsSlinky.storybookComponents.anon.PickLinkPropscolortransla
import typingsSlinky.storybookComponents.buttonMod.TabButtonProps
import typingsSlinky.storybookTheming.typesMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Support for combinations of intersection and union types not implemented */
object TabButton {
  
  def apply(
    p: (PickButtonPropscolortrans | PickLinkPropscolortransla) with (Omit[TabButtonProps, theme]) with `0`[Theme]
  ): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("@storybook/components", "TabButton")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: TabButton.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
}
