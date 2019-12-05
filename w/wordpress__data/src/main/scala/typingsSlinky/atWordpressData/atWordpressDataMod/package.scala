package typingsSlinky.atWordpressData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atWordpressDataMod {
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Record

  type DispatcherMap = Record[String, js.Function1[/* repeated */ js.Any, Unit]]
  type Plugin[T /* <: Record[String, _] */] = js.Function2[/* registry */ DataRegistry, /* options */ T, Partial[DataRegistry]]
  type SelectorMap = Record[String, js.Function1[/* repeated */ js.Any, js.Any]]
  type Subscriber = js.Function1[/* callback */ js.Function0[Unit], Unit]
}
