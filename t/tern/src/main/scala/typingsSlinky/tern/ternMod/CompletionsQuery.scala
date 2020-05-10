package typingsSlinky.tern.ternMod

import typingsSlinky.tern.ternStrings.completions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompletionsQuery
  extends BaseQueryWithFile
     with Query {
  /** Whether to use a case-insensitive compare between the current word and potential completions. Default `false` */
  var caseInsensitive: js.UndefOr[Boolean] = js.native
  /** Whether to include the distance (in scopes for variables, in prototypes for properties) between the completions and the origin position in the result data. Default `false` */
  var depths: js.UndefOr[Boolean] = js.native
  /** Whether to include documentation strings in the result data. Default `false` */
  var docs: js.UndefOr[Boolean] = js.native
  /** Specify the location to complete at. */
  var end: Double | Position = js.native
  /**
    * When disabled, only the text before the given position is considered part of the word. When enabled (the default),
    * the whole variable name that the cursor is on will be included. Default `true`
    */
  var expandWordForward: js.UndefOr[Boolean] = js.native
  /** When on, only completions that match the current word at the given point will be returned. Turn this off to get all results, so that you can filter on the client side. Default `true` */
  var filter: js.UndefOr[Boolean] = js.native
  /** When completing a property and no completions are found, Tern will use some heuristics to try and return some properties anyway. Set this to `false` to turn that off. Default `true` */
  var guess: js.UndefOr[Boolean] = js.native
  /** If completions should be returned when inside a literal. Default `true` */
  var inLiteral: js.UndefOr[Boolean] = js.native
  /** Whether to include JavaScript keywords when completing something that is not a property. Default `false` */
  var includeKeywords: js.UndefOr[Boolean] = js.native
  /** Whether to ignore the properties of `Object.prototype` unless they have been spelled out by at least two characters. Default `true` */
  var omitObjectPrototype: js.UndefOr[Boolean] = js.native
  /** Whether to include origin files (if found) in the result data. Default `false` */
  var origins: js.UndefOr[Boolean] = js.native
  /** Determines whether the result set will be sorted. Default `true` */
  var sort: js.UndefOr[Boolean] = js.native
  /** Asks the server for a set of completions at the given point. */
  @JSName("type")
  var type_CompletionsQuery: completions = js.native
  /** Whether to include the types of the completions in the result data. Default `false` */
  var types: js.UndefOr[Boolean] = js.native
  /** Whether to include urls in the result data. Default `false` */
  var urls: js.UndefOr[Boolean] = js.native
}

object CompletionsQuery {
  @scala.inline
  def apply(end: Double | Position, file: String, `type`: completions): CompletionsQuery = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionsQuery]
  }
  @scala.inline
  implicit class CompletionsQueryOps[Self <: CompletionsQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnd(value: Double | Position): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: completions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCaseInsensitive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseInsensitive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaseInsensitive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseInsensitive")(js.undefined)
        ret
    }
    @scala.inline
    def withDepths(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDepths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depths")(js.undefined)
        ret
    }
    @scala.inline
    def withDocs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("docs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("docs")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandWordForward(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandWordForward")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandWordForward: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandWordForward")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withGuess(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGuess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guess")(js.undefined)
        ret
    }
    @scala.inline
    def withInLiteral(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inLiteral")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInLiteral: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inLiteral")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeKeywords(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeKeywords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeKeywords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeKeywords")(js.undefined)
        ret
    }
    @scala.inline
    def withOmitObjectPrototype(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("omitObjectPrototype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOmitObjectPrototype: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("omitObjectPrototype")(js.undefined)
        ret
    }
    @scala.inline
    def withOrigins(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrigins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origins")(js.undefined)
        ret
    }
    @scala.inline
    def withSort(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.undefined)
        ret
    }
    @scala.inline
    def withTypes(value: Boolean): Self = {
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
    @scala.inline
    def withUrls(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urls")(js.undefined)
        ret
    }
  }
  
}

