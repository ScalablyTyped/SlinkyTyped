package typingsSlinky.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options provided when associating models with hasMany relationship
  *
  * @see Association class hasMany method
  */
@js.native
trait AssociationOptionsHasMany extends AssociationOptionsManyToMany {
  /**
    * A string or a data type to represent the identifier in the table
    */
  var keyType: js.UndefOr[DataTypeAbstract] = js.native
  /**
    * A string to represent the name of the field to use as the key for an 1 to many association in the source table.
    *
    * @see http://docs.sequelizejs.com/class/lib/model.js~Model.html#static-method-hasMany
    * @see https://github.com/sequelize/sequelize/blob/b4fd46426db9cdbb97074bea121203d565e4195d/lib/associations/has-many.js#L81
    */
  var sourceKey: js.UndefOr[String] = js.native
}

object AssociationOptionsHasMany {
  @scala.inline
  def apply(): AssociationOptionsHasMany = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociationOptionsHasMany]
  }
  @scala.inline
  implicit class AssociationOptionsHasManyOps[Self <: AssociationOptionsHasMany] (val x: Self) extends AnyVal {
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
    def withSourceKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceKey")(js.undefined)
        ret
    }
  }
  
}

