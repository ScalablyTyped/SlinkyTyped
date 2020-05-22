package typingsSlinky.wordpressComponents.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@scala.inline
class SharedBuilder_Props1661094714[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  @scala.inline
  def currentDate(value: String): this.type = set("currentDate", value.asInstanceOf[js.Any])
  @scala.inline
  def is12Hour(value: Boolean): this.type = set("is12Hour", value.asInstanceOf[js.Any])
  @scala.inline
  def isInvalidDate(value: /* date */ js.Date => Boolean): this.type = set("isInvalidDate", js.Any.fromFunction1(value))
}

