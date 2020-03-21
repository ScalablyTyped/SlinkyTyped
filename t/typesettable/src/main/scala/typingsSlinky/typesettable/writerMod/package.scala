package typingsSlinky.typesettable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object writerMod {
  type IPenFactory[T] = js.Function3[
    /* text */ java.lang.String, 
    /* transform */ typingsSlinky.typesettable.writerMod.ITransform, 
    /* container */ js.UndefOr[T], 
    typingsSlinky.typesettable.writerMod.IPen
  ]
}
