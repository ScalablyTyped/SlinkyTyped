package typingsSlinky.winrt.Windows.System.UserProfile

import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrt.Windows.Globalization.DayOfWeek
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGlobalizationPreferencesStatics extends js.Object {
  var calendars: IVectorView[String] = js.native
  var clocks: IVectorView[String] = js.native
  var currencies: IVectorView[String] = js.native
  var homeGeographicRegion: String = js.native
  var languages: IVectorView[String] = js.native
  var weekStartsOn: DayOfWeek = js.native
}

object IGlobalizationPreferencesStatics {
  @scala.inline
  def apply(
    calendars: IVectorView[String],
    clocks: IVectorView[String],
    currencies: IVectorView[String],
    homeGeographicRegion: String,
    languages: IVectorView[String],
    weekStartsOn: DayOfWeek
  ): IGlobalizationPreferencesStatics = {
    val __obj = js.Dynamic.literal(calendars = calendars.asInstanceOf[js.Any], clocks = clocks.asInstanceOf[js.Any], currencies = currencies.asInstanceOf[js.Any], homeGeographicRegion = homeGeographicRegion.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any], weekStartsOn = weekStartsOn.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGlobalizationPreferencesStatics]
  }
  @scala.inline
  implicit class IGlobalizationPreferencesStaticsOps[Self <: IGlobalizationPreferencesStatics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCalendars(value: IVectorView[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClocks(value: IVectorView[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clocks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrencies(value: IVectorView[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHomeGeographicRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homeGeographicRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguages(value: IVectorView[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeekStartsOn(value: DayOfWeek): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekStartsOn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

