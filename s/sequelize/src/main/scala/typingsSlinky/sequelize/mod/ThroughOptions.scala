package typingsSlinky.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used for a association table in n:m associations.
  *
  * @see AssociationOptionsBelongsToMany
  */
@js.native
trait ThroughOptions extends js.Object {
  /**
    * The model used to join both sides of the N:M association.
    */
  var model: Model[_, _, _] = js.native
  /**
    * A key/value set that will be used for association create and find defaults on the through model.
    * (Remember to add the attributes to the through model)
    */
  var scope: js.UndefOr[AssociationScope] = js.native
  /**
    * If true a unique key will be generated from the foreign keys used (might want to turn this off and create
    * specific unique keys when using scopes)
    *
    * Defaults to true
    */
  var unique: js.UndefOr[Boolean] = js.native
}

object ThroughOptions {
  @scala.inline
  def apply(model: Model[_, _, _]): ThroughOptions = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThroughOptions]
  }
  @scala.inline
  implicit class ThroughOptionsOps[Self <: ThroughOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withModel(value: Model[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScope(value: AssociationScope): Self = {
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
    @scala.inline
    def withUnique(value: Boolean): Self = {
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

