package typingsSlinky.sequelize.mod

import typingsSlinky.sequelize.AnonExclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Complex include options
  */
@js.native
trait IncludeOptions extends js.Object {
  var all: js.UndefOr[Boolean | String] = js.native
  /**
    * The alias of the relation, in case the model you want to eagerly load is aliassed. For `hasOne` /
    * `belongsTo`, this should be the singular name, and for `hasMany`, it should be the plural
    */
  var as: js.UndefOr[String] = js.native
  /**
    * The association you want to eagerly load. (This can be used instead of providing a model/as pair).
    * You can also use the association alias.
    */
  var association: js.UndefOr[IncludeAssociation | String] = js.native
  /**
    * A list of attributes to select from the child model
    */
  var attributes: js.UndefOr[FindOptionsAttributesArray | AnonExclude] = js.native
  /**
    * Load further nested related models
    */
  var include: js.UndefOr[js.Array[(Model[_, _, _]) | IncludeOptions]] = js.native
  /**
    * The model you want to eagerly load
    */
  var model: js.UndefOr[Model[_, _, _]] = js.native
  /**
    * if true, it will also eager load the relations of the child models, recursively.
    */
  var nested: js.UndefOr[Boolean] = js.native
  /**
    * If true, only non-deleted records will be returned. If false, both deleted and non-deleted records will
    * be returned. Only applies if `options.paranoid` is true for the model.
    */
  var paranoid: js.UndefOr[Boolean] = js.native
  /**
    * If true, converts to an inner join, which means that the parent model will only be loaded if it has any
    * matching children. True if `include.where` is set, false otherwise.
    */
  var required: js.UndefOr[Boolean] = js.native
  /**
    * If true, runs a separate query to fetch the associated instances, only supported for hasMany associations
    */
  var separate: js.UndefOr[Boolean] = js.native
  /**
    * Through Options
    */
  var through: js.UndefOr[IncludeThroughOptions] = js.native
  /**
    * Where clauses to apply to the child models. Note that this converts the eager load to an inner join,
    * unless you explicitly set `required: false`
    */
  var where: js.UndefOr[AnyWhereOptions] = js.native
}

object IncludeOptions {
  @scala.inline
  def apply(): IncludeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncludeOptions]
  }
  @scala.inline
  implicit class IncludeOptionsOps[Self <: IncludeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAll(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(js.undefined)
        ret
    }
    @scala.inline
    def withAs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(js.undefined)
        ret
    }
    @scala.inline
    def withAssociation(value: IncludeAssociation | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("association")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssociation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("association")(js.undefined)
        ret
    }
    @scala.inline
    def withAttributes(value: FindOptionsAttributesArray | AnonExclude): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(js.undefined)
        ret
    }
    @scala.inline
    def withInclude(value: js.Array[(Model[_, _, _]) | IncludeOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(js.undefined)
        ret
    }
    @scala.inline
    def withModel(value: Model[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(js.undefined)
        ret
    }
    @scala.inline
    def withNested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nested")(js.undefined)
        ret
    }
    @scala.inline
    def withParanoid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paranoid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParanoid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paranoid")(js.undefined)
        ret
    }
    @scala.inline
    def withRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(js.undefined)
        ret
    }
    @scala.inline
    def withSeparate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeparate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separate")(js.undefined)
        ret
    }
    @scala.inline
    def withThrough(value: IncludeThroughOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("through")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThrough: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("through")(js.undefined)
        ret
    }
    @scala.inline
    def withWhere(value: AnyWhereOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("where")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhere: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("where")(js.undefined)
        ret
    }
  }
  
}

