package typingsSlinky.sequelize.anon

import typingsSlinky.sequelize.mod.Transaction
import typingsSlinky.sequelize.sequelizeBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined sequelize.sequelize.UpsertOptions & {  returning  :false | undefined} */
@js.native
trait UpsertOptionsreturningfalBenchmark extends js.Object {
  /**
    * Print query execution time in milliseconds when logging SQL.
    */
  var benchmark: js.UndefOr[Boolean] = js.native
  /**
    * The fields to insert / update. Defaults to all fields
    */
  var fields: js.UndefOr[js.Array[String]] = js.native
  /**
    * A function that gets executed while running the query to log the sql.
    */
  var logging: js.UndefOr[Boolean | js.Function] = js.native
  /**
    * Append RETURNING * to get back auto generated values (Postgres only)
    */
  var returning: js.UndefOr[Boolean with js.UndefOr[`false`]] = js.native
  /**
    * An optional parameter to specify the schema search_path (Postgres only)
    */
  var searchPath: js.UndefOr[String] = js.native
  /**
    * Transaction to run query under
    */
  var transaction: js.UndefOr[Transaction] = js.native
  /**
    * Run validations before the row is inserted
    */
  var validate: js.UndefOr[Boolean] = js.native
}

object UpsertOptionsreturningfalBenchmark {
  @scala.inline
  def apply(): UpsertOptionsreturningfalBenchmark = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpsertOptionsreturningfalBenchmark]
  }
  @scala.inline
  implicit class UpsertOptionsreturningfalBenchmarkOps[Self <: UpsertOptionsreturningfalBenchmark] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBenchmark(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("benchmark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBenchmark: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("benchmark")(js.undefined)
        ret
    }
    @scala.inline
    def withFields(value: js.Array[String]): Self = {
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
    def withLogging(value: Boolean | js.Function): Self = {
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
    def withReturning(value: Boolean with js.UndefOr[`false`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returning")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchPath")(js.undefined)
        ret
    }
    @scala.inline
    def withTransaction(value: Transaction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transaction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransaction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transaction")(js.undefined)
        ret
    }
    @scala.inline
    def withValidate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(js.undefined)
        ret
    }
  }
  
}

