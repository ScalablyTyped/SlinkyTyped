package typingsSlinky.sparkpost.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SupressionSearchParameters extends js.Object {
  /**
    * The results cursor location to return, to start paging with cursor, use the value of ‘initial’.
    * When cursor is provided the page parameter is ignored. (Note: SparkPost only)
    *
    */
  var cursor: js.UndefOr[String] = js.native
  /**
    * Description of the entries to include in the search, i.e descriptions that include the text submitted.
    * ( Note: SparkPost only)
    *
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Domain of entries to include in the search. ( Note: SparkPost only)
    *
    */
  var domain: js.UndefOr[String] = js.native
  /** Datetime the entries were last updated, in the format YYYY-MM-DDTHH:mm:ssZ */
  var from: js.UndefOr[String] = js.native
  /**
    * Maximum number of results to return per page. Must be between 1 and 10,000.
    * @deprecated use per_page instead
    */
  var limit: js.UndefOr[Double] = js.native
  /**
    * The results page number to return. Used with per_page for paging through results.
    * The page parameter works up to 10,000 results.
    * You must use the cursor parameter and start with cursor=initial to page result sets larger than 10,000
    * ( Note: SparkPost only)
    *
    */
  var page: js.UndefOr[String | Double] = js.native
  /**
    * Maximum number of results to return per page. Must be between 1 and 10,000.
    * ( Note: SparkPost only)
    * @default 1000
    */
  var per_page: js.UndefOr[String | Double] = js.native
  /** Sources of the entries to include in the search, i.e. entries that were added by this source */
  var sources: js.UndefOr[String] = js.native
  /** Datetime the entries were last updated, in the format of YYYY-MM-DDTHH:mm:ssZ */
  var to: js.UndefOr[String] = js.native
  /** Types of entries to include in the search, i.e. entries with “transactional” and/or “non_transactional” keys set to true */
  var types: js.UndefOr[String] = js.native
}

object SupressionSearchParameters {
  @scala.inline
  def apply(): SupressionSearchParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SupressionSearchParameters]
  }
  @scala.inline
  implicit class SupressionSearchParametersOps[Self <: SupressionSearchParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCursor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withDomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(js.undefined)
        ret
    }
    @scala.inline
    def withFrom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(js.undefined)
        ret
    }
    @scala.inline
    def withLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.undefined)
        ret
    }
    @scala.inline
    def withPage(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(js.undefined)
        ret
    }
    @scala.inline
    def withPer_page(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("per_page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPer_page: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("per_page")(js.undefined)
        ret
    }
    @scala.inline
    def withSources(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sources")(js.undefined)
        ret
    }
    @scala.inline
    def withTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(js.undefined)
        ret
    }
    @scala.inline
    def withTypes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(js.undefined)
        ret
    }
  }
  
}

