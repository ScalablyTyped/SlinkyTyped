package typingsSlinky.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*************************
  * model interfaces
  ************************/
/** Analysis results for each requested feature. */
@js.native
trait AnalysisResults extends js.Object {
  /** Text that was used in the analysis. */
  var analyzed_text: js.UndefOr[String] = js.native
  /** The categories that the service assigned to the analyzed text. */
  var categories: js.UndefOr[js.Array[CategoriesResult]] = js.native
  /** The general concepts referenced or alluded to in the analyzed text. */
  var concepts: js.UndefOr[js.Array[ConceptsResult]] = js.native
  /** The anger, disgust, fear, joy, or sadness conveyed by the content. */
  var emotion: js.UndefOr[EmotionResult] = js.native
  /** The entities detected in the analyzed text. */
  var entities: js.UndefOr[js.Array[EntitiesResult]] = js.native
  /** The keywords from the analyzed text. */
  var keywords: js.UndefOr[js.Array[KeywordsResult]] = js.native
  /** Language used to analyze the text. */
  var language: js.UndefOr[String] = js.native
  /** Webpage metadata, such as the author and the title of the page. */
  var metadata: js.UndefOr[AnalysisResultsMetadata] = js.native
  /** The relationships between entities in the content. */
  var relations: js.UndefOr[js.Array[RelationsResult]] = js.native
  /** URL of the webpage that was analyzed. */
  var retrieved_url: js.UndefOr[String] = js.native
  /** Sentences parsed into `subject`, `action`, and `object` form. */
  var semantic_roles: js.UndefOr[js.Array[SemanticRolesResult]] = js.native
  /** The sentiment of the content. */
  var sentiment: js.UndefOr[SentimentResult] = js.native
  /** Tokens and sentences returned from syntax analysis. */
  var syntax: js.UndefOr[SyntaxResult] = js.native
  /** API usage information for the request. */
  var usage: js.UndefOr[AnalysisResultsUsage] = js.native
}

object AnalysisResults {
  @scala.inline
  def apply(): AnalysisResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalysisResults]
  }
  @scala.inline
  implicit class AnalysisResultsOps[Self <: AnalysisResults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnalyzed_text(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analyzed_text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnalyzed_text: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analyzed_text")(js.undefined)
        ret
    }
    @scala.inline
    def withCategories(value: js.Array[CategoriesResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categories")(js.undefined)
        ret
    }
    @scala.inline
    def withConcepts(value: js.Array[ConceptsResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concepts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConcepts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concepts")(js.undefined)
        ret
    }
    @scala.inline
    def withEmotion(value: EmotionResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emotion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmotion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emotion")(js.undefined)
        ret
    }
    @scala.inline
    def withEntities(value: js.Array[EntitiesResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entities")(js.undefined)
        ret
    }
    @scala.inline
    def withKeywords(value: js.Array[KeywordsResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keywords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeywords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keywords")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: AnalysisResultsMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withRelations(value: js.Array[RelationsResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relations")(js.undefined)
        ret
    }
    @scala.inline
    def withRetrieved_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retrieved_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetrieved_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retrieved_url")(js.undefined)
        ret
    }
    @scala.inline
    def withSemantic_roles(value: js.Array[SemanticRolesResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("semantic_roles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSemantic_roles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("semantic_roles")(js.undefined)
        ret
    }
    @scala.inline
    def withSentiment(value: SentimentResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sentiment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSentiment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sentiment")(js.undefined)
        ret
    }
    @scala.inline
    def withSyntax(value: SyntaxResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syntax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSyntax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syntax")(js.undefined)
        ret
    }
    @scala.inline
    def withUsage(value: AnalysisResultsUsage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usage")(js.undefined)
        ret
    }
  }
  
}

