package typingsSlinky.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The important people, places, geopolitical entities and other types of entities in your content. */
@js.native
trait EntitiesResult extends js.Object {
  /** How many times the entity was mentioned in the text. */
  var count: js.UndefOr[Double] = js.native
  /** Disambiguation information for the entity. */
  var disambiguation: js.UndefOr[DisambiguationResult] = js.native
  /** Emotion analysis results for the entity, enabled with the `emotion` option. */
  var emotion: js.UndefOr[EmotionScores] = js.native
  /** Entity mentions and locations. */
  var mentions: js.UndefOr[js.Array[EntityMention]] = js.native
  /** Relevance score from 0 to 1. Higher values indicate greater relevance. */
  var relevance: js.UndefOr[Double] = js.native
  /** Sentiment analysis results for the entity, enabled with the `sentiment` option. */
  var sentiment: js.UndefOr[FeatureSentimentResults] = js.native
  /** The name of the entity. */
  var text: js.UndefOr[String] = js.native
  /** Entity type. */
  var `type`: js.UndefOr[String] = js.native
}

object EntitiesResult {
  @scala.inline
  def apply(): EntitiesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntitiesResult]
  }
  @scala.inline
  implicit class EntitiesResultOps[Self <: EntitiesResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(js.undefined)
        ret
    }
    @scala.inline
    def withDisambiguation(value: DisambiguationResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disambiguation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisambiguation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disambiguation")(js.undefined)
        ret
    }
    @scala.inline
    def withEmotion(value: EmotionScores): Self = {
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
    def withMentions(value: js.Array[EntityMention]): Self = {
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
    def withRelevance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relevance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelevance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relevance")(js.undefined)
        ret
    }
    @scala.inline
    def withSentiment(value: FeatureSentimentResults): Self = {
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
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
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
  }
  
}

