package typingsSlinky.storybookPreact.typesMod

import org.scalajs.dom.raw.Node
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.std.Node
  - typingsSlinky.react.mod.global.JSX.Element
*/
trait StoryFnPreactReturnType extends js.Object

object StoryFnPreactReturnType {
  @scala.inline
  implicit def apply(value: ReactElement): StoryFnPreactReturnType = value.asInstanceOf[StoryFnPreactReturnType]
  @scala.inline
  implicit def apply(value: Node): StoryFnPreactReturnType = value.asInstanceOf[StoryFnPreactReturnType]
  @scala.inline
  implicit def apply(value: String): StoryFnPreactReturnType = value.asInstanceOf[StoryFnPreactReturnType]
}

