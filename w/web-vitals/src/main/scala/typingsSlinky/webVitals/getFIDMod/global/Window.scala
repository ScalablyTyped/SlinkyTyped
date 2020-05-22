package typingsSlinky.webVitals.getFIDMod.global

import typingsSlinky.webVitals.getFIDMod.FIDPolyfill
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var perfMetrics: FIDPolyfill
}

object Window {
  @scala.inline
  def apply(perfMetrics: FIDPolyfill): Window = {
    val __obj = js.Dynamic.literal(perfMetrics = perfMetrics.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
}

