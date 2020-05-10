package typingsSlinky.watsonDeveloperCloud.v3GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Profile. */
@js.native
trait Profile extends js.Object {
  /** For JSON content that is timestamped, detailed results about the social behavior disclosed by the input in terms of temporal characteristics. The results include information about the distribution of the content over the days of the week and the hours of the day. */
  var behavior: js.UndefOr[js.Array[Behavior]] = js.native
  /** If the **consumption_preferences** parameter is `true`, detailed results for each category of consumption preferences. Each element of the array provides information inferred from the input text for the individual preferences of that category. */
  var consumption_preferences: js.UndefOr[js.Array[ConsumptionPreferencesCategory]] = js.native
  /** Detailed results for the Needs characteristics inferred from the input text. */
  var needs: js.Array[Trait] = js.native
  /** A recursive array of `Trait` objects that provides detailed results for the Big Five personality characteristics (dimensions and facets) inferred from the input text. */
  var personality: js.Array[Trait] = js.native
  /** The language model that was used to process the input. */
  var processed_language: String = js.native
  /** Detailed results for the Values characteristics inferred from the input text. */
  var values: js.Array[Trait] = js.native
  /** Warning messages associated with the input text submitted with the request. The array is empty if the input generated no warnings. */
  var warnings: js.Array[Warning] = js.native
  /** The number of words from the input that were used to produce the profile. */
  var word_count: Double = js.native
  /** When guidance is appropriate, a string that provides a message that indicates the number of words found and where that value falls in the range of required or suggested number of words. */
  var word_count_message: js.UndefOr[String] = js.native
}

object Profile {
  @scala.inline
  def apply(
    needs: js.Array[Trait],
    personality: js.Array[Trait],
    processed_language: String,
    values: js.Array[Trait],
    warnings: js.Array[Warning],
    word_count: Double
  ): Profile = {
    val __obj = js.Dynamic.literal(needs = needs.asInstanceOf[js.Any], personality = personality.asInstanceOf[js.Any], processed_language = processed_language.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any], word_count = word_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[Profile]
  }
  @scala.inline
  implicit class ProfileOps[Self <: Profile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNeeds(value: js.Array[Trait]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPersonality(value: js.Array[Trait]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("personality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProcessed_language(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processed_language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: js.Array[Trait]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWarnings(value: js.Array[Warning]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warnings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWord_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("word_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBehavior(value: js.Array[Behavior]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("behavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBehavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("behavior")(js.undefined)
        ret
    }
    @scala.inline
    def withConsumption_preferences(value: js.Array[ConsumptionPreferencesCategory]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consumption_preferences")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsumption_preferences: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consumption_preferences")(js.undefined)
        ret
    }
    @scala.inline
    def withWord_count_message(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("word_count_message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWord_count_message: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("word_count_message")(js.undefined)
        ret
    }
  }
  
}

