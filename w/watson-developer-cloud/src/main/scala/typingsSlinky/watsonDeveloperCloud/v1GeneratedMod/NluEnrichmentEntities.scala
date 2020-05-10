package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An object speficying the Entities enrichment and related parameters. */
@js.native
trait NluEnrichmentEntities extends js.Object {
  /** When `true`, emotion detection of entities will be performed on the specified field. */
  var emotion: js.UndefOr[Boolean] = js.native
  /** The maximum number of entities to extract for each instance of the specified field. */
  var limit: js.UndefOr[Double] = js.native
  /** When `true`, the types of mentions for each idetifieid entity is recorded. The default is `false`. */
  var mention_types: js.UndefOr[Boolean] = js.native
  /** When `true`, the number of mentions of each identified entity is recorded. The default is `false`. */
  var mentions: js.UndefOr[Boolean] = js.native
  /** The enrichement model to use with entity extraction. May be a custom model provided by Watson Knowledge Studio, the public model for use with Knowledge Graph `en-news`, or the default public model `alchemy`. */
  var model: js.UndefOr[String] = js.native
  /** When `true`, a list of sentence locations for each instance of each identified entity is recorded. The default is `false`. */
  var sentence_locations: js.UndefOr[Boolean] = js.native
  /** When `true`, sentiment analysis of entities will be performed on the specified field. */
  var sentiment: js.UndefOr[Boolean] = js.native
}

object NluEnrichmentEntities {
  @scala.inline
  def apply(): NluEnrichmentEntities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NluEnrichmentEntities]
  }
  @scala.inline
  implicit class NluEnrichmentEntitiesOps[Self <: NluEnrichmentEntities] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmotion(value: Boolean): Self = {
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
    def withMention_types(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mention_types")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMention_types: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mention_types")(js.undefined)
        ret
    }
    @scala.inline
    def withMentions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mentions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMentions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mentions")(js.undefined)
        ret
    }
    @scala.inline
    def withModel(value: String): Self = {
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
    def withSentence_locations(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sentence_locations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSentence_locations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sentence_locations")(js.undefined)
        ret
    }
    @scala.inline
    def withSentiment(value: Boolean): Self = {
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

