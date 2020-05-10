package typingsSlinky.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Analysis features and options. */
@js.native
trait Features extends js.Object {
  /** Returns a five-level taxonomy of the content. The top three categories are returned. Supported languages: Arabic, English, French, German, Italian, Japanese, Korean, Portuguese, Spanish. */
  var categories: js.UndefOr[CategoriesOptions] = js.native
  /** Returns high-level concepts in the content. For example, a research paper about deep learning might return the concept, "Artificial Intelligence" although the term is not mentioned. Supported languages: English, French, German, Italian, Japanese, Korean, Portuguese, Spanish. */
  var concepts: js.UndefOr[ConceptsOptions] = js.native
  /** Detects anger, disgust, fear, joy, or sadness that is conveyed in the content or by the context around target phrases specified in the targets parameter. You can analyze emotion for detected entities with `entities.emotion` and for keywords with `keywords.emotion`. Supported languages: English. */
  var emotion: js.UndefOr[EmotionOptions] = js.native
  /** Identifies people, cities, organizations, and other entities in the content. See [Entity types and subtypes](https://cloud.ibm.com/docs/services/natural-language-understanding/entity-types.html). Supported languages: English, French, German, Italian, Japanese, Korean, Portuguese, Russian, Spanish, Swedish. Arabic, Chinese, and Dutch are supported only through custom models. */
  var entities: js.UndefOr[EntitiesOptions] = js.native
  /** Returns important keywords in the content. Supported languages: English, French, German, Italian, Japanese, Korean, Portuguese, Russian, Spanish, Swedish. */
  var keywords: js.UndefOr[KeywordsOptions] = js.native
  /** Returns information from the document, including author name, title, RSS/ATOM feeds, prominent page image, and publication date. Supports URL and HTML input types only. */
  var metadata: js.UndefOr[MetadataOptions] = js.native
  /** Recognizes when two entities are related and identifies the type of relation. For example, an `awardedTo` relation might connect the entities "Nobel Prize" and "Albert Einstein". See [Relation types](https://cloud.ibm.com/docs/services/natural-language-understanding/relations.html). Supported languages: Arabic, English, German, Japanese, Korean, Spanish. Chinese, Dutch, French, Italian, and Portuguese custom models are also supported. */
  var relations: js.UndefOr[RelationsOptions] = js.native
  /** Parses sentences into subject, action, and object form. Supported languages: English, German, Japanese, Korean, Spanish. */
  var semantic_roles: js.UndefOr[SemanticRolesOptions] = js.native
  /** Analyzes the general sentiment of your content or the sentiment toward specific target phrases. You can analyze sentiment for detected entities with `entities.sentiment` and for keywords with `keywords.sentiment`. Supported languages: Arabic, English, French, German, Italian, Japanese, Korean, Portuguese, Russian, Spanish. */
  var sentiment: js.UndefOr[SentimentOptions] = js.native
  /** Returns tokens and sentences from the input text. */
  var syntax: js.UndefOr[SyntaxOptions] = js.native
}

object Features {
  @scala.inline
  def apply(): Features = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Features]
  }
  @scala.inline
  implicit class FeaturesOps[Self <: Features] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCategories(value: CategoriesOptions): Self = {
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
    def withConcepts(value: ConceptsOptions): Self = {
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
    def withEmotion(value: EmotionOptions): Self = {
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
    def withEntities(value: EntitiesOptions): Self = {
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
    def withKeywords(value: KeywordsOptions): Self = {
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
    def withMetadata(value: MetadataOptions): Self = {
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
    def withRelations(value: RelationsOptions): Self = {
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
    def withSemantic_roles(value: SemanticRolesOptions): Self = {
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
    def withSentiment(value: SentimentOptions): Self = {
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
    def withSyntax(value: SyntaxOptions): Self = {
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
  }
  
}

