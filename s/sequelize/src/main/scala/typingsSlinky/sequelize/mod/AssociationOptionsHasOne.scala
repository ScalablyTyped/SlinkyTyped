package typingsSlinky.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options provided when associating models with hasOne relationship
  *
  * @see Association class hasOne method
  */
@js.native
trait AssociationOptionsHasOne extends AssociationOptions {
  /**
    * A string or a data type to represent the identifier in the table
    */
  var keyType: js.UndefOr[DataTypeAbstract] = js.native
}

object AssociationOptionsHasOne {
  @scala.inline
  def apply(): AssociationOptionsHasOne = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociationOptionsHasOne]
  }
  @scala.inline
  implicit class AssociationOptionsHasOneOps[Self <: AssociationOptionsHasOne] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeyType(value: DataTypeAbstract): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyType")(js.undefined)
        ret
    }
  }
  
}

