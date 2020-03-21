package typingsSlinky.wordcloud

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type EventCallback = js.Function3[
    /* item */ typingsSlinky.wordcloud.mod.ListEntry, 
    /* dimension */ typingsSlinky.wordcloud.mod.Dimension, 
    /* event */ org.scalajs.dom.raw.MouseEvent, 
    scala.Unit
  ]
  type ListEntry = js.Tuple2[java.lang.String, scala.Double]
}
