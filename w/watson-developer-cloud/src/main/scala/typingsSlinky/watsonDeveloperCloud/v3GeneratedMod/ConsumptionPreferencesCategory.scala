package typingsSlinky.watsonDeveloperCloud.v3GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** ConsumptionPreferencesCategory. */
@js.native
trait ConsumptionPreferencesCategory extends js.Object {
  /** The unique, non-localized identifier of the consumption preferences category to which the results pertain. IDs have the form `consumption_preferences_{category}`. */
  var consumption_preference_category_id: String = js.native
  /** Detailed results inferred from the input text for the individual preferences of the category. */
  var consumption_preferences: js.Array[ConsumptionPreferences] = js.native
  /** The user-visible name of the consumption preferences category. */
  var name: String = js.native
}

object ConsumptionPreferencesCategory {
  @scala.inline
  def apply(
    consumption_preference_category_id: String,
    consumption_preferences: js.Array[ConsumptionPreferences],
    name: String
  ): ConsumptionPreferencesCategory = {
    val __obj = js.Dynamic.literal(consumption_preference_category_id = consumption_preference_category_id.asInstanceOf[js.Any], consumption_preferences = consumption_preferences.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsumptionPreferencesCategory]
  }
  @scala.inline
  implicit class ConsumptionPreferencesCategoryOps[Self <: ConsumptionPreferencesCategory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConsumption_preference_category_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consumption_preference_category_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConsumption_preferences(value: js.Array[ConsumptionPreferences]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consumption_preferences")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

