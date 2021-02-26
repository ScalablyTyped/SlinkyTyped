package typingsSlinky.storybookUi.components

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.web.html.`*`.tag
import typingsSlinky.emotionStyledBase.mod.StyledComponent
import typingsSlinky.react.mod.ButtonHTMLAttributes
import typingsSlinky.react.mod.ComponentProps
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.storybookTheming.typesMod.Theme
import typingsSlinky.storybookUi.anon.Depth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from / * import warning: importer.ImportType#apply Failed type conversion: react.react.<global>.JSX.IntrinsicElements[T] * / js.Any because couldn't resolve ClassTree. */
object ComponentNode {
  
  def apply(
    p: ComponentProps[
      StyledComponent[
        DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
        Depth, 
        Theme
      ]
    ]
  ): typingsSlinky.StBuildingComponent.Default[tag.type, js.Object] = new typingsSlinky.StBuildingComponent.Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("@storybook/ui/dist/components/sidebar/TreeNode", "ComponentNode")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: ComponentNode.type): typingsSlinky.StBuildingComponent.Default[tag.type, js.Object] = new typingsSlinky.StBuildingComponent.Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
}
