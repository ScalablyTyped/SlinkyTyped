package typingsSlinky.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object App {
  type AppConstructor = js.Function1[
    /* options */ (typingsSlinky.uniApp.App.AppInstance[
      typingsSlinky.uniApp.AnyObject with typingsSlinky.uniApp.App.AppInstance[js.Object]
    ]) with typingsSlinky.uniApp.AnyObject with typingsSlinky.uniApp.App.AppInstance[js.Object], 
    scala.Unit
  ]
  type GetApp = js.Function1[
    /* opts */ js.UndefOr[typingsSlinky.uniApp.App.GetAppOption], 
    typingsSlinky.uniApp.App.AppInstance[typingsSlinky.uniApp.AnyObject] with typingsSlinky.uniApp.AnyObject
  ]
}
