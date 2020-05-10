package typingsSlinky.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * References options for the column's attributes
  *
  * @see AttributeColumnOptions
  */
@js.native
trait DefineAttributeColumnReferencesOptions extends js.Object {
  /**
    * When to check for the foreign key constraing
    *
    * PostgreSQL only
    */
  var deferrable: js.UndefOr[
    DeferrableInitiallyDeferred | DeferrableInitiallyImmediate | DeferrableNot | DeferrableSetDeferred | DeferrableSetImmediate
  ] = js.native
  /**
    * The column of the foreign table that this column references
    */
  var key: js.UndefOr[String] = js.native
  /**
    * If this column references another table, provide it here as a Model, or a string
    */
  var model: String | (Model[_, _, _]) = js.native
}

object DefineAttributeColumnReferencesOptions {
  @scala.inline
  def apply(model: String | (Model[_, _, _])): DefineAttributeColumnReferencesOptions = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefineAttributeColumnReferencesOptions]
  }
  @scala.inline
  implicit class DefineAttributeColumnReferencesOptionsOps[Self <: DefineAttributeColumnReferencesOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withModel(value: String | (Model[_, _, _])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeferrable(
      value: DeferrableInitiallyDeferred | DeferrableInitiallyImmediate | DeferrableNot | DeferrableSetDeferred | DeferrableSetImmediate
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferrable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeferrable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferrable")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
  }
  
}

