package typingsSlinky.typedoc.distLibTsDashInternalMod.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Symbol extends js.Object {
  var id: js.UndefOr[Double] = js.undefined
  var parent: js.UndefOr[typingsSlinky.typescript.typescriptMod.Symbol] = js.undefined
}

object Symbol {
  @scala.inline
  def apply(id: Int | Double = null, parent: typingsSlinky.typescript.typescriptMod.Symbol = null): Symbol = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Symbol]
  }
}

