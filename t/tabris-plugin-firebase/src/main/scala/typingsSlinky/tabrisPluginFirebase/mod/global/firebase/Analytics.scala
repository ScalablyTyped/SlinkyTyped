package typingsSlinky.tabrisPluginFirebase.mod.global.firebase

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.tabris.mod.NativeObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Analytics
  extends NativeObject
     with typingsSlinky.tabrisPluginFirebase.mod.global.firebase.PropertyMixins.Analytics {
  def logEvent(eventName: String): Unit = js.native
  def logEvent(eventName: String, parameters: StringDictionary[String]): Unit = js.native
  def set(properties: AnalyticsProperties): this.type = js.native
  def set(property: String, value: js.Any): this.type = js.native
  def setUserProperty(propertyName: String, value: String): Unit = js.native
}

@JSGlobal("firebase.Analytics")
@js.native
object Analytics extends TopLevel[Analytics]

