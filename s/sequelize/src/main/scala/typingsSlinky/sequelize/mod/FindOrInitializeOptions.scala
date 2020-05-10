package typingsSlinky.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for Model.findOrInitialize method
  */
@js.native
trait FindOrInitializeOptions[TAttributes] extends FindOptions[TAttributes] {
  /**
    * Default values to use if building a new instance
    */
  var defaults: js.UndefOr[TAttributes] = js.native
}

object FindOrInitializeOptions {
  @scala.inline
  def apply[TAttributes](): FindOrInitializeOptions[TAttributes] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindOrInitializeOptions[TAttributes]]
  }
  @scala.inline
  implicit class FindOrInitializeOptionsOps[Self[tattributes] <: FindOrInitializeOptions[tattributes], TAttributes] (val x: Self[TAttributes]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TAttributes] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TAttributes]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TAttributes] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TAttributes] with Other]
    @scala.inline
    def withDefaults(value: TAttributes): Self[TAttributes] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaults: Self[TAttributes] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaults")(js.undefined)
        ret
    }
  }
  
}

