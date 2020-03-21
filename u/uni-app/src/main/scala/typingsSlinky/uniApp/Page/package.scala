package typingsSlinky.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Page {
  type GetCurrentPages = js.Function0[
    js.Array[
      (typingsSlinky.uniApp.Page.PageInstance[typingsSlinky.uniApp.AnyObject, js.Object]) with js.Object
    ]
  ]
  type PageConstructor = js.Function1[
    /* options */ (typingsSlinky.uniApp.Page.PageInstance[
      typingsSlinky.uniApp.AnyObject, 
      typingsSlinky.uniApp.AnyObject with (typingsSlinky.uniApp.Page.PageInstance[_, _])
    ]) with typingsSlinky.uniApp.AnyObject with (typingsSlinky.uniApp.Page.PageInstance[_, _]), 
    scala.Unit
  ]
}
