package typingsSlinky.atTensorflowTfjsDashConverter.distSrcDataCompiledUnderscoreApiMod.CollectionDef

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a BytesList. */
trait IBytesList extends js.Object {
  /** BytesList value */
  var value: js.UndefOr[js.Array[scala.scalajs.js.typedarray.Uint8Array] | Null] = js.undefined
}

object IBytesList {
  @scala.inline
  def apply(value: js.Array[scala.scalajs.js.typedarray.Uint8Array] = null): IBytesList = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBytesList]
  }
}

