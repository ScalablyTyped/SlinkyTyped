package typingsSlinky.webpackErrorNotification.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.webpackErrorNotification.webpackErrorNotificationStrings.darwin
  - typingsSlinky.webpackErrorNotification.webpackErrorNotificationStrings.linux
  - js.Function1[/ * msg * / java.lang.String, scala.Unit]
*/
trait Strategy extends js.Object

object Strategy {
  @scala.inline
  def darwin: typingsSlinky.webpackErrorNotification.webpackErrorNotificationStrings.darwin = "darwin".asInstanceOf[typingsSlinky.webpackErrorNotification.webpackErrorNotificationStrings.darwin]
  @scala.inline
  def linux: typingsSlinky.webpackErrorNotification.webpackErrorNotificationStrings.linux = "linux".asInstanceOf[typingsSlinky.webpackErrorNotification.webpackErrorNotificationStrings.linux]
  @scala.inline
  implicit def apply(value: js.Function1[/* msg */ String, Unit]): Strategy = value.asInstanceOf[Strategy]
}

