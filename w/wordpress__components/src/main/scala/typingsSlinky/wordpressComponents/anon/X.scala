package typingsSlinky.wordpressComponents.anon

import typingsSlinky.wordpressComponents.wordpressComponentsStrings.bottom
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.left
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.right
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait X extends js.Object {
  var x: left | right
  var y: top | bottom
}

object X {
  @scala.inline
  def apply(x: left | right, y: top | bottom): X = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[X]
  }
}

