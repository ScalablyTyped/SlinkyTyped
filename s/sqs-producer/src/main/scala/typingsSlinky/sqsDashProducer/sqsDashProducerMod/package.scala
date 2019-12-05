package typingsSlinky.sqsDashProducer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sqsDashProducerMod {
  type ProducerCallback[T] = js.Function2[/* err */ js.UndefOr[js.Error], /* data */ js.UndefOr[T], js.Any]
}
