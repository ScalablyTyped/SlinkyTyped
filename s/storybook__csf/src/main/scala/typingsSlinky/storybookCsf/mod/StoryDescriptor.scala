package typingsSlinky.storybookCsf.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Array[java.lang.String]
  - typingsSlinky.std.RegExp
*/
trait StoryDescriptor extends js.Object

object StoryDescriptor {
  @scala.inline
  implicit def apply(value: js.Array[String]): StoryDescriptor = value.asInstanceOf[StoryDescriptor]
  @scala.inline
  implicit def apply(value: js.RegExp): StoryDescriptor = value.asInstanceOf[StoryDescriptor]
}

