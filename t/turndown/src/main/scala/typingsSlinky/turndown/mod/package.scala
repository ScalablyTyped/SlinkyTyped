package typingsSlinky.turndown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Filter = typingsSlinky.turndown.mod.TagName | js.Array[typingsSlinky.turndown.mod.TagName] | typingsSlinky.turndown.mod.FilterFunction
  type FilterFunction = js.Function2[
    /* node */ org.scalajs.dom.raw.HTMLElement, 
    /* options */ typingsSlinky.turndown.mod.Options, 
    scala.Boolean
  ]
  type Node = org.scalajs.dom.raw.HTMLElement | typingsSlinky.std.Document_ | org.scalajs.dom.raw.DocumentFragment
  type Plugin = js.Function1[/* service */ typingsSlinky.turndown.mod.TurndownService, scala.Unit]
  type ReplacementFunction = js.Function3[
    /* content */ java.lang.String, 
    /* node */ typingsSlinky.turndown.mod.Node, 
    /* options */ typingsSlinky.turndown.mod.Options, 
    java.lang.String
  ]
}
