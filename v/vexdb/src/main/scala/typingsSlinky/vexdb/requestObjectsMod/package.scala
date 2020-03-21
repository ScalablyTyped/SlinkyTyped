package typingsSlinky.vexdb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object requestObjectsMod {
  type NumberRequest = scala.Double | js.Array[scala.Double] | typingsSlinky.vexdb.requestObjectsMod.NumberRequestValidatorFunction
  type NumberRequestValidatorFunction = js.Function2[
    /* itemValue */ scala.Double, 
    /* item */ typingsSlinky.vexdb.responseObjectsMod.ResponseObject, 
    js.Promise[scala.Boolean] | scala.Boolean
  ]
  type StringRequest = java.lang.String | js.Array[java.lang.String] | js.RegExp | typingsSlinky.vexdb.requestObjectsMod.StringRequestValidatorFunction
  type StringRequestValidatorFunction = js.Function2[
    /* itemValue */ java.lang.String, 
    /* item */ typingsSlinky.vexdb.responseObjectsMod.ResponseObject, 
    js.Promise[scala.Boolean] | scala.Boolean
  ]
}
