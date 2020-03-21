package typingsSlinky.spotifyWebApiNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback[T] = js.Function2[
    /* error */ js.Error, 
    /* response */ typingsSlinky.spotifyWebApiNode.mod.Response[T], 
    scala.Unit
  ]
}
