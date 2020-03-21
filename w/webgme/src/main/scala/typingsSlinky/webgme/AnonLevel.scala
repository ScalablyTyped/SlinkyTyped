package typingsSlinky.webgme

import typingsSlinky.webgme.GmeCommon.DefIntegerObject
import typingsSlinky.webgme.GmeCommon.DefStringObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLevel extends js.Object {
  var level: DefIntegerObject
  var name: DefStringObject
}

object AnonLevel {
  @scala.inline
  def apply(level: DefIntegerObject, name: DefStringObject): AnonLevel = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLevel]
  }
}

