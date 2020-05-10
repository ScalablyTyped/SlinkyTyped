package typingsSlinky.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class BulkCreateOptionsOps[Self <: BulkCreateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withIgnoreDuplicates(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreDuplicates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreDuplicates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreDuplicates")(js.undefined)
        ret
    }
    @scala.inline
    def withIndividualHooks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("individualHooks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndividualHooks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("individualHooks")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateOnDuplicate(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateOnDuplicate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateOnDuplicate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateOnDuplicate")(js.undefined)
        ret
    }
  }
  
}

