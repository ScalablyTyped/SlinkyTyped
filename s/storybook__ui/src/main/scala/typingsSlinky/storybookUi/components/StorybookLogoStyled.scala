package typingsSlinky.storybookUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.emotionStyledBase.anon.`0`
import typingsSlinky.emotionStyledBase.emotionStyledBaseStrings.theme
import typingsSlinky.emotionStyledBase.helperMod.Omit
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.storybookComponents.storybookLogoMod.StorybookLogoProps
import typingsSlinky.storybookTheming.typesMod.Theme
import typingsSlinky.storybookUi.anon.PickPropsWithChildrenStor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StorybookLogoStyled {
  
  @scala.inline
  def apply(alt: String): Builder = {
    val __props = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PropsWithChildren[StorybookLogoProps] with (Omit[PickPropsWithChildrenStor, theme]) with `0`[Theme]]))
  }
  
  @JSImport("@storybook/ui/dist/components/sidebar/Brand", "StorybookLogoStyled")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def theme(value: Theme): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(
    p: PropsWithChildren[StorybookLogoProps] with (Omit[PickPropsWithChildrenStor, theme]) with `0`[Theme]
  ): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
