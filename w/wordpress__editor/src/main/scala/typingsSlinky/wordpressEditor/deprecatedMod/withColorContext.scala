package typingsSlinky.wordpressEditor.deprecatedMod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.ComponentClass
import typingsSlinky.react.mod.FunctionComponent
import typingsSlinky.std.Omit
import typingsSlinky.wordpressBlockEditor.anon.PartialProps
import typingsSlinky.wordpressEditor.wordpressEditorStrings.colors
import typingsSlinky.wordpressEditor.wordpressEditorStrings.disableCustomColors
import typingsSlinky.wordpressEditor.wordpressEditorStrings.hasColorsToChoose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/editor/components/deprecated", "withColorContext")
@js.native
object withColorContext extends js.Object {
  
  // prettier-ignore
  def apply[ProvidedProps /* <: PartialProps */, OwnProps /* <: js.Any */](component: ComponentClass[ProvidedProps with OwnProps, js.Object]): ReactComponentClass[
    (Omit[_, colors | disableCustomColors | hasColorsToChoose]) with (Omit[ProvidedProps, hasColorsToChoose])
  ] = js.native
  def apply[ProvidedProps /* <: PartialProps */, OwnProps /* <: js.Any */](component: FunctionComponent[ProvidedProps with OwnProps]): ReactComponentClass[
    (Omit[_, colors | disableCustomColors | hasColorsToChoose]) with (Omit[ProvidedProps, hasColorsToChoose])
  ] = js.native
}
