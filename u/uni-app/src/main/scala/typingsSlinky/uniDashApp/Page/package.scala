package typingsSlinky.uniDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Page {
  import typingsSlinky.uniDashApp.AnyObject

  type GetCurrentPages = js.Function0[js.Array[(PageInstance[AnyObject, js.Object]) with js.Object]]
  type PageConstructor = js.Function1[
    /* options */ (PageInstance[AnyObject, AnyObject with (PageInstance[_, _])]) with AnyObject with (PageInstance[_, _]), 
    Unit
  ]
}
