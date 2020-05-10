package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This Payment Request API interface is used to store shipping or payment address information. */
@js.native
trait PaymentAddress extends js.Object {
  val addressLine: js.Array[java.lang.String] = js.native
  val city: java.lang.String = js.native
  val country: java.lang.String = js.native
  val dependentLocality: java.lang.String = js.native
  val languageCode: java.lang.String = js.native
  val organization: java.lang.String = js.native
  val phone: java.lang.String = js.native
  val postalCode: java.lang.String = js.native
  val recipient: java.lang.String = js.native
  val region: java.lang.String = js.native
  val sortingCode: java.lang.String = js.native
  def toJSON(): js.Any = js.native
}

@JSGlobal("PaymentAddress")
@js.native
object PaymentAddress extends Instantiable0[PaymentAddress]

