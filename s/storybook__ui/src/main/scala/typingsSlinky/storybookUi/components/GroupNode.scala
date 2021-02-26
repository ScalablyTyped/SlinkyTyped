package typingsSlinky.storybookUi.components

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.web.html.`*`.tag
import typingsSlinky.emotionStyledBase.mod.StyledComponent
import typingsSlinky.react.mod.ButtonHTMLAttributes
import typingsSlinky.react.mod.ComponentProps
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.storybookTheming.typesMod.Theme
import typingsSlinky.storybookUi.anon.Depth
import typingsSlinky.storybookUi.anon.IsExpandable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for (typingsSlinky.react.mod.ComponentProps[
typingsSlinky.emotionStyledBase.mod.StyledComponent[
  typingsSlinky.react.mod.DetailedHTMLProps[
  typingsSlinky.react.mod.ButtonHTMLAttributes[typingsSlinky.std.HTMLButtonElement], 
  typingsSlinky.std.HTMLButtonElement
  ], 
  typingsSlinky.storybookUi.anon.Depth, 
  typingsSlinky.storybookTheming.typesMod.Theme
]]) with typingsSlinky.storybookUi.anon.IsExpandable because: IArray(Could't extract props from / * import warning: importer.ImportType#apply Failed type conversion: react.react.<global>.JSX.IntrinsicElements[T] * / js.Any because couldn't resolve ClassTree.) */
object GroupNode {
  
  def apply(
    p: (ComponentProps[
      StyledComponent[
        DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
        Depth, 
        Theme
      ]
    ]) with IsExpandable
  ): typingsSlinky.StBuildingComponent.Default[tag.type, js.Object] = new typingsSlinky.StBuildingComponent.Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("@storybook/ui/dist/components/sidebar/TreeNode", "GroupNode")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: GroupNode.type): typingsSlinky.StBuildingComponent.Default[tag.type, js.Object] = new typingsSlinky.StBuildingComponent.Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
}
