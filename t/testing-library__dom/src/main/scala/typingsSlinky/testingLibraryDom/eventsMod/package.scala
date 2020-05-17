package typingsSlinky.testingLibraryDom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object eventsMod {
  type FireFunction = js.Function2[
    /* element */ org.scalajs.dom.raw.Document | org.scalajs.dom.raw.Element | org.scalajs.dom.raw.Window | org.scalajs.dom.raw.Node, 
    /* event */ org.scalajs.dom.raw.Event, 
    scala.Boolean
  ]
}
