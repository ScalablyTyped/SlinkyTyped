package typingsSlinky.tsCustomError.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts-custom-error", "customErrorFactory")
@js.native
object customErrorFactory extends js.Object {
  def apply[Properties](fn: js.ThisFunction1[/* this */ Properties, /* repeated */ js.Any, Unit]): CustomErrorConstructor[Properties] = js.native
  def apply[Properties](
    fn: js.ThisFunction1[/* this */ Properties, /* repeated */ js.Any, Unit],
    parent: GenericErrorConstructor
  ): CustomErrorConstructor[Properties] = js.native
}

