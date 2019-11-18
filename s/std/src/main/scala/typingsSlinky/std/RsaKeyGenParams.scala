package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RsaKeyGenParams extends Algorithm {
  var modulusLength: Double
  var publicExponent: scala.scalajs.js.typedarray.Uint8Array
}

object RsaKeyGenParams {
  @scala.inline
  def apply(
    modulusLength: Double,
    name: java.lang.String,
    publicExponent: scala.scalajs.js.typedarray.Uint8Array
  ): RsaKeyGenParams = {
    val __obj = js.Dynamic.literal(modulusLength = modulusLength.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], publicExponent = publicExponent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RsaKeyGenParams]
  }
}

