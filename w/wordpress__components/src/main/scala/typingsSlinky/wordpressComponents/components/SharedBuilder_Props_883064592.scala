package typingsSlinky.wordpressComponents.components

import org.scalajs.dom.raw.Element
import slinky.web.SyntheticFocusEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@scala.inline
class SharedBuilder_Props_883064592[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  @scala.inline
  def html(value: String): this.type = set("html", value.asInstanceOf[js.Any])
  @scala.inline
  def onFocus(value: SyntheticFocusEvent[Element] => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
  @scala.inline
  def scripts(value: js.Array[String]): this.type = set("scripts", value.asInstanceOf[js.Any])
  @scala.inline
  def styles(value: js.Array[String]): this.type = set("styles", value.asInstanceOf[js.Any])
  @scala.inline
  def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
  @scala.inline
  def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
}

