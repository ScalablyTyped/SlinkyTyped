package typingsSlinky.waterline

import typingsSlinky.waterline.mod.CollectionClass
import typingsSlinky.waterline.mod.CollectionDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExtend extends js.Object {
  def extend(params: CollectionDefinition): CollectionClass
}

object AnonExtend {
  @scala.inline
  def apply(extend: CollectionDefinition => CollectionClass): AnonExtend = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend))
  
    __obj.asInstanceOf[AnonExtend]
  }
}

