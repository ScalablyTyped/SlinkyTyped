package typingsSlinky.uifabricFoundation

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSlots[TSlots] extends js.Object {
  var slots: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in keyof TSlots ]:? @uifabric/foundation.@uifabric/foundation/lib/ISlots.ISlotOptions<@uifabric/foundation.@uifabric/foundation/lib/ISlots.ExtractProps<TSlots[key]>>}
    */ typingsSlinky.uifabricFoundation.uifabricFoundationStrings.AnonSlots with TopLevel[TSlots]
  ] = js.native
}

object AnonSlots {
  @scala.inline
  def apply[TSlots](): AnonSlots[TSlots] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonSlots[TSlots]]
  }
  @scala.inline
  implicit class AnonSlotsOps[Self[tslots] <: AnonSlots[tslots], TSlots] (val x: Self[TSlots]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TSlots] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TSlots]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TSlots] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TSlots] with Other]
    @scala.inline
    def withSlots(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in keyof TSlots ]:? @uifabric/foundation.@uifabric/foundation/lib/ISlots.ISlotOptions<@uifabric/foundation.@uifabric/foundation/lib/ISlots.ExtractProps<TSlots[key]>>}
      */ typingsSlinky.uifabricFoundation.uifabricFoundationStrings.AnonSlots with TopLevel[TSlots]
    ): Self[TSlots] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlots: Self[TSlots] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slots")(js.undefined)
        ret
    }
  }
  
}

