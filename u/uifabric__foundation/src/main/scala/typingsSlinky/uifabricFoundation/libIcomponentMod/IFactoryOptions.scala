package typingsSlinky.uifabricFoundation.libIcomponentMod

import typingsSlinky.uifabricFoundation.uifabricFoundationStrings.children
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFactoryOptions[TProps] extends js.Object {
  /**
    * Default prop for which to map primitive values.
    */
  var defaultProp: js.UndefOr[(/* keyof TProps */ String) | children] = js.native
}

object IFactoryOptions {
  @scala.inline
  def apply[TProps](): IFactoryOptions[TProps] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFactoryOptions[TProps]]
  }
  @scala.inline
  implicit class IFactoryOptionsOps[Self[tprops] <: IFactoryOptions[tprops], TProps] (val x: Self[TProps]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TProps] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TProps]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TProps] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TProps] with Other]
    @scala.inline
    def withDefaultProp(value: (/* keyof TProps */ String) | children): Self[TProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultProp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultProp: Self[TProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultProp")(js.undefined)
        ret
    }
  }
  
}

