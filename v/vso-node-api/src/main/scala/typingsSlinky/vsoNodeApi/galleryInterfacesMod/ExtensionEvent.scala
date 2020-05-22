package typingsSlinky.vsoNodeApi.galleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionEvent extends js.Object {
  /**
    * Id which identifies each data point uniquely
    */
  var id: Double
  var properties: js.Any
  /**
    * Timestamp of when the event occurred
    */
  var statisticDate: js.Date
  /**
    * Version of the extension
    */
  var version: String
}

object ExtensionEvent {
  @scala.inline
  def apply(id: Double, properties: js.Any, statisticDate: js.Date, version: String): ExtensionEvent = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], statisticDate = statisticDate.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionEvent]
  }
}

