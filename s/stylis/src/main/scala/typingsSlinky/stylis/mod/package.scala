package typingsSlinky.stylis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Plugin = js.ThisFunction9[
    /* this */ typingsSlinky.stylis.mod.Stylis, 
    /* context */ typingsSlinky.stylis.mod.Context, 
    /* content */ java.lang.String, 
    /* selector */ typingsSlinky.stylis.mod.Selectors, 
    /* parent */ typingsSlinky.stylis.mod.Selectors, 
    /* line */ scala.Double, 
    /* column */ scala.Double, 
    /* length */ scala.Double, 
    /* at */ scala.Double, 
    /* depth */ scala.Double, 
    js.Any
  ]
  type Selectors = js.Array[java.lang.String]
}
