package typingsSlinky.titanium.Titanium

import typingsSlinky.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContactsEventMap extends ProxyEventMap {
  var reload: ContactsReloadEvent
}

object ContactsEventMap {
  @scala.inline
  def apply(reload: ContactsReloadEvent): ContactsEventMap = {
    val __obj = js.Dynamic.literal(reload = reload.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactsEventMap]
  }
}

