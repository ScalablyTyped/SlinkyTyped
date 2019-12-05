package typingsSlinky.sixDashRuntime.Six.plugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object static {
  import typingsSlinky.sixDashRuntime.Six.middleware

  type staticFactory = js.Function1[/* conf */ staticConf, middleware]
}
