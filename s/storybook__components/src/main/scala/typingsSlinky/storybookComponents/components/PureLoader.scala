package typingsSlinky.storybookComponents.components

import org.scalajs.dom.raw.HTMLDivElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.emotionStyledBase.mod.StyledComponent
import typingsSlinky.react.mod.ComponentProps
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.storybookComponents.anon.PickDetailedHTMLPropsHTML
import typingsSlinky.storybookComponents.loaderMod.LoaderProps
import typingsSlinky.storybookTheming.typesMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for typingsSlinky.storybookComponents.loaderMod.LoaderProps with (typingsSlinky.react.mod.ComponentProps[
typingsSlinky.emotionStyledBase.mod.StyledComponent[
  typingsSlinky.react.mod.DetailedHTMLProps[
  typingsSlinky.react.mod.HTMLAttributes[typingsSlinky.std.HTMLDivElement], 
  typingsSlinky.std.HTMLDivElement
  ], 
  typingsSlinky.storybookComponents.anon.PickDetailedHTMLPropsHTML, 
  typingsSlinky.storybookTheming.typesMod.Theme
]]) because: IArray(Could't extract props from / * import warning: importer.ImportType#apply Failed type conversion: react.react.<global>.JSX.IntrinsicElements[T] * / js.Any because couldn't resolve ClassTree.) */
object PureLoader {
  
  def apply(
    p: LoaderProps with (ComponentProps[
      StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], 
        PickDetailedHTMLPropsHTML, 
        Theme
      ]
    ])
  ): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("@storybook/components/dist/Loader/Loader", "PureLoader")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: PureLoader.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
}
