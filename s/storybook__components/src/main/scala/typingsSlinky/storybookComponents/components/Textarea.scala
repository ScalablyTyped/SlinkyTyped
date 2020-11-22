package typingsSlinky.storybookComponents.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.emotionStyledBase.anon.`0`
import typingsSlinky.emotionStyledBase.helperMod.Omit
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.storybookComponents.anon.PickanycolortranslatehiddAbout
import typingsSlinky.storybookComponents.inputMod.TextareaProps
import typingsSlinky.storybookComponents.storybookComponentsStrings.theme
import typingsSlinky.storybookTheming.typesMod.Theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for typingsSlinky.react.mod.PropsWithChildren[
typingsSlinky.storybookComponents.anon.PickanycolortranslatehiddAbout with (typingsSlinky.emotionStyledBase.helperMod.Omit[
  typingsSlinky.storybookComponents.inputMod.TextareaProps, 
  typingsSlinky.storybookComponents.storybookComponentsStrings.theme
]) with typingsSlinky.emotionStyledBase.anon.`0`[typingsSlinky.storybookTheming.typesMod.Theme]] because: IArray(Couldn't find props for typingsSlinky.storybookComponents.inputMod.TextareaProps because: IArray(Could't extract props from js.Any because couldn't resolve ClassTree.)) */
object Textarea {
  
  @JSImport("@storybook/components/dist/form/input/input", "Textarea")
  @js.native
  object component extends js.Object
  
  def apply(
    p: PropsWithChildren[PickanycolortranslatehiddAbout with (Omit[TextareaProps, theme]) with `0`[Theme]]
  ): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Textarea.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
}
