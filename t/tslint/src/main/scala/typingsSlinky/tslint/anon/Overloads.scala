package typingsSlinky.tslint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Overloads extends js.Object {
  var overloads: Type
  var tags: Properties
  var visibilities: Enum
}

object Overloads {
  @scala.inline
  def apply(overloads: Type, tags: Properties, visibilities: Enum): Overloads = {
    val __obj = js.Dynamic.literal(overloads = overloads.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], visibilities = visibilities.asInstanceOf[js.Any])
    __obj.asInstanceOf[Overloads]
  }
}

