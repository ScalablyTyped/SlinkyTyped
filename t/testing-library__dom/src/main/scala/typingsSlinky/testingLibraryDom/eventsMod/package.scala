package typingsSlinky.testingLibraryDom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object eventsMod {
  type FireFunction = js.Function2[
    /* element */ typingsSlinky.std.Document_ | org.scalajs.dom.raw.Element | typingsSlinky.std.Window_ | org.scalajs.dom.raw.Node, 
    /* event */ typingsSlinky.std.Event_, 
    scala.Boolean
  ]
}
