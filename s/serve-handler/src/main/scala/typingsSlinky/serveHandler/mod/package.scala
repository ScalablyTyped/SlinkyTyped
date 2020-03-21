package typingsSlinky.serveHandler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type SendErrorHandler = js.Function7[
    /* absolutePath */ js.UndefOr[java.lang.String], 
    /* response */ js.UndefOr[typingsSlinky.node.httpMod.ServerResponse], 
    /* acceptsJSON */ js.UndefOr[scala.Boolean], 
    /* current */ js.UndefOr[java.lang.String], 
    /* handlers */ js.UndefOr[typingsSlinky.serveHandler.mod.Methods], 
    /* config */ js.UndefOr[typingsSlinky.serveHandler.mod.Config], 
    /* spec */ js.UndefOr[js.Any], 
    js.Promise[scala.Unit]
  ]
}
