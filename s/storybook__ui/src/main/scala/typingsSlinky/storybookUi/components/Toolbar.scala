package typingsSlinky.storybookUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.emotionStyledBase.anon.`0`
import typingsSlinky.emotionStyledBase.emotionStyledBaseStrings.theme
import typingsSlinky.emotionStyledBase.helperMod.Omit
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.std.Pick
import typingsSlinky.std.Record
import typingsSlinky.storybookTheming.typesMod.Theme
import typingsSlinky.storybookUi.anon.Shown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Toolbar {
  
  @scala.inline
  def apply(shown: Boolean): Builder = {
    val __props = js.Dynamic.literal(shown = shown.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[(PropsWithChildren[Shown with (Record[String, js.Any])]) with (Omit[Pick[PropsWithChildren[Shown with (Record[String, js.Any])], String], theme]) with `0`[Theme]]))
  }
  
  @JSImport("@storybook/ui/dist/components/preview/toolbar", "Toolbar")
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
    p: (PropsWithChildren[Shown with (Record[String, js.Any])]) with (Omit[Pick[PropsWithChildren[Shown with (Record[String, js.Any])], String], theme]) with `0`[Theme]
  ): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
