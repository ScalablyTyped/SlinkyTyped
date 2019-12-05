package typingsSlinky.waitme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object WaitMe {
  import typingsSlinky.waitme.JQuery
  import typingsSlinky.waitme.waitmeStrings.hide

  type WaitMeStatic = js.Function1[/* options */ js.UndefOr[WaitMeOptions | hide], JQuery]
}
