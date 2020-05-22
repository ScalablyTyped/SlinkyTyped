package typingsSlinky.typedoc.tsInternalMod.typescriptAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Symbol extends js.Object {
  var id: js.UndefOr[Double] = js.undefined
  var parent: js.UndefOr[typingsSlinky.typescript.mod.Symbol] = js.undefined
}

object Symbol {
  @scala.inline
  def apply(id: js.UndefOr[Double] = js.undefined, parent: typingsSlinky.typescript.mod.Symbol = null): Symbol = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.get.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Symbol]
  }
}

