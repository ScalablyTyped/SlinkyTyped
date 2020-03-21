package typingsSlinky.wiredep

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLess extends js.Object {
  /**
    * @example:
    *  /@import\s['"](.+css)['"]/gi
    */
  var css: js.RegExp
  /**
    * @example:
    *  /@import\s['"](.+less)['"]/gi
    */
  var less: js.RegExp
}

object AnonLess {
  @scala.inline
  def apply(css: js.RegExp, less: js.RegExp): AnonLess = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], less = less.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLess]
  }
}

