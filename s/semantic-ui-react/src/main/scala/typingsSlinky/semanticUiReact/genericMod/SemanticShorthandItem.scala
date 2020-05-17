package typingsSlinky.semanticUiReact.genericMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.react.mod.ReactNode
  - TProps
  - typingsSlinky.semanticUiReact.genericMod.SemanticShorthandItemFunc[TProps]
*/
trait SemanticShorthandItem[TProps] extends js.Object

object SemanticShorthandItem {
  @scala.inline
  implicit def apply[TProps](value: TagMod[Any]): SemanticShorthandItem[TProps] = value.asInstanceOf[SemanticShorthandItem[TProps]]
  @scala.inline
  implicit def apply[TProps](value: SemanticShorthandItemFunc[TProps]): SemanticShorthandItem[TProps] = value.asInstanceOf[SemanticShorthandItem[TProps]]
  @scala.inline
  implicit def apply[TProps](value: TProps): SemanticShorthandItem[TProps] = value.asInstanceOf[SemanticShorthandItem[TProps]]
}

