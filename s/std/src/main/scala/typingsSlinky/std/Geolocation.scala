package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An object able to programmatically obtain the position of the device. It gives Web content access to the location of the device. This allows a Web site or app to offer customized results based on the user's location. */
@js.native
trait Geolocation extends StObject {
  
  def clearWatch(watchId: Double): Unit = js.native
  
  def getCurrentPosition(successCallback: PositionCallback): Unit = js.native
  def getCurrentPosition(
    successCallback: PositionCallback,
    errorCallback: js.UndefOr[scala.Nothing],
    options: org.scalajs.dom.raw.PositionOptions
  ): Unit = js.native
  def getCurrentPosition(successCallback: PositionCallback, errorCallback: PositionErrorCallback): Unit = js.native
  def getCurrentPosition(
    successCallback: PositionCallback,
    errorCallback: PositionErrorCallback,
    options: org.scalajs.dom.raw.PositionOptions
  ): Unit = js.native
  
  def watchPosition(successCallback: PositionCallback): Double = js.native
  def watchPosition(
    successCallback: PositionCallback,
    errorCallback: js.UndefOr[scala.Nothing],
    options: org.scalajs.dom.raw.PositionOptions
  ): Double = js.native
  def watchPosition(successCallback: PositionCallback, errorCallback: PositionErrorCallback): Double = js.native
  def watchPosition(
    successCallback: PositionCallback,
    errorCallback: PositionErrorCallback,
    options: org.scalajs.dom.raw.PositionOptions
  ): Double = js.native
}
