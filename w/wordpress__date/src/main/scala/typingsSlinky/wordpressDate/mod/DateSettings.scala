package typingsSlinky.wordpressDate.mod

import typingsSlinky.wordpressDate.AnonDate
import typingsSlinky.wordpressDate.AnonLocale
import typingsSlinky.wordpressDate.AnonOffset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateSettings extends js.Object {
  var formats: AnonDate
  var l10n: AnonLocale
  var timezone: AnonOffset
}

object DateSettings {
  @scala.inline
  def apply(formats: AnonDate, l10n: AnonLocale, timezone: AnonOffset): DateSettings = {
    val __obj = js.Dynamic.literal(formats = formats.asInstanceOf[js.Any], l10n = l10n.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DateSettings]
  }
}

