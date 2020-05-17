package typingsSlinky.styletronReact.mod

import typingsSlinky.styletronStandard.mod.StyleObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.styletronStandard.mod.StyleObject
  - typingsSlinky.styletronReact.mod.StyleObjectFn[P]
*/
trait StyleProp[P /* <: js.Object */] extends js.Object

object StyleProp {
  @scala.inline
  implicit def apply[P](value: StyleObject): StyleProp[P] = value.asInstanceOf[StyleProp[P]]
  @scala.inline
  implicit def apply[P](value: StyleObjectFn[P]): StyleProp[P] = value.asInstanceOf[StyleProp[P]]
}

