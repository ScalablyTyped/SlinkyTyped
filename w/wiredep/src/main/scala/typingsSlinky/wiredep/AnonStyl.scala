package typingsSlinky.wiredep

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStyl extends js.Object {
  /**
    * @example:
    *  /@import\s['"](.+css)['"]/gi
    */
  var css: js.RegExp
  /**
    * @example:
    *   /@import\s['"](.+styl)['"]/gi
    */
  var styl: js.RegExp
}

object AnonStyl {
  @scala.inline
  def apply(css: js.RegExp, styl: js.RegExp): AnonStyl = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], styl = styl.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonStyl]
  }
}

