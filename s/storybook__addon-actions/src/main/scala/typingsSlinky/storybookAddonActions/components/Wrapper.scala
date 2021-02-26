package typingsSlinky.storybookAddonActions.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.emotionStyledBase.anon.`0`
import typingsSlinky.emotionStyledBase.emotionStyledBaseStrings.theme
import typingsSlinky.emotionStyledBase.helperMod.Omit
import typingsSlinky.std.Pick
import typingsSlinky.storybookTheming.typesMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for js.Any with (typingsSlinky.emotionStyledBase.helperMod.Omit[
typingsSlinky.std.Pick[js.Any, java.lang.String | scala.Double | js.Symbol], 
typingsSlinky.emotionStyledBase.emotionStyledBaseStrings.theme]) with typingsSlinky.emotionStyledBase.anon.`0`[typingsSlinky.storybookTheming.typesMod.Theme] because: IArray(Could't extract props from js.Any because couldn't resolve ClassTree.) */
object Wrapper {
  
  def apply(p: js.Any with (Omit[Pick[js.Any, String | Double | js.Symbol], theme]) with `0`[Theme]): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("@storybook/addon-actions/dist/components/ActionLogger", "Wrapper")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Wrapper.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
}
