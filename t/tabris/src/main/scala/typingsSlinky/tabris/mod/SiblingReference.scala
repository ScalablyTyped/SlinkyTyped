package typingsSlinky.tabris.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.tabris.mod.Widget
  - / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LayoutData.next * / js.Any
  - typingsSlinky.tabris.mod.SelectorString
*/
trait SiblingReference extends js.Object

object SiblingReference {
  @scala.inline
  implicit def apply(
    value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LayoutData.next */ js.Any
  ): SiblingReference = value.asInstanceOf[SiblingReference]
  @scala.inline
  implicit def apply(value: SelectorString): SiblingReference = value.asInstanceOf[SiblingReference]
  @scala.inline
  implicit def apply(value: Widget): SiblingReference = value.asInstanceOf[SiblingReference]
}

