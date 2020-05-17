package typingsSlinky.vexdb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object requestObjectsMod {
  type NumberRequestValidatorFunction = js.Function2[
    /* itemValue */ scala.Double, 
    /* item */ typingsSlinky.vexdb.responseObjectsMod.ResponseObject, 
    js.Promise[scala.Boolean] | scala.Boolean
  ]
  type StringRequestValidatorFunction = js.Function2[
    /* itemValue */ java.lang.String, 
    /* item */ typingsSlinky.vexdb.responseObjectsMod.ResponseObject, 
    js.Promise[scala.Boolean] | scala.Boolean
  ]
}
