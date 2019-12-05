package typingsSlinky.vegaDashTypings.typesSpecTransformMod

import typingsSlinky.vegaDashTypings.typesSpecMarkMod.Compare
import typingsSlinky.vegaDashTypings.vegaDashTypingsStrings.collect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectTransform extends _Transforms {
  var sort: Compare
  var `type`: collect
}

object CollectTransform {
  @scala.inline
  def apply(sort: Compare, `type`: collect): CollectTransform = {
    val __obj = js.Dynamic.literal(sort = sort.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectTransform]
  }
}

