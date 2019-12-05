package typingsSlinky

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object toastr {
  import org.scalajs.dom.raw.HTMLElement
  import typingsSlinky.jquery.JQuery

  type ToastrDisplayMethod = js.Function3[
    /* message */ String, 
    /* title */ js.UndefOr[String], 
    /* overrides */ js.UndefOr[ToastrOptions], 
    JQuery[HTMLElement]
  ]
}
