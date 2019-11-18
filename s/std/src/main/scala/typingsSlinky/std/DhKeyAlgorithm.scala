package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DhKeyAlgorithm extends KeyAlgorithm {
  var generator: scala.scalajs.js.typedarray.Uint8Array
  var prime: scala.scalajs.js.typedarray.Uint8Array
}

object DhKeyAlgorithm {
  @scala.inline
  def apply(
    generator: scala.scalajs.js.typedarray.Uint8Array,
    name: java.lang.String,
    prime: scala.scalajs.js.typedarray.Uint8Array
  ): DhKeyAlgorithm = {
    val __obj = js.Dynamic.literal(generator = generator.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], prime = prime.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DhKeyAlgorithm]
  }
}

