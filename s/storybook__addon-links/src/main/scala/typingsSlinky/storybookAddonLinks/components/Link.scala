package typingsSlinky.storybookAddonLinks.components

import typingsSlinky.storybookAddonLinks.linkMod.Props
import typingsSlinky.storybookAddonLinks.linkMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Link {
  
  @scala.inline
  def apply(kind: String, story: String): SharedBuilder_Props_1233294151[default] = {
    val __props = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], story = story.asInstanceOf[js.Any])
    new SharedBuilder_Props_1233294151[default](js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("@storybook/addon-links/dist/react/components/link", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Props): SharedBuilder_Props_1233294151[default] = new SharedBuilder_Props_1233294151[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
