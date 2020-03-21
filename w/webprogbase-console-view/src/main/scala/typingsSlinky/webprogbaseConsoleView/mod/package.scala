package typingsSlinky.webprogbaseConsoleView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BasicObject[T] = org.scalablytyped.runtime.StringDictionary[T]
  type FormFields = typingsSlinky.webprogbaseConsoleView.mod.BasicObject[java.lang.String | typingsSlinky.webprogbaseConsoleView.mod.FormFieldDescriptor]
  type ServerAppHandler = js.Function2[
    /* req */ typingsSlinky.webprogbaseConsoleView.mod.Request, 
    /* res */ typingsSlinky.webprogbaseConsoleView.mod.Response, 
    scala.Unit
  ]
  type StateLinks = typingsSlinky.webprogbaseConsoleView.mod.BasicObject[java.lang.String | typingsSlinky.webprogbaseConsoleView.mod.StateLinkDescriptor]
}
