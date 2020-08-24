package typingsSlinky.wouter.staticLocationMod

import typingsSlinky.wouter.anon.ReadonlyArrayPath
import typingsSlinky.wouter.useLocationMod.LocationHook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StaticLocationHook extends LocationHook {
  var history: ReadonlyArrayPath = js.native
}

