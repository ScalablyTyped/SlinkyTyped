package typingsSlinky.superstruct.libSuperstructMod

import typingsSlinky.std.Record
import typingsSlinky.superstruct.Anon_Failures
import typingsSlinky.superstruct.libTypesMod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuperstructSettings extends js.Object {
  var error: Anon_Failures
  var types: Record[String, Validator]
}

object SuperstructSettings {
  @scala.inline
  def apply(error: Anon_Failures, types: Record[String, Validator]): SuperstructSettings = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SuperstructSettings]
  }
}

