package typingsSlinky.tabris.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.tabris.mod.Widget
  - / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LayoutData.next * / js.Any
  - typingsSlinky.tabris.mod.SelectorString
*/
trait SiblingReferenceValue extends ConstraintValue

object SiblingReferenceValue {
  @scala.inline
  implicit def apply(
    value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LayoutData.next */ js.Any
  ): SiblingReferenceValue = value.asInstanceOf[SiblingReferenceValue]
  @scala.inline
  implicit def apply(value: SelectorString): SiblingReferenceValue = value.asInstanceOf[SiblingReferenceValue]
  @scala.inline
  implicit def apply(value: Widget): SiblingReferenceValue = value.asInstanceOf[SiblingReferenceValue]
}

