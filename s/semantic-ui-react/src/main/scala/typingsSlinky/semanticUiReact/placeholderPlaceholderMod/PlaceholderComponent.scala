package typingsSlinky.semanticUiReact.placeholderPlaceholderMod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.FunctionComponent
import typingsSlinky.semanticUiReact.placeholderHeaderMod.PlaceholderHeaderProps
import typingsSlinky.semanticUiReact.placeholderImageMod.PlaceholderImageProps
import typingsSlinky.semanticUiReact.placeholderLineMod.PlaceholderLineProps
import typingsSlinky.semanticUiReact.placeholderParagraphMod.PlaceholderParagraphProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlaceholderComponent extends FunctionComponent[PlaceholderProps] {
  var Header: ReactComponentClass[PlaceholderHeaderProps] = js.native
  var Image: ReactComponentClass[PlaceholderImageProps] = js.native
  var Line: ReactComponentClass[PlaceholderLineProps] = js.native
  var Paragraph: ReactComponentClass[PlaceholderParagraphProps] = js.native
}

