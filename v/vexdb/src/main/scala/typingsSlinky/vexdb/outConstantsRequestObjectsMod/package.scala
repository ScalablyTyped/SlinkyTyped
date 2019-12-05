package typingsSlinky.vexdb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object outConstantsRequestObjectsMod {
  import typingsSlinky.vexdb.outConstantsResponseObjectsMod.ResponseObject

  type NumberRequest = Double | js.Array[Double] | NumberRequestValidatorFunction
  type NumberRequestValidatorFunction = js.Function2[/* itemValue */ Double, /* item */ ResponseObject, js.Promise[Boolean] | Boolean]
  type StringRequest = String | js.Array[String] | js.RegExp | StringRequestValidatorFunction
  type StringRequestValidatorFunction = js.Function2[/* itemValue */ String, /* item */ ResponseObject, js.Promise[Boolean] | Boolean]
}
