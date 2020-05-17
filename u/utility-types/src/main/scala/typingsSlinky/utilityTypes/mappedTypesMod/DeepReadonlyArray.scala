package typingsSlinky.utilityTypes.mappedTypesMod

import typingsSlinky.std.ReadonlyArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeepReadonlyArray[T]
  extends ReadonlyArray[DeepReadonly[T]]
     with DeepReadonly[js.Any]

