package typingsSlinky.socketioJwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type JwtAuthorizeCallback = js.Function0[scala.Unit]
  type JwtSecretFunc = js.Function3[
    /* request */ js.Any, 
    /* payload */ js.Any, 
    /* callback */ typingsSlinky.socketioJwt.mod.JwtSecretFuncCallback, 
    scala.Unit
  ]
  type JwtSecretFuncCallback = js.Function2[/* err */ js.Error | scala.Null, /* secret */ java.lang.String, scala.Unit]
}
