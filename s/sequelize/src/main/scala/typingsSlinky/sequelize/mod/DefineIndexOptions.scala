package typingsSlinky.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefineIndexOptions extends js.Object {
  /**
    * Pass CONCURRENT so other operations run while the index is created - PostgresSQL only. Default is false
    */
  var concurrently: js.UndefOr[Boolean] = js.native
  /**
    * The name of the index. Default is __
    */
  var indexName: js.UndefOr[String] = js.native
  /**
    * Set a type for the index, e.g. BTREE. See the documentation of the used dialect
    */
  var indexType: js.UndefOr[String] = js.native
  /**
    * The index type
    */
  var indicesType: js.UndefOr[IndexType] = js.native
  /**
    * A function that receives the sql query, e.g. console.log
    */
  var logging: js.UndefOr[js.Function] = js.native
  /**
    * The name of the index. Default is Default is <table>_<attr1>_<attr2>
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Index operator
    */
  var operator: js.UndefOr[String] = js.native
  /**
    * For FULLTEXT columns set your parser
    */
  var parser: js.UndefOr[String] = js.native
  /**
    * The index type
    */
  var `type`: js.UndefOr[IndexType] = js.native
  /**
    * Create a unique index
    */
  var unique: js.UndefOr[Boolean] = js.native
  /**
    * Create an unique index
    */
  var using: js.UndefOr[String] = js.native
  /**
    * A hash of attributes to limit your index(Filtered Indexes - MSSQL & PostgreSQL only)
    */
  var where: js.UndefOr[AnyWhereOptions] = js.native
}

object DefineIndexOptions {
  @scala.inline
  def apply(): DefineIndexOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefineIndexOptions]
  }
  @scala.inline
  implicit class DefineIndexOptionsOps[Self <: DefineIndexOptions] (val x: Self) extends AnyVal {
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
    def withIndexName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexName")(js.undefined)
        ret
    }
    @scala.inline
    def withIndexType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexType")(js.undefined)
        ret
    }
    @scala.inline
    def withIndicesType(value: IndexType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicesType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndicesType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicesType")(js.undefined)
        ret
    }
    @scala.inline
    def withLogging(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logging")(js.undefined)
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
    def withParser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parser")(js.undefined)
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

