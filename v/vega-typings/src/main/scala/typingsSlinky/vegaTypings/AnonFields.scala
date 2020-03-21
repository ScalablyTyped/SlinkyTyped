package typingsSlinky.vegaTypings

import typingsSlinky.vegaTypings.scaleMod.MultiDataRef
import typingsSlinky.vegaTypings.scaleMod.ScaleField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFields extends MultiDataRef {
  var data: String
  var fields: js.Array[ScaleField]
}

object AnonFields {
  @scala.inline
  def apply(data: String, fields: js.Array[ScaleField]): AnonFields = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFields]
  }
}

