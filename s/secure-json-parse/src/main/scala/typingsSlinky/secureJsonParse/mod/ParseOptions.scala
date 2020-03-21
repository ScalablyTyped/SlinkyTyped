package typingsSlinky.secureJsonParse.mod

import typingsSlinky.secureJsonParse.secureJsonParseStrings.error
import typingsSlinky.secureJsonParse.secureJsonParseStrings.ignore
import typingsSlinky.secureJsonParse.secureJsonParseStrings.remove
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

