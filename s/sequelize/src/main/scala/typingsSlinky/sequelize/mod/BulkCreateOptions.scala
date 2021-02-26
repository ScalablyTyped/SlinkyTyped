package typingsSlinky.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for Model.bulkCreate method
  */
@js.native
trait BulkCreateOptions
  extends FieldsOptions
     with LoggingOptions
     with SearchPathOptions
     with ReturningOptions {
  
  /**
    * Run before / after bulk create hooks?
    */
  var hooks: js.UndefOr[Boolean] = js.native
  
  /**
    * Ignore duplicate values for primary keys? (not supported by postgres)
    *
    * Defaults to false
    */
  var ignoreDuplicates: js.UndefOr[Boolean] = js.native
  
  /**
    * Run before / after create hooks for each individual Instance? BulkCreate hooks will still be run if
    * options.hooks is true.
    */
  var individualHooks: js.UndefOr[Boolean] = js.native
  
  /**
    * Fields to update if row key already exists (on duplicate key update)? (only supported by mysql &
    * mariadb). By default, all fields are updated.
    */
  var updateOnDuplicate: js.UndefOr[js.Array[String]] = js.native
}
object BulkCreateOptions {
  
  @scala.inline
  def apply(): BulkCreateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkCreateOptions]
  }
  
  @scala.inline
  implicit class BulkCreateOptionsMutableBuilder[Self <: BulkCreateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHooks(value: Boolean): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHooksUndefined: Self = StObject.set(x, "hooks", js.undefined)
    
    @scala.inline
    def setIgnoreDuplicates(value: Boolean): Self = StObject.set(x, "ignoreDuplicates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreDuplicatesUndefined: Self = StObject.set(x, "ignoreDuplicates", js.undefined)
    
    @scala.inline
    def setIndividualHooks(value: Boolean): Self = StObject.set(x, "individualHooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndividualHooksUndefined: Self = StObject.set(x, "individualHooks", js.undefined)
    
    @scala.inline
    def setUpdateOnDuplicate(value: js.Array[String]): Self = StObject.set(x, "updateOnDuplicate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateOnDuplicateUndefined: Self = StObject.set(x, "updateOnDuplicate", js.undefined)
    
    @scala.inline
    def setUpdateOnDuplicateVarargs(value: String*): Self = StObject.set(x, "updateOnDuplicate", js.Array(value :_*))
  }
}
