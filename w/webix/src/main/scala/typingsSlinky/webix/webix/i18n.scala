package typingsSlinky.webix.webix

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait i18n extends js.Object {
  var calendar: js.Any = js.native
  var controls: js.Any = js.native
  var dateFormat: String = js.native
  var decimalDelimiter: String = js.native
  var decimalSize: Double = js.native
  var fileSize: js.Array[_] = js.native
  var fullDateFormat: String = js.native
  var groupDelimiter: String = js.native
  var groupSize: Double = js.native
  var locales: js.Any = js.native
  var longDateFormat: String = js.native
  var parseFormat: String = js.native
  var parseTimeFormat: String = js.native
  var price: String = js.native
  var priceSettings: js.Any = js.native
  var timeFormat: String = js.native
  def dateFormatDate(date: String): js.Any = js.native
  def dateFormatStr(date: js.Any): String = js.native
  def fullDateFormatDate(date: String): js.Any = js.native
  def fullDateFormatStr(date: Date): String = js.native
  def intFormat(num: Double): String = js.native
  def longDateFormatDate(date: String): js.Any = js.native
  def longDateFormatStr(date: js.Any): String = js.native
  def numberFormat(number: Double): String = js.native
  def parseFormatDate(date: String): js.Any = js.native
  def parseFormatStr(date: js.Any): String = js.native
  def parseTimeFormatDate(date: String): js.Any = js.native
  def parseTimeFormatStr(date: js.Any): String = js.native
  def priceFormat(number: Double): String = js.native
  def setLocale(name: String): Unit = js.native
  def timeFormatDate(time: String): js.Any = js.native
  def timeFormatStr(date: js.Any): String = js.native
}

object i18n {
  @scala.inline
  def apply(
    calendar: js.Any,
    controls: js.Any,
    dateFormat: String,
    dateFormatDate: String => js.Any,
    dateFormatStr: js.Any => String,
    decimalDelimiter: String,
    decimalSize: Double,
    fileSize: js.Array[_],
    fullDateFormat: String,
    fullDateFormatDate: String => js.Any,
    fullDateFormatStr: Date => String,
    groupDelimiter: String,
    groupSize: Double,
    intFormat: Double => String,
    locales: js.Any,
    longDateFormat: String,
    longDateFormatDate: String => js.Any,
    longDateFormatStr: js.Any => String,
    numberFormat: Double => String,
    parseFormat: String,
    parseFormatDate: String => js.Any,
    parseFormatStr: js.Any => String,
    parseTimeFormat: String,
    parseTimeFormatDate: String => js.Any,
    parseTimeFormatStr: js.Any => String,
    price: String,
    priceFormat: Double => String,
    priceSettings: js.Any,
    setLocale: String => Unit,
    timeFormat: String,
    timeFormatDate: String => js.Any,
    timeFormatStr: js.Any => String
  ): i18n = {
    val __obj = js.Dynamic.literal(calendar = calendar.asInstanceOf[js.Any], controls = controls.asInstanceOf[js.Any], dateFormat = dateFormat.asInstanceOf[js.Any], dateFormatDate = js.Any.fromFunction1(dateFormatDate), dateFormatStr = js.Any.fromFunction1(dateFormatStr), decimalDelimiter = decimalDelimiter.asInstanceOf[js.Any], decimalSize = decimalSize.asInstanceOf[js.Any], fileSize = fileSize.asInstanceOf[js.Any], fullDateFormat = fullDateFormat.asInstanceOf[js.Any], fullDateFormatDate = js.Any.fromFunction1(fullDateFormatDate), fullDateFormatStr = js.Any.fromFunction1(fullDateFormatStr), groupDelimiter = groupDelimiter.asInstanceOf[js.Any], groupSize = groupSize.asInstanceOf[js.Any], intFormat = js.Any.fromFunction1(intFormat), locales = locales.asInstanceOf[js.Any], longDateFormat = longDateFormat.asInstanceOf[js.Any], longDateFormatDate = js.Any.fromFunction1(longDateFormatDate), longDateFormatStr = js.Any.fromFunction1(longDateFormatStr), numberFormat = js.Any.fromFunction1(numberFormat), parseFormat = parseFormat.asInstanceOf[js.Any], parseFormatDate = js.Any.fromFunction1(parseFormatDate), parseFormatStr = js.Any.fromFunction1(parseFormatStr), parseTimeFormat = parseTimeFormat.asInstanceOf[js.Any], parseTimeFormatDate = js.Any.fromFunction1(parseTimeFormatDate), parseTimeFormatStr = js.Any.fromFunction1(parseTimeFormatStr), price = price.asInstanceOf[js.Any], priceFormat = js.Any.fromFunction1(priceFormat), priceSettings = priceSettings.asInstanceOf[js.Any], setLocale = js.Any.fromFunction1(setLocale), timeFormat = timeFormat.asInstanceOf[js.Any], timeFormatDate = js.Any.fromFunction1(timeFormatDate), timeFormatStr = js.Any.fromFunction1(timeFormatStr))
    __obj.asInstanceOf[i18n]
  }
  @scala.inline
  implicit class i18nOps[Self <: i18n] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCalendar(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withControls(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDateFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDateFormatDate(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateFormatDate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDateFormatStr(value: js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateFormatStr")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDecimalDelimiter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimalDelimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDecimalSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimalSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileSize(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFullDateFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullDateFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFullDateFormatDate(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullDateFormatDate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFullDateFormatStr(value: Date => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullDateFormatStr")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGroupDelimiter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupDelimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIntFormat(value: Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intFormat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLocales(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locales")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLongDateFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longDateFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLongDateFormatDate(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longDateFormatDate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLongDateFormatStr(value: js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longDateFormatStr")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNumberFormat(value: Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberFormat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withParseFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParseFormatDate(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseFormatDate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withParseFormatStr(value: js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseFormatStr")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withParseTimeFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseTimeFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParseTimeFormatDate(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseTimeFormatDate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withParseTimeFormatStr(value: js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseTimeFormatStr")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPrice(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("price")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPriceFormat(value: Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priceFormat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPriceSettings(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priceSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetLocale(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLocale")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTimeFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeFormatDate(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeFormatDate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTimeFormatStr(value: js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeFormatStr")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

