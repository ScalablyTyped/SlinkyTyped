package typingsSlinky.sqsProducer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ProducerCallback[T] = js.Function2[/* err */ js.UndefOr[js.Error], /* data */ js.UndefOr[T], js.Any]
}
