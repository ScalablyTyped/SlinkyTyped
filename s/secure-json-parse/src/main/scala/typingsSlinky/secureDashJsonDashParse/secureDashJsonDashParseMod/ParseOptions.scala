package typingsSlinky.secureDashJsonDashParse.secureDashJsonDashParseMod

import typingsSlinky.secureDashJsonDashParse.secureDashJsonDashParseStrings.error
import typingsSlinky.secureDashJsonDashParse.secureDashJsonDashParseStrings.ignore
import typingsSlinky.secureDashJsonDashParse.secureDashJsonDashParseStrings.remove
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseOptions extends js.Object {
  var protoAction: error | remove | ignore
}

object ParseOptions {
  @scala.inline
  def apply(protoAction: error | remove | ignore): ParseOptions = {
    val __obj = js.Dynamic.literal(protoAction = protoAction.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ParseOptions]
  }
}

