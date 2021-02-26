package typingsSlinky.storybookUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.emotionStyledBase.anon.`0`
import typingsSlinky.emotionStyledBase.emotionStyledBaseStrings.theme
import typingsSlinky.emotionStyledBase.helperMod.Omit
import typingsSlinky.storybookRouter.routerMod.QueryLinkProps
import typingsSlinky.storybookTheming.typesMod.Theme
import typingsSlinky.storybookUi.anon.PickQueryLinkPropschildre
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object UnstyledLink {
  
  @scala.inline
  def apply(to: String): Builder = {
    val __props = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[QueryLinkProps with (Omit[PickQueryLinkPropschildre, theme]) with `0`[Theme]]))
  }
  
  @JSImport("@storybook/ui/dist/components/preview/utils/components", "UnstyledLink")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def theme(value: Theme): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: QueryLinkProps with (Omit[PickQueryLinkPropschildre, theme]) with `0`[Theme]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
