package typingsSlinky.uifabricUtilities

import typingsSlinky.uifabricUtilities.customizationsMod.ICustomizations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<@uifabric/utilities.@uifabric/utilities/lib/customizations/CustomizerContext.ICustomizerContext> */
@js.native
trait ReadonlyICustomizerContex extends js.Object {
  val customizations: ICustomizations = js.native
}

object ReadonlyICustomizerContex {
  @scala.inline
  def apply(customizations: ICustomizations): ReadonlyICustomizerContex = {
    val __obj = js.Dynamic.literal(customizations = customizations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyICustomizerContex]
  }
  @scala.inline
  implicit class ReadonlyICustomizerContexOps[Self <: ReadonlyICustomizerContex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomizations(value: ICustomizations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizations")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

