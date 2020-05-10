package typingsSlinky.selectize.Selectize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISearch extends js.Object {
  /**
    * A list of matched results. Each result is an object containing two properties: "score" and "id".
    */
  var items: js.Array[ISearchResult] = js.native
  /**
    * Original search options.
    */
  var options: js.Any = js.native
  /**
    * The raw user input
    */
  var query: String = js.native
  /**
    * An array containing parsed search tokens. A token is an object containing two properties: "string" and "regex".
    */
  var tokens: js.Array[ISearchToken] = js.native
  /**
    * The total number of results.
    */
  var total: Double = js.native
}

object ISearch {
  @scala.inline
  def apply(
    items: js.Array[ISearchResult],
    options: js.Any,
    query: String,
    tokens: js.Array[ISearchToken],
    total: Double
  ): ISearch = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearch]
  }
  @scala.inline
  implicit class ISearchOps[Self <: ISearch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[ISearchResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuery(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTokens(value: js.Array[ISearchToken]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokens")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

