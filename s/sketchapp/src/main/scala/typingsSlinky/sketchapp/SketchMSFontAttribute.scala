package typingsSlinky.sketchapp

import typingsSlinky.sketchapp.anon.Name
import typingsSlinky.sketchapp.sketchappStrings.fontDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSFontAttribute extends js.Object {
  var _class: fontDescriptor
  var attributes: Name
}

object SketchMSFontAttribute {
  @scala.inline
  def apply(_class: fontDescriptor, attributes: Name): SketchMSFontAttribute = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSFontAttribute]
  }
}

