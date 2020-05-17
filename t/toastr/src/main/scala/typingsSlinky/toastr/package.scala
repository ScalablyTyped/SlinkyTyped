package typingsSlinky

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object toastr {
  type ToastrDisplayMethod = js.Function3[
    /* message */ java.lang.String, 
    /* title */ js.UndefOr[java.lang.String], 
    /* overrides */ js.UndefOr[typingsSlinky.toastr.ToastrOptions], 
    typingsSlinky.jquery.JQuery[org.scalajs.dom.raw.HTMLElement]
  ]
}
