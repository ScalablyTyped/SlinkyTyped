package typingsSlinky.atTensorflowTfjsDashConverter.distSrcDataCompiledUnderscoreApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAny extends js.Object {
  /** Any typeUrl */
  var typeUrl: js.UndefOr[String | Null] = js.undefined
  /** Any value */
  var value: js.UndefOr[scala.scalajs.js.typedarray.Uint8Array | Null] = js.undefined
}

object IAny {
  @scala.inline
  def apply(typeUrl: String = null, value: scala.scalajs.js.typedarray.Uint8Array = null): IAny = {
    val __obj = js.Dynamic.literal()
    if (typeUrl != null) __obj.updateDynamic("typeUrl")(typeUrl.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAny]
  }
}

