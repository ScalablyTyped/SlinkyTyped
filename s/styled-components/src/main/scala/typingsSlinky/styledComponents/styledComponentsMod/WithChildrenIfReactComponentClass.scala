package typingsSlinky.styledComponents.styledComponentsMod

import typingsSlinky.styledComponents.anon.Children
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Because of React typing quirks, when getting props from a React.ComponentClass,
// we need to manually add a `children` field.
// See https://github.com/DefinitelyTyped/DefinitelyTyped/pull/31945
// and https://github.com/DefinitelyTyped/DefinitelyTyped/pull/32843
/* Rewritten from type alias, can be one of: 
  - js.Object
  - typingsSlinky.styledComponents.anon.Children
*/
trait WithChildrenIfReactComponentClass[C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any */] extends js.Object

object WithChildrenIfReactComponentClass {
  @scala.inline
  implicit def apply[C](value: Children): WithChildrenIfReactComponentClass[C] = value.asInstanceOf[WithChildrenIfReactComponentClass[C]]
  @scala.inline
  implicit def apply[C](value: js.Object): WithChildrenIfReactComponentClass[C] = value.asInstanceOf[WithChildrenIfReactComponentClass[C]]
}

