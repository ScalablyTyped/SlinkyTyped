package typingsSlinky.storybookUi.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.react.mod.ConsumerProps
import typingsSlinky.storybookUi.anon.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ZoomConsumer {
  
  @scala.inline
  def apply(children: Set => ReactElement): typingsSlinky.StBuildingComponent.Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new typingsSlinky.StBuildingComponent.Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[ConsumerProps[Set]]))
  }
  
  @JSImport("@storybook/ui/dist/components/preview/tools/zoom", "ZoomConsumer")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ConsumerProps[Set]): typingsSlinky.StBuildingComponent.Default[tag.type, js.Object] = new typingsSlinky.StBuildingComponent.Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
