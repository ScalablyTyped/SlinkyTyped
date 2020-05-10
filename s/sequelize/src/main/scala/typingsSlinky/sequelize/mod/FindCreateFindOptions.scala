package typingsSlinky.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for Model.findOrInitialize method
  */
@js.native
trait FindCreateFindOptions[TAttributes] extends FindOptions[TAttributes] {
  /**
    * Default values to use if building a new instance
    */
  var defaults: js.UndefOr[TAttributes] = js.native
}

object FindCreateFindOptions {
  @scala.inline
  def apply[TAttributes](): FindCreateFindOptions[TAttributes] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindCreateFindOptions[TAttributes]]
  }
  @scala.inline
  implicit class FindCreateFindOptionsOps[Self[tattributes] <: FindCreateFindOptions[tattributes], TAttributes] (val x: Self[TAttributes]) extends AnyVal {
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

