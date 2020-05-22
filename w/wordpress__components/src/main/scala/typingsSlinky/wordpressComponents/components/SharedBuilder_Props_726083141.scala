package typingsSlinky.wordpressComponents.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@scala.inline
class SharedBuilder_Props_726083141[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  @scala.inline
  def currentTime(value: String): this.type = set("currentTime", value.asInstanceOf[js.Any])
  @scala.inline
  def is12Hour(value: Boolean): this.type = set("is12Hour", value.asInstanceOf[js.Any])
}

