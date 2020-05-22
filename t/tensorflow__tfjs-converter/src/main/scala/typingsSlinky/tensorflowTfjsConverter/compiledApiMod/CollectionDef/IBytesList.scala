package typingsSlinky.tensorflowTfjsConverter.compiledApiMod.CollectionDef

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a BytesList. */
trait IBytesList extends js.Object {
  /** BytesList value */
  var value: js.UndefOr[js.Array[js.typedarray.Uint8Array] | Null] = js.undefined
}

object IBytesList {
  @scala.inline
  def apply(value: js.UndefOr[Null | js.Array[js.typedarray.Uint8Array]] = js.undefined): IBytesList = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBytesList]
  }
}

