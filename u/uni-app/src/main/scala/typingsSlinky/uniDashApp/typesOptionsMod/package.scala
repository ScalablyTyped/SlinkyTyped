package typingsSlinky.uniDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesOptionsMod {
  import typingsSlinky.uniDashApp.App.AppInstance
  import typingsSlinky.uniDashApp.Page.PageInstance

  type Hooks = AppInstance[js.Object] with (PageInstance[_, _])
}
