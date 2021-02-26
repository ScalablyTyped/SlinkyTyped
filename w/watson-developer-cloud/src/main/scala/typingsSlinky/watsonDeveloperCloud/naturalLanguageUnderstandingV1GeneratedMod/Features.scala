package typingsSlinky.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Analysis features and options. */
@js.native
trait Features extends StObject {
  
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
  implicit class FeaturesMutableBuilder[Self <: Features] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategories(value: CategoriesOptions): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    @scala.inline
    def setConcepts(value: ConceptsOptions): Self = StObject.set(x, "concepts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConceptsUndefined: Self = StObject.set(x, "concepts", js.undefined)
    
    @scala.inline
    def setEmotion(value: EmotionOptions): Self = StObject.set(x, "emotion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmotionUndefined: Self = StObject.set(x, "emotion", js.undefined)
    
    @scala.inline
    def setEntities(value: EntitiesOptions): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntitiesUndefined: Self = StObject.set(x, "entities", js.undefined)
    
    @scala.inline
    def setKeywords(value: KeywordsOptions): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
    
    @scala.inline
    def setMetadata(value: MetadataOptions): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setRelations(value: RelationsOptions): Self = StObject.set(x, "relations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationsUndefined: Self = StObject.set(x, "relations", js.undefined)
    
    @scala.inline
    def setSemantic_roles(value: SemanticRolesOptions): Self = StObject.set(x, "semantic_roles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSemantic_rolesUndefined: Self = StObject.set(x, "semantic_roles", js.undefined)
    
    @scala.inline
    def setSentiment(value: SentimentOptions): Self = StObject.set(x, "sentiment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSentimentUndefined: Self = StObject.set(x, "sentiment", js.undefined)
    
    @scala.inline
    def setSyntax(value: SyntaxOptions): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyntaxUndefined: Self = StObject.set(x, "syntax", js.undefined)
  }
}
