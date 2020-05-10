package typingsSlinky.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options for the addAssociations mixin of the belongsToMany association.
  * @see BelongsToManyAddAssociationsMixin
  */
@js.native
trait BelongsToManyAddAssociationsMixinOptions extends js.Object {
  /**
    * Run validation for the join model.
    */
  var validate: js.UndefOr[Boolean] = js.native
}

object BelongsToManyAddAssociationsMixinOptions {
  @scala.inline
  def apply(): BelongsToManyAddAssociationsMixinOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BelongsToManyAddAssociationsMixinOptions]
  }
  @scala.inline
  implicit class BelongsToManyAddAssociationsMixinOptionsOps[Self <: BelongsToManyAddAssociationsMixinOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValidate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(js.undefined)
        ret
    }
  }
  
}

