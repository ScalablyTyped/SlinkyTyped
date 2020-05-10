package typingsSlinky.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options for the setAssociation mixin of the hasOne association.
  * @see HasOneSetAssociationMixin
  */
@js.native
trait HasOneSetAssociationMixinOptions extends js.Object {
  /**
    * Skip saving this after setting the foreign key if false.
    */
  var save: js.UndefOr[Boolean] = js.native
}

object HasOneSetAssociationMixinOptions {
  @scala.inline
  def apply(): HasOneSetAssociationMixinOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HasOneSetAssociationMixinOptions]
  }
  @scala.inline
  implicit class HasOneSetAssociationMixinOptionsOps[Self <: HasOneSetAssociationMixinOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSave(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save")(js.undefined)
        ret
    }
  }
  
}

