package typingsSlinky.wiredep

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDetect extends js.Object {
  /**
    * @example:
    *  /(([ \t]*)#\s*bower:*(\S*))(\n|\r|.)*?(#\s*endbower)/gi
    */
  var block: js.RegExp
  var detect: AnonCss
  var replace: AnonJs
}

object AnonDetect {
  @scala.inline
  def apply(block: js.RegExp, detect: AnonCss, replace: AnonJs): AnonDetect = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], detect = detect.asInstanceOf[js.Any], replace = replace.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDetect]
  }
}

