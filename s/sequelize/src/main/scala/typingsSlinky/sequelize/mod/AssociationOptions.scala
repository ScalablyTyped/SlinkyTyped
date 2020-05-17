package typingsSlinky.sequelize.mod

import typingsSlinky.sequelize.anon.Plural
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options provided when associating models
  *
  * @see Association class
  */
@js.native
trait AssociationOptions extends js.Object {
  /**
    * The alias of this model, in singular form. See also the `name` option passed to `sequelize.define`. If
    * you create multiple associations between the same tables, you should provide an alias to be able to
    * distinguish between them. If you provide an alias when creating the assocition, you should provide the
    * same alias when eager loading and when getting assocated models. Defaults to the singularized name of
    * target
    */
  var as: js.UndefOr[String | Plural] = js.native
  /**
    * Should on update and on delete constraints be enabled on the foreign key.
    */
  var constraints: js.UndefOr[Boolean] = js.native
  /**
    * The name of the foreign key in the target table or an object representing the type definition for the
    * foreign column (see `Sequelize.define` for syntax). When using an object, you can add a `name` property
    * to set the name of the column. Defaults to the name of source + primary key of source
    */
  var foreignKey: js.UndefOr[String | AssociationForeignKeyOptions] = js.native
  var foreignKeyConstraint: js.UndefOr[Boolean] = js.native
  /**
    * Set to true to run before-/afterDestroy hooks when an associated model is deleted because of a cascade.
    * For example if `User.hasOne(Profile, {onDelete: 'cascade', hooks:true})`, the before-/afterDestroy hooks
    * for profile will be called when a user is deleted. Otherwise the profile will be deleted without invoking
    * any hooks.
    *
    * Defaults to false
    */
  var hooks: js.UndefOr[Boolean] = js.native
  /**
    * What happens when delete occurs.
    *
    * Cascade if this is a n:m, and set null if it is a 1:m
    *
    * Defaults to 'SET NULL' or 'CASCADE'
    */
  var onDelete: js.UndefOr[String] = js.native
  /**
    * What happens when update occurs
    *
    * Defaults to 'CASCADE'
    */
  var onUpdate: js.UndefOr[String] = js.native
  var scope: js.UndefOr[AssociationScope] = js.native
}

object AssociationOptions {
  @scala.inline
  def apply(): AssociationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociationOptions]
  }
  @scala.inline
  implicit class AssociationOptionsOps[Self <: AssociationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAs(value: String | Plural): Self = {
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
    def withConstraints(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constraints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstraints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constraints")(js.undefined)
        ret
    }
    @scala.inline
    def withForeignKey(value: String | AssociationForeignKeyOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foreignKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForeignKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foreignKey")(js.undefined)
        ret
    }
    @scala.inline
    def withForeignKeyConstraint(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foreignKeyConstraint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForeignKeyConstraint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foreignKeyConstraint")(js.undefined)
        ret
    }
    @scala.inline
    def withHooks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hooks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHooks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hooks")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDelete(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDelete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnDelete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDelete")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUpdate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpdate")(js.undefined)
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
  }
  
}

