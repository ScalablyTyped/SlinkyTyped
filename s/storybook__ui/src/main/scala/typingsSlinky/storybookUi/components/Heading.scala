package typingsSlinky.storybookUi.components

import org.scalajs.dom.raw.HTMLDivElement
import slinky.web.html.`*`.tag
import typingsSlinky.emotionStyledBase.mod.StyledComponent
import typingsSlinky.react.mod.ComponentProps
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.storybookTheming.typesMod.Theme
import typingsSlinky.storybookUi.anon.PickDetailedHTMLPropsHTML
import typingsSlinky.storybookUi.headingMod.HeadingProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for typingsSlinky.storybookUi.headingMod.HeadingProps with (typingsSlinky.react.mod.ComponentProps[
typingsSlinky.emotionStyledBase.mod.StyledComponent[
  typingsSlinky.react.mod.DetailedHTMLProps[
  typingsSlinky.react.mod.HTMLAttributes[typingsSlinky.std.HTMLDivElement], 
  typingsSlinky.std.HTMLDivElement
  ], 
  typingsSlinky.storybookUi.anon.PickDetailedHTMLPropsHTML, 
  typingsSlinky.storybookTheming.typesMod.Theme
]]) because: IArray(Could't extract props from / * import warning: importer.ImportType#apply Failed type conversion: react.react.<global>.JSX.IntrinsicElements[T] * / js.Any because couldn't resolve ClassTree.) */
object Heading {
  
  def apply(
    p: HeadingProps with (ComponentProps[
      StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], 
        PickDetailedHTMLPropsHTML, 
        Theme
      ]
    ])
  ): typingsSlinky.StBuildingComponent.Default[tag.type, js.Object] = new typingsSlinky.StBuildingComponent.Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("@storybook/ui/dist/components/sidebar/Heading", "Heading")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Heading.type): typingsSlinky.StBuildingComponent.Default[tag.type, js.Object] = new typingsSlinky.StBuildingComponent.Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
}
