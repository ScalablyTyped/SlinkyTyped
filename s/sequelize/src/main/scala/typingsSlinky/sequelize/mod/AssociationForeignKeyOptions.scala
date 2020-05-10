package typingsSlinky.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Foreign Key Options
  *
  * @see AssociationOptions
  */
@js.native
trait AssociationForeignKeyOptions extends ColumnOptions {
  /**
    *  Attribute name for the relation
    */
  var name: js.UndefOr[String] = js.native
  var unique: js.UndefOr[Boolean | String] = js.native
}

object AssociationForeignKeyOptions {
  @scala.inline
  def apply(): AssociationForeignKeyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociationForeignKeyOptions]
  }
  @scala.inline
  implicit class AssociationForeignKeyOptionsOps[Self <: AssociationForeignKeyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withUnique(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unique")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnique: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unique")(js.undefined)
        ret
    }
  }
  
}

