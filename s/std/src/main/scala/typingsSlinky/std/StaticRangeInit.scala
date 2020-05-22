package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StaticRangeInit extends js.Object {
  var endContainer: org.scalajs.dom.raw.Node
  var endOffset: Double
  var startContainer: org.scalajs.dom.raw.Node
  var startOffset: Double
}

object StaticRangeInit {
  @scala.inline
  def apply(
    endContainer: org.scalajs.dom.raw.Node,
    endOffset: Double,
    startContainer: org.scalajs.dom.raw.Node,
    startOffset: Double
  ): StaticRangeInit = {
    val __obj = js.Dynamic.literal(endContainer = endContainer.asInstanceOf[js.Any], endOffset = endOffset.asInstanceOf[js.Any], startContainer = startContainer.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticRangeInit]
  }
}

