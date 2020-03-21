package typingsSlinky.watsonDeveloperCloud

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object v3Mod {
  /** The callback for a service request. */
  type Callback[T] = js.Function3[
    /* error */ js.Any, 
    /* body */ js.UndefOr[T], 
    /* response */ js.UndefOr[typingsSlinky.axios.mod.AxiosResponse[T]], 
    scala.Unit
  ]
}
