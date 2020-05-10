package typingsSlinky.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
//  Associations
// ~~~~~~~~~~~~~~
//
//  https://github.com/sequelize/sequelize/tree/v3.4.1/lib/associations
//
/**
  * The options for the getAssociation mixin of the belongsTo association.
  * @see BelongsToGetAssociationMixin
  */
@js.native
trait BelongsToGetAssociationMixinOptions extends js.Object {
  /**
    * Apply a scope on the related model, or remove its default scope by passing false.
    */
  var scope: js.UndefOr[String | Boolean] = js.native
}

object BelongsToGetAssociationMixinOptions {
  @scala.inline
  def apply(): BelongsToGetAssociationMixinOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BelongsToGetAssociationMixinOptions]
  }
  @scala.inline
  implicit class BelongsToGetAssociationMixinOptionsOps[Self <: BelongsToGetAssociationMixinOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScope(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(js.undefined)
        ret
    }
  }
  
}

