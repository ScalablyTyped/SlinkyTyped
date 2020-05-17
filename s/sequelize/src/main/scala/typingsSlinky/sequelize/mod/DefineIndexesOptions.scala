package typingsSlinky.sequelize.mod

import typingsSlinky.sequelize.anon.Attribute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for indexes property in DefineOptions
  *
  * @see DefineOptions
  */
@js.native
trait DefineIndexesOptions extends js.Object {
  /**
    * PostgreSQL will build the index without taking any write locks. Postgres only
    *
    * Defaults to false
    */
  var concurrently: js.UndefOr[Boolean] = js.native
  /**
    * An array of the fields to index. Each field can either be a string containing the name of the field,
    * a sequelize object (e.g `sequelize.fn`), or an object with the following attributes: `attribute`
    * (field name), `length` (create a prefix index of length chars), `order` (the direction the column
    * should be sorted in), `collate` (the collation (sort order) for the column)
    */
  var fields: js.UndefOr[js.Array[String | fn | Attribute]] = js.native
  /**
    * The method to create the index by (`USING` statement in SQL). BTREE and HASH are supported by mysql and
    * postgres, and postgres additionally supports GIST and GIN.
    */
  var method: js.UndefOr[String] = js.native
  /**
    * The name of the index. Defaults to model name + _ + fields concatenated
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Operator that should be used by gin index, see Built-in GIN Operator Classes
    */
  var operator: js.UndefOr[String] = js.native
  /**
    * Index type. Only used by mysql. One of `UNIQUE`, `FULLTEXT` and `SPATIAL`
    */
  var `type`: js.UndefOr[IndexType] = js.native
  /**
    * Should the index by unique? Can also be triggered by setting type to `UNIQUE`
    *
    * Defaults to false
    */
  var unique: js.UndefOr[Boolean] = js.native
  /**
    * Method the index should use, for example 'gin' index.
    */
  var using: js.UndefOr[String] = js.native
  /**
    * Condition for partioal index
    */
  var where: js.UndefOr[AnyWhereOptions] = js.native
}

object DefineIndexesOptions {
  @scala.inline
  def apply(): DefineIndexesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefineIndexesOptions]
  }
  @scala.inline
  implicit class DefineIndexesOptionsOps[Self <: DefineIndexesOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConcurrently(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concurrently")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConcurrently: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concurrently")(js.undefined)
        ret
    }
    @scala.inline
    def withFields(value: js.Array[String | fn | Attribute]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
    @scala.inline
    def withMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOperator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operator")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: IndexType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
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
    @scala.inline
    def withUsing(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("using")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("using")(js.undefined)
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

