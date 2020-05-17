package typingsSlinky.yaml.typesMod.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.yaml.typesMod.Schema.CustomTag
  - typingsSlinky.yaml.typesMod.Schema.DefaultTag
*/
trait Tag extends js.Object

object Tag {
  @scala.inline
  implicit def apply(value: CustomTag): Tag = value.asInstanceOf[Tag]
  @scala.inline
  implicit def apply(value: DefaultTag): Tag = value.asInstanceOf[Tag]
}

