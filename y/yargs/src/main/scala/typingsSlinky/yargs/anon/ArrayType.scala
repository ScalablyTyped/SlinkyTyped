package typingsSlinky.yargs.anon

import typingsSlinky.yargs.yargsBooleans.`true`
import typingsSlinky.yargs.yargsStrings.number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrayType extends js.Object {
  var array: `true`
  var `type`: number
}

object ArrayType {
  @scala.inline
  def apply(array: `true`, `type`: number): ArrayType = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayType]
  }
}

