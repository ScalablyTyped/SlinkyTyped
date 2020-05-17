package typingsSlinky.vegaUtil

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AccessorFn[R] = typingsSlinky.vegaUtil.mod.Fn[R] with typingsSlinky.vegaUtil.anon.Fields
  type Fn[R] = js.Function1[/* repeated */ js.Any, R]
}
