package typingsSlinky.scrollIntoViewIfNeeded

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type CustomScrollBehaviorCallback[T] = js.Function1[
    /* actions */ js.Array[typingsSlinky.scrollIntoViewIfNeeded.typesMod.CustomScrollAction], 
    T
  ]
  type CustomScrollBoundary = org.scalajs.dom.raw.Element | typingsSlinky.scrollIntoViewIfNeeded.typesMod.CustomScrollBoundaryCallback | scala.Null
  type CustomScrollBoundaryCallback = js.Function1[/* parent */ org.scalajs.dom.raw.Element, scala.Boolean]
  type SkipOverflowHiddenElements = scala.Boolean
}
