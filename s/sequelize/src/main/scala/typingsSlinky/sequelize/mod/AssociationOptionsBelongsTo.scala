package typingsSlinky.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options provided when associating models with belongsTo relationship
  *
  * @see Association class belongsTo method
  */
@js.native
trait AssociationOptionsBelongsTo extends AssociationOptions {
  /**
    * A string or a data type to represent the identifier in the table
    */
  var keyType: js.UndefOr[DataTypeAbstract] = js.native
  /**
    * The name of the field to use as the key for the association in the target table. Defaults to the primary
    * key of the target table
    */
  var targetKey: js.UndefOr[String] = js.native
}

object AssociationOptionsBelongsTo {
  @scala.inline
  def apply(): AssociationOptionsBelongsTo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociationOptionsBelongsTo]
  }
  @scala.inline
  implicit class AssociationOptionsBelongsToOps[Self <: AssociationOptionsBelongsTo] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withTargetKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetKey")(js.undefined)
        ret
    }
  }
  
}

