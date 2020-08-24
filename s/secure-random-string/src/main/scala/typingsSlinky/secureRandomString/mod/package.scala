package typingsSlinky.secureRandomString

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback = js.Function2[
    /* error */ js.Error | scala.Null, 
    /* result */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
}
