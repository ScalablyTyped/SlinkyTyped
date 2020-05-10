package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** NluEnrichmentFeatures. */
@js.native
trait NluEnrichmentFeatures extends js.Object {
  /** An object that indicates the Categories enrichment will be applied to the specified field. */
  var categories: js.UndefOr[NluEnrichmentCategories] = js.native
  /** An object specifiying the concepts enrichment and related parameters. */
  var concepts: js.UndefOr[NluEnrichmentConcepts] = js.native
  /** An object specifying the emotion detection enrichment and related parameters. */
  var emotion: js.UndefOr[NluEnrichmentEmotion] = js.native
  /** An object speficying the Entities enrichment and related parameters. */
  var entities: js.UndefOr[NluEnrichmentEntities] = js.native
  /** An object specifying the Keyword enrichment and related parameters. */
  var keywords: js.UndefOr[NluEnrichmentKeywords] = js.native
  /** An object specifying the relations enrichment and related parameters. */
  var relations: js.UndefOr[NluEnrichmentRelations] = js.native
  /** An object specifiying the semantic roles enrichment and related parameters. */
  var semantic_roles: js.UndefOr[NluEnrichmentSemanticRoles] = js.native
  /** An object specifying the sentiment extraction enrichment and related parameters. */
  var sentiment: js.UndefOr[NluEnrichmentSentiment] = js.native
}

object NluEnrichmentFeatures {
  @scala.inline
  def apply(): NluEnrichmentFeatures = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NluEnrichmentFeatures]
  }
  @scala.inline
  implicit class NluEnrichmentFeaturesOps[Self <: NluEnrichmentFeatures] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCategories(value: NluEnrichmentCategories): Self = {
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
    def withConcepts(value: NluEnrichmentConcepts): Self = {
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
    def withEmotion(value: NluEnrichmentEmotion): Self = {
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
    def withEntities(value: NluEnrichmentEntities): Self = {
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
    def withKeywords(value: NluEnrichmentKeywords): Self = {
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
    def withRelations(value: NluEnrichmentRelations): Self = {
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
    def withSemantic_roles(value: NluEnrichmentSemanticRoles): Self = {
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
    def withSentiment(value: NluEnrichmentSentiment): Self = {
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
  }
  
}

