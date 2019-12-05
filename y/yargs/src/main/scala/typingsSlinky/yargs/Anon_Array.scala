package typingsSlinky.yargs

import typingsSlinky.yargs.yargsNumbers.`true`
import typingsSlinky.yargs.yargsStrings.array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Array extends js.Object {
  var string: `true`
  var `type`: array
}

object Anon_Array {
  @scala.inline
  def apply(string: `true`, `type`: array): Anon_Array = {
    val __obj = js.Dynamic.literal(string = string.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Array]
  }
}

