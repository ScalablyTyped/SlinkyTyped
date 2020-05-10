package typingsSlinky.sequelize.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for query options
  *
  * @see Options
  */
@js.native
trait QueryOptions
  extends SearchPathOptions
     with ReturningOptions {
  /**
    * Either an object of named bind parameter in the format `$param` or an array of unnamed
    * bind parameter to replace `$1`, `$2`, ... in your SQL.
    */
  var bind: js.UndefOr[js.Object | js.Array[String]] = js.native
  // TODO: force, cascade
  var fieldMap: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * A sequelize instance used to build the return instance
    */
  var instance: js.UndefOr[Instance[_]] = js.native
  /**
    * A function that gets executed while running the query to log the sql.
    */
  var logging: js.UndefOr[Boolean | js.Function] = js.native
  /**
    * Map returned fields to model's fields if `options.model` or `options.instance` is present.
    * Mapping will occur before building the model instance.
    */
  var mapToModel: js.UndefOr[Boolean] = js.native
  /**
    * A sequelize model used to build the returned model instances (used to be called callee)
    */
  var model: js.UndefOr[Model[_, _, _]] = js.native
  /**
    * If true, transforms objects with `.` separated property names into nested objects using
    * [dottie.js](https://github.com/mickhansen/dottie.js). For example { 'user.username': 'john' } becomes
    * { user: { username: 'john' }}. When `nest` is true, the query type is assumed to be `'SELECT'`,
    * unless otherwise specified
    *
    * Defaults to false
    */
  var nest: js.UndefOr[Boolean] = js.native
  /**
    * Sets the query type to `SELECT` and return a single row
    */
  var plain: js.UndefOr[Boolean] = js.native
  /**
    * If true, sequelize will not try to format the results of the query, or build an instance of a model from
    * the result
    */
  var raw: js.UndefOr[Boolean] = js.native
  /**
    * Either an object of named parameter replacements in the format `:param` or an array of unnamed
    * replacements to replace `?` in your SQL.
    */
  var replacements: js.UndefOr[js.Object | js.Array[String]] = js.native
  /**
    * Set of flags that control when a query is automatically retried.
    */
  var retry: js.UndefOr[RetryOptions] = js.native
  /**
    * If false do not prepend the query with the search_path (Postgres only)
    */
  var supportsSearchPath: js.UndefOr[Boolean] = js.native
  /**
    * The type of query you are executing. The query type affects how results are formatted before they are
    * passed back. The type is a string, but `Sequelize.QueryTypes` is provided as convenience shortcuts.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Force the query to use the write pool, regardless of the query type.
    *
    * Defaults to false
    */
  var useMaster: js.UndefOr[Boolean] = js.native
}

object QueryOptions {
  @scala.inline
  def apply(): QueryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryOptions]
  }
  @scala.inline
  implicit class QueryOptionsOps[Self <: QueryOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBind(value: js.Object | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bind")(js.undefined)
        ret
    }
    @scala.inline
    def withFieldMap(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldMap")(js.undefined)
        ret
    }
    @scala.inline
    def withInstance(value: Instance[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instance")(js.undefined)
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
    def withMapToModel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapToModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapToModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapToModel")(js.undefined)
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
    def withNest(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nest")(js.undefined)
        ret
    }
    @scala.inline
    def withPlain(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plain")(js.undefined)
        ret
    }
    @scala.inline
    def withRaw(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRaw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(js.undefined)
        ret
    }
    @scala.inline
    def withReplacements(value: js.Object | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replacements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplacements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replacements")(js.undefined)
        ret
    }
    @scala.inline
    def withRetry(value: RetryOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retry")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportsSearchPath(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsSearchPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportsSearchPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsSearchPath")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
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
    def withUseMaster(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useMaster")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseMaster: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useMaster")(js.undefined)
        ret
    }
  }
  
}

