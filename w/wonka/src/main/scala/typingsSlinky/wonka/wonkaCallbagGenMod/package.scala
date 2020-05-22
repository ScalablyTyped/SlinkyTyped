package typingsSlinky.wonka

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object wonkaCallbagGenMod {
  type callbagT[a] = typingsSlinky.wonka.jsShimMod.callbagT[a]
  type callbagTalkback = js.Function1[/* _1 */ typingsSlinky.wonka.wonkaCallbagGenMod.callbagSignal, scala.Unit]
}
