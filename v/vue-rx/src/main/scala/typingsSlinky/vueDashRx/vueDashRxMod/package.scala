package typingsSlinky.vueDashRx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object vueDashRxMod {
  import typingsSlinky.rxjs.rxjsMod.Observable
  import typingsSlinky.std.Record

  type Observables = Record[String, Observable[js.Any]]
}
