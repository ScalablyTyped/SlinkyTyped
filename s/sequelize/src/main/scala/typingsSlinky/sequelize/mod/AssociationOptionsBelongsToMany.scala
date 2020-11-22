package typingsSlinky.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options provided when associating models with belongsToMany relationship
  *
  * @see Association class belongsToMany method
  */
@js.native
trait AssociationOptionsBelongsToMany extends AssociationOptionsManyToMany {
  
  /**
    * The name of the foreign key in the join table (representing the target model) or an object representing
    * the type definition for the other column (see `Sequelize.define` for syntax). When using an object, you
    * can add a `name` property to set the name of the colum. Defaults to the name of target + primary key of
    * target
    */
  var otherKey: js.UndefOr[String | AssociationForeignKeyOptions] = js.native
  
  /**
    * The name of the table that is used to join source and target in n:m associations. Can also be a
    * sequelize
    * model if you want to define the junction table yourself and add extra attributes to it.
    *
    * In 3.4.1 version of Sequelize, hasMany's use of through gives an error, and on the other hand through
    * option for belongsToMany has been made required.
    *
    * @see https://github.com/sequelize/sequelize/blob/v3.4.1/lib/associations/has-many.js
    * @see https://github.com/sequelize/sequelize/blob/v3.4.1/lib/associations/belongs-to-many.js
    */
  var through: (Model[_, _, _]) | String | ThroughOptions = js.native
  
  /**
    * Should the join model have timestamps
    */
  var timestamps: js.UndefOr[Boolean] = js.native
  
  /**
    * Belongs-To-Many creates a unique key when primary key is not present on through model. This unique key name can be overridden using uniqueKey option.
    */
  var uniqueKey: js.UndefOr[String] = js.native
}
object AssociationOptionsBelongsToMany {
  
  @scala.inline
  def apply(through: (Model[_, _, _]) | String | ThroughOptions): AssociationOptionsBelongsToMany = {
    val __obj = js.Dynamic.literal(through = through.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociationOptionsBelongsToMany]
  }
  
  @scala.inline
  implicit class AssociationOptionsBelongsToManyOps[Self <: AssociationOptionsBelongsToMany] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setThrough(value: (Model[_, _, _]) | String | ThroughOptions): Self = this.set("through", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOtherKey(value: String | AssociationForeignKeyOptions): Self = this.set("otherKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOtherKey: Self = this.set("otherKey", js.undefined)
    
    @scala.inline
    def setTimestamps(value: Boolean): Self = this.set("timestamps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestamps: Self = this.set("timestamps", js.undefined)
    
    @scala.inline
    def setUniqueKey(value: String): Self = this.set("uniqueKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUniqueKey: Self = this.set("uniqueKey", js.undefined)
  }
}
